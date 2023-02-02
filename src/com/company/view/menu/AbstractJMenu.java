package com.company.view.menu;

import javax.swing.*;

/**
 * The base AbstractJMenu class from which all implemented JMenu classes will derive.
 * Provides basic functionality
 */
public abstract class AbstractJMenu extends JMenu implements MenuInterface {


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor
     * @param name The name of the menu
     */
    public AbstractJMenu(final String name) {
        super(name);
    }
}
