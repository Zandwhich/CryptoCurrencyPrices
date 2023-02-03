package com.company.view.menu_item;

import javax.swing.*;

/**
 * The base implementation of the JMenuItem class, from which all JMenuItem classes will extend
 */
public abstract class AbstractJMenuItem extends JMenuItem implements MenuItemInterface {

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor for the AbstractJMenuItem
     * @param name The name of the JMenuItem
     */
    public AbstractJMenuItem(final String name) {
        super(name);
    }

}
