package com.company.view.combo_box;

import javax.swing.*;

/**
 * The default class
 */
public abstract class AbstractJComboBox<T> extends JComboBox<T> implements ComboBoxInterface<T> {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The controller
     */
    private final ComboBoxContractInterface controller;


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * A constructor for the combo box
     * @param items A string of items that is displayed
     */
    public AbstractJComboBox(final T[] items, final ComboBoxContractInterface controller) {
        super(items);
        this.controller = controller;
    }


    /* ************ *
     *    Methods   *
     * ************ */

    /**
     * {@inheritDoc}
     */
    @Override
    public T getSelectedItem() {
        return (T) super.getSelectedItem();
    }

    /**
     * Returns the controller that implemented the required methods
     * @return The controller that implemented the required methods
     */
    public ComboBoxContractInterface getController() {
        return this.controller;
    }

}
