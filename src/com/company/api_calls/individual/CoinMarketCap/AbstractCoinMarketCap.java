package com.company.api_calls.individual.CoinMarketCap;

import com.company.api_calls.AbstractJSONCaller;
import com.company.controller.ControllerInterface;
import com.company.tools.CryptoCurrencies;
import com.company.tools.FiatCurrencies;
import com.sun.istack.internal.NotNull;
import json_simple.JSONObject;

/**
 * TODO: Fill in
 */
public abstract class AbstractCoinMarketCap extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * The base URL for CoinMarketCap requests
     */
    private final static String BASE_URL = "https://api.coinmarketcap.com/v2/ticker/";


    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for the basic CoinMarketCap requests
     * @param cryptoCurrency The cryptocurrency in the request
     * @param fiatCurrency The fiat currency in the request
     * @param name The name of the request
     * @param urlExt The extension of the request
     * @param controller The controller that calls this endpoint
     */
    public AbstractCoinMarketCap(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency, final String name,
                                 final String urlExt, ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, name, AbstractCoinMarketCap.BASE_URL + urlExt, controller);
    }//end AbstractCoinMarketCap()

    /****************
     *   Methods    *
     ****************/

    /* Public */

    // Getters

    /**
     * Returns the base of the url
     * @return The base of the url
     */
    @Override
    public String getBaseUrl() { return AbstractCoinMarketCap.BASE_URL; }//end getBaseUrl()

    /* Protected */

    /**
     * TODO: Fill in
     * @param jsonObject
     * @return
     */
    @Override
    protected double extractPrice(@NotNull final JSONObject jsonObject) {
        JSONObject data = (JSONObject) jsonObject.get("data");

        if (data == null) return -1;

        JSONObject quotes = (JSONObject) data.get("quotes");

        if (quotes == null) return -1;

        return this.extractFiat(quotes);
    }//end extractPrice()

    /**
     * TODO: Fill in
     * @param quotes
     * @return
     */
    protected abstract double extractFiat(JSONObject quotes);
}//end AbstractCoinMarketCap
