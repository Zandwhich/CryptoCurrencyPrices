//package com.company.api_calls_deprecated.individual.CoinMarketCap;
//
//import com.company.controller.ControllerInterface;
//import json_simple.JSONObject;
//
///**
// * The class used for CoinMarketCap BTC to USD
// */
//public class CoinMarketCapBTC_USD extends AbstractCoinMarketCap {
//
//    /****************
//     *    Fields    *
//     ****************/
//
//    /**
//     * TODO: Fill in
//     */
//    public final static String URL_EXT = "1/?convert=USD";
//
//    /**
//     * TODO: Fill in
//     */
//    public final static String CRYPTO_CURRENCY = "BTC";
//
//    /**
//     * TODO: Fill in
//     */
//    public final static String FIAT_CURRENCY = "USD";
//
//    /**
//     * TODO: Fill in
//     */
//    public final static String NAME = "CoinMarketCap Bitcoin/USD";
//
//    /****************
//     * Constructors *
//     ****************/
//
//    /**
//     * The default constructor for CoinMarketCap BTC/USD
//     * @param controller The controller that calls this endpoint
//     */
//    public CoinMarketCapBTC_USD(ControllerInterface controller) {
//        super(CoinMarketCapBTC_USD.CRYPTO_CURRENCY, CoinMarketCapBTC_USD.FIAT_CURRENCY, CoinMarketCapBTC_USD.NAME,
//                CoinMarketCapBTC_USD.URL_EXT, controller);
//    }//end CoinMarketCapBTC_USD()
//
//    /****************
//     *   Methods    *
//     ****************/
//
//    /* Public */
//
//    // Getters
//
//    /**
//     * Returns the url extension
//     * @return The url extension
//     */
//    @Override
//    public String getUrlExt() { return CoinMarketCapBTC_USD.URL_EXT; }//end getUrlExt()
//
//    /* Protected */
//
//    /**
//     * TODO: Fill in
//     * @param quotes
//     * @return
//     */
//    @Override
//    protected double extractFiat(JSONObject quotes) {
//        JSONObject USD = (JSONObject) quotes.get("USD");
//
//        if (USD == null) return -1;
//
//        return (Double) USD.get("price");
//    }//end extractFiat()
//
//}//end CoinMarketCapBTC_USD
