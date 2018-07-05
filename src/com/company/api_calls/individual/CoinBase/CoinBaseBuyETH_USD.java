package com.company.api_calls.individual.CoinBase;

/**
 * TODO: Fill in
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
    public final static String NAME = "CoinBase Buy Ethereum/USD";

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for CoinBase Buy ETH/USD
     */
    public CoinBaseBuyETH_USD() {
        super(CoinBaseBuyETH_USD.CRYPTO_CURRENCY, CoinBaseBuyETH_USD.FIAT_CURRENCY, CoinBaseBuyETH_USD.NAME,
                CoinBaseBuyETH_USD.URL_EXT);
    }//end CoinBaseBuyETH_USD()

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
    public String getUrlExt() { return CoinBaseBuyETH_USD.URL_EXT; }//end getUrlExt()

}//end CoinBaseBuyETH_USD
