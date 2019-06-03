package com.company.api_calls_deprecated.individual.Quadrigacx;

import com.company.api_calls_deprecated.AbstractJSONCaller;
import com.company.controller.ControllerInterface;

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
     * @param controller The controller that calls this endpoint
     */
    public AbstractQuadrigacx(final String cryptoCurrency, final String fiatCurrency, final String name,
                              final String urlExt, ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, name, AbstractQuadrigacx.BASE_URL + urlExt, controller);
    }//end AbstractQuadrigacx()

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
    public String getBaseUrl() { return AbstractQuadrigacx.BASE_URL; }//end getBaseUrl()

    /* Protected */

    // TODO: Override the extract price method
}//end AbstractQuadrigacx
