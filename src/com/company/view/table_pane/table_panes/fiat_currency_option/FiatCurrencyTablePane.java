package com.company.view.table_pane.table_panes.fiat_currency_option;

import com.company.view.table_pane.AbstractJTablePane;

import java.util.Arrays;
import java.util.Vector;

/**
 * TODO: Fill in
 */
public class FiatCurrencyTablePane extends AbstractJTablePane implements FiatCurrencyTablePaneInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /**
     * The column headers names
     */
    private static final String[] COLUMN_HEADERS_ARRAY = {"Fiat Currency", "In Use"};

    /**
     * The column headers
     */
    public static final Vector<String> COLUMN_HEADERS =
            new Vector<>(Arrays.asList(FiatCurrencyTablePane.COLUMN_HEADERS_ARRAY));


    /* Variables */


    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor
     */
    public FiatCurrencyTablePane() {
        super(FiatCurrencyTablePane.COLUMN_HEADERS, null);
        super.setColumnMovingAllowed(false);
    }//end FiatCurrencyTablePane()


    /****************
     *    Methods   *
     ****************/

    /* Private */

    /* Protected */

    /* Public */

    // Getters

    // Setters

}//end FiatCurrencyTablePane
