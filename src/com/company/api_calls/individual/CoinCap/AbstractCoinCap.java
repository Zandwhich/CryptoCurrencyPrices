package com.company.api_calls.individual.CoinCap;

import com.company.api_calls.AbstractJSONCaller;
import com.company.controller.ControllerInterface;
import com.company.tools.CryptoCurrencies;
import com.company.tools.FiatCurrencies;
import com.sun.istack.internal.NotNull;
import json_simple.JSONObject;

/**
 * The basic class for all CoinCap requests
 */
public abstract class AbstractCoinCap extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * The base URL for CoinCap requests
     */
    public final static String BASE_URL = "http://coincap.io/page/";

    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for the basic CoinCap requests
     * @param cryptoCurrency The cryptocurrency
     * @param fiatCurrency The fiat currency
     * @param name The name of the endpoint
     * @param urlExt The extension of the url
     * @param controller The controller that calls this endpoint
     */
    public AbstractCoinCap(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency, final String name,
                           final String urlExt, ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, name, AbstractCoinCap.BASE_URL + urlExt, controller);
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
    public String getBaseUrl() { return AbstractCoinCap.BASE_URL; }//end getBaseUrl()

    /* Protected */

    /**
     * TODO: Fill in
     * @param jsonObject
     * @return
     */
    @Override
    protected double extractPrice(JSONObject jsonObject) {

        // TODO: Figure out how to stop getting denied :(

        return this.extractFiat(jsonObject);
    }//end extractPrice()

    /**
     * TODO: FIll in
     * @param jsonObject
     * @return
     */
    protected abstract double extractFiat(@NotNull final JSONObject jsonObject);

}//end AbstractCoinCap
