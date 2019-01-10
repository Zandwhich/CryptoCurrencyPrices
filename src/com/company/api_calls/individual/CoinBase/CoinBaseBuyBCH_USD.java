package com.company.api_calls.individual.CoinBase;

import com.company.controller.ControllerInterface;

/**
 * The class used for calling CoinBase Buy BCH to USD
 */
public class CoinBaseBuyBCH_USD extends  AbstractCoinBase{

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "BCH-USD/buy";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "BCH";

    /**
     * TODO: Fill in
     */
    public final static String FIAT_CURRENCY = "USD";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinBase-Buy Bitcoin Cash/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Buy BCH/USD
     * @param controller The controller that calls this endpoint
     */
    public CoinBaseBuyBCH_USD(ControllerInterface controller) {
        super(CoinBaseBuyBCH_USD.CRYPTO_CURRENCY, CoinBaseBuyBCH_USD.FIAT_CURRENCY, CoinBaseBuyBCH_USD.NAME,
                CoinBaseBuyBCH_USD.URL_EXT, controller);
    }//end CoinBaseBuyBCH_USD()

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
    public String getUrlExt() { return CoinBaseBuyBCH_USD.URL_EXT; }//end getUrlExt()

}//end CoinBaseBuyBCH_USD
