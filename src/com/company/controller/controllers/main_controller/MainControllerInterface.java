package com.company.controller.controllers.main_controller;

import com.company.api_calls.APICallerInterface;
import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.currency.FiatCurrencies;
import com.company.controller.ControllerInterface;

import java.util.ArrayList;
import java.util.Vector;

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
     *
     * @return The list of websites of URLs to hit
     */
    public abstract ArrayList<APICallerInterface> getWebsiteList();

    /**
     * Returns the current fiat currency selected
     *
     * @return The current fiat currency selected
     */
    public abstract FiatCurrencies getCurrentFiat();

    /**
     * Returns the current cryptocurrency selected
     *
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

    /**
     * Brings up the fiat currencies popup
     */
    public abstract void fiatCurrenciesPopUp();

    /**
     * Brings up the cryptocurrencies popup
     */
    public abstract void cryptoCurrenciesPopUp();

    /**
     * Returns the fiatCurrenciesHash as a vector of objects, with the first vector being the strings,
     * and the second vector being if they are boolean values
     *
     * @return The fiatCurrenciesHash as a vector of 2 vectors: the keys and the values
     */
    public abstract Vector<Vector<Object>> getFiatHashAsVector();

}

