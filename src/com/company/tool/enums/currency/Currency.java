package com.company.tool.enums.currency;

/**
 * A parent enum to both FiatCurrencies and CryptoCurrencies
 */
public interface Currency {

    /**
     * Returns the full name of the currency
     * @return The full name of the currency
     */
    String getFullName();

    /**
     * Returns the abbreviated name of the currency
     * @return The abbreviated name of the currency
     */
    String getAbbreviatedName();

}
