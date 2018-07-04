package com.company.api_calls.individual.CoinBase;

/**
 * TODO: Fill in
 */
public class CoinBaseBuyETH_USD extends AbstractCoinBase {

    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor that will use USD as the fiat currency
     */
    public CoinBaseBuyETH_USD() {
        super("ETH", "CoinBase Buy Ethereum", "https://api.coinbase.com/v2/prices/ETH-USD/buy");
    }//end CoinBaseBuyBTC_USD()

    /****************
     *   Methods    *
     ****************/

}//end CoinBaseBuyETH_USD
