package com.company.view.menu_item.fiat_currencies_menu_item;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.menu_item.AbstractJMenuItem;

/**
 * TODO: Fill in
 */
public class FiatCurrenciesMenuItem extends AbstractJMenuItem implements FiatCurrenciesMenuItemInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /**
     * The name to be displayed
     */
    public final static String NAME = "Fiat Currencies";

    /* Variables */


    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor
     */
    public FiatCurrenciesMenuItem(MainControllerInterface controller) {
        super(FiatCurrenciesMenuItem.NAME, controller);
        this.addActionListener(e -> {
            this.getMainController().fiatCurrenciesPopUp();
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

}//end FiatCurrenciesMenuItem
