package com.company.api_calls;

import json_simple.JSONObject;
import json_simple.JSONValue;
import json_simple.parser.JSONParser;
import json_simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URLConnection;

/**
 * TODO: Fill this out
 */
public abstract class AbstractJSONCaller extends AbstractAPICaller {

    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * TODO: Fill in
     * @param cryptoCurrency
     * @param fiatCurrency
     * @param name
     * @param url
     */
    public AbstractJSONCaller(final String cryptoCurrency, final String fiatCurrency, final String name,
                              final String url) {
        super(cryptoCurrency, fiatCurrency, name, url);
    }//end AbstractJSONCaller()

    /****************
     *   Methods    *
     ****************/

    /* Private */

    /**
     * TODO: Fill this out
     * @return
     */
    private JSONObject getRequestCall() {

        /*
        Refer to:
            https://docs.oracle.com/javase/tutorial/networking/urls/connecting.html
            https://docs.oracle.com/javase/tutorial/networking/urls/readingWriting.html
            https://docs.oracle.com/javase/tutorial/networking/urls/readingURL.html
            https://stackoverflow.com/questions/2793150/how-to-use-java-net-urlconnection-to-fire-and-handle-http-requests
         */

        JSONObject jsonObject;
        try {
            // Setup the connection and get the input stream
            URLConnection connection = this.getUrl().openConnection();
            connection.connect();
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            JSONParser parser = new JSONParser();

            // Parse the input stream into a JSONObject
            // TODO: Eventually get rid of this simple casting. It could prove problematic in the future
            try {
                jsonObject = (JSONObject) parser.parse(in);
            }//end try
            catch (ParseException e) {
                // TODO: Figure out what to do with a ParseException
                jsonObject = null;
            }//end catch (ParseException)
        }//end try
        catch (IOException e) {
            // openConnection() failed

            jsonObject = null;
            // TODO: Figure out exactly what to do when the connection fails
        }//end catch IOException

        return jsonObject;
    }//end getRequestCall()

    /* Protected */

    /**
     * TODO: Fill in
     * @param jsonObject
     * @return
     */
    protected abstract double extractPrice(JSONObject jsonObject);

    /**
     * TODO: Fill in
     * @return
     */
    @Override
    protected double getNewPrice() { return extractPrice(getRequestCall()); }//end getNewPrice()
}//end AbstractJSONCaller
