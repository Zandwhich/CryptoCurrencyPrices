package com.company.api_calls.individual.CoinMarketCap;

import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public class CoinMarketCapBTC_EUR extends AbstractCoinMarketCap {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "1/?convert=EUR";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "BTC";

    /**
     * TODO: Fill in
     */
    public final static String FIAT_CURRENCY = "EUR";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinMarketCap Bitcoin/EUR";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinMarketCap BTC/EUR
     */
    public CoinMarketCapBTC_EUR() {
        super(CoinMarketCapBTC_EUR.CRYPTO_CURRENCY, CoinMarketCapBTC_EUR.FIAT_CURRENCY, CoinMarketCapBTC_EUR.NAME,
                CoinMarketCapBTC_EUR.URL_EXT);
    }//end CoinMarketCapBTC_EUR()

    /****************
     *   Methods    *
     ****************/

    /* Public */

    // Getters

    /**
     * Returns the url extension
     * @return The url extension
     */
    @Override
    public String getUrlExt() { return CoinMarketCapBTC_EUR.URL_EXT; }//end getUrlExt()

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

}//end CoinMarketCapBTC_EUR
