package com.company.tool.exception.currency_not_supported;

import com.company.tool.enums.currency.Currency;

/**
 *
 */
public abstract class AbstractCurrencyNotSupported extends Exception {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The currency that was attempted to
     */
    private final Currency notSupportedCurrency;


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor for the exception when a non-supported currency is tried to be applied to an endpoint
     * @param notSupportedCurrency The not supported currency for the endpoint
     */
    public AbstractCurrencyNotSupported(final Currency notSupportedCurrency) {
        this.notSupportedCurrency = notSupportedCurrency;
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * Returns the currency that's not supported
     * @return The currency that's not supported
     */
    public Currency getNotSupportedCurrency() {
        return notSupportedCurrency;
    }
}
