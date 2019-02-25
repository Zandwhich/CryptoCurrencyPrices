package com.company.view.window.windows.currency_option.crypto_option;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.table_pane.table_panes.crypto_currency_option.CryptoCurrencyTablePane;
import com.company.view.table_pane.table_panes.crypto_currency_option.CryptoCurrencyTablePaneInterface;
import com.company.view.window.windows.currency_option.AbstractCurrencyOptionWindow;

import javax.swing.*;

/**
 * TODO: Fill in
 */
public class CryptoOptionWindow extends AbstractCurrencyOptionWindow implements CryptoOptionWindowInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /**
     * The title of the window
     */
    public static final String TITLE = "CryptoCurrency Options";

    /* Variables */

    /**
     * The table that shows which fiat currencies are currently in use
     */
    private CryptoCurrencyTablePaneInterface table = new CryptoCurrencyTablePane();


    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor
     * @param controller The controller
     * @param xLocation The x position
     * @param yLocation The y position
     */
    public CryptoOptionWindow(MainControllerInterface controller, int xLocation, int yLocation) {
        super(CryptoOptionWindow.TITLE, controller, xLocation, yLocation);
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

}//end CryptoOptionWindow
