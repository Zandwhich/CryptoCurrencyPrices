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

    /* Constants */

    /**
     * The default width of a button
     */
    public static final int DEFAULT_WIDTH = 100;

    /**
     * The default height of a button
     */
    public static final int DEFAULT_HEIGHT = 100;

    /* Variables */

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
        public void actionPerformed(ActionEvent e) {
            onClick(e);
        }
    }

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * A constructor for AbstractJButtonButton
     * @param controller The window that holds and subscribes to the button
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     * @param window The window that holds the button
     */
    public AbstractJButtonButton(int width, int height, ControllerInterface controller, WindowInterface window) {
        this.setup(width, height, controller, window);
    }

    /**
     * A constructor for AbstractJButtonButton
     * @param controller The controller that holds and subscribes to the button
     * @param window The window that holds the button
     */
    public AbstractJButtonButton(ControllerInterface controller, WindowInterface window) {
        this.setup(AbstractJButtonButton.DEFAULT_WIDTH, AbstractJButtonButton.DEFAULT_HEIGHT, controller, window);
    }

    /**
     * A constructor for AbstractJButtonButton
     * @param imagePath The path for the image of the button
     * @param controller The controller that holds and subscribes to the button
     * @param window The window that holds the button
     */
    public AbstractJButtonButton(String imagePath, ControllerInterface controller, WindowInterface window) {
        this.setup(imagePath, controller, window);
    }

    /* ************ *
     *    Methods   *
     * ************ */

    /* Private */

    /**
     * The method that is run during the constructor in order to abstract the process as much as possible
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     * @param controller The controller that holds and subscribes to the button
     */
    private void setup(int width, int height, ControllerInterface controller, WindowInterface window) {
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
    private void setup(String imagePath, ControllerInterface controller, WindowInterface window) {
        this.generalSetup(controller, window);

        this.imagePath = imagePath;
        this.setImage(this.imagePath);
    }

    /**
     * The method that is run by any of the setup methods
     * @param controller The controller that holds and subscribes to the button
     */
    private void generalSetup(ControllerInterface controller, WindowInterface window) {
        this.controller = controller;
        this.window = window;
        this.addActionListener(new ClickListener());
        super.setVisible(true);
    }

    /* Protected */

    /**
     * Sets the action to happen when the button is pressed
     */
    protected abstract void onClick(ActionEvent event);

    /**
     * Sets the image of the button
     * @param imagePath The path of the image displayed by the button
     */
    public void setImage(String imagePath) {
        this.imagePath = imagePath;
        super.setIcon(new ImageIcon(this.imagePath));
    }

    /* Public */

    // Getters

    /**
     * Gets the controller that the button is posting to
     * @return The controller that the button is posting to
     */
    public ControllerInterface getController() { return this.controller; }

    /**
     * Gets the path of the image of the button. If no image is used, returns 'null'
     * @return The path of the image of the button. If no image is used, returns 'null'
     */
    public String getImagePath() { return this.imagePath; }

    /**
     * Gets the window that holds the button
     * @return The window that holds the button
     */
    public WindowInterface getWindow() { return this.window; }

    // Setters

    /**
     * Sets the width (in pixels) of the button
     * @param width The new width (in pixels) of the button
     */
    public void setWidth(int width) { super.setSize(width, this.getHeight()); }

    /**
     * Sets the height (in pixels) of the button
     * @param height The new height (in pixels) of the button
     */
    public void setHeight(int height) { super.setSize(this.getWidth(), height); }

}
