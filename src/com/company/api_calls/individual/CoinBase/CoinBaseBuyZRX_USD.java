package com.company.api_calls.individual.CoinBase;

import com.company.controller.ControllerInterface;

/**
 * TODO: Fill in
 */
public class CoinBaseBuyZRX_USD extends AbstractCoinBase {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "ZRX-USD/buy";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "ZRX";

    /**
     * TODO: Fill in
     */
    public final static String FIAT_CURRENCY = "USD";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinBase-Buy 0x/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Buy ZRX/USD
     * @param controller The controller that calls this endpoint
     */
    public CoinBaseBuyZRX_USD(ControllerInterface controller) {
        super(CoinBaseBuyZRX_USD.CRYPTO_CURRENCY, CoinBaseBuyZRX_USD.FIAT_CURRENCY, CoinBaseBuyZRX_USD.NAME,
                CoinBaseBuyZRX_USD.URL_EXT, controller);
    }//end CoinBaseBuyLTC_USD()

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
    public String getUrlExt() { return CoinBaseBuyZRX_USD.URL_EXT; }//end getUrlExt()

}//end class CoinBaseBuyZRX_USD
