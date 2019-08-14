package com.company.api_calls.individual.CoinMarketCap;

import com.company.api_calls.AbstractJSONCaller;
import com.company.controller.ControllerInterface;
import com.company.tools.CryptoCurrencies;
import com.company.tools.FiatCurrencies;
import com.sun.istack.internal.NotNull;
import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public abstract class CoinMarketCap extends AbstractJSONCaller {

    /* ************ *
     *  Constants   *
     * ************ */

    /**
     * The base URL for CoinMarketCap requests
     */
    private final static String BASE_URL = "https://api.coinmarketcap.com/v2/ticker/";

    /**
     * The base name for CoinMarketCap requests
     */
    private final static String BASE_NAME = "CoinMarketCap ";

    /**
     * The cryptocurrencies that CoinMarketCap uses
     */
    private final static CryptoCurrencies[] ACCEPTED_CRYPTO_CURRENCIES = {CryptoCurrencies.BTC, CryptoCurrencies.ETH,
            CryptoCurrencies.LTC, CryptoCurrencies.XRP};

    /**
     * The fiat currencies that CoinMarketCap uses
     */
    private final static FiatCurrencies[] ACCEPTED_FIAT_CURRENCIES = {FiatCurrencies.AUD, FiatCurrencies.CAD,
            FiatCurrencies.EUR, FiatCurrencies.GBP, FiatCurrencies.JPY, FiatCurrencies.MXN, FiatCurrencies.NZD,
            FiatCurrencies.PLN, FiatCurrencies.SEK, FiatCurrencies.USD};


    /****************
     *    Fields    *
     ****************/


    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for the basic CoinMarketCap requests
     * @param cryptoCurrency The cryptocurrency in the request
     * @param fiatCurrency The fiat currency in the request
     * @param controller The controller that calls this endpoint
     */
    public CoinMarketCap(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                         final ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, CoinMarketCap.ACCEPTED_CRYPTO_CURRENCIES,
                CoinMarketCap.ACCEPTED_FIAT_CURRENCIES,
                CoinMarketCap.BASE_NAME + cryptoCurrency.getAbbreviatedName() + "/" + fiatCurrency.getAbbreviatedName(),
                CoinMarketCap.BASE_URL, controller);

        // TODO: Figure out a way to do the extension properly
    }//end AbstractCoinMarketCap()

    /****************
     *   Methods    *
     ****************/

    /* Public */

    // Getters

    /**
     * {@inheritDoc}
     */
    @Override
    public String getBaseUrl() { return CoinMarketCap.BASE_URL; }//end getBaseUrl()

    /* Protected */

    /**
     * {@inheritDoc}
     */
    @Override
    protected double extractPrice(@NotNull final JSONObject jsonObject) {
        JSONObject data = (JSONObject) jsonObject.get("data");

        if (data == null) return -1;

        JSONObject quotes = (JSONObject) data.get("quotes");

        if (quotes == null) return -1;

        return this.extractFiat(quotes);
    }//end extractPrice()

    /**
     * TODO: Fill in
     * @param quotes
     * @return
     */
    protected abstract double extractFiat(JSONObject quotes);
}//end AbstractCoinMarketCap
