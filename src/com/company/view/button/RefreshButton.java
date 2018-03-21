package com.company.view.button;

import com.company.view.window.MainWindowListenerInterface;

import java.awt.event.ActionEvent;

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
    public RefreshButton(MainWindowListenerInterface window, int width, int height) {
        super(width, height, window);
    }//end RefreshButton()

    /**
     * TODO: Fill this out
     * @param window The window that holds and subscribes to the button
     */
    public RefreshButton(MainWindowListenerInterface window) { super(window); }//end RefreshButton()

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
        window.refresh();
    }//end onClick()

    /* Public */

}//end RefreshButton
