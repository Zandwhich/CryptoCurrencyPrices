package com.company.view.window.windows.error.errors.network_error;

import com.company.controller.ControllerInterface;
import com.company.view.button.buttons.close_button.CloseButtonInterface;
import com.company.view.window.windows.error.AbstractJFrameErrorWindow;

import javax.swing.*;

/**
 * TODO: Fill in
 */
public class NetworkErrorWindow extends AbstractJFrameErrorWindow implements NetworkErrorWindowInterface {

    /****************
     *    Fields    *
     ****************/

    /* Public Constants */

    /**
     * The message of the error's window
     */
    public static final String MESSAGE = "There appears to be a network connection error.\nPlease check your connection and try again.";

    /**
     * The title of the error's window
     */
    public static final String TITLE = "ERROR: Network Connection";

    /**
     * The width of the error window
     */
    public static final int WIDTH = 600;

    /**
     * The height of the error window
     */
    public static final int HEIGHT = 75;

    /****************
     * Constructors *
     ****************/

    /**
     * TODO: The constructor for the window that displays an error
     * @param controller The controller in charge of the window
     */
    public NetworkErrorWindow(ControllerInterface controller) {
        super(controller, NetworkErrorWindow.TITLE, NetworkErrorWindow.WIDTH, NetworkErrorWindow.HEIGHT,
                NetworkErrorWindow.MESSAGE);
        this.setup();
    }//end NetworkErrorWindow

    /****************
     *    Methods   *
     ****************/

    /* Private */

    private void setup() {

    }

    /* Protected */

    /* Public */

    // Getters

    // Setters

    // Others
}//end NetworkErrorWindow
