package com.company.api_calls.individual.CoinCap;

import com.company.api_calls.AbstractJSONCaller;

/**
 * TODO: Fill in
 */
public abstract class AbstractCoinCap extends AbstractJSONCaller {

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
    public AbstractCoinCap(final String currency, final String name, final String url) {
        // TODO: Concatenate the ending of the url with the base string
        super(currency, name, url);
    }//end AbstractCoinCap()

    /****************
     *   Methods    *
     ****************/

    // TODO: Override the extract price method
}//end AbstractCoinCap
