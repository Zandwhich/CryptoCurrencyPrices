package com.company.api_call.CoinMarketCap;

import com.company.api_call.APICallerContract;
import com.company.api_call.AbstractAPICaller;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.tool.exception.currency_not_supported.CryptoCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.FiatCurrencyNotSupported;
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
    private final static String NAME = "CoinMarketCap";

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
     * The constructor for CoinMarketCap when a cryptocurrency and a fiat currency aren't specified (most likely when
     * the currency is not supported for the given endpoint)
     *
     * @param controller The controller that implements the required methods
     */
    public CoinMarketCap(final APICallerContract controller) {
        super(CoinMarketCap.ACCEPTED_CRYPTO_CURRENCIES, CoinMarketCap.ACCEPTED_FIAT_CURRENCIES, CoinMarketCap.NAME,
                controller);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    @Override
    protected String createURLStringForCall(final CryptoCurrencies crypto, final FiatCurrencies fiat)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        super.throwIfNotAcceptedCurrency(crypto, fiat);

        return CoinMarketCap.BASE_URL + "?symbol=" + crypto.getAbbreviatedName() + "&convert=" +
                fiat.getAbbreviatedName();
    }

    @Override
    protected double extractPrice(final JSONObject jsonObject, final CryptoCurrencies crypto, final FiatCurrencies fiat)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        super.throwIfNotAcceptedCurrency(crypto, fiat);

        final JSONObject data = (JSONObject) jsonObject.get("data");

        if (data == null) return -1; // TODO: Throw an error

        final JSONObject quotes = (JSONObject) data.get("quotes");

        if (quotes == null) return -1; // TODO: Throw an error

        final JSONObject fiat_json = (JSONObject) quotes.get(fiat.getAbbreviatedName());

        return fiat_json == null ? -1 /* TODO: Throw an error */ : (double) fiat_json.get("price");
    }

    /**
     * Returns if the given fiat currency can be used with CoinMarketCap
     *
     * @param fiatCurrency The given fiat currency
     * @return If the given fiat currency can be used with CoinMarketCap
     */
    public static boolean endpointCanUseFiatCurrency(final FiatCurrencies fiatCurrency) {
        return AbstractAPICaller.canUseCurrency(CoinMarketCap.ACCEPTED_FIAT_CURRENCIES, fiatCurrency);
    }

    /**
     * Returns if the given cryptocurrency can be used with CoinMarketCap
     *
     * @param cryptoCurrency The given cryptocurrency
     * @return If the given cryptocurrency can be used with CoinMarketCap
     */
    public static boolean endpointCanUseCryptoCurrency(final CryptoCurrencies cryptoCurrency) {
        return AbstractAPICaller.canUseCurrency(CoinMarketCap.ACCEPTED_CRYPTO_CURRENCIES, cryptoCurrency);
    }
}
