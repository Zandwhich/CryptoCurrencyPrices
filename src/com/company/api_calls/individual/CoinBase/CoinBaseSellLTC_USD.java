package com.company.api_calls.individual.CoinBase;

import com.company.controller.ControllerInterface;

/**
 * The class used for CoinBase Sell LTC to USD
 */
public class CoinBaseSellLTC_USD extends AbstractCoinBase {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "LTC-USD/sell";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "LTC";

    /**
     * TODO: Fill in
     */
    public final static String FIAT_CURRENCY = "USD";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinBase-Sell Litecoin/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Sell LTC/USD
     * @param controller The controller that calls this endpoint
     */
    public CoinBaseSellLTC_USD(ControllerInterface controller) {
        super(CoinBaseSellLTC_USD.CRYPTO_CURRENCY, CoinBaseSellLTC_USD.FIAT_CURRENCY, CoinBaseSellLTC_USD.NAME,
                CoinBaseSellLTC_USD.URL_EXT, controller);
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
    public String getUrlExt() { return CoinBaseSellLTC_USD.URL_EXT; }//end getUrlExt()

}//end CoinBaseSellLTC_USD
