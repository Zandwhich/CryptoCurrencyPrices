package com.company;

import com.oracle.javafx.jmx.json.JSONReader;

import java.io.InputStream;
import java.net.URL;

public abstract class AbstractJSONCaller extends AbstractAPICaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * The url to hit
     */
    private URL url;


    /****************
     * Constructors *
     ****************/

    public AbstractJSONCaller(String currency) {
        // TODO: Figure out what I'm doing here (specifically with the names I think)
        super(currency);
    }//end AbstractJSONCaller()

    /****************
     *   Methods    *
     ****************/

    @Override
    protected double getNewPrice() {
        // TODO: Figure out how to do the JSON
        try {
            InputStream is = url.openStream();
            JSONReader reader = ;
            JSON

        }
        catch (Exception e) {
            // If we can't get the new price, return the price that we have
            // TODO: Do something in the future to notify there was a failure in getting the updated price
            return this.getPrice();
        }
    }//end getNewPrice()
}//end AbstractJSONCaller
