package com.company.controller.controllers.main_controller;

import com.company.api_calls.APICallerInterface;
import com.company.tools.FiatCurrencies;
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
     * Updates the currently selected fiatCurrencyPrice
     */
    public abstract void updateFiatCurrency(FiatCurrencies fiatCurrency);

    /**
     * Brings up the fiat currencies popup
     */
    public abstract void fiatCurrenciesPopUp();

    /**
     * Brings up the cryptocurrencies popup
     */
    public abstract void cryptoCurrenciesPopUp();

}//end MainControllerInterface
