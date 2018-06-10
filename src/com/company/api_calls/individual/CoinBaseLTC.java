package com.company.api_calls.individual;

import com.company.api_calls.AbstractJSONCaller;
import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public class CoinBaseLTC extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final String BASE_URL_STRING = "https://api.coinbase.com/v2/prices/LTC-USD/buy";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor that will use USD as the fiat currency
     */
    public CoinBaseLTC() {
        super("LTC", "CoinBaseBTC Litecoin", "https://api.coinbase.com/v2/prices/LTC-USD/buy");
    }//end CoinBaseBTC()

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
}//end CoinBaseLTC
