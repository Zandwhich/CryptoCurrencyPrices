package com.company.api_calls.individual.CoinBase;

/**
 * TThe class used for CoinBase Spot LTC to USD
 */
public class CoinBaseSpotLTC_USD extends AbstractCoinBase {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "LTC-USD/spot";

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
    public final static String NAME = "CoinBase-Spot Litecoin/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Spot LTC/USD
     */
    public CoinBaseSpotLTC_USD() {
        super(CoinBaseSpotLTC_USD.CRYPTO_CURRENCY, CoinBaseSpotLTC_USD.FIAT_CURRENCY, CoinBaseSpotLTC_USD.NAME,
                CoinBaseSpotLTC_USD.URL_EXT);
    }//end CoinBaseSpotLTC_USD()

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
    public String getUrlExt() { return CoinBaseSpotLTC_USD.URL_EXT; }//end getUrlExt()

}//end CoinBaseSpotLTC_USD
