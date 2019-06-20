//package com.company.api_calls_deprecated.individual.CoinMarketCap;
//
//import com.company.controller.ControllerInterface;
//import json_simple.JSONObject;
//
///**
// * The class used for CoinMarketCap ETH to USD
// */
//public class CoinMarketCapETH_USD extends AbstractCoinMarketCap {
//
//    /****************
//     *    Fields    *
//     ****************/
//
//    /**
//     * TODO: Fill in
//     */
//    public final static String URL_EXT = "1027/?convert=USD";
//
//    /**
//     * TODO: Fill in
//     */
//    public final static String CRYPTO_CURRENCY = "ETH";
//
//    /**
//     * TODO: Fill in
//     */
//    public final static String FIAT_CURRENCY = "USD";
//
//    /**
//     * TODO: Fill in
//     */
//    public final static String NAME = "CoinMarketCap Ethereum/USD";
//
//    /****************
//     * Constructors *
//     ****************/
//
//    /**
//     * The default constructor for CoinMarketCap ETH/USD
//     * @param controller The controller that calls this endpoint
//     */
//    public CoinMarketCapETH_USD(ControllerInterface controller) {
//        super(CoinMarketCapETH_USD.CRYPTO_CURRENCY, CoinMarketCapETH_USD.FIAT_CURRENCY, CoinMarketCapETH_USD.NAME,
//                CoinMarketCapETH_USD.URL_EXT, controller);
//    }//end CoinMarketCapETH_USD()
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
//    public String getUrlExt() { return CoinMarketCapETH_USD.URL_EXT; }//end getUrlExt()
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
//}//end CoinMarketCapETH_USD
