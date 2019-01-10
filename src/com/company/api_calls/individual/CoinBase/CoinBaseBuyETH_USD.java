package com.company.api_calls.individual.CoinBase;

import com.company.controller.ControllerInterface;

/**
 * The class used for CoinBase Buy ETH to USD
 */
public class CoinBaseBuyETH_USD extends AbstractCoinBase {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "ETH-USD/buy";

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
    public final static String NAME = "CoinBase-Buy Ethereum/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Buy ETH/USD
     * @param controller The controller that calls this endpoint
     */
    public CoinBaseBuyETH_USD(ControllerInterface controller) {
        super(CoinBaseBuyETH_USD.CRYPTO_CURRENCY, CoinBaseBuyETH_USD.FIAT_CURRENCY, CoinBaseBuyETH_USD.NAME,
                CoinBaseBuyETH_USD.URL_EXT, controller);
    }//end CoinBaseBuyETH_USD()

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
    public String getUrlExt() { return CoinBaseBuyETH_USD.URL_EXT; }//end getUrlExt()

}//end CoinBaseBuyETH_USD
