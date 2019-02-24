package com.company.view.menu_item.crypto_currencies_menu_item;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.menu_item.AbstractJMenuItem;

/**
 * TODO: Fill in
 */
public class CryptoCurrenciesMenuItem extends AbstractJMenuItem implements CryptoCurrenciesMenuItemInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /**
     * The name to be displayed
     */
    public final static String NAME = "Cryptocurrencies";

    /* Variables */


    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor
     */
    public CryptoCurrenciesMenuItem(MainControllerInterface controller) {
        super(CryptoCurrenciesMenuItem.NAME, controller);
        this.addActionListener(e -> {
            this.getMainController().cryptoCurrenciesPopUp();
        });
    }//end FiatCurrenciesMenuItem()


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

}//end CryptoCurrenciesMenuItem
