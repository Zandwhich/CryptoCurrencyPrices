package com.company.api_call.CoinCap;

import com.company.api_call.APICallerContract;
import com.company.api_call.AbstractAPICaller;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.FiatCurrencies;
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
    private final static String NAME = "CoinCap ";

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
     * The constructor for CoinCap when a cryptocurrency and a fiat currency aren't specified (most likely when the
     * currency is not supported for the given endpoint)
     * @param controller The controller that implements the required methods
     */
    public CoinCap(final APICallerContract controller) {
        super(CoinCap.ACCEPTED_CRYPTOCURRENCIES, CoinCap.ACCEPTED_FIAT_CURRENCIES, CoinCap.NAME, controller);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    @Override
    protected String createURLStringForCall(final CryptoCurrencies crypto, final FiatCurrencies fiat)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        super.throwIfNotAcceptedCurrency(crypto, fiat);

        return CoinCap.BASE_URL + crypto.getFullName().toLowerCase();
    }

    @Override
    protected double extractPrice(final JSONObject jsonObject, final CryptoCurrencies crypto, final FiatCurrencies fiat)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        super.throwIfNotAcceptedCurrency(crypto, fiat);

        final JSONObject data = (JSONObject) jsonObject.get("data");

        // TODO: Should throw an error here?
        if (data == null) return -1;

        return Double.parseDouble((String) data.get("rateUsd"));
    }

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
}
