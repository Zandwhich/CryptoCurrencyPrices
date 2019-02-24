package com.company.view.combo_box;

import javax.swing.*;

/**
 * TODO: Fill in
 */
public abstract class AbstractJComboBox extends JComboBox implements ComboBoxInterface {

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
    public AbstractJComboBox(String[] items) {
        super(items);
    }//end AbstractJComboBox

    /****************
     *    Methods   *
     ****************/

}//end AbstractJComboBox
