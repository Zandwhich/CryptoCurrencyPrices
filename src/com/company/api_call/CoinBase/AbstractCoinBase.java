package com.company.api_call.CoinBase;

import com.company.api_call.APICallerContract;
import com.company.api_call.AbstractAPICaller;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.tool.exception.BadData;
import com.company.tool.exception.currency_not_supported.AbstractCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.CryptoCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.FiatCurrencyNotSupported;
import json_simple.JSONObject;

/**
 * The basic class for all CoinBase requests
 */
public abstract class AbstractCoinBase extends AbstractAPICaller {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The cryptocurrencies that CoinBase uses
     */
    private static final CryptoCurrencies[] ACCEPTED_CRYPTO_CURRENCIES = {CryptoCurrencies.BTC, CryptoCurrencies.ETH,
            CryptoCurrencies.LTC, CryptoCurrencies.XRP};

    /**
     * The fiat currencies that CoinBase uses
     */
    private static final FiatCurrencies[] ACCEPTED_FIAT_CURRENCIES = {FiatCurrencies.AUD, FiatCurrencies.CAD,
            FiatCurrencies.EUR, FiatCurrencies.JPY, FiatCurrencies.MXN, FiatCurrencies.NZD, FiatCurrencies.PLN,
            FiatCurrencies.SEK, FiatCurrencies.USD};

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
     * @param controller The controller that implements the required methods
     */
    public AbstractCoinBase(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                            final String name, final String urlExt, final APICallerContract controller)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        super(cryptoCurrency, fiatCurrency, AbstractCoinBase.ACCEPTED_CRYPTO_CURRENCIES,
                AbstractCoinBase.ACCEPTED_FIAT_CURRENCIES, "CoinBase " + name,
                AbstractCoinBase.BASE_URL + urlExt, controller);
    }

    /**
     * The constructor for AbstractCoinBase when a cryptocurrency and a fiat currency aren't specified (most likely when
     * the currency is not supported for the given endpoint)
     * @param controller The controller that implements the required methods
     */
    public AbstractCoinBase(final String name, final String urlExt, final APICallerContract controller) {
        super(AbstractCoinBase.ACCEPTED_CRYPTO_CURRENCIES, AbstractCoinBase.ACCEPTED_FIAT_CURRENCIES, "Coinbase "
                + name, AbstractCoinBase.BASE_URL + urlExt, controller);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * Returns if the given fiat currency can be used with CoinBase
     * @param fiatCurrency The given fiat currency
     * @return If the given fiat currency can be used with CoinBase
     */
    public static boolean endpointCanUseFiatCurrency(final FiatCurrencies fiatCurrency)
    {
        return AbstractAPICaller.canUseCurrency(AbstractCoinBase.ACCEPTED_FIAT_CURRENCIES, fiatCurrency);
    }

    /**
     * Returns if the given cryptocurrency can be used with CoinBase
     * @param cryptoCurrency The given cryptocurrency
     * @return If the given cryptocurrency can be used with CoinBase
     */
    public static boolean endpointCanUseCryptoCurrency(final CryptoCurrencies cryptoCurrency)
    {
        return AbstractAPICaller.canUseCurrency(AbstractCoinBase.ACCEPTED_CRYPTO_CURRENCIES, cryptoCurrency);
    }

    /**
     * Gets the price from the JSON Object
     * @param jsonObject The JSON object received from a request
     * @return The price from the JSON object
     */
    @Override
    protected double extractPrice(final JSONObject jsonObject) throws BadData {
        try {
            return Double.parseDouble(((String) ((JSONObject) jsonObject.get("data")).get("amount")));
        } catch (final Exception e) {
            throw new BadData(e, this);
        }
    }

    /**
     * Updates the url to hit for the endpoint, provided that the extension is passed in
     * @param urlExtension The extension for the CoinBase endpoint
     */
    protected void updateUrlWithNewExtension(final String urlExtension) {
        super.updateUrl(AbstractCoinBase.BASE_URL + urlExtension);
    }

}
