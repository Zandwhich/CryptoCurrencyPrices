package com.company.view.button.close;

import com.company.controller.ControllerInterface;
import com.company.view.button.AbstractJButtonButton;
import com.company.view.window.WindowInterface;

import java.awt.event.ActionEvent;

/**
 * The button used to close a window
 */
final public class CloseJButton extends AbstractJButtonButton implements CloseButtonInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The text to be displayed in the button
     */
    public static final String TEXT = "Close";

    /**
     * The window that holds this button (needed for its <code>close()</code> operation)
     */
    private final WindowInterface window;


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * Constructor for the close button
     * @param window The window that holds the button
     */
    public CloseJButton(final WindowInterface window) {
        super();

        this.window = window;
        super.setText(CloseJButton.TEXT);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * The action performed on clicking the button. In this case it closes the window
     * @param actionEvent The action event passed in
     */
    @Override
    public void onClick(final ActionEvent actionEvent) {
        this.window.close();
    }

}
