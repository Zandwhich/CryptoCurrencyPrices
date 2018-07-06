package com.company.api_calls.individual.CoinMarketCap;

import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public class CoinMarketCapLTC_USD extends AbstractCoinMarketCap {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "2/?convert=USD";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "LTC";

    /**
     * TODO: Fill in
     */
    public final static String FIAT_CURRENCY = "USD";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinMarketCap Litecoin/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinMarketCap LTC/USD
     */
    public CoinMarketCapLTC_USD() {
        super(CoinMarketCapLTC_USD.CRYPTO_CURRENCY, CoinMarketCapLTC_USD.FIAT_CURRENCY, CoinMarketCapLTC_USD.NAME,
                CoinMarketCapLTC_USD.URL_EXT);
    }//end CoinMarketCapLTC_USD()

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
    public String getUrlExt() { return CoinMarketCapLTC_USD.URL_EXT; }//end getUrlExt()

    /* Protected */

    /**
     * TODO: Fill in
     * @param quotes
     * @return
     */
    @Override
    protected double extractFiat(JSONObject quotes) {
        JSONObject USD = (JSONObject) quotes.get("USD");

        if (USD == null) return -1;

        return (Double) USD.get("price");
    }//end extractFiat()

}//end CoinMarketCapLTC_USD
