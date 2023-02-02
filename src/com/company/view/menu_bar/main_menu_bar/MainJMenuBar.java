package com.company.view.menu_bar.main_menu_bar;

import com.company.view.menu.crypto_currency_prices_menu.CryptoCurrencyPrices;
import com.company.view.menu_bar.AbstractJMenuBar;
import com.company.view.menu_item.about_menu_item.AboutMenuItemContractInterface;

public final class MainJMenuBar extends AbstractJMenuBar implements MainMenuBarInterface {

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor
     * @param aboutMenuItemController The controller that will open up the about menu item
     */
    public MainJMenuBar(final AboutMenuItemContractInterface aboutMenuItemController) {
        super();

        super.add(new CryptoCurrencyPrices(aboutMenuItemController));
    }
}
