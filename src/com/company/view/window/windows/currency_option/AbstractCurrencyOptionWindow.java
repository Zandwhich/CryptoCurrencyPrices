package com.company.view.window.windows.currency_option;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.window.AbstractJFrameWindow;

/**
 * TODO: Fill in
 */
public abstract class AbstractCurrencyOptionWindow extends AbstractJFrameWindow implements CurrencyOptionWindowInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /* Constants */

    /**
     * The width of the window
     */
    public static final int WIDTH = 250;

    /**
     * The height of the window
     */
    public static final int HEIGHT = 250;


    /* Variables */


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The default constructor
     * @param title The title of the window
     * @param controller The controller
     */
    public AbstractCurrencyOptionWindow(final String title, final MainControllerInterface controller) {
        super(controller, title, AbstractCurrencyOptionWindow.WIDTH, AbstractCurrencyOptionWindow.HEIGHT);
    }


    /* ************ *
     *    Methods   *
     * ************ */

    /* Private */

    /* Protected */

    /**
     * Returns the controller as the main controller
     * @return The controller as the main controller
     */
    protected MainControllerInterface getMainController() {
        return (MainControllerInterface) super.getController();
    }

    /* Public */

    // Getters

    // Setters

}
