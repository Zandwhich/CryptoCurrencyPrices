package com.company.api_calls.individual.CryptoCompare;

import com.company.api_calls.AbstractAPICaller;
import com.company.api_calls.AbstractJSONCaller;
import com.company.controller.ControllerInterface;
import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.currency.FiatCurrencies;
import json_simple.JSONObject;

/**
 * The class for the CryptoCompare endpoint
 */
final public class CryptoCompare extends AbstractJSONCaller {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The base URL for CryptoCompare requests
     */
    private final static String BASE_URL = "https://min-api.cryptocompare.com/data/price";

    /**
     * The base name for the endpoint
     */
    private final static String BASE_NAME = "CryptoCompare ";

    /**
     * The accepted cryptocurrencies for CryptoCompare
     */
    private final static CryptoCurrencies[] ACCEPTED_CRYPTOCURRENCIES = {CryptoCurrencies.BTC, CryptoCurrencies.ETH,
            CryptoCurrencies.LTC, CryptoCurrencies.XRP};

    /**
     * The accepted fiat currencies for CryptoCompare
     */
    private final static FiatCurrencies[] ACCEPTED_FIAT_CURRENCIES = {FiatCurrencies.AUD, FiatCurrencies.CAD,
            FiatCurrencies.EUR, FiatCurrencies.GBP, FiatCurrencies.JPY, FiatCurrencies.MXN, FiatCurrencies.NZD,
            FiatCurrencies.PLN, FiatCurrencies.SEK, FiatCurrencies.USD};


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for the basic CryptoCompare requests
     * @param cryptoCurrency The cryptocurrency
     * @param fiatCurrency The fiat currency
     * @param controller The controller that calls this endpoint
     */
    public CryptoCompare(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                   final ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, CryptoCompare.ACCEPTED_CRYPTOCURRENCIES,
                CryptoCompare.ACCEPTED_FIAT_CURRENCIES, CryptoCompare.BASE_NAME,
                CryptoCompare.BASE_URL + "?fsym=" + cryptoCurrency.getAbbreviatedName() + "&tsyms=" +
                        fiatCurrency.getAbbreviatedName(),
                controller);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * Returns the base url
     * @return The base url
     */
    @Override
    public String getBaseUrl() { return CryptoCompare.BASE_URL; }

    /**
     * Returns if the given fiat currency can be used with CryptoCompare
     * @param fiatCurrency The given fiat currency
     * @return If the given fiat currency can be used with CryptoCompare
     */
    public static boolean canUseFiatCurrency(final FiatCurrencies fiatCurrency)
    {
        return AbstractAPICaller.canUseCurrency(CryptoCompare.ACCEPTED_FIAT_CURRENCIES, fiatCurrency);
    }

    /**
     * Returns if the given cryptocurrency can be used with CryptoCompare
     * @param cryptoCurrency The given cryptocurrency
     * @return If the given cryptocurrency can be used with CryptoCompare
     */
    public static boolean canUseCryptoCurrency(final CryptoCurrencies cryptoCurrency)
    {
        return AbstractAPICaller.canUseCurrency(CryptoCompare.ACCEPTED_CRYPTOCURRENCIES, cryptoCurrency);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected double extractPrice(final JSONObject jsonObject) {
        // Ok, so I don't know why, but casting it to a regular 'double' wasn't working. This does, so I'm leaving it
        return ((Double) jsonObject.get(super.getFiatCurrency().getAbbreviatedName()));
    }

}
