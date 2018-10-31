package com.company.view.button.buttons;

import com.company.controller.MainControllerInterface;
import com.company.view.button.AbstractJButtonButton;

import java.awt.event.ActionEvent;

/**
 * TODO: Fill this out
 */
public class RefreshButton extends AbstractJButtonButton {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    public static final String IMAGE_PATH = "imgs/refresh_button_image.PNG";

    /****************
     * Constructors *
     ****************/

    /**
     * TODO: Fill this out
     * @param controller The controller that holds and subscribes to the button
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     */
    public RefreshButton(MainControllerInterface controller, int width, int height) {
        super(width, height, controller);
    }//end RefreshButton()

    /**
     * TODO: Fill this out
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
     * TODO: Fill this in
     * @param event TODO: Fill this in
     */
    @Override
    protected void onClick(ActionEvent event) {
        controller.refresh();
    }//end onClick()

    /* Public */

}//end RefreshButton
