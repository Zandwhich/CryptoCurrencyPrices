package com.company.api_calls.individual.CoinMarketCap;

import com.company.api_calls.AbstractJSONCaller;
import com.company.controller.ControllerInterface;
import com.company.tools.enums.CryptoCurrencies;
import com.company.tools.enums.FiatCurrencies;
import json_simple.JSONObject;

/**
 * The API endpoint for CoinMarketCap
 * TODO: Get this to work? Idk if I'll ever get around to this...
 */
final public class CoinMarketCap extends AbstractJSONCaller {

    /* ************ *
     *  Constants   *
     * ************ */

    /**
     * The base URL for CoinMarketCap requests
     */
    private final static String BASE_URL = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest";

    /**
     * The base name for CoinMarketCap requests
     */
    private final static String BASE_NAME = "CoinMarketCap ";

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


    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for the basic CoinMarketCap requests
     * @param cryptoCurrency The cryptocurrency in the request
     * @param fiatCurrency The fiat currency in the request
     * @param controller The controller that calls this endpoint
     */
    public CoinMarketCap(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                         final ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, CoinMarketCap.ACCEPTED_CRYPTO_CURRENCIES,
                CoinMarketCap.ACCEPTED_FIAT_CURRENCIES,
                CoinMarketCap.BASE_NAME + ": " + cryptoCurrency.getAbbreviatedName() + "/" +
                        fiatCurrency.getAbbreviatedName(),
                CoinMarketCap.BASE_URL + "?symbol=" + cryptoCurrency.getAbbreviatedName() +
                        "&convert=" + fiatCurrency.getAbbreviatedName(),
                controller);
    }//end AbstractCoinMarketCap()

    /****************
     *   Methods    *
     ****************/

    /* Public */

    // Getters

    /**
     * {@inheritDoc}
     */
    @Override
    public String getBaseUrl() { return CoinMarketCap.BASE_URL; }//end getBaseUrl()

    // Other

    /**
     * Returns if the given fiat currency can be used with CoinMarketCap
     * @param fiatCurrency The given fiat currency
     * @return If the given fiat currency can be used with CoinMarketCap
     */
    public static boolean canUseFiatCurrency(final FiatCurrencies fiatCurrency)
    {
        for (final FiatCurrencies currency : CoinMarketCap.ACCEPTED_FIAT_CURRENCIES)
        {
            if (currency.equals(fiatCurrency)) return true;
        }//end for
        return false;
    }//end canUseFiatCurrency()

    /**
     * Returns if the given cryptocurrency can be used with CoinMarketCap
     * @param cryptoCurrency The given cryptocurrency
     * @return If the given cryptocurrency can be used with CoinMarketCap
     */
    public static boolean canUseCryptoCurrency(final CryptoCurrencies cryptoCurrency)
    {
        for (final CryptoCurrencies currency : CoinMarketCap.ACCEPTED_CRYPTO_CURRENCIES)
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

        if (data == null) return -1; // TODO: Throw an error

        final JSONObject quotes = (JSONObject) data.get("quotes");

        if (quotes == null) return -1; // TODO: Throw an error

        final JSONObject fiat = (JSONObject) quotes.get(this.getFiatCurrency().getAbbreviatedName());

        return fiat == null ? -1 /* TODO: Throw an error */ : (double) fiat.get("price");
    }//end extractPrice()
}//end AbstractCoinMarketCap
