package com.company.view.button.buttons.close_button;

import com.company.controller.ControllerInterface;
import com.company.view.button.AbstractJButtonButton;
import com.company.view.window.WindowInterface;

import java.awt.event.ActionEvent;

/**
 * The button used to close a window
 */
final public class CloseButton extends AbstractJButtonButton implements CloseButtonInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The text to be displayed in the button
     */
    public static final String TEXT = "Close";

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * Constructor for the close button
     * @param controller The controller that subscribes to the button
     * @param window The window that holds the button
     */
    public CloseButton(ControllerInterface controller, WindowInterface window) {
        super(controller, window);
        super.setText(CloseButton.TEXT);
    }

    /* ************ *
     *   Methods    *
     * ************ */

    /* Public */

    /**
     * The action performed on clicking the button. In this case it closes the window
     * @param actionEvent The action event passed in
     */
    @Override
    public void onClick(ActionEvent actionEvent) {
        super.getWindow().close();
    }
}
