package com.company.view.menu.currencies_menu;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.menu.AbstractJMenu;
import com.company.view.menu_item.crypto_currencies_menu_item.CryptoCurrenciesMenuItem;
import com.company.view.menu_item.crypto_currencies_menu_item.CryptoCurrenciesMenuItemInterface;
import com.company.view.menu_item.fiat_currencies_menu_item.FiatCurrenciesMenuItem;
import com.company.view.menu_item.fiat_currencies_menu_item.FiatCurrenciesMenuItemInterface;

import javax.swing.*;

/**
 * TODO: Fill in
 */
public class CurrenciesMenu extends AbstractJMenu implements CurrenciesMenuInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /**
     * The name of the menu
     */
    public static final String NAME = "Currencies";

    /* Variables */

    /**
     * The menu item that opens the crypto currencies popup
     */
    private CryptoCurrenciesMenuItemInterface cryptoCurrencies;

    /**
     * The menu item that opens the fiat currencies popup
     */
    private FiatCurrenciesMenuItemInterface fiatCurrencies;


    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor
     * @param controller The main controller
     */
    public CurrenciesMenu(MainControllerInterface controller) {
        super(CurrenciesMenu.NAME, controller);
        this.cryptoCurrencies = new CryptoCurrenciesMenuItem(this.getMainController());
        this.fiatCurrencies = new FiatCurrenciesMenuItem(this.getMainController());

        super.add((JMenuItem) this.fiatCurrencies);
        super.add((JMenuItem) this.cryptoCurrencies);
    }//end CurrenciesMenu()


    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * Returns the controller as a main controller
     * @return The controller as a main controller
     */
    private MainControllerInterface getMainController() {
        return (MainControllerInterface) super.getController();
    }//end getMainController()

    /* Protected */

    /* Public */

    // Getters

    // Setters

}//end CurrenciesMenu
