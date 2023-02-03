package com.company.view.menu_item.about_menu_item;

import com.company.view.menu_item.MenuItemContractInterface;

/**
 * Whoever wants to use the AboutMenuItem needs to implement these methods
 */
public interface AboutMenuItemContractInterface extends MenuItemContractInterface {

    /**
     * Pops up a page that displays information about this application
     */
    void aboutPagePopUp();

}
