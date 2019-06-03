package com.company.api_calls_deprecated.individual.CoinBase;

import com.company.controller.ControllerInterface;

/**
 * TODO: Fill in
 */
public class CoinBaseSellZRX_USD extends AbstractCoinBase{

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "ZRX-USD/sell";

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
    public final static String NAME = "CoinBase-Sell 0x/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Sell ZRX/USD
     * @param controller The controller that calls this endpoint
     */
    public CoinBaseSellZRX_USD(ControllerInterface controller) {
        super(CoinBaseSellZRX_USD.CRYPTO_CURRENCY, CoinBaseSellZRX_USD.FIAT_CURRENCY, CoinBaseSellZRX_USD.NAME,
                CoinBaseSellZRX_USD.URL_EXT, controller);
    }//end CoinBaseSellLTC_USD()

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
    public String getUrlExt() { return CoinBaseSellZRX_USD.URL_EXT; }//end getUrlExt()


}//end CoinBaseSellZRX_USD
