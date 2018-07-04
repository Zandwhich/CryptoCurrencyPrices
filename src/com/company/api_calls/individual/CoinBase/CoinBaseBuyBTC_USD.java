package com.company.api_calls.individual.CoinBase;

/**
 * TODO: Fill in
 */
public class CoinBaseBuyBTC_USD extends AbstractCoinBase {

    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor that will use USD as the fiat currency
     */
    public CoinBaseBuyBTC_USD() {
        super("BTC", "CoinBase Buy Bitcoin", "https://api.coinbase.com/v2/prices/BTC-USD/buy");
    }//end CoinBaseBuyBTC_USD()

    /****************
     *   Methods    *
     ****************/
}//end CoinBaseBuyBTC_USD
