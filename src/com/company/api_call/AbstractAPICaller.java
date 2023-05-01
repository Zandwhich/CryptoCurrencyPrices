package com.company.api_call;

import com.company.tool.enums.Errors;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.Currency;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.tool.exception.currency_not_supported.AbstractCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.CryptoCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.FiatCurrencyNotSupported;
import json_simple.JSONObject;
import json_simple.parser.JSONParser;
import json_simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * The abstract class for API calls, which all API calls are based off of
 */
public abstract class AbstractAPICaller implements APICallerInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The last received price
     */
    private double price;

    /**
     * The crypto currency (i.e. BTC, ETH, LTC, etc.)
     */
    private CryptoCurrencies cryptoCurrency;

    /**
     * The fiat currency (i.e. USD, CAD, PLN, etc.)
     */
    private FiatCurrencies fiatCurrency;

    /**
     * If the API has a price to display
     */
    private boolean hasPrice;

    /**
     * The name of the API endpoint
     */
    private String name;

    /**
     * The url to hit
     */
    private URL url;

    /**
     * If the last attempt to update the prices ended in failure
     */
    private boolean hasFailedLastUpdate;

    /**
     * The controller that calls this API caller
     */
    private APICallerContract controller;

    /**
     * The cryptocurrencies that this website can use
     */
    private CryptoCurrencies[] acceptedCryptoCurrencies;

    /**
     * The fiat currencies that this website can use
     */
    private FiatCurrencies[] acceptedFiatCurrencies;

    /**
     * The flag to check when going through to see if this API endpoint should be updated.
     * </p>
     * The flag's setter can be overwritten as well if we for some reason we don't want to use a certain endpoint.
     */
    private boolean isActive = false;


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for AbstractAPICaller
     * @param cryptoCurrency The currency (i.e. BTC, ETH, LTC, etc.)
     * @param fiatCurrency The fiat currency to compare against (i.e. USD, CAD, PLN, etc.)
     * @param acceptedCryptoCurrencies The accepted cryptocurrencies for this website
     * @param acceptedFiatCurrencies The accepted fiat currencies for this website
     * @param name The name of the API endpoint
     * @param url The url to hit
     * @param controller The controller that calls this API caller
     */
    public AbstractAPICaller(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                             final CryptoCurrencies[] acceptedCryptoCurrencies,
                             final FiatCurrencies[] acceptedFiatCurrencies, final String name, final String url,
                             final APICallerContract controller)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        this.setup(cryptoCurrency, fiatCurrency, acceptedCryptoCurrencies, acceptedFiatCurrencies, name, url,
                controller);
    }

    /**
     * The constructor for AbstractAPICaller when a cryptocurrency and a fiat currency aren't specified (most likely
     * when the currency is not supported for the given endpoint)
     * @param acceptedCryptoCurrencies The list of accepted cryptocurrencies for this endpoint
     * @param acceptedFiatCurrencies The list of accepted fiat currencies for this endpoint
     * @param name The name of this endpoint
     * @param url The url to hit
     * @param controller The instantiation of whatever calls this endpoint, most likely a controller
     */
    public AbstractAPICaller(final CryptoCurrencies[] acceptedCryptoCurrencies,
                             final FiatCurrencies[] acceptedFiatCurrencies, final String name, final String url,
                             final APICallerContract controller) {
        try {
            this.setup(null, null, acceptedCryptoCurrencies, acceptedFiatCurrencies, name, url,
                    controller);
        } catch (final AbstractCurrencyNotSupported ignored) {
            // This won't happen, as the two currencies are set to null
        }
    }

    // TODO: This is where you left off. Next, you need to implement a constructor that doesn't take in a cryptocurrency
    //       or a fiat currency, sets those to null, does the rest of the setup stuff, and won't throw an error.


    /* ************ *
     *    Methods   *
     * ************ */

    /**
     * The setup function with its logic extracted to avoid duplication
     * @param cryptoCurrency The cryptocurrency that this endpoint will use
     * @param fiatCurrency The fiat currency that this endpoint will use
     * @param acceptedCryptoCurrencies The list of accepted cryptocurrencies for this endpoint
     * @param acceptedFiatCurrencies The list of accepted fiat currencies for this endpoint
     * @param name The name of this endpoint
     * @param url The url for this endpoint
     * @param controller Whoever created and will be implementing the methods in the contract for this endpoint
     *                   (most likely a controller)
     * @throws CryptoCurrencyNotSupported If an unaccepted cryptocurrency is tried to be set
     * @throws FiatCurrencyNotSupported If an unaccepted fiat currency is tried to be set
     */
    private void setup(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                       final CryptoCurrencies[] acceptedCryptoCurrencies, final FiatCurrencies[] acceptedFiatCurrencies,
                       final String name, final String url, final APICallerContract controller)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        // The order here is important
        this.acceptedCryptoCurrencies = acceptedCryptoCurrencies;
        this.acceptedFiatCurrencies = acceptedFiatCurrencies;
        if (!this.canUseCryptoCurrency(cryptoCurrency)) throw new CryptoCurrencyNotSupported(cryptoCurrency);
        if (!this.canUseFiatCurrency(fiatCurrency)) throw new FiatCurrencyNotSupported(fiatCurrency);

        this.controller = controller;
        this.hasPrice = false;
        // There has not been a failure to update, as there hasn't been a request made yet
        this.hasFailedLastUpdate = false;
        this.price = 0.0;
        this.name = name;

        this.isActive = true;
        try {
            this.url = new URL(url);
        }
        catch (final MalformedURLException e) {
            // The url is set to null if either of the cryptocurrency or fiat currency are null
            if (!(e.getCause() instanceof NullPointerException)) {
                // Bad URL input
                e.printStackTrace();

                // TODO: Figure out what to do when a bad URL is inputted (this shouldn't happen as the URLs are to be hard-coded in)
                //       Throw an error?
            }

            this.isActive = false;
        }

        this.cryptoCurrency = cryptoCurrency;
        this.fiatCurrency = fiatCurrency;
    }

    @Override
    public double getPrice() { return this.price; }

    @Override
    public CryptoCurrencies getCurrentCryptoCurrency() { return this.cryptoCurrency; }

    public FiatCurrencies getCurrentFiatCurrency() { return this.fiatCurrency; }

    @Override
    public String getName() { return this.name; }

    @Override
    public URL getUrl() { return this.url; }

    @Override
    public boolean isActive() {
        return isActive;
    }

    @Override
    public void setActive(final boolean active) {
        isActive = active;
    }

    /**
     * Gets the Base URL of the API call
     * @return The Base URL of the API call
     */
    public abstract String getBaseUrl();

    /**
     * Gets if the last attempt at updating the price ended in failure
     * @return If the last attempt at updating the price ended in failure
     */
    public boolean getHasFailedLastUpdate() { return this.hasFailedLastUpdate; }

    /**
     * Gets the controller
     * @return The controller
     */
    public APICallerContract getController() { return this.controller; }

    /**
     * Updates the price
     */
    private void updatePrice() {
        if (this.isActive) {
            final double newPrice = this.getNewPrice();
            // TODO: Once we start throwing errors this will be changed
            if (newPrice != -1) {
                this.setPrice(newPrice);
                this.setHasFailedLastUpdate(false);
                this.setHasPrice(true);
            }
            else {
                this.setHasFailedLastUpdate(true);
            }
        } else {
            // TODO: Should this be -1...? Can this be cleaner somehow?
            this.setPrice(-1);
        }
    }

    /**
     * Updates the price and notifies the controller
     */
    public void updatePriceAndNotify() {
        this.updatePrice();
        this.controller.updatePrice(this.name, this.price, !this.hasFailedLastUpdate);
    }

    /**
     * Sets the price
     * @param price The new price
     */
    protected void setPrice(final double price) { this.price = price; }

    @Override
    public void setCryptoCurrency(final CryptoCurrencies cryptoCurrency) throws CryptoCurrencyNotSupported {
        if (this.canUseCryptoCurrency(cryptoCurrency))
            this.cryptoCurrency = cryptoCurrency;
        else
            throw new CryptoCurrencyNotSupported(cryptoCurrency);
    }

    @Override
    public void setFiatCurrency(final FiatCurrencies fiatCurrency) throws FiatCurrencyNotSupported {
        if (this.canUseFiatCurrency(fiatCurrency))
            this.fiatCurrency = fiatCurrency;
        else
            throw new FiatCurrencyNotSupported(fiatCurrency);
    }

    @Override
    public void setCryptoCurrencyToNull() {
        this.cryptoCurrency = null;
    }

    @Override
    public void setFiatCurrencyToNull() {
        this.fiatCurrency = null;
    }

    /**
     * Updates the url with a new url
     * @param newUrl The new url in String form
     */
    protected void updateUrl(final String newUrl) {
        try {
            this.url = new URL(newUrl);
        }
        catch (final MalformedURLException e) {
            // The url is set to null if either of the cryptocurrency or fiat currency are null
            if (!(e.getCause() instanceof NullPointerException)) {
                // Bad URL input
                e.printStackTrace();

                // TODO: Figure out what to do when a bad URL is inputted (this shouldn't happen as the URLs are to be hard-coded in)
                //       Throw an error?
            }

            this.isActive = false;
        }
    }

    /**
     * Sets if the last update failed
     * @param hasFailedLastUpdate If the last update failed
     */
    public void setHasFailedLastUpdate(final boolean hasFailedLastUpdate) { this.hasFailedLastUpdate = hasFailedLastUpdate; }

    /**
     * Sets if there is a price to display
     * @param hasPrice If there is a price to display
     */
    protected void setHasPrice(final boolean hasPrice) { this.hasPrice = hasPrice; }

    @Override
    public boolean canUseCryptoCurrency(final CryptoCurrencies cryptoCurrency) {
        if (cryptoCurrency == null) return true;

        for (final CryptoCurrencies crypto : this.acceptedCryptoCurrencies) {
            if (crypto.equals(cryptoCurrency)) return true;
        }

        return false;
    }

    @Override
    public boolean canUseFiatCurrency(FiatCurrencies fiatCurrency) {
        if (fiatCurrency == null) return true;

        for (final FiatCurrencies fiat : this.acceptedFiatCurrencies) {
            if (fiat.equals(fiatCurrency)) return true;
        }

        return false;
    }

    /**
     * Gets an updated price by calling the API
     * @return The update price received from calling the API. If it is -1, there was a failure in retrieving the price
     */
    protected double getNewPrice() {
        final JSONObject response = this.getRequestCall();
        if (response == null) return -1;

        final double extractedPrice = this.extractPrice(response);

        if (extractedPrice == -1) return -1; // TODO: Once we throw errors, we can get rid of this

        this.setHasPrice(true);
        return extractedPrice;
    }

    /**
     * Gets the price from the JSON object which was returned from a call
     * @param jsonObject The returned, parsed JSON object from the call
     * @return The price extracted from the JSON object. If it is -1, there was a failure in retrieving the price
     */
    protected abstract double extractPrice(final JSONObject jsonObject);

    /**
     * A method to avoid duplication in implementation of the "canUseCryptoCurrency" and "canUseFiatCurrency" methods
     * that are in each of the children classes. This method is to only be called by the children classes
     * @param acceptedCurrencies The array of accepted currencies for this endpoint
     * @param attemptedCurrency The currency in question to see if it is in the list of accepted currencies for this
     *                          endpoint
     * @return If the attemptedCurrency is in the list of acceptedCurrencies
     */
    protected static boolean canUseCurrency(final Currency[] acceptedCurrencies, final Currency attemptedCurrency) {
        for (final Currency acceptedCurrency : acceptedCurrencies) {
            if (acceptedCurrency.equals(attemptedCurrency)) return true;
        }

        return false;
    }

    /**
     * Hits the url and retrieves the JSON. If there is an error, it returns null
     * @return The parsed JSON object returned as a result of the call. If there is an error, then it returns null
     */
    private JSONObject getRequestCall() {

        // If it's not connected, don't try to get the request
        if (!this.getController().isConnected()) return null;  // TODO: Throw error?

        /*
        Refer to:
            https://docs.oracle.com/javase/tutorial/networking/urls/connecting.html
            https://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html
            https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html
            https://stackoverflow.com/questions/2793150/how-to-use-java-net-urlconnection-to-fire-and-handle-http-requests
         */

        JSONObject jsonObject;
        URLConnection connection = null;
        BufferedReader in = null;
        try {
            // Set up the connection and get the input stream
            connection = this.getUrl().openConnection();
            connection.connect();
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            final JSONParser parser = new JSONParser();

            // Parse the input stream into a JSONObject
            // TODO: Eventually get rid of this simple casting. It could prove problematic in the future
            try {
                jsonObject = (JSONObject) parser.parse(in);
            }
            catch (ParseException e) {
                System.out.println("In ParseException");
                // TODO: Figure out what to do with a ParseException
                // TODO: Throw error?
                jsonObject = null;
            }
        }
        catch (IOException e) {
            // openConnection() failed
            this.getController().errorDisplay(Errors.NETWORK_CONNECTION, this.getName());
            e.printStackTrace();

            // TODO: Throw error?

            jsonObject = null;
        }
        finally {
            try {
                if (in != null) in.close();
            } catch (final IOException ignored) {}
            // TODO: Disconnect the connection here. (Do I need to cast as  HttpURLConnection/HttpsURLConnection) above
            //  when I do .openConnection();
        }

        return jsonObject;
    }

}
