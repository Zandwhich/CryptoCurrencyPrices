package com.company.view.button.buttons;

import com.company.view.button.AbstractJButtonButton;
import com.company.view.window.MainWindowInterface;

import java.awt.event.ActionEvent;

/**
 * TODO: Fill this out
 */
public class RefreshButton extends AbstractJButtonButton {

    /****************
     * Constructors *
     ****************/

    /*
     * TODO: Realized that the MainWindowInterface shouldn't be passed in, but rather the controller interface,
     *       and that the controller should be doing the 'refresh' functionality instead of the window
     */

    /**
     * TODO: Fill this out
     * @param window The window that holds and subscribes to the button
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     */
    public RefreshButton(MainWindowInterface window, int width, int height) {
        super(width, height, window);
    }//end RefreshButton()

    /**
     * TODO: Fill this out
     * @param window The window that holds and subscribes to the button
     */
    public RefreshButton(MainWindowInterface window) {
        super(window);
        super.setImage("imgs/refresh_button_image.PNG");
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
        ((MainWindowInterface) window).refresh();
    }//end onClick()

    /* Public */

}//end RefreshButton
