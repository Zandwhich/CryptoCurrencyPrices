package com.company.api_calls.individual.CoinMarketCap;

import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public class CoinMarketCapXRP_EUR extends AbstractCoinMarketCap {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "52/?convert=EUR";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "XRP";

    /**
     * TODO: Fill in
     */
    public final static String FIAT_CURRENCY = "EUR";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinMarketCap Ripple/EUR";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinMarketCap XRP/EUR
     */
    public CoinMarketCapXRP_EUR() {
        super(CoinMarketCapXRP_EUR.CRYPTO_CURRENCY, CoinMarketCapXRP_EUR.FIAT_CURRENCY, CoinMarketCapXRP_EUR.NAME,
                CoinMarketCapXRP_EUR.URL_EXT);
    }//end CoinMarketCapXRP_EUR()

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
    public String getUrlExt() { return CoinMarketCapXRP_EUR.URL_EXT; }//end getUrlExt()

    /* Protected */

    /**
     * TODO: Fill in
     * @param quotes
     * @return
     */
    @Override
    protected double extractFiat(JSONObject quotes) {
        JSONObject USD = (JSONObject) quotes.get("EUR");

        if (USD == null) return -1;

        return (Double) USD.get("price");
    }//end extractFiat()

}//end CoinMarketCapXRP_EUR
