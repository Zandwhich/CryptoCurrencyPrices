package com.company.api_calls.individual.CoinBase;

import com.company.api_calls.AbstractJSONCaller;
import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public abstract class AbstractCoinBase extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * TODO: Fill in
     * @param currency
     * @param name
     * @param url
     */
    public AbstractCoinBase(String currency, String name, String url) {
        super(currency, name, url);
    }//end AbstractCoinBase()

    /****************
     *   Methods    *
     ****************/

    /**
     * TODO: Fill in
     * @param jsonObject
     * @return
     */
    @Override
    protected double extractPrice(JSONObject jsonObject) {
        if (jsonObject == null) return -1;

        JSONObject data = (JSONObject) jsonObject.get("data");

        if (data == null) return -1;

        return Double.parseDouble((String) data.get("amount"));
    }//end extractPrice()
}//end AbstractCoinBase
