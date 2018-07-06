package com.company.api_calls.individual.CoinMarketCap;

import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public class CoinMarketCapETH_USD extends AbstractCoinMarketCap {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "1027/?convert=USD";

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
    public final static String NAME = "CoinMarketCap Ethereum/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinMarketCap ETH/USD
     */
    public CoinMarketCapETH_USD() {
        super(CoinMarketCapETH_USD.CRYPTO_CURRENCY, CoinMarketCapETH_USD.FIAT_CURRENCY, CoinMarketCapETH_USD.NAME,
                CoinMarketCapETH_USD.URL_EXT);
    }//end CoinMarketCapETH_USD()

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
    public String getUrlExt() { return CoinMarketCapETH_USD.URL_EXT; }//end getUrlExt()

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

}//end CoinMarketCapETH_USD
