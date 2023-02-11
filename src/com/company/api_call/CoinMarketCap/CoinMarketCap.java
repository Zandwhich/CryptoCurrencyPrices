package com.company.api_call.CoinMarketCap;

import com.company.api_call.APICallerContract;
import com.company.api_call.AbstractAPICaller;
import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.currency.FiatCurrencies;
import json_simple.JSONObject;

/**
 * The API endpoint for CoinMarketCap
 * TODO: Get this to work? Idk if I'll ever get around to this...
 */
final public class CoinMarketCap extends AbstractAPICaller {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The base URL for CoinMarketCap requests
     */
    private final static String BASE_URL = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest";

    /**
     * The base name for CoinMarketCap requests
     */
    private final static String BASE_NAME = "CoinMarketCap";

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


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for the basic CoinMarketCap requests
     * @param cryptoCurrency The cryptocurrency in the request
     * @param fiatCurrency The fiat currency in the request
     * @param controller The controller that implements the required method
     */
    public CoinMarketCap(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                         final APICallerContract controller) {
        super(cryptoCurrency, fiatCurrency, CoinMarketCap.ACCEPTED_CRYPTO_CURRENCIES,
                CoinMarketCap.ACCEPTED_FIAT_CURRENCIES,
                CoinMarketCap.BASE_NAME,
                cryptoCurrency == null || fiatCurrency == null ?
                        null :
                        CoinMarketCap.BASE_URL + "?symbol=" + cryptoCurrency.getAbbreviatedName() + "&convert=" +
                                fiatCurrency.getAbbreviatedName(),
                controller);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * {@inheritDoc}
     */
    @Override
    public String getBaseUrl() { return CoinMarketCap.BASE_URL; }

    /**
     * Returns if the given fiat currency can be used with CoinMarketCap
     * @param fiatCurrency The given fiat currency
     * @return If the given fiat currency can be used with CoinMarketCap
     */
    public static boolean endpointCanUseFiatCurrency(final FiatCurrencies fiatCurrency)
    {
        return AbstractAPICaller.canUseCurrency(CoinMarketCap.ACCEPTED_FIAT_CURRENCIES, fiatCurrency);
    }

    /**
     * Returns if the given cryptocurrency can be used with CoinMarketCap
     * @param cryptoCurrency The given cryptocurrency
     * @return If the given cryptocurrency can be used with CoinMarketCap
     */
    public static boolean endpointCanUseCryptoCurrency(final CryptoCurrencies cryptoCurrency)
    {
        return AbstractAPICaller.canUseCurrency(CoinMarketCap.ACCEPTED_CRYPTO_CURRENCIES, cryptoCurrency);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected double extractPrice(final JSONObject jsonObject) {
        final JSONObject data = (JSONObject) jsonObject.get("data");

        if (data == null) return -1; // TODO: Throw an error

        final JSONObject quotes = (JSONObject) data.get("quotes");

        if (quotes == null) return -1; // TODO: Throw an error

        final JSONObject fiat = (JSONObject) quotes.get(this.getCurrentFiatCurrency().getAbbreviatedName());

        return fiat == null ? -1 /* TODO: Throw an error */ : (double) fiat.get("price");
    }

    /**
     * {@inheritDoc}
     * </p>
     * In addition, it also updates the endpoint
     * @param cryptoCurrency The cryptocurrency to be used for this endpoint
     */
    @Override
    public void setCryptoCurrency(final CryptoCurrencies cryptoCurrency) {
        super.setCryptoCurrency(cryptoCurrency);
        super.updateUrl(cryptoCurrency == null ?
                null :
                CoinMarketCap.BASE_URL + "?symbol=" + cryptoCurrency.getAbbreviatedName() + "&convert=" +
                        super.getCurrentFiatCurrency().getAbbreviatedName());
    }

    /**
     * {@inheritDoc}
     * </p>
     * In addition, it also updates the endpoint
     * @param fiatCurrency The fiat currency to be used for this endpoint
     */
    @Override
    public void setFiatCurrency(final FiatCurrencies fiatCurrency) {
        super.setFiatCurrency(fiatCurrency);
        super.updateUrl(fiatCurrency == null ?
                null :
                CoinMarketCap.BASE_URL + "?symbol=" + super.getCurrentFiatCurrency().getAbbreviatedName() + "&convert="
                        + fiatCurrency.getAbbreviatedName());
    }
}
