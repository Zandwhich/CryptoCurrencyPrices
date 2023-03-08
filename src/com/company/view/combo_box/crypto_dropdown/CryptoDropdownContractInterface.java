package com.company.view.combo_box.crypto_dropdown;

import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.view.combo_box.ComboBoxContractInterface;

/**
 * Whoever wants to use an instantiation of CryptoDropdownInterface needs to provide these methods
 */
public interface CryptoDropdownContractInterface extends ComboBoxContractInterface {

    /**
     * Updates the currently selected cryptocurrencyPrice
     * @param cryptoCurrency The cryptocurrency to be passed in
     */
    void updateCryptocurrency(final CryptoCurrencies cryptoCurrency);
}
