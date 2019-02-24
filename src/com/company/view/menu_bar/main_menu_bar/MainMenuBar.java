package com.company.view.menu_bar.main_menu_bar;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.menu.currencies_menu.CurrenciesMenu;
import com.company.view.menu.currencies_menu.CurrenciesMenuInterface;
import com.company.view.menu_bar.AbstractJMenuBar;

import javax.swing.*;

/**
 * TODO: Fill in
 */
public class MainMenuBar extends AbstractJMenuBar implements MainMenuBarInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /* Variables */

    /**
     * The menu that displays editing information for the currencies.
     */
    private CurrenciesMenuInterface currenciesMenu;


    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor
     * @param controller The main controller
     */
    public MainMenuBar(MainControllerInterface controller) {
        super(controller);
        this.currenciesMenu = new CurrenciesMenu(this.getMainController());

        super.add((JMenu) this.currenciesMenu);
    }//end MainMenuBar()


    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * Returns the controller as the main controller
     * @return The controller as the main controller
     */
    private MainControllerInterface getMainController() {
        return (MainControllerInterface) super.getController();
    }//end getMainController()

    /* Protected */

    /* Public */

    // Getters

    // Setters

}//end MainMenuBar
