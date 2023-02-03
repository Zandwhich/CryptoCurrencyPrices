package com.company.view.combo_box.fiat_dropdown;

import com.company.tools.enums.currency.FiatCurrencies;
import com.company.view.combo_box.ComboBoxContractInterface;

public interface FiatDropdownContractInterface extends ComboBoxContractInterface {

    /**
     * Updates the currently selected fiatCurrencyPrice
     * @param fiatCurrency The fiat currency to be passed in
     */
    void updateFiatCurrency(final FiatCurrencies fiatCurrency);
}
