package com.company.view.menu_item;

import com.company.controller.ControllerInterface;

import javax.swing.*;

/**
 * TODO: Fill in
 */
public abstract class AbstractJMenuItem extends JMenuItem implements MenuItemInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /* Variables */

    private ControllerInterface controller;


    /****************
     * Constructors *
     ****************/

    /**
     * A constructor which takes in a name to display
     * @param name The name to display
     */
    public AbstractJMenuItem(String name, ControllerInterface controller) {
        super(name);
        this.controller = controller;
    }//end AbstractJMenuItem()


    /****************
     *    Methods   *
     ****************/

    /* Private */

    /* Protected */

    /* Public */

    // Getters

    /**
     * Returns the controller
     * @return The controller
     */
    public ControllerInterface getController() {
        return controller;
    }//end getController()


    // Setters

}//end AbstractJMenuItem
