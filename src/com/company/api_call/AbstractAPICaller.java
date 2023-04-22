package com.company.api_call;

import com.company.api_call.endpoint_memory.EndpointMemory;
import com.company.api_call.endpoint_memory.EndpointMemoryInterface;
import com.company.tool.enums.Errors;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.Currency;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.tool.exception.currency_not_supported.CryptoCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.FiatCurrencyNotSupported;
import json_simple.JSONObject;
import json_simple.parser.JSONParser;
import json_simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * The abstract class for API calls, which all API calls are based off of
 */
public abstract class AbstractAPICaller implements APICallerInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The name of the API endpoint
     */
    private String name;

    /**
     * The url to hit
     */
    private URL url;

    /**
     * The controller that calls this API caller
     */
    private APICallerContract controller;

    /**
     * The cryptocurrencies that this website can use
     */
    private CryptoCurrencies[] acceptedCryptos;

    /**
     * The fiat currencies that this website can use
     */
    private FiatCurrencies[] acceptedFiats;

    private EndpointMemoryInterface memory;


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for AbstractAPICaller
     * @param acceptedCryptos The accepted cryptocurrencies for this website
     * @param acceptedFiats The accepted fiat currencies for this website
     * @param name The name of the API endpoint
     * @param url The url to hit
     * @param controller The controller that calls this API caller
     */
    public AbstractAPICaller(final CryptoCurrencies[] acceptedCryptos,
                             final FiatCurrencies[] acceptedFiats, final String name, final String url,
                             final APICallerContract controller) {
        this.setup(acceptedCryptos, acceptedFiats, name, url,
                controller);
    }


    /* ************ *
     *    Methods   *
     * ************ */

    /**
     * The setup function with its logic extracted to avoid duplication
     *
     * @param acceptedCryptoCurrencies The list of accepted cryptocurrencies for this endpoint
     * @param acceptedFiatCurrencies   The list of accepted fiat currencies for this endpoint
     * @param name                     The name of this endpoint
     * @param url                      The url for this endpoint
     * @param controller               Whoever created and will be implementing the methods in the contract for this
     *                                 endpoint (most likely a controller)
     */
    private void setup(final CryptoCurrencies[] acceptedCryptoCurrencies, final FiatCurrencies[] acceptedFiatCurrencies,
                       final String name, final String url, final APICallerContract controller) {
        // The order here is important
        this.acceptedCryptos = acceptedCryptoCurrencies;
        this.acceptedFiats = acceptedFiatCurrencies;

        this.controller = controller;
        this.name = name;

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

        }

        this.memory = new EndpointMemory(this.acceptedCryptos, this.acceptedFiats);
    }

    @Override
    public String getName() { return this.name; }

    protected URL getUrl() { return this.url; }

    @Override
    public double getPrice(final CryptoCurrencies crypto, final FiatCurrencies fiat)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported  {
        return this.memory.getPrice(crypto, fiat);
    }

    @Override
    public LocalDateTime getLastUpdated(final CryptoCurrencies crypto, final FiatCurrencies fiat)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        return this.memory.getLastSuccessfulUpdated(crypto, fiat);
    }

    @Override
    public boolean isUpdating(final CryptoCurrencies crypto, final FiatCurrencies fiat)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        return this.memory.isUpdating(crypto, fiat);
    }

    @Override
    public boolean wasLastUpdatedSuccessful(final CryptoCurrencies crypto, final FiatCurrencies fiat)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        return this.memory.wasLastUpdateSuccessful(crypto, fiat);
    }

    @Override
    public boolean canUseCryptoCurrency(final CryptoCurrencies crypto) {
        return Arrays.asList(this.acceptedCryptos).contains(crypto);
    }

    @Override
    public boolean canUseFiatCurrency(final FiatCurrencies fiat) {
        return Arrays.asList(this.acceptedFiats).contains(fiat);
    }

    /**
     * Updates the price and notifies the controller
     */
    public void updatePriceAndNotify(final CryptoCurrencies crypto, final FiatCurrencies fiat)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        this.setIsUpdatingAndNotify(crypto, fiat, true);
        final double newPrice = this.getNewPrice(crypto, fiat);
        this.setNewPriceAndNotify(crypto, fiat, newPrice);
    }

    private void setIsUpdatingAndNotify(final CryptoCurrencies crypto, final FiatCurrencies fiat,
                                        final boolean isUpdating)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        this.memory.setUpdating(crypto, fiat, isUpdating);
        this.controller.notifyUpdating(this, crypto, fiat, isUpdating);
    }

    // TODO: Update this when price errors get updated
    private void setNewPriceAndNotify(final CryptoCurrencies crypto, final FiatCurrencies fiat, final double price)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        this.memory.setUpdating(crypto, fiat, false);
        if (price != -1) this.memory.setPrice(crypto, fiat, price);
        if (price != -1) this.memory.setLastSuccessfulUpdated(crypto, fiat, LocalDateTime.now());
        this.memory.setWasLasUpdateSuccessful(crypto, fiat, price == -1);
        this.controller.notifyPriceSet(this, crypto, fiat, price, false, price == -1,
                this.memory.getLastSuccessfulUpdated(crypto, fiat));
    }

    private double getNewPrice(final CryptoCurrencies crypto, final FiatCurrencies fiat) {
        final JSONObject response = this.getRequestCall(crypto, fiat);
        return this.extractPrice(response);
    }

    protected abstract URL createURLForCall(final CryptoCurrencies crypto, final FiatCurrencies fiat);

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
    private JSONObject getRequestCall(final CryptoCurrencies crypto, final FiatCurrencies fiat) {

        // If it's not connected, don't try to get the request
        // TODO: Throw error here?
        // TODO: Should I even check this, as it should "short" out in the controller above,
        //  or get caught later in the method as an ENDPOINT_UPDATE_ERROR?
        if (!this.controller.isConnected()) return null;

        /*
        Refer to:
            https://docs.oracle.com/javase/tutorial/networking/urls/connecting.html
            https://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html
            https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html
            https://stackoverflow.com/questions/2793150/how-to-use-java-net-urlconnection-to-fire-and-handle-http-requests
         */

        JSONObject jsonObject;
        // Set up the connection and get the input stream
        try {
            final URLConnection connection = this.createURLForCall(crypto, fiat).openConnection();
            connection.connect();
            final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            final JSONParser parser = new JSONParser();

            jsonObject = (JSONObject) parser.parse(in);
        } catch (final IOException e) {
            // openConnection(), connection.connect(), or parser.parse(in) failed
            this.controller.errorDisplay(Errors.ENDPOINT_UPDATE_ERROR, this.getName(), crypto, fiat);
            e.printStackTrace();

            // TODO: Throw an error?

            jsonObject = null;
        } catch (final ParseException e) {
            // parser.parse(in) failed
            this.controller.errorDisplay(Errors.PARSE_ERROR, this.getName(), crypto, fiat);
            e.printStackTrace();

            // TODO: Throw an error?

            jsonObject = null;
        }

        return jsonObject;
    }

}
