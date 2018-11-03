package com.company.api_calls.individual.CoinBase;

/**
 * The class used for CoinBase Spot BCH to USD
 */
public class CoinBaseSpotBCH_USD extends AbstractCoinBase {
    
    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    public final static String URL_EXT = "BCH-USD/spot";

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
    public final static String NAME = "CoinBase-Spot Bitcoin Cash/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Spot BCH/USD
     */
    public CoinBaseSpotBCH_USD() {
        super(CoinBaseSpotBCH_USD.CRYPTO_CURRENCY, CoinBaseSpotBCH_USD.FIAT_CURRENCY, CoinBaseSpotBCH_USD.NAME,
                CoinBaseSpotBCH_USD.URL_EXT);
    }//end CoinBaseSpotBCH_USD()

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
    public String getUrlExt() { return CoinBaseSpotBCH_USD.URL_EXT; }//end getUrlExt()

}//end CoinBaseSpotBCH_USD
