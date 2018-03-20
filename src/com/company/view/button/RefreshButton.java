package com.company.view.button;

import com.company.view.window.WindowListenerInterface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * TODO: Fill this out
 */
public class RefreshButton extends AbstractJButtonButton{

    /****************
     * Constructors *
     ****************/

    /**
     * TODO: Fill this out
     * @param window The window that holds and subscribes to the button
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     */
    public RefreshButton(WindowListenerInterface window, int width, int height) {
        super(window, width, height);
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

    }//end onClick()

    /* Public */

}//end RefreshButton
