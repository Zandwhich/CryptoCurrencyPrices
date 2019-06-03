package com.company.api_calls_deprecated.individual.CoinBase;

import com.company.api_calls_deprecated.AbstractJSONCaller;
import com.company.controller.ControllerInterface;
import com.sun.istack.internal.NotNull;
import json_simple.JSONObject;

/**
 * The basic class for all CoinBase requests
 */
public abstract class AbstractCoinBase extends AbstractJSONCaller {

    /****************
     *    Fields    *
     ****************/

    /**
     * The base URL for CoinBase requests
     */
    final static String BASE_URL = "https://api.coinbase.com/v2/prices/";

    /****************
     * Constructors *
     ****************/

    /**
     * A constructor for the AbstractCoinBase class
     * @param cryptoCurrency The cryptocurrency
     * @param fiatCurrency The fiat currency
     * @param name The name of the specific request
     * @param urlExt The extension to the base url
     */
    public AbstractCoinBase(final String cryptoCurrency, final String fiatCurrency, final String name,
                            final String urlExt, final ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, name, AbstractCoinBase.BASE_URL + urlExt, controller);
    }//end AbstractCoinBase()

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
    public String getBaseUrl() { return AbstractCoinBase.BASE_URL; }//end getBaseUrl()

    /* Protected */

    /**
     * Gets the price from the JSON Object
     * @param jsonObject The JSON object received from a request
     * @return The price from the JSON object
     */
    @Override
    protected double extractPrice(@NotNull final JSONObject jsonObject) {
        JSONObject data = (JSONObject) jsonObject.get("data");

        if (data == null || !data.containsKey("amount")) return -1;

        return Double.parseDouble((String) data.get("amount"));
    }//end extractPrice()

}//end AbstractCoinBase
