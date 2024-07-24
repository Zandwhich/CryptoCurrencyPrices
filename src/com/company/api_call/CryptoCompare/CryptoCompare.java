package com.company.api_call.CryptoCompare;

import com.company.api_call.APICallerContract;
import com.company.api_call.AbstractAPICaller;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.tool.exception.BadData;
import com.company.tool.exception.currency_not_supported.CryptoCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.FiatCurrencyNotSupported;
import json_simple.JSONObject;

/**
 * The class for the CryptoCompare endpoint
 */
final public class CryptoCompare extends AbstractAPICaller {

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
    private final static String BASE_NAME = "CryptoCompare";

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
     * @param controller The controller that implements the required methods
     */
    public CryptoCompare(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                   final APICallerContract controller)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        super(cryptoCurrency, fiatCurrency, CryptoCompare.ACCEPTED_CRYPTOCURRENCIES,
                CryptoCompare.ACCEPTED_FIAT_CURRENCIES, CryptoCompare.BASE_NAME,
                urlBuilder(cryptoCurrency, fiatCurrency), controller);
    }

    /**
     * The constructor for CryptoCompare when a cryptocurrency and a fiat currency aren't specified (most likely when
     * the currency is not supported for the given endpoint)
     * @param controller The controller that implements the required methods
     */
    public CryptoCompare(final APICallerContract controller) {
        super(CryptoCompare.ACCEPTED_CRYPTOCURRENCIES, CryptoCompare.ACCEPTED_FIAT_CURRENCIES, CryptoCompare.BASE_NAME,
                urlBuilder(null, null), controller);
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
                CryptoCompare.BASE_URL + "?fsym=" + cryptoCurrency.getAbbreviatedName() + "&tsyms=" +
                        fiatCurrency.getAbbreviatedName();
    }

    /**
     * Returns if the given fiat currency can be used with CryptoCompare
     * @param fiatCurrency The given fiat currency
     * @return If the given fiat currency can be used with CryptoCompare
     */
    public static boolean endpointCanUseFiatCurrency(final FiatCurrencies fiatCurrency)
    {
        return AbstractAPICaller.canUseCurrency(CryptoCompare.ACCEPTED_FIAT_CURRENCIES, fiatCurrency);
    }

    /**
     * Returns if the given cryptocurrency can be used with CryptoCompare
     * @param cryptoCurrency The given cryptocurrency
     * @return If the given cryptocurrency can be used with CryptoCompare
     */
    public static boolean endpointCanUseCryptoCurrency(final CryptoCurrencies cryptoCurrency)
    {
        return AbstractAPICaller.canUseCurrency(CryptoCompare.ACCEPTED_CRYPTOCURRENCIES, cryptoCurrency);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected double extractPrice(final JSONObject jsonObject) throws BadData {
        try {
            // Ok, so I don't know why, but casting it to a regular 'double' wasn't working.
            //  This works, so I'm leaving it
            return ((Double) jsonObject.get(super.getCurrentFiatCurrency().getAbbreviatedName()));
        } catch (final ClassCastException e) {
            // Sometimes when the price has too many digits, it gets returned as a long
            return ((Long) jsonObject.get(super.getCurrentFiatCurrency().getAbbreviatedName())).doubleValue();
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
                CryptoCompare.BASE_URL + "?fsym=" + cryptoCurrency.getAbbreviatedName() + "&tsyms=" +
                        super.getCurrentFiatCurrency().getAbbreviatedName());
    }

    /**
     * {@inheritDoc}
     * </p>
     * In addition, it also updates the endpoint
     * @param fiatCurrency The fiat currency to be used for this endpoint
     */
    @Override
    public void setFiatCurrency(final FiatCurrencies fiatCurrency) throws FiatCurrencyNotSupported {
        super.setFiatCurrency(fiatCurrency);
        super.updateUrl(fiatCurrency == null ?
                null :
                CryptoCompare.BASE_URL + "?fsym=" + super.getCurrentCryptoCurrency().getAbbreviatedName() + "&tsyms=" +
                        fiatCurrency.getAbbreviatedName());
    }
}
