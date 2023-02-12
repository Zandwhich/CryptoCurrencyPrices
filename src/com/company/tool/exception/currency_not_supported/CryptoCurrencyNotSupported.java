package com.company.tool.exception.currency_not_supported;

import com.company.tool.enums.currency.CryptoCurrencies;

/**
 * The exception to throw when an endpoint is set to a cryptocurrency it doesn't support
 */
public final class CryptoCurrencyNotSupported extends AbstractCurrencyNotSupported {

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor to throw when an endpoint is set to a cryptocurrency it doesn't support
     * @param notSupportedCrypto The cryptocurrency that isn't supported
     */
    public CryptoCurrencyNotSupported(final CryptoCurrencies notSupportedCrypto) {
        super(notSupportedCrypto);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * Returns the cryptocurrency that is not supported
     * @return The cryptocurrency that is not supported
     */
    @Override
    public CryptoCurrencies getNotSupportedCurrency() {
        return (CryptoCurrencies) super.getNotSupportedCurrency();
    }
}
