package com.company.api_calls.individual.Quadrigacx;

import com.company.api_calls.AbstractJSONCaller;

/**
 * TODO: Fill in
 */
public abstract class AbstractQuadrigacx extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * The base URL for Quadrigacx requests
     * TODO: Put in actual base URL
     */
    public final static String BASE_URL = "";

    /****************
     * Constructors *
     ****************/

    /**
     * TODO: Fill in
     * @param cryptoCurrency
     * @param fiatCurrency
     * @param name
     * @param urlExt
     */
    public AbstractQuadrigacx(final String cryptoCurrency, final String fiatCurrency, final String name,
                              final String urlExt) {
        super(cryptoCurrency, fiatCurrency, name, AbstractQuadrigacx.BASE_URL + urlExt);
    }//end AbstractQuadrigacx()

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
    public String getBaseUrl() { return AbstractQuadrigacx.BASE_URL; }//end getBaseUrl()

    /* Protected */

    // TODO: Override the extract price method
}//end AbstractQuadrigacx
