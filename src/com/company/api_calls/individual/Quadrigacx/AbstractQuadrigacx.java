package com.company.api_calls.individual.Quadrigacx;

import com.company.api_calls.AbstractJSONCaller;

/**
 * TODO: Fill in
 */
public abstract class AbstractQuadrigacx extends AbstractJSONCaller {
    /****************
     *    Fields    *
     ****************/

    // TODO: Have a final static base url string

    /****************
     * Constructors *
     ****************/

    /**
     * TODO: Fill in
     * @param currency
     * @param name
     * @param url
     */
    public AbstractQuadrigacx(final String currency, final String name, final String url) {
        // TODO: Concatenate the ending of the url with the base string
        super(currency, name, url);
    }//end AbstractQuadrigacx()

    /****************
     *   Methods    *
     ****************/

    // TODO: Override the extract price method
}//end AbstractQuadrigacx
