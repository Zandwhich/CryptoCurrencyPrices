package com.company.api_calls;

import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.Errors;
import com.company.controller.ControllerInterface;
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
 */
public abstract class AbstractJSONCaller extends AbstractAPICaller {

    /* ************ *
     *    Fields    *
     * ************ */

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
                              final ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, acceptedCryptoCurrencies, acceptedFiatCurrencies, name, url, controller);
    }

    /* ************ *
     *   Methods    *
     * ************ */

    /* Private */

    /**
     * Hits the url and retrieves the JSON. If there is an error, it returns null
     * @return The parsed JSON object returned as a result of the call. If there is an error, then it returns null
     */
    private JSONObject getRequestCall() {

        // If it's not connected, don't try to get the request
        if (!super.getController().isConnected()) return null;

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
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            JSONParser parser = new JSONParser();

            // Parse the input stream into a JSONObject
            // TODO: Eventually get rid of this simple casting. It could prove problematic in the future
            try {
                jsonObject = (JSONObject) parser.parse(in);
            }
            catch (ParseException e) {
                System.out.println("In ParseException");
                // TODO: Figure out what to do with a ParseException
                jsonObject = null;
            }
        }
        catch (IOException e) {
            // openConnection() failed
            super.getController().errorDisplay(Errors.NETWORK_CONNECTION, super.getName());
            e.printStackTrace();

            jsonObject = null;
        }

        return jsonObject;
    }

    /* Protected */

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

        double extractedPrice = extractPrice(response);

        if (extractedPrice == -1) return -1;

        setHasPrice(true);
        return extractedPrice;
    }

    // TODO: Create a static method to be overwritten that returns the full URL
}
