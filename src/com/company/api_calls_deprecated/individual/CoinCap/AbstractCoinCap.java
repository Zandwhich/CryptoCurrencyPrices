package com.company.api_calls_deprecated.individual.CoinCap;

import com.company.api_calls_deprecated.AbstractJSONCaller;
import com.company.controller.ControllerInterface;
import com.sun.istack.internal.NotNull;
import json_simple.JSONObject;

/**
 * TODO: Fill in
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
     * TODO: Fill in
     * @param cryptoCurrency
     * @param fiatCurrency
     * @param name
     * @param urlExt
     * @param controller The controller that calls this endpoint
     */
    public AbstractCoinCap(final String cryptoCurrency, final String fiatCurrency, final String name,
                           final String urlExt, ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, name, AbstractCoinCap.BASE_URL + urlExt, controller);
    }//end AbstractCoinCap()

    /****************
     *   Methods    *
     ****************/

    /* Public */

    // Getters

    /**
     * TODO: Fill in
     * @return
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
     * TODO: Fill in
     * @param jsonObject
     * @return
     */
    protected abstract double extractFiat(@NotNull final JSONObject jsonObject);

}//end AbstractCoinCap
