package com.company.view.button.buttons.close_button;

import com.company.controller.ControllerInterface;
import com.company.view.button.AbstractJButtonButton;
import com.company.view.window.WindowInterface;

import java.awt.event.ActionEvent;

/**
 * TODO: Fill in
 */
public class CloseButton extends AbstractJButtonButton implements CloseButtonInterface {

    /****************
     *    Fields    *
     ****************/

    public static final String TEXT = "Close";

    /****************
     * Constructors *
     ****************/

    /**
     * Constructor for the close button
     * @param controller The controller that subscribes to the button
     * @param window The window that holds the button
     */
    public CloseButton(ControllerInterface controller, WindowInterface window) {
        super(controller, window);
        super.setText(CloseButton.TEXT);
    }//end CloseButton

    /****************
     *   Methods    *
     ****************/

    /* Public */

    /**
     * The action performed on clicking the button. In this case it closes the window
     * @param actionEvent The action event passed in
     */
    @Override
    public void onClick(ActionEvent actionEvent) {
        super.getWindow().close();
    }//end onClick()
}//end CloseButton
