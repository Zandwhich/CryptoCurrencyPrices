package com.company.api_calls.individual.CoinCap;

import com.company.api_calls.AbstractJSONCaller;

/**
 * TODO: Fill in
 */
public abstract class AbstractCoinCap extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * The base URL for CoinCap requests
     * TODO: Put in correct base URL
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
    public AbstractCoinCap(final String cryptoCurrency, final String fiatCurrency, final String name,
                           final String urlExt) {
        super(cryptoCurrency, fiatCurrency, name, AbstractCoinCap.BASE_URL + urlExt);
    }//end AbstractCoinCap()

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
    public String getBaseUrl() { return AbstractCoinCap.BASE_URL; }//end getBaseUrl()

    /* Protected */

    // TODO: Override the extract price method
}//end AbstractCoinCap
