package com.company.controller.controllers.main_controller;

import com.company.api_calls.APICallerInterface;
import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.currency.FiatCurrencies;
import com.company.controller.ControllerInterface;
import com.company.view.menu_item.about_menu_item.AboutMenuItemContractInterface;

import java.util.ArrayList;

/**
 * The interface for specifically the main controller
 */
public interface MainControllerInterface extends ControllerInterface, AboutMenuItemContractInterface {

    /**
     * Update the prices that are listed on the main screen
     */
    void updatePrices();

    /**
     * Gets the list of websites of URLs to hit
     * @return The list of websites of URLs to hit
     */
    ArrayList<APICallerInterface> getWebsiteList();

    /**
     * Returns the current fiat currency selected
     * @return The current fiat currency selected
     */
    FiatCurrencies getCurrentFiat();

    /**
     * Returns the current cryptocurrency selected
     * @return The current cryptocurrency selected
     */
    CryptoCurrencies getCurrentCrypto();

    /**
     * Updates the currently selected fiatCurrencyPrice
     * @param fiatCurrency The fiat currency to be passed in
     */
    void updateFiatCurrency(final FiatCurrencies fiatCurrency);

    /**
     * Updates the currently selected cryptocurrencyPrice
     * @param cryptoCurrency The cryptocurrency to be passed in
     */
    void updateCryptocurrency(final CryptoCurrencies cryptoCurrency);
}
