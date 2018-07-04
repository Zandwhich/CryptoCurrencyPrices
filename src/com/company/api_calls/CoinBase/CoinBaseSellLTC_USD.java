package com.company.api_calls.CoinBase;

/**
 * TODO: Fill in
 */
public class CoinBaseSellLTC_USD extends AbstractCoinBase {

    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor that will use USD as the fiat currency
     */
    public CoinBaseSellLTC_USD() {
        super("LTC", "CoinBase Sell Litecoin", "https://api.coinbase.com/v2/prices/LTC-USD/sell");
    }//end CoinBaseBuyBTC_USD()

    /****************
     *   Methods    *
     ****************/
}//end CoinBaseSellLTC_USD
