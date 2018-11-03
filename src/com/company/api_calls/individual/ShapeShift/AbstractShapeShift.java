package com.company.api_calls.individual.ShapeShift;

import com.company.api_calls.AbstractJSONCaller;

/**
 * TODO: Fill in
 */
public abstract class AbstractShapeShift extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * The base URL for ShapeShift requests
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
    public AbstractShapeShift(final String cryptoCurrency, final String fiatCurrency, final String name,
                              final String urlExt) {
        super(cryptoCurrency, fiatCurrency, name, AbstractShapeShift.BASE_URL + urlExt);
    }//end AbstractShapeShift()

    /****************
     *   Methods    *
     ****************/

    /* Public */

    // Getters

    /**
     * Returns the base URL
     * @return The base URL
     */
    @Override
    public String getBaseUrl() { return AbstractShapeShift.BASE_URL; }//end getBaseUrl()

    /* Protected */

    // TODO: Override the extract price method
}//end AbstractShapeShift
