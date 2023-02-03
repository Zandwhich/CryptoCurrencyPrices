package com.company.view.menu.crypto_currency_prices;

import com.company.view.menu.AbstractJMenu;
import com.company.view.menu_item.about.AboutJMenuItem;
import com.company.view.menu_item.about.AboutMenuItemContractInterface;

/**
 * The instantiation of the "CryptoCurrency Prices" menu
 */
final public class CryptoCurrencyPricesJMenu extends AbstractJMenu implements CryptoCurrencyPricesInterface {

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
    public CryptoCurrencyPricesJMenu(final AboutMenuItemContractInterface controller) {
        super(CryptoCurrencyPricesJMenu.NAME);

        super.add(new AboutJMenuItem(controller));
    }

}
