package com.company.api_calls.individual.CryptoCompare;

import com.company.api_calls.AbstractJSONCaller;

/**
 * TODO: Fill in
 */
public abstract class AbstractCryptoCompare extends AbstractJSONCaller {

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
    public AbstractCryptoCompare(final String currency, final String name, final String url) {
        // TODO: Concatenate the ending of the url with the base string
        super(currency, name, url);
    }//end AbstractCryptoCompare()

    /****************
     *   Methods    *
     ****************/

    // TODO: Override the extract price method
}//end AbstractCryptoCompare
