package com.company.controller.controllers.main_controller;

import com.company.api_calls_deprecated.APICallerInterface;
import com.company.tools_deprecated.FiatCurrencies;
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

    public abstract FiatCurrencies getCurrentFiat();

    /**
     * Updates the currently selected fiatCurrencyPrice
     */
    public abstract void updateFiatCurrency(FiatCurrencies fiatCurrency);

}//end MainControllerInterface
