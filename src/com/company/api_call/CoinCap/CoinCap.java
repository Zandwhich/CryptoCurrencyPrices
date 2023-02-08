package com.company.api_call.CoinCap;

import com.company.api_call.APICallerContract;
import com.company.api_call.AbstractAPICaller;
import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.currency.FiatCurrencies;
import json_simple.JSONObject;

/**
 * The basic class for all CoinCap requests
 */
final public class CoinCap extends AbstractAPICaller {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The base URL for CoinCap requests
     */
    private final static String BASE_URL = "https://api.coincap.io/v2/rates/";

    /**
     * The base name for the endpoint
     */
    private final static String BASE_NAME = "CoinCap ";

    /**
     * The accepted cryptocurrencies for CoinCap
     */
    private final static CryptoCurrencies[] ACCEPTED_CRYPTOCURRENCIES = {CryptoCurrencies.BTC, CryptoCurrencies.ETH,
            CryptoCurrencies.LTC, CryptoCurrencies.XRP};

    /**
     * The accepted fiat currencies for CoinCap
     */
    private final static FiatCurrencies[] ACCEPTED_FIAT_CURRENCIES = {FiatCurrencies.USD};


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for the basic CoinCap requests
     * @param cryptoCurrency The cryptocurrency
     * @param fiatCurrency The fiat currency
     * @param controller The controller that implements the required methods
     */
    public CoinCap(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                   final APICallerContract controller) {
        super(cryptoCurrency, fiatCurrency, CoinCap.ACCEPTED_CRYPTOCURRENCIES, CoinCap.ACCEPTED_FIAT_CURRENCIES,
                CoinCap.BASE_NAME, CoinCap.BASE_URL + cryptoCurrency.getFullName().toLowerCase(),  controller);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * Returns the base url
     * @return The base url
     */
    @Override
    public String getBaseUrl() { return CoinCap.BASE_URL; }

    /**
     * Returns if the given fiat currency can be used with CoinCap
     * @param fiatCurrency The given fiat currency
     * @return If the given fiat currency can be used with CoinCap
     */
    public static boolean endpointCanUseFiatCurrency(final FiatCurrencies fiatCurrency)
    {
        return AbstractAPICaller.canUseCurrency(CoinCap.ACCEPTED_FIAT_CURRENCIES, fiatCurrency);
    }

    /**
     * Returns if the given cryptocurrency can be used with CoinCap
     * @param cryptoCurrency The given cryptocurrency
     * @return If the given cryptocurrency can be used with CoinCap
     */
    public static boolean endpointCanUseCryptoCurrency(final CryptoCurrencies cryptoCurrency)
    {
        return AbstractAPICaller.canUseCurrency(CoinCap.ACCEPTED_CRYPTOCURRENCIES, cryptoCurrency);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected double extractPrice(final JSONObject jsonObject) {
        final JSONObject data = (JSONObject) jsonObject.get("data");

        // TODO: Should throw an error here?
        if (data == null) return -1;

        return Double.parseDouble((String) data.get("rateUsd"));
    }

}
