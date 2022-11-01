package com.company.view.combo_box;

import com.company.controller.ControllerInterface;
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
    private final ControllerInterface controller;

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * A constructor for the combo box
     * @param items A string of items that is displayed
     */
    public AbstractJComboBox(T[] items, ControllerInterface controller) {
        super(items);
        this.controller = controller;
    }

    /* ************ *
     *    Methods   *
     * ************ */

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
    }

    /**
     * Returns the controller
     * @return The controller
     */
    public ControllerInterface getController() {
        return this.controller;
    }

}
