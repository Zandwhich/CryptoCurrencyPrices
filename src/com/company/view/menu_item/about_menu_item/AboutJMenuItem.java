package com.company.view.menu_item.about_menu_item;

import com.company.view.menu_item.AbstractJMenuItem;

/**
 * The instantiation of the About menu item
 */
final public class AboutJMenuItem extends AbstractJMenuItem implements AboutMenuItemInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The name of the menu item to be displayed
     */
    public final static String NAME = "About";


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor
     * @param controller The (most likely) controller that will open this About page
     */
    public AboutJMenuItem(final AboutMenuItemContractInterface controller) {
        super(AboutJMenuItem.NAME);
        this.addActionListener(e -> controller.aboutPagePopUp());
    }

}
