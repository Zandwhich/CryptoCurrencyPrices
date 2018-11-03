package com.company.api_calls.individual.CoinMarketCap;

import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public class CoinMarketCapXRP_USD extends AbstractCoinMarketCap {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "52/?convert=USD";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "XRP";

    /**
     * TODO: Fill in
     */
    public final static String FIAT_CURRENCY = "USD";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinMarketCap Ripple/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinMarketCap XRP/USD
     */
    public CoinMarketCapXRP_USD() {
        super(CoinMarketCapXRP_USD.CRYPTO_CURRENCY, CoinMarketCapXRP_USD.FIAT_CURRENCY, CoinMarketCapXRP_USD.NAME,
                CoinMarketCapXRP_USD.URL_EXT);
    }//end CoinMarketCapXRP_USD()

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
    public String getUrlExt() { return CoinMarketCapXRP_USD.URL_EXT; }//end getUrlExt()

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

}//end CoinMarketCapXRP_USD
