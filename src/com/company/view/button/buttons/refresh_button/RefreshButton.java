package com.company.view.button.buttons.refresh_button;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.button.AbstractJButtonButton;
import com.company.view.window.WindowInterface;

import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * The refresh button that is displayed on the main page
 */
final public class RefreshButton extends AbstractJButtonButton implements RefreshButtonInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /* Constants */

    public static final String IMAGE_PATH = "src/resources/imgs/refresh_button_image.PNG";

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * A constructor for the RefreshButton
     * @param controller The controller that holds and subscribes to the button
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     * @param window The window that holds the button
     */
    public RefreshButton(MainControllerInterface controller, WindowInterface window, int width, int height) {
        super(width, height, controller, window);
    }

    /**
     * A constructor for the refresh button
     * @param controller The controller that holds and subscribes to the button that will be refreshed
     * @param window The window that holds the button
     */
    public RefreshButton(MainControllerInterface controller, WindowInterface window) {
        super(RefreshButton.IMAGE_PATH, controller, window);
        super.setMaximumSize(new Dimension(100, 100));
        super.setMinimumSize(new Dimension(10, 10));
    }

    /* ************ *
     *   Methods    *
     * ************ */

    /* Private */

    /* Protected */

    /**
     * The action to do on pressing. It will tell the controller to refresh
     * @param event Because of the nature of the method, an ActionEvent is required
     */
    @Override
    protected void onClick(ActionEvent event) {
        super.getController().refresh();
    }

    /* Public */

}
