package com.company.view.combo_box.crypto_dropdown;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.tools.enums.currency.CryptoCurrencies;
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
    public CryptoDropdownJComboBox(final String[] items, final MainControllerInterface mainController) {
        super(items, mainController);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * Returns the controller cast as the main controller interface
     * @return The controller cast as the main controller interface
     */
    private MainControllerInterface getMainController() {
        return (MainControllerInterface) super.getController();
    }

    /**
     * Alerts the main controller when the selected cryptocurrency is changed
     */
    @Override
    protected void selectedItemChanged() {
        super.selectedItemChanged();
        this.getMainController().updateCryptocurrency(CryptoCurrencies.toCryptoCurrency(super.getSelectedItem()));
    }
}
