package com.company.view.menu.crypto_currency_prices_menu;

import com.company.view.menu.AbstractJMenu;
import com.company.view.menu_item.about_menu_item.AboutJMenuItem;
import com.company.view.menu_item.about_menu_item.AboutMenuItemContractInterface;

/**
 * The instantiation of the "CryptoCurrency Prices" menu
 */
final public class CryptoCurrencyPrices extends AbstractJMenu implements CryptoCurrencyPricesInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The name of the menu
     */
    public static final String NAME = "CryptoCurrency Prices";


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor
     * @param controller The controller that will implement the action to open the about page
     */
    public CryptoCurrencyPrices(final AboutMenuItemContractInterface controller) {
        super(CryptoCurrencyPrices.NAME);

        super.add(new AboutJMenuItem(controller));
    }

}
