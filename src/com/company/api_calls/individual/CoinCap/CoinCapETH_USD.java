package com.company.api_calls.individual.CoinCap;

import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public class CoinCapETH_USD extends AbstractCoinCap {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "ETH";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "ETH";

    /**
     * TODO: Fill in
     */
    public final static String FIAT_CURRENCY = "USD";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinCap Ethereum/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinCap ETH/USD
     */
    public CoinCapETH_USD() {
        super(CoinCapETH_USD.CRYPTO_CURRENCY, CoinCapETH_USD.FIAT_CURRENCY, CoinCapETH_USD.NAME,
                CoinCapETH_USD.URL_EXT);
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
    public String getUrlExt() { return CoinCapETH_USD.URL_EXT; }//end getUrlExt()

    /* Protected */

    /**
     * TODO: Fill in
     * @param jsonObject
     * @return
     */
    @Override
    public double extractFiat(JSONObject jsonObject) {
        return (Double) jsonObject.get("price_usd");
    }//end extractFiat()

}//end CoinCapETH_USD
