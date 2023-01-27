package com.company.view.table_pane.table_panes.MainTablePane;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.table_pane.AbstractJTablePane;

import java.util.Arrays;
import java.util.Vector;

/**
 * The main table that displays the prices
 */
final public class MainTablePane extends AbstractTablePane implements MainTablePaneInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The array that the main table column headers are made from because Vectors are dumb
     */
    private static final String[] DEFAULT_COLUMN_HEADERS_ARRAY = {"Website", "Price"};

    /**
     * The default column headers for the main table
     */
    public static final Vector<String> DEFAULT_COLUMN_HEADERS =
            new Vector<>(Arrays.asList(MainTablePane.DEFAULT_COLUMN_HEADERS_ARRAY));

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for the main table pane
     * @param controller The main controller
     * @param data The data of all the prices of the cryptocurrencies and whatnot
     */
    public MainTablePane(MainControllerInterface controller, Vector<Vector<String>> data) {
        super(controller, MainTablePane.DEFAULT_COLUMN_HEADERS, data);
        super.disableTableEditable();
    }

    /* ************ *
     *    Methods   *
     * ************ */

}
