package com.company.view.button;

import com.company.view.window.WindowListenerInterface;
import javax.swing.*;
import java.awt.event.ActionEvent;
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
    private class ClickListener implements ActionListener {

        /**
         * TODO: Fill this in
         * @param e TODO: Fill this in
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            /* TODO: Figure out if overriding onClick actually works as expected in this case (also if I can construct
             * it at the super-class level or if it needs to be done at the sub-class level)
             */

            onClick(e);
        }//end actionPerformed()
    }//end ClickListener

    /****************
     * Constructors *
     ****************/

    /**
     * TODO: Fill this out
     * @param window The window that holds and subscribes to the button
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     */
    public AbstractJButtonButton(WindowListenerInterface window, int width, int height) {
        this.window = window;
        ActionListener listener = new ClickListener();
        this.addActionListener(listener);
    }//end AbstractJButtonButton()

    /**
     * TODO: Fill this out
     * @param window The window that holds and subscribes to the button
     */
    public AbstractJButtonButton(WindowListenerInterface window) {
        this.window = window;
        ActionListener listener = new ClickListener();
        this.addActionListener(listener);
    }//end AbstractJButtonButton()

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * TODO: Fill this in
     * @param event TODO: Fill this in
     */
    protected abstract void onClick(ActionEvent event);

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
