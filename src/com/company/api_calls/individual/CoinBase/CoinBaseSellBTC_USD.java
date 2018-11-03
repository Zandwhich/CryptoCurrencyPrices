package com.company.api_calls.individual.CoinBase;

/**
 * TODO: Fill in
 */
public class CoinBaseSellBTC_USD extends AbstractCoinBase {
    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "BTC-USD/sell";

    /**
     * TODO: Fill in
     */
    public final static String CRYPTO_CURRENCY = "BTC";

    /**
     * The class sued for CoinBase Sell BTC to USD
     */
    public final static String FIAT_CURRENCY = "USD";

    /**
     * TODO: Fill in
     */
    public final static String NAME = "CoinBase-Sell Bitcoin/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Sell BTC/USD
     */
    public CoinBaseSellBTC_USD() {
        super(CoinBaseSellBTC_USD.CRYPTO_CURRENCY, CoinBaseSellBTC_USD.FIAT_CURRENCY, CoinBaseSellBTC_USD.NAME,
                CoinBaseSellBTC_USD.URL_EXT);
    }//end CoinBaseSellBTC_USD()

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
    public String getUrlExt() { return CoinBaseSellBTC_USD.URL_EXT; }//end getUrlExt()

}//end CoinBaseSellBTC_USD
