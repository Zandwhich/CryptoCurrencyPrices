package com.company.api_calls.individual.CoinMarketCap;

import com.company.api_calls.AbstractJSONCaller;

/**
 * TODO: Fill in
 */
public abstract class AbstractCoinMarketCap extends AbstractJSONCaller {

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
    public AbstractCoinMarketCap(final String currency, final String name, final String url) {
        // TODO: Concatenate the ending of the url with the base string
        super(currency, name, url);
    }//end AbstractCoinMarketCap()

    /****************
     *   Methods    *
     ****************/

    // TODO: Override the extract price method
}//end AbstractCoinMarketCap
