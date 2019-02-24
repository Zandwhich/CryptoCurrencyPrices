package com.company.view.combo_box;

import com.company.controller.controllers.main_controller.MainControllerInterface;

import javax.swing.*;

/**
 * TODO: Fill in
 */
public abstract class AbstractJComboBox<T> extends JComboBox<T> implements ComboBoxInterface<T> {

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
    public AbstractJComboBox(T[] items, MainControllerInterface mainController) {
        super(items);
    }//end AbstractJComboBox

    /****************
     *    Methods   *
     ****************/

    /* Private */


    /* Protected */


    /* Public */

    // Getters

    /**
     * Returns the currently selected item
     * @return The currently selected item
     */
    @Override
    public T getSelectedItem() {
        return (T) super.getSelectedItem();
    }//end getSelectedItem()

}//end AbstractJComboBox
