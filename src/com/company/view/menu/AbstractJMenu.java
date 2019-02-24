package com.company.view.menu;

import com.company.controller.ControllerInterface;

import javax.swing.*;

/**
 * TODO: Fill in
 */
public abstract class AbstractJMenu extends JMenu implements MenuInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /* Variables */

    /**
     * The controller
     */
    private ControllerInterface controller;


    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor
     * @param name The name of the menu
     */
    public AbstractJMenu(String name, ControllerInterface controller) {
        super(name);
        this.controller = controller;
    }//end AbstractJMenu()


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

}//end AbstractJMenu
