package com.company.tools;

/**
 * A parent enum to both FiatCurrencies and CryptoCurrencies
 */
public interface Currency {

    // TODO: Create the currency folder underneath the enum folder, and put this interface in that with
    //  CryptoCurrencies and FiatCurrencies

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
