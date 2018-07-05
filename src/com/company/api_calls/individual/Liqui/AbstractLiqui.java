package com.company.api_calls.individual.Liqui;

import com.company.api_calls.AbstractJSONCaller;

/**
 * TODO: Fill in
 */
public abstract class AbstractLiqui extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * The base URL for Liqui requests
     * TODO: Put in actual base URL
     */
    public final static String BASE_URL = "";

    /****************
     * Constructors *
     ****************/

    public AbstractLiqui(final String cryptoCurrency, final String fiatCurrency, final String name,
                         final String urlExt) {
        super(cryptoCurrency, fiatCurrency, name, AbstractLiqui.BASE_URL + urlExt);
    }//end AbstractLiqui()

    /****************
     *   Methods    *
     ****************/

    /* Public */

    // Getters

    /**
     * TODO: Fill in
     * @return
     */
    @Override
    public String getBaseUrl() { return AbstractLiqui.BASE_URL; }//end getBaseUrl()

    /* Protected */

    // TODO: Override the extract price method
}//end AbstractLiqui
