package com.company.view.table_pane.table_panes;

import com.company.view.table_pane.AbstractTablePane;

import java.util.Vector;

/**
 * TODO: Fill in
 */
public class MainTablePane extends AbstractTablePane {

    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for the main table pane
     * @param data The data of all of the prices of the cryptocurrencies and whatnot
     */
    public MainTablePane(Vector<Vector<String>> data) {
        super(MainTablePane.createColumns(), data);
    }//end MainTablePane()

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * Static method to create the columns for the constructor
     * @return The columns
     */
    private static Vector<String> createColumns() {
        Vector<String> columns = new Vector<>();
        // TODO: Actually put in the correct headers
        columns.add("test");
        return columns;
    }//end createColumns()
}//end MainTablePane
