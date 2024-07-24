package com.company.api_call.CoinCap;

import com.company.api_call.APICallerContract;
import com.company.api_call.AbstractAPICaller;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.tool.exception.BadData;
import com.company.tool.exception.currency_not_supported.CryptoCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.FiatCurrencyNotSupported;
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
                   final APICallerContract controller)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        super(cryptoCurrency, fiatCurrency, CoinCap.ACCEPTED_CRYPTOCURRENCIES, CoinCap.ACCEPTED_FIAT_CURRENCIES,
                CoinCap.BASE_NAME, CoinCap.urlBuilder(cryptoCurrency, fiatCurrency), controller);
    }

    /**
     * The constructor for CoinCap when a cryptocurrency and a fiat currency aren't specified (most likely when the
     * currency is not supported for the given endpoint)
     * @param controller The controller that implements the required methods
     */
    public CoinCap(final APICallerContract controller) {
        super(CoinCap.ACCEPTED_CRYPTOCURRENCIES, CoinCap.ACCEPTED_FIAT_CURRENCIES, CoinCap.BASE_NAME,
                CoinCap.urlBuilder(null, null), controller);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * A function through which to create the URL for the given currency outside the constructor
     * @param cryptoCurrency The cryptocurrency
     * @param fiatCurrency The fiat currency
     * @return The url to be used for the endpoint
     */
    private static String urlBuilder(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency) {
        return cryptoCurrency == null || fiatCurrency == null ?
                null :
                CoinCap.BASE_URL + cryptoCurrency.getFullName().toLowerCase();
    }

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

    @Override
    protected double extractPrice(final JSONObject jsonObject) throws BadData {
        try {
            final JSONObject data = (JSONObject) jsonObject.get("data");

            return Double.parseDouble((String) data.get("rateUsd"));
        } catch (final Exception e) {
            throw new BadData(e, this);
        }
    }

    /**
     * {@inheritDoc}
     * </p>
     * In addition, it also updates the endpoint
     * @param cryptoCurrency The cryptocurrency to be used for this endpoint
     */
    @Override
    public void setCryptoCurrency(final CryptoCurrencies cryptoCurrency) throws CryptoCurrencyNotSupported {
        super.setCryptoCurrency(cryptoCurrency);
        super.updateUrl(cryptoCurrency == null ?
                null :
                CoinCap.BASE_URL + cryptoCurrency.getFullName().toLowerCase());
    }
}
