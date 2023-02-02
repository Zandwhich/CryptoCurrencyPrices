package com.company.api_calls.individual.CoinBase;

import com.company.api_calls.AbstractJSONCaller;
import com.company.controller.ControllerInterface;
import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.currency.FiatCurrencies;
import json_simple.JSONObject;

/**
 * The basic class for all CoinBase requests
 */
public abstract class AbstractCoinBase extends AbstractJSONCaller {

    /* ************ *
     *  Constants   *
     * ************ */

    /**
     * The cryptocurrencies that CoinBase uses
     */
    private final static CryptoCurrencies[] ACCEPTED_CRYPTO_CURRENCIES = {CryptoCurrencies.BTC, CryptoCurrencies.ETH,
            CryptoCurrencies.LTC, CryptoCurrencies.XRP};

    /**
     * The fiat currencies that CoinBase uses
     */
    private final static FiatCurrencies[] ACCEPTED_FIAT_CURRENCIES = {FiatCurrencies.AUD, FiatCurrencies.CAD,
            FiatCurrencies.EUR, FiatCurrencies.JPY, FiatCurrencies.MXN, FiatCurrencies.NZD, FiatCurrencies.PLN,
            FiatCurrencies.SEK, FiatCurrencies.USD};

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The base URL for CoinBase requests
     */
    private static final String BASE_URL = "https://api.coinbase.com/v2/prices/";

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for the AbstractCoinBase class
     * @param cryptoCurrency The cryptocurrency
     * @param fiatCurrency The fiat currency
     * @param name The name of the specific request
     * @param urlExt The extension to the base url
     */
    public AbstractCoinBase(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                            final String name, final String urlExt, final ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, AbstractCoinBase.ACCEPTED_CRYPTO_CURRENCIES,
                AbstractCoinBase.ACCEPTED_FIAT_CURRENCIES, "CoinBase " + name,
                AbstractCoinBase.BASE_URL + urlExt, controller);
    }//end AbstractCoinBase()

    /* ************ *
     *   Methods    *
     * ************ */

    /* Public */

    // Getters

    /**
     * Returns the base url
     * @return The base url
     */
    @Override
    public String getBaseUrl() { return AbstractCoinBase.BASE_URL; }

    // Other

    /**
     * Returns if the given fiat currency can be used with CoinBase
     * @param fiatCurrency The given fiat currency
     * @return If the given fiat currency can be used with CoinBase
     */
    public static boolean canUseFiatCurrency(final FiatCurrencies fiatCurrency)
    {
        for (final FiatCurrencies currency : AbstractCoinBase.ACCEPTED_FIAT_CURRENCIES)
        {
            if (currency.equals(fiatCurrency)) return true;
        }
        return false;
    }

    /**
     * Returns if the given cryptocurrency can be used with CoinBase
     * @param cryptoCurrency The given cryptocurrency
     * @return If the given cryptocurrency can be used with CoinBase
     */
    public static boolean canUseCryptoCurrency(final CryptoCurrencies cryptoCurrency)
    {
        for (final CryptoCurrencies currency : AbstractCoinBase.ACCEPTED_CRYPTO_CURRENCIES)
        {
            if (currency.equals(cryptoCurrency)) return true;
        }

        return false;
    }

    /* Protected */

    /**
     * Gets the price from the JSON Object
     * @param jsonObject The JSON object received from a request
     * @return The price from the JSON object
     */
    @Override
    protected double extractPrice(final JSONObject jsonObject) {
        JSONObject data = (JSONObject) jsonObject.get("data");

        if (data == null || !data.containsKey("amount")) return -1;

        return Double.parseDouble((String) data.get("amount"));
    }

}
