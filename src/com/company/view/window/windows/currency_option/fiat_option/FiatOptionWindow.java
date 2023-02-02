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

    /* ************ *
     *    Fields    *
     * ************ */

    /* Constants */

    /**
     * The title of the window
     */
    public static final String TITLE = "Fiat Currency Options";

    /* Variables */

    /**
     * The table that shows which fiat currencies are currently in use
     */
    private final FiatCurrencyTablePaneInterface table = new FiatCurrencyTablePane(super.getMainController());


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor
     * @param controller The controller
     */
    public FiatOptionWindow(final MainControllerInterface controller) {
        super(FiatOptionWindow.TITLE, controller);
        super.add((JScrollPane) this.table);
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
