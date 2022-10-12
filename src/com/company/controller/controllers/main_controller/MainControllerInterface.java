package com.company.controller.controllers.main_controller;

import com.company.api_calls.APICallerInterface;
import com.company.tools.enums.CryptoCurrencies;
import com.company.tools.enums.FiatCurrencies;
import com.company.controller.ControllerInterface;

import java.util.ArrayList;

/**
 * The interface for specifically the main controller
 */
public interface MainControllerInterface extends ControllerInterface {

    /**
     * Update the prices that are listed on the main screen
     */
    public abstract void updatePrices();

    /**
     * Gets the list of websites of URLs to hit
     * @return The list of websites of URLs to hit
     */
    public abstract ArrayList<APICallerInterface> getWebsiteList();

    /**
     * Returns the current fiat currency selected
     * @return The current fiat currency selected
     */
    public abstract FiatCurrencies getCurrentFiat();

    /**
     * Returns the current cryptocurrency selected
     * @return The current cryptocurrency selected
     */
    public abstract CryptoCurrencies getCurrentCrypto();

    /**
     * Updates the currently selected fiatCurrencyPrice
     * @param fiatCurrency The fiat currency to be passed in
     */
    public abstract void updateFiatCurrency(FiatCurrencies fiatCurrency);

    /**
     * Updates the currently selected cryptocurrencyPrice
     * @param cryptoCurrency The cryptocurrency to be passed in
     */
    public abstract void updateCryptocurrency(CryptoCurrencies cryptoCurrency);
}
