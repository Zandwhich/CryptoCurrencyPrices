package com.company.api_calls.individual.CoinBase;

/**
 * TODO: Fill in
 */
public class CoinBaseSellBTC_USD extends AbstractCoinBase {
    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor that will use USD as the fiat currency
     */
    public CoinBaseSellBTC_USD() {
        super("BTC", "CoinBase Sell Bitcoin", "https://api.coinbase.com/v2/prices/BTC-USD/sell");
    }//end CoinBaseBuyBTC_USD()

    /****************
     *   Methods    *
     ****************/
}//end CoinBaseSellBTC_USD
