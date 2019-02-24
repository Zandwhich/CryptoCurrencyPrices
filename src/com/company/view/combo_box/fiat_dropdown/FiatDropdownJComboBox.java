package com.company.view.combo_box.fiat_dropdown;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.combo_box.AbstractJComboBox;

/**
 * TODO: Fill in
 */
public class FiatDropdownJComboBox<String> extends AbstractJComboBox<String> implements FiatDropdownInterface<String> {

    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * A constructor for the combo box
     * @param items A string of items that is displayed
     */
    public FiatDropdownJComboBox(String[] items, MainControllerInterface mainController) {
        super(items, mainController);
    }//end AbstractJComboBox()

    /****************
     *    Methods   *
     ****************/

    /* Private */


    /* Protected */


    /* Public */

    // Getters


    @Override
    protected void selectedItemChanged() {
        super.selectedItemChanged();

    }
}//end FiatDropdownJComboBox
