package com.company.api_calls.individual;

import com.company.api_calls.AbstractJSONCaller;
import json_simple.JSONObject;
import json_simple.parser.JSONParser;

/**
 * TODO: Fill in
 */
public class CoinBase extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final String BASE_URL_STRING = "https://api.coinbase.com/v2/prices/spot?currency=";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor that will use USD as the fiat currency
     */
    public CoinBase() {
        super("BTC", "CoinBase Bitcoin", "https://api.coinbase.com/v2/prices/spot?currency=USD");
    }//end CoinBase()

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
}//end CoinBase
