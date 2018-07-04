package com.company.api_calls.CoinBase;

/**
 * TODO: Fill in
 */
public class CoinBaseBuyLTC_USD extends AbstractCoinBase {

    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor that will use USD as the fiat currency
     */
    public CoinBaseBuyLTC_USD() {
        super("LTC", "CoinBase Buy Litecoin", "https://api.coinbase.com/v2/prices/LTC-USD/buy");
    }//end CoinBaseBuyBTC_USD()

    /****************
     *   Methods    *
     ****************/

}//end CoinBaseBuyLTC_USD
