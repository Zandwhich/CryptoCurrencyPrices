package com.company.api_calls.individual.CoinMarketCap;

import json_simple.JSONObject;

/**
 * The class used for CoinMarketCap ETH to EUR
 */
public class CoinMarketCapETH_EUR extends AbstractCoinMarketCap {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "1027/?convert=EUR";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "ETH";

    /**
     * TODO: Fill in
     */
    public final static String FIAT_CURRENCY = "EUR";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinMarketCap Ethereum/EUR";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinMarketCap ETH/EUR
     */
    public CoinMarketCapETH_EUR() {
        super(CoinMarketCapETH_EUR.CRYPTO_CURRENCY, CoinMarketCapETH_EUR.FIAT_CURRENCY, CoinMarketCapETH_EUR.NAME,
                CoinMarketCapETH_EUR.URL_EXT);
    }//end CoinMarketCapETH_EUR()

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
    public String getUrlExt() { return CoinMarketCapETH_EUR.URL_EXT; }//end getUrlExt()

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

}//end CoinMarketCapETH_EUR
