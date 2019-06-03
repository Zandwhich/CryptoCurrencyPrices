package com.company.api_calls_deprecated.individual.CoinBase;

import com.company.controller.ControllerInterface;

/**
 * The class used for CoinBase Spot BTC to USD
 */
public class CoinBaseSpotBTC_USD extends AbstractCoinBase {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "BTC-USD/spot";

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
    public final static String NAME = "CoinBase-Spot Bitcoin/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Spot BTC/USD
     * @param controller The controller that calls this endpoint
     */
    public CoinBaseSpotBTC_USD(ControllerInterface controller) {
        super(CoinBaseSpotBTC_USD.CRYPTO_CURRENCY, CoinBaseSpotBTC_USD.FIAT_CURRENCY, CoinBaseSpotBTC_USD.NAME,
                CoinBaseSpotBTC_USD.URL_EXT, controller);
    }//end CoinBaseSpotBTC_USD()

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
    public String getUrlExt() { return CoinBaseSpotBTC_USD.URL_EXT; }//end getUrlExt()

}//end CoinBaseSpotBTC_USD
