package com.company.api_calls;

import java.net.URL;

/**
 * The abstract API caller interface for all classes which will call APIs
 */
public interface APICallerInterface {

    // Getters

    /**
     * Returns the current price
     * @return The current price
     */
    public abstract double getPrice();

    /**
     * Returns the cryptocurrency
     * @return The cryptocurrency
     */
    public abstract String getCryptoCurrency();

    /**
     * TODO: Fill this out
     * @return
     */
    public abstract String getFiatCurrency();

    /**
     * TODO: Fill this out
     * @return
     */
    public abstract boolean getHasPrice();

    /**
     * TODO: Fill this out
     */
    public abstract void updatePrice();

    /**
     * TODO: Fill this out
     * @return
     */
    public abstract String getName();

    /**
     * TODO: Fill this out
     * @return
     */
    public abstract URL getUrl();

    /**
     * TODO: Fill this out
     * @return
     */
    public abstract String getUrlString();

}//end AbstractAPICaller
