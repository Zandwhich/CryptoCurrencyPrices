package com.company.view.button;

import com.company.controller.ControllerInterface;
import com.company.view.window.WindowInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The abstract class that all buttons inherit from
 */
public abstract class AbstractJButtonButton extends JButton implements ButtonInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The default width of a button
     */
    public static final int DEFAULT_WIDTH = 100;

    /**
     * The default height of a button
     */
    public static final int DEFAULT_HEIGHT = 100;

    /**
     * The controller that holds and subscribes to the button
     */
    private ControllerInterface controller;

    /**
     * The window that holds the button
     */
    private WindowInterface window;

    /**
     * The path to the image file
     */
    private String imagePath;

    /**
     * The click listener
     */
    private class ClickListener implements ActionListener {

        /**
         * The action to perform when a click happens
         * @param e The action passed in
         */
        @Override
        public void actionPerformed(final ActionEvent e) {
            onClick(e);
        }

    }


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * A constructor for AbstractJButtonButton
     * @param controller The controller that holds and subscribes to the button
     * @param window The window that holds the button
     */
    public AbstractJButtonButton(final ControllerInterface controller, final WindowInterface window) {
        this.setup(AbstractJButtonButton.DEFAULT_WIDTH, AbstractJButtonButton.DEFAULT_HEIGHT, controller, window);
    }

    /**
     * A constructor for AbstractJButtonButton
     * @param imagePath The path for the image of the button
     * @param controller The controller that holds and subscribes to the button
     * @param window The window that holds the button
     */
    public AbstractJButtonButton(final String imagePath, final ControllerInterface controller,
                                 final WindowInterface window) {
        this.setup(imagePath, controller, window);
    }


    /* ************ *
     *    Methods   *
     * ************ */

    /**
     * The method that is run during the constructor in order to abstract the process as much as possible
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     * @param controller The controller that holds and subscribes to the button
     */
    private void setup(final int width, final int height, final ControllerInterface controller,
                       final WindowInterface window) {
        this.generalSetup(controller, window);

        // Setting up the window
        //if (!name.equals("")) super.setName(name);
        //System.out.println("Width: " + width + ", Height: " + height);
        super.setSize(width, height);
    }

    /**
     * The setup method that is run by the constructor who gets passed in an imagePath and a controller
     * @param imagePath The path for the image of the button
     * @param controller The controller that holds and subscribes to the button
     */
    private void setup(final String imagePath, final ControllerInterface controller, final WindowInterface window) {
        this.generalSetup(controller, window);

        this.imagePath = imagePath;
        this.setImage(this.imagePath);
    }

    /**
     * The method that is run by any of the setup methods
     * @param controller The controller that holds and subscribes to the button
     */
    private void generalSetup(final ControllerInterface controller, final WindowInterface window) {
        this.controller = controller;
        this.window = window;
        this.addActionListener(new ClickListener());
        super.setVisible(true);
    }

    /**
     * Sets the action to happen when the button is pressed
     */
    protected abstract void onClick(final ActionEvent event);

    /**
     * Sets the image of the button
     * @param imagePath The path of the image displayed by the button
     */
    public void setImage(final String imagePath) {
        this.imagePath = imagePath;
        super.setIcon(new ImageIcon(this.imagePath));
    }

    /**
     * Gets the controller that the button is posting to
     * @return The controller that the button is posting to
     */
    public ControllerInterface getController() { return this.controller; }

    /**
     * Gets the window that holds the button
     * @return The window that holds the button
     */
    public WindowInterface getWindow() { return this.window; }

}
