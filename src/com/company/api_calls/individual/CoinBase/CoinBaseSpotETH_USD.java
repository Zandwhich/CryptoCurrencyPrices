package com.company.api_calls.individual.CoinBase;

import com.company.controller.ControllerInterface;

/**
 * The class used for CoinBase Spot ETH to USD
 */
public class CoinBaseSpotETH_USD extends AbstractCoinBase{

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "ETH-USD/spot";

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
    public final static String NAME = "CoinBase-Spot Ethereum/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Spot ETH/USD
     * @param controller The controller that calls this endpoint
     */
    public CoinBaseSpotETH_USD(ControllerInterface controller) {
        super(CoinBaseSpotETH_USD.CRYPTO_CURRENCY, CoinBaseSpotETH_USD.FIAT_CURRENCY, CoinBaseSpotETH_USD.NAME,
                CoinBaseSpotETH_USD.URL_EXT, controller);
    }//end CoinBaseSpotETH_USD()

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
    public String getUrlExt() { return CoinBaseSpotETH_USD.URL_EXT; }//end getUrlExt()

}//end CoinBaseSpotETH_USd
