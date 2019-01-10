package com.company.api_calls.individual.CoinBase;

import com.company.controller.ControllerInterface;

/**
 * The class used for calling CoinBase Buy BTC to USD
 */
public class CoinBaseBuyBTC_USD extends AbstractCoinBase {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "BTC-USD/buy";

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
    public final static String NAME = "CoinBase-Buy Bitcoin/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Buy BTC/USD
     * @param controller The controller that calls this endpoint
     */
    public CoinBaseBuyBTC_USD(ControllerInterface controller) {
        super(CoinBaseBuyBTC_USD.CRYPTO_CURRENCY, CoinBaseBuyBTC_USD.FIAT_CURRENCY, CoinBaseBuyBTC_USD.NAME,
                CoinBaseBuyBTC_USD.URL_EXT, controller);
    }//end CoinBaseBuyBTC_USD()

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
    public String getUrlExt() { return CoinBaseBuyBTC_USD.URL_EXT; }//end getUrlExt()

}//end CoinBaseBuyBTC_USD
