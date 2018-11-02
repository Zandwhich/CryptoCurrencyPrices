package com.company.api_calls.individual.CoinBase;

import com.company.api_calls.AbstractJSONCaller;
import com.sun.istack.internal.NotNull;
import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public abstract class AbstractCoinBase extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * The base URL for CoinBase requests
     */
    final static String BASE_URL = "https://api.coinbase.com/v2/prices/";

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
    public AbstractCoinBase(final String cryptoCurrency, final String fiatCurrency, final String name,
                            final String urlExt) {
        super(cryptoCurrency, fiatCurrency, name, AbstractCoinBase.BASE_URL + urlExt);
    }//end AbstractCoinBase()

    /****************
     *   Methods    *
     ****************/

    /* Public */

    // Getters

    /**
     * Returns the base url
     * @return The base url
     */
    @Override
    public String getBaseUrl() { return AbstractCoinBase.BASE_URL; }//end getBaseUrl()

    /* Protected */

    /**
     * TODO: Fill in
     * @param jsonObject
     * @return
     */
    @Override
    protected double extractPrice(@NotNull final JSONObject jsonObject) {
        JSONObject data = (JSONObject) jsonObject.get("data");

        if (data == null || !data.containsKey("amount")) return -1;

        return Double.parseDouble((String) data.get("amount"));
    }//end extractPrice()

}//end AbstractCoinBase
