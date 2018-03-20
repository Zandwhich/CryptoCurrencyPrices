package com.company.view.button;

import com.company.view.window.WindowListenerInterface;
import javax.swing.*;
import java.awt.event.ActionListener;

/**
 * TODO: Fill this out
 */
public abstract class AbstractJButtonButton extends JButton implements ButtonInterface {

    /****************
     *    Fields    *
     ****************/

    /**
     * The window that holds and subscribes to the button
     */
    private WindowListenerInterface window;

    /**
     * TODO: Fill this out
     */
    abstract private class ClickListener implements ActionListener {}

    /****************
     * Constructors *
     ****************/

    /**
     * TODO: Fill this out
     * @param window The window that holds and subscribes to the button
     */
    public AbstractJButtonButton(WindowListenerInterface window) {
        this.window = window;
        // TODO: Figure out how to make the ClickListener and whatnot
        //this.addActionListener(listener);
    }//end AbstractJButtonButton()

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /* Public */

    // Getters

    /**
     * Gets the width (in pixels) of the button
     * @return The width (in pixels) of the button
     */
    @Override
    public int getWidth() { return super.getWidth(); }//end getWidth()

    /**
     * Gets the height (in pixels) of the button
     * @return The height (in pixels) of the button
     */
    @Override
    public int getHeight() { return super.getHeight(); }//end getHeight()

    /**
     * Gets the window that the button is posting to
     * @return The window that the button is posting to
     */
    public WindowListenerInterface getWindow() { return window; }//end getWindow()
}//end AbstractJButtonButton
