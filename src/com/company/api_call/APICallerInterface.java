package com.company.api_call;

import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.currency.FiatCurrencies;

import java.net.URL;

/**
 * The abstract API caller interface for all classes which will call APIs
 */
public interface APICallerInterface {

    /**
     * Returns the current price
     * @return The current price
     */
    double getPrice();

    /**
     * Returns if the API endpoint can use the given cryptocurrency
     * @param cryptoCurrency The cryptocurrency to check
     * @return If the given cryptocurrency can be used with this endpoint
     */
    boolean canUseCryptoCurrency(final CryptoCurrencies cryptoCurrency);

    /**
     * Returns if the API endpoint can use the given fiat currency
     * @param fiatCurrency The fiat currency to check
     * @return If the given fiat currency can be used with this endpoint
     */
    boolean canUseFiatCurrency(final FiatCurrencies fiatCurrency);

    /**
     * Sets the current cryptocurrency that will be used for this endpoint
     * @param cryptoCurrency The cryptocurrency to be used for this endpoint
     */
    void setCryptoCurrency(final CryptoCurrencies cryptoCurrency);

    /**
     * Sets the current fiat currency that will be used for this endpoint
     * @param fiatCurrency The fiat currency to be used for this endpoint
     */
    void setFiatCurrency(final FiatCurrencies fiatCurrency);

    /**
     * Returns the cryptocurrency
     * @return The cryptocurrency
     */
    CryptoCurrencies getCurrentCryptoCurrency();

    /**
     * Returns the fiat currency
     * @return The fiat currency
     */
    FiatCurrencies getCurrentFiatCurrency();

    /**
     * Updates the price and notifies the controller
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
     * Returns if this API endpoint is currently active
     * @return If this API endpoint is currently active
     */
    boolean isActive();

    /**
     * Sets if this API endpoint should be currently active
     * @param active If this endpoint is active or not
     */
    void setActive(final boolean active);

}
