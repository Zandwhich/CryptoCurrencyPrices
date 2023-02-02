package com.company.view.window.windows.error;

import com.company.controller.ControllerInterface;
import com.company.view.button.buttons.close_button.CloseButton;
import com.company.view.button.buttons.close_button.CloseButtonInterface;
import com.company.view.window.AbstractJFrameWindow;

import javax.swing.*;

/**
 * The generic window for any error
 */
public abstract class AbstractJFrameErrorWindow extends AbstractJFrameWindow implements ErrorWindowInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The panel that holds all the components of the page together
     */
    private final JPanel panel = new JPanel();


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for the window that displays an error
     * @param controller The controller in charge of the window
     * @param title The title of the window
     * @param width The width of the window
     * @param height The height of the window
     * @param message The error message (body) to display
     */
    public AbstractJFrameErrorWindow(final ControllerInterface controller, final String title, final int width,
                                     final int height, final String message) {
        super(controller, title, width, height);
        this.setup(message);
    }


    /* ************ *
     *    Methods   *
     * ************ */

    /* Private */

    /**
     * The redundant setup that is run for each constructor
     * @param message The error message (body) of the window
     */
    private void setup(final String message) {
        // The label that holds the message
        panel.add(new JLabel(message));

        // The button that can close the screen
        panel.add(new CloseButton(super.getController(), this));

        this.add(panel);
    }

    /* Protected */

    /* Public */

    // Getters

    // Setters

    // Others

}
