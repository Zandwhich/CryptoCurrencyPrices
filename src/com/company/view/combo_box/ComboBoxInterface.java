package com.company.view.combo_box;

/**
 * The base combo box interface which all extend from
 */
public interface ComboBoxInterface<T> {

    /**
     * Returns the currently selected item
     * @return The currently selected item
     */
    T getSelectedItem();

}
