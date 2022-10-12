package com.company.view.combo_box.fiat_dropdown;

import com.company.tools.enums.FiatCurrencies;
import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.combo_box.AbstractJComboBox;

/**
 * The implementation for the dropdown selector for fiat currencies
 */
final public class FiatDropdownJComboBox extends AbstractJComboBox<String> implements FiatDropdownInterface<String> {

    /* ************ *
     *    Fields    *
     * ************ */

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * A constructor for the combo box
     * @param items A string of items that is displayed
     */
    public FiatDropdownJComboBox(String[] items, MainControllerInterface mainController) {
        super(items, mainController);
    }

    /* ************ *
     *    Methods   *
     * ************ */

    /* Private */

    /**
     * Returns the controller cast as the main controller interface
     * @return The controller cast as the main controller interface
     */
    private MainControllerInterface getMainController() {
        return (MainControllerInterface) super.getController();
    }


    /* Protected */

    /**
     * Alerts the main controller when the selected fiat currency is changed
     */
    @Override
    protected void selectedItemChanged() {
        super.selectedItemChanged();
        this.getMainController().updateFiatCurrency(FiatCurrencies.toFiatCurrency(super.getSelectedItem()));
    }


    /* Public */

    // Getters


}
