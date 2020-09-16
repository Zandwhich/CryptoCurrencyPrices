package com.company.api_calls.individual.CoinCap;

import com.company.api_calls.AbstractJSONCaller;
import com.company.api_calls.individual.CoinBase.AbstractCoinBase;
import com.company.controller.ControllerInterface;
import com.company.tools.enums.CryptoCurrencies;
import com.company.tools.enums.FiatCurrencies;
import json_simple.JSONObject;

/**
 * The basic class for all CoinCap requests
 */
final public class CoinCap extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

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

    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for the basic CoinCap requests
     * @param cryptoCurrency The cryptocurrency
     * @param fiatCurrency The fiat currency
     * @param controller The controller that calls this endpoint
     */
    public CoinCap(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                   final ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, CoinCap.ACCEPTED_CRYPTOCURRENCIES, CoinCap.ACCEPTED_FIAT_CURRENCIES,
                CoinCap.BASE_NAME, CoinCap.BASE_URL + cryptoCurrency.getFullName(),  controller);
    }//end AbstractCoinCap()

    /****************
     *   Methods    *
     ****************/

    /* Public */

    // Getters

    /**
     * Returns the base url
     * @return The base url
     */
    @Override
    public String getBaseUrl() { return CoinCap.BASE_URL; }//end getBaseUrl()

    // Others

    /**
     * Returns if the given fiat currency can be used with CoinBase
     * @param fiatCurrency The given fiat currency
     * @return If the given fiat currency can be used with CoinBase
     */
    public static boolean canUseFiatCurrency(final FiatCurrencies fiatCurrency)
    {
        for (final FiatCurrencies currency : CoinCap.ACCEPTED_FIAT_CURRENCIES)
        {
            if (currency.equals(fiatCurrency)) return true;
        }//end for
        return false;
    }//end canUseFiatCurrency()

    /**
     * Returns if the given cryptocurrency can be used with CoinBase
     * @param cryptoCurrency The given cryptocurrency
     * @return If the given cryptocurrency can be used with CoinBase
     */
    public static boolean canUseCryptoCurrency(final CryptoCurrencies cryptoCurrency)
    {
        for (final CryptoCurrencies currency : CoinCap.ACCEPTED_CRYPTOCURRENCIES)
        {
            if (currency.equals(cryptoCurrency)) return true;
        }//end for

        return false;
    }//end canUseCryptoCurrency()

    /* Protected */

    /**
     * {@inheritDoc}
     */
    @Override
    protected double extractPrice(final JSONObject jsonObject) {
        final JSONObject data = (JSONObject) jsonObject.get("data");
        if (data == null) return -1;

        return (double) data.get("rateUsd");
    }//end extractPrice()

}//end AbstractCoinCap
