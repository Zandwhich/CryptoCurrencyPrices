package com.company.view.button.buttons.refresh_button;

import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.view.button.AbstractJButtonButton;

import java.awt.event.ActionEvent;

/**
 * The refresh button that is displayed on the main page
 */
public class RefreshButton extends AbstractJButtonButton implements RefreshButtonInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    public static final String IMAGE_PATH = "imgs/refresh_button_image.PNG";

    /****************
     * Constructors *
     ****************/

    /**
     * A constructor for the RefreshButton
     * @param controller The controller that holds and subscribes to the button
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     */
    public RefreshButton(MainControllerInterface controller, int width, int height) {
        super(width, height, controller);
    }//end RefreshButton()

    /**
     * A constructor for the refresh button
     * @param controller The controller that holds and subscribes to the button that will be refreshed
     */
    public RefreshButton(MainControllerInterface controller) {
        super(RefreshButton.IMAGE_PATH, controller);
    }//end RefreshButton()

    /****************
     *   Methods    *
     ****************/

    /* Private */

    /* Protected */

    /**
     * The action to do on pressing. It will tell the controller to refresh
     * @param event Because of the nature of the method, an ActionEvent is required
     */
    @Override
    protected void onClick(ActionEvent event) {
        controller.refresh();
    }//end onClick()

    /* Public */

}//end RefreshButton
