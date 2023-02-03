package com.company.view.button.refresh;

import com.company.controller.main.MainControllerInterface;
import com.company.view.button.AbstractJButtonButton;
import com.company.view.window.WindowInterface;

import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * The refresh button that is displayed on the main page
 */
final public class RefreshJButton extends AbstractJButtonButton implements RefreshButtonInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    public static final String IMAGE_PATH = "src/resources/images/refresh_button_image.PNG";


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * A constructor for the refresh button
     * @param controller The controller that holds and subscribes to the button that will be refreshed
     * @param window The window that holds the button
     */
    public RefreshJButton(final MainControllerInterface controller, final WindowInterface window) {
        super(RefreshJButton.IMAGE_PATH, controller, window);

        // TODO: This doesn't work, sadly...
        super.setMaximumSize(new Dimension(100, 100));
        super.setMinimumSize(new Dimension(10, 10));
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * The action to do on pressing. It will tell the controller to refresh
     * @param event Because of the nature of the method, an ActionEvent is required
     */
    @Override
    protected void onClick(ActionEvent event) {
        super.getController().refresh();
    }

}
