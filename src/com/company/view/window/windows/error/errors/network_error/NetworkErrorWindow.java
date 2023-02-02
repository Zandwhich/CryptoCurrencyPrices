package com.company.view.window.windows.error.errors.network_error;

import com.company.view.window.windows.error.AbstractJFrameErrorWindow;
import com.company.controller.ControllerInterface;

/**
 * The error to throw if there is a network error
 */
final public class NetworkErrorWindow extends AbstractJFrameErrorWindow implements NetworkErrorWindowInterface {

    /* ************ *
     *    Fields    *
     * ************ */

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
    public static final int WIDTH = 1100;

    /**
     * The height of the error window
     */
    public static final int HEIGHT = 75;

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for the window that displays a network error
     * @param controller The controller in charge of the window
     */
    public NetworkErrorWindow(ControllerInterface controller) {
        super(controller, NetworkErrorWindow.TITLE, NetworkErrorWindow.WIDTH, NetworkErrorWindow.HEIGHT,
                NetworkErrorWindow.MESSAGE);
        this.setup();
    }

    /**
     * The constructor for the window that displays a network error along with the name of the connection that caused the error
     * @param controller The controller in charge of the window
     * @param name The name of the cryptocurrency that caused the error
     */
    public NetworkErrorWindow(ControllerInterface controller, String name) {
        super(controller, NetworkErrorWindow.TITLE, NetworkErrorWindow.WIDTH, NetworkErrorWindow.HEIGHT,
                messageWithName(name));
        this.setup();
    }

    /* ************ *
     *    Methods   *
     * ************ */

    /* Private */

    /**
     * The method used to do duplicate setup work throughout multiple controllers
     */
    private void setup() {

    }

    /**
     * Returns the message formatted to hold the cryptocurrency's name that tried to call a network connection
     * @param name The name of the cryptocurrency that tried to call a network connection
     * @return The message formatted to hold the cryptocurrency's name that tried to call a network connection
     */
    private static String messageWithName(String name) {
        return "There appears to be a network connection error. This error occurred while trying to connect to " + name + ".\nPlease check your connection and try again.";
    }


    /* Protected */

    /* Public */

    // Getters

    // Setters

    // Others
}
