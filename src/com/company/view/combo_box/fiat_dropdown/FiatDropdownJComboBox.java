package com.company.view.combo_box.fiat_dropdown;

import com.company.tools.enums.currency.FiatCurrencies;
import com.company.view.combo_box.AbstractJComboBox;

/**
 * The implementation for the dropdown selector for fiat currencies
 */
final public class FiatDropdownJComboBox extends AbstractJComboBox<String> implements FiatDropdownInterface<String> {

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * A constructor for the combo box
     * @param items A string of items that is displayed
     */
    public FiatDropdownJComboBox(final String[] items, final FiatDropdownContractInterface controller) {
        super(items, controller);
    }


    /* ************ *
     *    Methods   *
     * ************ */

    /**
     * {@inheritDoc}
     */
    @Override
    public FiatDropdownContractInterface getController() {
        return (FiatDropdownContractInterface) super.getController();
    }

    /**
     * Alerts the main controller when the selected fiat currency is changed
     */
    @Override
    protected void selectedItemChanged() {
        super.selectedItemChanged();
        this.getController().updateFiatCurrency(FiatCurrencies.toFiatCurrency(super.getSelectedItem()));
    }

}
