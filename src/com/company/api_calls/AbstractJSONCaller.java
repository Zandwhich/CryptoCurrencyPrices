package com.company.api_calls;

import json_simple.JSONObject;
import json_simple.JSONValue;

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
     * A constructor for the Abstract JSON caller
     * @param currency
     */
    public AbstractJSONCaller(final String currency, final String name, final String url) {
        super(currency, name, url);
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

            // Parse the input stream into a JSONObject
            // TODO: Eventually get rid of this simple casting. It could prove problematic in the future
            jsonObject = (JSONObject) JSONValue.parseWithException(in);
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
