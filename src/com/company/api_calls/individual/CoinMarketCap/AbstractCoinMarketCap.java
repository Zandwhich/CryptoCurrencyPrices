package com.company.api_calls.individual.CoinMarketCap;

import com.company.api_calls.AbstractJSONCaller;

/**
 * TODO: Fill in
 */
public abstract class AbstractCoinMarketCap extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * The base URL for CoinMarketCap requests
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
    public AbstractCoinMarketCap(final String cryptoCurrency, final String fiatCurrency, final String name,
                                 final String urlExt) {
        // TODO: Concatenate the ending of the url with the base string
        super(cryptoCurrency, fiatCurrency, name, AbstractCoinMarketCap.BASE_URL + urlExt);
    }//end AbstractCoinMarketCap()

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
    public String getBaseUrl() { return AbstractCoinMarketCap.BASE_URL; }//end getBaseUrl()

    /* Protected */

    // TODO: Override the extract price method
}//end AbstractCoinMarketCap
