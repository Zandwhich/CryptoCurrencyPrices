package com.company.api_call;

import com.company.tool.enums.Errors;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.Currency;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.tool.exception.currency_not_supported.CryptoCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.FiatCurrencyNotSupported;
import com.company.tool.util.Pair;
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
import java.util.HashMap;
import java.util.Map;

/**
 * The abstract class for API calls, which all API calls are based off of
 */
public abstract class AbstractAPICaller implements APICallerInterface {

    /**
     * A wrapper class around the hashmap to hold the data returned from endpoints
     * </p>
     * NOTE: This may seem a bit over-kill, but I liked the separation, personally, so I decided to implement it.
     * If in the future I want to get rid of it, I will
     */
    private static final class EndpointMemory {


        /**
         * The class that encapsulates all the data that we want to know about data returned from the APIs
         */
        private static final class EndpointData {

            /**
             * The last price of the endpoint
             */
            private double price = -1;

            /**
             * The last time this endpoint was updated for this currency combination
             */
            private LocalDateTime lastSuccessfulUpdate = null;

            /**
             * If the endpoint is currently updating for this currently combination
             */
            private boolean isUpdating = false;

            private boolean hasFailedLastUpdate = false;

            public double getPrice() {
                return price;
            }

            public void setPrice(final double price) {
                this.price = price;
            }

            public LocalDateTime getLastSuccessfulUpdate() {
                return lastSuccessfulUpdate;
            }

            public void setLastSuccessfulUpdate(final LocalDateTime lastSuccessfulUpdate) {
                this.lastSuccessfulUpdate = lastSuccessfulUpdate;
            }

            public boolean isUpdating() {
                return isUpdating;
            }

            public void setUpdating(final boolean updating) {
                isUpdating = updating;
            }

            public boolean hasFailedLastUpdate() {
                return hasFailedLastUpdate;
            }

            public void setHasFailedLastUpdate(final boolean hasFailedLastUpdate) {
                this.hasFailedLastUpdate = hasFailedLastUpdate;
            }
        }

        /**
         * The map that actually holds the data
         */
        private final Map<Pair<CryptoCurrencies, FiatCurrencies>, EndpointData> endpointDataMap;

        private final CryptoCurrencies[] acceptedCryptos;

        private final FiatCurrencies[] acceptedFiats;

        public EndpointMemory(final CryptoCurrencies[] acceptedCryptos,
                              final FiatCurrencies[] acceptedFiats) {
            this.endpointDataMap = new HashMap<>();
            this.acceptedCryptos = acceptedCryptos;
            this.acceptedFiats = acceptedFiats;

            for (final CryptoCurrencies crypto : this.acceptedCryptos) {
                for (final FiatCurrencies fiat : this.acceptedFiats) {
                    this.endpointDataMap.put(new Pair<>(crypto, fiat), new EndpointData());
                }
            }
        }

        // TODO: You left off here, where you were adding the errors to all of the getters and setters. Take a look at
        //  your Notion for notes on what else to do

        public double getPrice(final CryptoCurrencies crypto, final FiatCurrencies fiat) {
            return this.endpointDataMap.get(new Pair<>(crypto, fiat)).getPrice();
        }

        public void setPrice(final CryptoCurrencies crypto, final FiatCurrencies fiat, final double price)
                throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
            try {
                this.endpointDataMap.get(new Pair<>(crypto, fiat)).setPrice(price);
            } catch (final NullPointerException e) {
                if (!Arrays.asList(this.acceptedCryptos).contains(crypto))
                    throw new CryptoCurrencyNotSupported(crypto);
                throw new FiatCurrencyNotSupported(fiat);
            }

        }

        public boolean isUpdating(final CryptoCurrencies crypto, final FiatCurrencies fiat) {
            return this.endpointDataMap.get(new Pair<>(crypto, fiat)).isUpdating();
        }

        public void setUpdating(final CryptoCurrencies crypto, final FiatCurrencies fiat, final boolean isUpdating) {
            this.endpointDataMap.get(new Pair<>(crypto, fiat)).setUpdating(isUpdating);
        }

        public LocalDateTime getLastUpdated(final CryptoCurrencies crypto, final FiatCurrencies fiat) {
            return this.endpointDataMap.get(new Pair<>(crypto, fiat)).getLastSuccessfulUpdate();
        }

        public void setLastUpdated(final CryptoCurrencies crypto, final FiatCurrencies fiat,
                                   final LocalDateTime lastUpdated) {
            this.endpointDataMap.get(new Pair<>(crypto, fiat)).setLastSuccessfulUpdate(lastUpdated);
        }
    }

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
    private CryptoCurrencies[] acceptedCryptoCurrencies;

    /**
     * The fiat currencies that this website can use
     */
    private FiatCurrencies[] acceptedFiatCurrencies;

    /**
     * The flag to check when going through to see if this API endpoint should be updated.
     * NOTE: Not to be used for cryptocurrency/fiat currency combinations, but more so for "url isn't working" reasons
     * </p>
     * The flag's setter can be overwritten as well if we for some reason we don't want to use a certain endpoint.
     */
    private boolean isActive = false;

    private EndpointMemory memory;


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for AbstractAPICaller
     * @param acceptedCryptoCurrencies The accepted cryptocurrencies for this website
     * @param acceptedFiatCurrencies The accepted fiat currencies for this website
     * @param name The name of the API endpoint
     * @param url The url to hit
     * @param controller The controller that calls this API caller
     */
    public AbstractAPICaller(final CryptoCurrencies[] acceptedCryptoCurrencies,
                             final FiatCurrencies[] acceptedFiatCurrencies, final String name, final String url,
                             final APICallerContract controller) {
        this.setup(acceptedCryptoCurrencies, acceptedFiatCurrencies, name, url,
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
        this.acceptedCryptoCurrencies = acceptedCryptoCurrencies;
        this.acceptedFiatCurrencies = acceptedFiatCurrencies;

        this.controller = controller;
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

        this.memory = new EndpointMemory(this.acceptedCryptoCurrencies, this.acceptedFiatCurrencies);
    }

    @Override
    public double getPrice(final CryptoCurrencies crypto, final FiatCurrencies fiat) {
        return this.memory.getPrice(crypto, fiat);
    }

    @Override
    public LocalDateTime getLastUpdated(final CryptoCurrencies crypto, final FiatCurrencies fiat) {
        return this.memory.getLastUpdated(crypto, fiat);
    }

    @Override
    public boolean isUpdating(final CryptoCurrencies crypto, final FiatCurrencies fiat) {
        return this.memory.isUpdating(crypto, fiat);
    }

    @Override
    public String getName() { return this.name; }

    @Override
    public URL getUrl() { return this.url; }

    @Override
    public boolean isActive() {
        return this.isActive;
    }

    @Override
    public void setActive(final boolean active) {
        this.isActive = active;
    }

    /**
     * Gets the controller
     * @return The controller
     */
    public APICallerContract getController() { return this.controller; }

    /**
     * Updates the price
     */
    private void updatePrice(final CryptoCurrencies crypto, final FiatCurrencies fiat) {
        if (this.isActive) {
            this.memory.setUpdating(crypto, fiat, true);

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
            // TODO: Should this be -1...? Can this be cleaner somehow? Should I throw an error here?
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

    protected void setPrice(final CryptoCurrencies crypto, final FiatCurrencies fiat, final double price) {
        this.memory.setPrice(crypto, fiat, price);
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
        try {
            // Set up the connection and get the input stream
            final URLConnection connection = this.getUrl().openConnection();
            connection.connect();
            final BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
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

        return jsonObject;
    }

}
