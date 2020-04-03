package com.company.api_calls;

import com.company.tools.enums.CryptoCurrencies;
import com.company.tools.enums.FiatCurrencies;

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
    public abstract CryptoCurrencies getCryptoCurrency();

    /**
     * Returns the fiat currency
     * @return The fiat currency
     */
    public abstract FiatCurrencies getFiatCurrency();

    /**
     * Returns if a price has been obtained
     * @return If a price has been obtained
     */
    public abstract boolean getHasPrice();

    /**
     * TODO: Fill this out
     */
    public abstract void updatePrice();

    /**
     * Returns the name of the API endpoint
     * @return The name of the API endpoint
     */
    public abstract String getName();

    /**
     * Returns the URL of the endpoint
     * @return The URL of the endpoint
     */
    public abstract URL getUrl();

    /**
     * Returns the URL in a String format
     * @return The URL in a String format
     */
    public abstract String getUrlString();

}//end AbstractAPICaller
