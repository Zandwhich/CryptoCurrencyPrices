package com.company.api_call;

import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.Errors;
import com.company.tools.enums.currency.FiatCurrencies;
import json_simple.JSONObject;
import json_simple.parser.JSONParser;
import json_simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLConnection;

/**
 * The abstract class of all 'callers' which use JSON
 * <p>
 * NOTE: I realize now that this class is unnecessary (as in, there's nothing special about JSON
 *       that should be extended from the API Caller).
 *       I should combine AbstractJSONCaller and AbstractAPICaller together in the future
 * <p>
 * TODO: Remove AbstractJSONCaller and put all of its logic into AbstractAPICaller
 */
public abstract class AbstractJSONCaller extends AbstractAPICaller {

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for AbstractJSONCaller
     * @param cryptoCurrency The cryptocurrency in question
     * @param fiatCurrency The fiat currency in question
     * @param acceptedCryptoCurrencies The cryptocurrencies accepted by this website
     * @param acceptedFiatCurrencies The fiat currencies accepted by this website
     * @param name The name of the endpoint
     * @param url The url to hit
     * @param controller The controller that calls this JSON caller
     */
    public AbstractJSONCaller(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                              final CryptoCurrencies[] acceptedCryptoCurrencies,
                              final FiatCurrencies[] acceptedFiatCurrencies, final String name, final String url,
                              final JSONCallerContract controller) {
        super(cryptoCurrency, fiatCurrency, acceptedCryptoCurrencies, acceptedFiatCurrencies, name, url, controller);
    }


    /* ************ *
     *   Methods    *
     * ************ */

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
            this.getController().errorDisplay(Errors.NETWORK_CONNECTION, super.getName());
            e.printStackTrace();

            // TODO: Throw error?

            jsonObject = null;
        }

        return jsonObject;
    }

    /**
     * Gets the price from the JSON object which was returned from a call
     * @param jsonObject The returned, parsed JSON object from the call
     * @return The price extracted from the JSON object. If it is -1, there was a failure in retrieving the price
     */
    protected abstract double extractPrice(final JSONObject jsonObject);

    /**
     * Gets an updated price by calling the API
     * @return The update price received from calling the API. If it is -1, there was a failure in retrieving the price
     */
    @Override
    protected double getNewPrice() {
        final JSONObject response = this.getRequestCall();
        if (response == null) return -1;

        final double extractedPrice = extractPrice(response);

        if (extractedPrice == -1) return -1; // TODO: Once we throw errors, we can get rid of this

        super.setHasPrice(true);
        return extractedPrice;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JSONCallerContract getController() {
        return (JSONCallerContract) super.getController();
    }

}
