package com.company.view.label;

import javax.swing.*;

/**
 * The JLabel that all labels extend from
 */
public abstract class AbstractJLabelLabel extends JLabel implements LabelInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor that takes in a text to print on the label
     * @param text The text to print on the label
     */
    public AbstractJLabelLabel(String text) { super(text); }

    /* ************ *
     *    Methods   *
     * ************ */
}//end AbstractJLabelLabel
