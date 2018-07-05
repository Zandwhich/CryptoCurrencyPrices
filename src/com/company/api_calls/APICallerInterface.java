package com.company.api_calls;

import java.net.URL;

/**
 * TODO: Fill this out
 */
public interface APICallerInterface {

    // Getters

    /**
     * TODO: Fill this out
     * @return
     */
    public abstract double getPrice();

    /**
     * TODO: Fill this out
     * @return
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
