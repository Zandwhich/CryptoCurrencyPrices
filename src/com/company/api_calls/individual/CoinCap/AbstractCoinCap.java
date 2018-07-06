package com.company.api_calls.individual.CoinCap;

import com.company.api_calls.AbstractJSONCaller;
import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public abstract class AbstractCoinCap extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * The base URL for CoinCap requests
     */
    public final static String BASE_URL = "http://coincap.io/page/";

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

    /**
     * TODO: Fill in
     * @param jsonObject
     * @return
     */
    @Override
    protected double extractPrice(JSONObject jsonObject) {
        if (jsonObject == null) return -1;

        // TODO: Figure out how to stop getting denied

        return this.extractFiat(jsonObject);
    }//end extractPrice()

    /**
     * TODO: Fill in
     * @param jsonObject
     * @return
     */
    protected abstract double extractFiat(JSONObject jsonObject);

}//end AbstractCoinCap
