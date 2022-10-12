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
    double getPrice();

    /**
     * Returns the cryptocurrency
     * @return The cryptocurrency
     */
    CryptoCurrencies getCryptoCurrency();

    /**
     * Returns the fiat currency
     * @return The fiat currency
     */
    FiatCurrencies getFiatCurrency();

    /**
     * Returns if a price has been obtained
     * @return If a price has been obtained
     */
    boolean getHasPrice();

    /**
     * TODO: Fill this out
     */
    void updatePriceAndNotify();

    /**
     * Returns the name of the API endpoint
     * @return The name of the API endpoint
     */
    String getName();

    /**
     * Returns the URL of the endpoint
     * @return The URL of the endpoint
     */
    URL getUrl();

    /**
     * Returns the URL in a String format
     * @return The URL in a String format
     */
    String getUrlString();

}
