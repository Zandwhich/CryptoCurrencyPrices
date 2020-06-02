package com.company.api_calls.individual.CoinMarketCap;

import com.company.api_calls.AbstractJSONCaller;
import com.company.controller.ControllerInterface;
import com.company.tools.enums.CryptoCurrencies;
import com.company.tools.enums.FiatCurrencies;
import com.sun.istack.internal.NotNull;
import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
final public class CoinMarketCap extends AbstractJSONCaller {

    /* ************ *
     *  Constants   *
     * ************ */

    /**
     * The base URL for CoinMarketCap requests
     */
    private final static String BASE_URL = "https://api.coinmarketcap.com/v2/ticker/";

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

    /**
     * The number that CoinMarketCap uses for BTC in its URLs
     */
    private static final String BTC_NUMBER = "1";

    /**
     * The number that CoinMarketCap uses for ETH in its URLs
     */
    private static final String ETH_NUMBER = "1027";

    /**
     * The number that CoinMarketCap uses for LTC in its URLs
     */
    private static final String LTC_NUMBER = "2";

    /**
     * The number that CoinMarketCap uses for XRP in its URLs
     */
    private static final String XRP_NUMBER = "57";


    /****************
     *    Fields    *
     ****************/

    private String cryptoNumber;


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
                CoinMarketCap.BASE_URL + convertCryptoCurrency(cryptoCurrency) + "/?convert=" +
                        fiatCurrency.getAbbreviatedName(),
                controller);
        this.cryptoNumber = convertCryptoCurrency(cryptoCurrency);
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
     * Converts the given cryptocurrency into the respective CoinMarketCap specified number
     * @param cryptoCurrency The cryptocurrency
     * @return The CoinMarketCap specified number
     */
    public static String convertCryptoCurrency(final CryptoCurrencies cryptoCurrency)
    {
        switch (cryptoCurrency) {
            case BTC:
                return CoinMarketCap.BTC_NUMBER;
            case ETH:
                return CoinMarketCap.ETH_NUMBER;
            case LTC:
                return CoinMarketCap.LTC_NUMBER;
            case XRP:
                return CoinMarketCap.XRP_NUMBER;
            default:
                // TODO: Throw an error that gets caught internally and simply doesn't display anything
                return "";
        }//end switch
    }//end convertCryptoCurrency()

    /**
     * Returns if the given fiat currency can be used with CoinMarketCap
     * TODO: Make this static somehow
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
     * TODO: Make this static somehow
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
    protected double extractPrice(@NotNull final JSONObject jsonObject) {
        final JSONObject data = (JSONObject) jsonObject.get("data");

        if (data == null) return -1; // TODO: Throw an error

        final JSONObject quotes = (JSONObject) data.get("quotes");

        if (quotes == null) return -1; // TODO: Throw an error

        final JSONObject fiat = (JSONObject) quotes.get(this.getFiatCurrency().getAbbreviatedName());

        return fiat == null ? -1 /* TODO: Throw an error */ : (double) fiat.get("price");
    }//end extractPrice()
}//end AbstractCoinMarketCap
