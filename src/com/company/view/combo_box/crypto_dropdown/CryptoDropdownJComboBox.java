package com.company.view.combo_box.crypto_dropdown;

import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.view.combo_box.AbstractJComboBox;

/**
 * The implementation for the dropdown selector for cryptocurrencies
 */
final public class CryptoDropdownJComboBox extends AbstractJComboBox<String> implements CryptoDropdownInterface<String> {

    /* ************ *
     * Constructors *
     * ************ */
    /**
     * A constructor for the combo box
     * @param items A string of items that is displayed
     */
    public CryptoDropdownJComboBox(final String[] items, final CryptoDropdownContractInterface controller) {
        super(items, controller);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * {@inheritDoc}
     */
    @Override
    public CryptoDropdownContractInterface getController() {
        return (CryptoDropdownContractInterface) super.getController();
    }

    /**
     * Alerts the main controller when the selected cryptocurrency is changed
     */
    @Override
    protected void selectedItemChanged() {
        super.selectedItemChanged();
        this.getController().updateCryptocurrency(CryptoCurrencies.toCryptoCurrency(super.getSelectedItem()));
    }

}
