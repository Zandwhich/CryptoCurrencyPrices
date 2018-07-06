package com.company.api_calls.individual.CoinCap;

import json_simple.JSONObject;

public class CoinCapBTC_USD extends AbstractCoinCap {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "BTC";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "BTC";

    /**
     * TODO: Fill in
     */
    public final static String FIAT_CURRENCY = "USD";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinCap Bitcoin/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinCap BTC/USD
     */
    public CoinCapBTC_USD() {
        super(CoinCapBTC_USD.CRYPTO_CURRENCY, CoinCapBTC_USD.FIAT_CURRENCY, CoinCapBTC_USD.NAME,
                CoinCapBTC_USD.URL_EXT);
    }//end CoinCapBTC_USD()

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
    public String getUrlExt() { return CoinCapBTC_USD.URL_EXT; }//end getUrlExt()

    /* Protected */

    /**
     * TODO: Fill in
     * @param jsonObject
     * @return
     */
    @Override
    protected double extractFiat(JSONObject jsonObject) {
        return (Double) jsonObject.get("price_usd");
    }//end extractFiat()

}//end CoinCapBTC_USD
