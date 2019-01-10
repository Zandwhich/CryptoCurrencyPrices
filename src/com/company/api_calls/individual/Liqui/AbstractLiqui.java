package com.company.api_calls.individual.Liqui;

import com.company.api_calls.AbstractJSONCaller;
import com.company.controller.ControllerInterface;

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

    /**
     * The basic constructor for the Liqui endpoints
     * @param cryptoCurrency
     * @param fiatCurrency
     * @param name
     * @param urlExt
     * @param controller The controller that calls this endpoint
     */
    public AbstractLiqui(final String cryptoCurrency, final String fiatCurrency, final String name,
                         final String urlExt, ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, name, AbstractLiqui.BASE_URL + urlExt, controller);
    }//end AbstractLiqui()

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
    public String getBaseUrl() { return AbstractLiqui.BASE_URL; }//end getBaseUrl()

    /* Protected */

    // TODO: Override the extract price method
}//end AbstractLiqui
