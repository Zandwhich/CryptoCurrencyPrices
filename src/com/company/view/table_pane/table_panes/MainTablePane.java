package com.company.view.table_pane.table_panes;

import com.company.view.table_pane.AbstractTablePane;

import java.util.Arrays;
import java.util.Vector;

/**
 * TODO: Fill in
 */
public class MainTablePane extends AbstractTablePane {

    /****************
     *    Fields    *
     ****************/

    /**
     * The array that the main table column headers are made from because Vectors are dumb
     */
    private static final String[] DEFAULT_COLUMN_HEADERS_ARRAY = {"Website", "Price"};

    /**
     * The default column headers for the main table
     */
    public static final Vector<String> DEFAULT_COLUMN_HEADERS = new Vector<>(Arrays.asList(MainTablePane.DEFAULT_COLUMN_HEADERS_ARRAY));

    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for the main table pane
     * @param data The data of all of the prices of the cryptocurrencies and whatnot
     */
    public MainTablePane(Vector<Vector<String>> data) {
        super(MainTablePane.DEFAULT_COLUMN_HEADERS, data);
    }//end MainTablePane()

    /****************
     *    Methods   *
     ****************/

}//end MainTablePane
