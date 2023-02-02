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

    /* ************ *
     *    Fields    *
     * ************ */

    /* Constants */

    /**
     * The title of the window
     */
    public static final String TITLE = "CryptoCurrency Options";

    /* Variables */

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor
     * @param controller The controller
     */
    public CryptoOptionWindow(MainControllerInterface controller) {
        super(CryptoOptionWindow.TITLE, controller);
        super.add(new CryptoCurrencyTablePane());
    }


    /* ************ *
     *    Methods   *
     * ************ */

    /* Private */

    /* Protected */

    /* Public */

    // Getters

    // Setters

}
