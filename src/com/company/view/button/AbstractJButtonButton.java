package com.company.view.button;

import com.company.view.window.WindowInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * TODO: Fill this out
 */
public abstract class AbstractJButtonButton extends JButton implements ButtonInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /**
     * The default width of a button
     */
    public final int DEFAULT_WIDTH = 100;

    /**
     * The default height of a button
     */
    public final int DEFAULT_HEIGHT = 100;

    /* Variables */

    /**
     * The window that holds and subscribes to the button
     */
    protected WindowInterface window;

    /**
     * The path of the image displayed on the button
     */
    protected String imagePath;

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
     * A constructor for AbstractJButtonButton
     * @param window The window that holds and subscribes to the button
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     */
    public AbstractJButtonButton(int width, int height, WindowInterface window) {
        this.setup(width, height, window);
    }//end AbstractJButtonButton()

    /**
     * A constructor for Abstract JButtonButton
     * @param window The window that holds and subscribes to the button
     */
    public AbstractJButtonButton(WindowInterface window) {
        this.setup(this.DEFAULT_WIDTH, this.DEFAULT_HEIGHT, window);
    }//end AbstractJButtonButton()

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * The method that is run during the constructor in order to abstract the process as much as possible
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     * @param window The window that holds and subscribes to the button
     */
    private void setup(int width, int height, WindowInterface window) {

        // Setting up the window
        //if (!name.equals("")) super.setName(name);
        //System.out.println("Width: " + width + ", Height: " + height);
        super.setSize(width, height);
        super.setVisible(true);
        this.window = window;
        this.addActionListener(new ClickListener());
    }//end setup()

    /* Protected */

    /**
     * TODO: Fill this in
     * @param event TODO: Fill this in
     */
    protected abstract void onClick(ActionEvent event);

    /**
     * TODO: Fill in
     * @param imagePath The path of the image displayed by the button
     */
    protected void setImage(String imagePath) {
        this.imagePath = imagePath;

        // These lines are just used for testing
        File imageCheck = new File(this.imagePath);
        if (imageCheck.exists()) { System.out.println("Exists"); }
        else { System.out.println("Doesn't exist"); }
        // End testing

        ImageIcon icon = new ImageIcon(this.imagePath);
        this.setIcon(icon);
    }//end setImage()

    /* Public */

    // Getters

    /**
     * Gets the window that the button is posting to
     * @return The window that the button is posting to
     */
    public WindowInterface getWindow() { return window; }//end getWindow()

    // Setters

    /**
     * Sets the width (in pixels) of the button
     * @param width The new width (in pixels) of the button
     */
    public void setWidth(int width) { super.setSize(width, this.getHeight()); }//end setWidth()

    /**
     * Sets the height (in pixels) of the button
     * @param height The new height (in pixels) of the button
     */
    public void setHeight(int height) { super.setSize(this.getWidth(), height); }//end setHeight()

}//end AbstractJButtonButton
