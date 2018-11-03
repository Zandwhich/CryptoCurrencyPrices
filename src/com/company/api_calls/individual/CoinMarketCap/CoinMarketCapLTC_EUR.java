package com.company.api_calls.individual.CoinMarketCap;

import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public class CoinMarketCapLTC_EUR extends AbstractCoinMarketCap {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "2/?convert=EUR";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "LTC";

    /**
     * TODO: Fill in
     */
    public final static String FIAT_CURRENCY = "EUR";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinMarketCap Litecoin/EUR";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinMarketCap LTC/EUR
     */
    public CoinMarketCapLTC_EUR() {
        super(CoinMarketCapLTC_EUR.CRYPTO_CURRENCY, CoinMarketCapLTC_EUR.FIAT_CURRENCY, CoinMarketCapLTC_EUR.NAME,
                CoinMarketCapLTC_EUR.URL_EXT);
    }//end CoinMarketCapLTC_USD()

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
    public String getUrlExt() { return CoinMarketCapLTC_EUR.URL_EXT; }//end getUrlExt()

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

}//end CoinMarketCapLTC_EUR
