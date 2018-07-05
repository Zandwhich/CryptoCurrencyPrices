package com.company.api_calls.individual.CoinBase;

/**
 * TODO: Fill in
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
    public final static String NAME = "CoinBase Sell Litecoin/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Sell LTC/USD
     */
    public CoinBaseSellLTC_USD() {
        super(CoinBaseSellLTC_USD.CRYPTO_CURRENCY, CoinBaseSellLTC_USD.FIAT_CURRENCY, CoinBaseSellLTC_USD.NAME,
                CoinBaseSellLTC_USD.URL_EXT);
    }//end CoinBaseSellLTC_USD()

    /****************
     *   Methods    *
     ****************/

    /* Public */

    // Getters

    /**
     * TODO: Fill in
     * @return
     */
    @Override
    public String getUrlExt() { return CoinBaseSellLTC_USD.URL_EXT; }//end getUrlExt()

}//end CoinBaseSellLTC_USD
