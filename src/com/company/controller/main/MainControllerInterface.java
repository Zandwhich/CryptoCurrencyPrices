package com.company.controller.main;

import com.company.api_call.APICallerInterface;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.controller.ControllerInterface;
import com.company.view.combo_box.crypto_dropdown.CryptoDropdownContractInterface;
import com.company.view.combo_box.fiat_dropdown.FiatDropdownContractInterface;
import com.company.view.menu_item.about.AboutMenuItemContractInterface;

import java.util.ArrayList;

/**
 * The interface for specifically the main controller
 */
public interface MainControllerInterface extends
        ControllerInterface,
        AboutMenuItemContractInterface,
        CryptoDropdownContractInterface,
        FiatDropdownContractInterface
{

    /**
     * Update the prices that are listed on the main screen
     */
    void updatePrices();

    /**
     * Gets the list of websites of URLs to hit
     * @return The list of websites of URLs to hit
     */
    ArrayList<APICallerInterface> getEndpointList();

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
}
