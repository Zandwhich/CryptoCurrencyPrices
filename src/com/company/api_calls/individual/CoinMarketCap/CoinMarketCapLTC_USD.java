package com.company.api_calls.individual.CoinMarketCap;

import com.company.controller.ControllerInterface;
import json_simple.JSONObject;

/**
 * The class used for CoinMarketCap LTC to USD
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
     * @param controller The controller that calls this endpoint
     */
    public CoinMarketCapLTC_USD(ControllerInterface controller) {
        super(CoinMarketCapLTC_USD.CRYPTO_CURRENCY, CoinMarketCapLTC_USD.FIAT_CURRENCY, CoinMarketCapLTC_USD.NAME,
                CoinMarketCapLTC_USD.URL_EXT, controller);
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
