package com.company.api_calls.individual.CoinBase;

/**
 * TODO: Fill in
 */
public class CoinBaseSellETH_USD extends AbstractCoinBase {
    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor that will use USD as the fiat currency
     */
    public CoinBaseSellETH_USD() {
        super("ETH", "CoinBase Sell Ethereum", "https://api.coinbase.com/v2/prices/ETH-USD/sell");
    }//end CoinBaseBuyBTC_USD()

    /****************
     *   Methods    *
     ****************/
}//end CoinBaseSellETH_USD
