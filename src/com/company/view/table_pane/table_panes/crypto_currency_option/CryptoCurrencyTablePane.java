package com.company.view.table_pane.table_panes.crypto_currency_option;

import com.company.view.table_pane.AbstractJTablePane;

import java.util.Arrays;
import java.util.Vector;

/**
 * TODO: Fill in
 */
public class CryptoCurrencyTablePane extends AbstractJTablePane implements CryptoCurrencyTablePaneInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /**
     * The column headers names
     */
    private static final String[] COLUMN_HEADERS_ARRAY = {"CryptoCurrency", "In Use"};

    /**
     * The column headers
     */
    public static final Vector<String> COLUMN_HEADERS =
            new Vector<>(Arrays.asList(CryptoCurrencyTablePane.COLUMN_HEADERS_ARRAY));

    /* Variables */


    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor
     */
    public CryptoCurrencyTablePane() {
        super(CryptoCurrencyTablePane.COLUMN_HEADERS, null);
    }//end FiatCurrencyTablePane()


    /****************
     *    Methods   *
     ****************/

    /* Private */

    /* Protected */

    /* Public */

    // Getters

    // Setters

}//end CryptoCurrencyTablePane
