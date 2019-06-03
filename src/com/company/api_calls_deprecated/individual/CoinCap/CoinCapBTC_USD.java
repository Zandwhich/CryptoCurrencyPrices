package com.company.api_calls_deprecated.individual.CoinCap;

import com.company.controller.ControllerInterface;
import json_simple.JSONObject;

/**
 * The class used for CoinCap BTC to USD
 */
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
     * @param controller The controller that calls this endpoint
     */
    public CoinCapBTC_USD(ControllerInterface controller) {
        super(CoinCapBTC_USD.CRYPTO_CURRENCY, CoinCapBTC_USD.FIAT_CURRENCY, CoinCapBTC_USD.NAME,
                CoinCapBTC_USD.URL_EXT, controller);
    }//end CoinCapBTC_USD()

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
