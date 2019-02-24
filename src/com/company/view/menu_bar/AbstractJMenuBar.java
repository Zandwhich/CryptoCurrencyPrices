package com.company.view.menu_bar;

import com.company.controller.ControllerInterface;

import javax.swing.*;

/**
 * TODO: Fill in
 */
public abstract class AbstractJMenuBar extends JMenuBar implements MenuBarInterface {

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
     * @param controller The controller
     */
    public AbstractJMenuBar(ControllerInterface controller) {
        super();
        this.controller = controller;
    }//end AbstractJMenuBar()


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

}//end AbstractJMenuBar
