package com.company.view.window.windows.currency_option.fiat_option;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.table_pane.table_panes.fiat_currency_option.FiatCurrencyTablePane;
import com.company.view.table_pane.table_panes.fiat_currency_option.FiatCurrencyTablePaneInterface;
import com.company.view.window.windows.currency_option.AbstractCurrencyOptionWindow;

import javax.swing.*;

/**
 * TODO: Fill in
 */
public class FiatOptionWindow extends AbstractCurrencyOptionWindow implements FiatOptionWindowInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /**
     * The title of the window
     */
    public static final String TITLE = "Fiat Currency Options";

    /* Variables */

    /**
     * The table that shows which fiat currencies are currently in use
     */
    private FiatCurrencyTablePaneInterface table = new FiatCurrencyTablePane();


    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor
     * @param controller The controller
     * @param xLocation The x position
     * @param yLocation The y position
     */
    public FiatOptionWindow(MainControllerInterface controller, int xLocation, int yLocation) {
        super(FiatOptionWindow.TITLE, controller, xLocation, yLocation);
        super.add((JScrollPane) this.table);
    }//end FiatOptionWindow()


    /****************
     *    Methods   *
     ****************/

    /* Private */

    /* Protected */

    /* Public */

    // Getters

    // Setters

}//end FiatOptionWindow
