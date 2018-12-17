package com.company.view.window.windows.error.errors.network_error;

import com.company.controller.ControllerInterface;
import com.company.view.window.windows.error.AbstractJFrameErrorWindow;

/**
 * TODO: Fill in
 */
public class NetworkErrorWindow extends AbstractJFrameErrorWindow implements NetworkErrorWindowInterface {

    /****************
     *    Fields    *
     ****************/

    /**
     * The message of the error's window
     */
    public static final String MESSAGE = "There appears to be a network connection error. Please check your connection and try again.";

    /**
     * The title of the error's window
     */
    public static final String TITLE = "ERROR: Network Connection";

    /****************
     * Constructors *
     ****************/

    /**
     * TODO: The constructor for the window that displays an error
     * @param controller The controller in charge of the window
     * @param width The width of the window
     * @param height The height of the window
     */
    public NetworkErrorWindow(ControllerInterface controller, int width, int height) {
        super(controller, NetworkErrorWindow.TITLE, width, height, NetworkErrorWindow.MESSAGE);
    }//end NetworkErrorWindow

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /* Protected */

    /* Public */

    // Getters

    // Setters

    // Others
}//end NetworkErrorWindow
