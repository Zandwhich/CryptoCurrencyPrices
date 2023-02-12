package com.company.tool.exception.currency_not_supported;

import com.company.tool.enums.currency.FiatCurrencies;

/**
 * The exception to throw when an endpoint is set to a fiat currency it doesn't support
 */
public final class FiatCurrencyNotSupported extends AbstractCurrencyNotSupported {

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor to throw when an endpoint is set to a fiat currency it doesn't support
     * @param notSupportFiat The fiat currency that isn't supported
     */
    public FiatCurrencyNotSupported(final FiatCurrencies notSupportFiat) {
        super(notSupportFiat);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * Returns the fiat currency that is not supported
     * @return The fiat currency that is not supported
     */
    @Override
    public FiatCurrencies getNotSupportedCurrency() {
        return (FiatCurrencies) super.getNotSupportedCurrency();
    }
}
