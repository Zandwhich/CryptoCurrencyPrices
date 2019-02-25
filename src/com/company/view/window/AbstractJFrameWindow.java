package com.company.view.window;


import com.company.controller.ControllerInterface;

import javax.swing.*;
import java.awt.event.WindowEvent;

/**
 * The abstract window class which uses Java's JFrame
 */
public abstract class AbstractJFrameWindow extends JFrame implements WindowInterface {

    /****************
     *    Fields    *
     ****************/

    /**
     * The default x starting location
     */
    public static final int DEFAULT_X_LOCATION = 10;

    /**
     * The default y starting location
     */
    public static final int DEFAULT_Y_LOCATION = 10;

    /**
     * The controller
     */
    private ControllerInterface controller;

    /****************
     * Constructors *
     ****************/

    /**
     * Constructor for an AbstractJFrameWindow
     * @param controller The controller in charge of the window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     */
    public AbstractJFrameWindow(ControllerInterface controller, String title, int width, int height, int xLocation,
                                int yLocation) {
        this.setup(controller, title, width, height, xLocation, yLocation, JFrame.DISPOSE_ON_CLOSE, true);
    }//end AbstractJFrameWindow()

    /**
     * Constructor for an AbstractJFrameWindow
     * @param controller The controller in charge of the window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param closeOperation The operation to be carried out on the closing of the window (should be one of:
     *                       JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE, JFrame.HIDE_ON_CLOSE, or
     *                       JFrame.DO_NOTHING_ON_CLOSE)
     */
    public AbstractJFrameWindow(ControllerInterface controller, String title, int width, int height, int xLocation,
                                int yLocation, int closeOperation) {
        this.setup(controller, title, width, height, xLocation, yLocation, closeOperation, true);
    }//end AbstractJFrameWindow()

    /**
     * Constructor for an AbstractJFrameWindow
     * @param controller The controller in charge of the window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param isVisible If the window is visible or not
     */
    public AbstractJFrameWindow(ControllerInterface controller, String title, int width, int height, int xLocation,
                                int yLocation, boolean isVisible) {
        this.setup(controller, title, width, height, xLocation, yLocation, JFrame.DISPOSE_ON_CLOSE, isVisible);
    }//end AbstractJFrameWindow()

    /**
     * Constructor for an AbstractJFrameWindow
     * @param controller The controller in charge of the window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param closeOperation The operation to be carried out on the closing of the window (should be one of:
     *                       JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE, JFrame.HIDE_ON_CLOSE, or
     *                       JFrame.DO_NOTHING_ON_CLOSE)
     * @param isVisible If the window is visible or not
     */
    public AbstractJFrameWindow(ControllerInterface controller, String title, int width, int height, int xLocation,
                                int yLocation, int closeOperation, boolean isVisible) {
        this.setup(controller, title, width, height, xLocation, yLocation, closeOperation, isVisible);
    }//end AbstractJFrameWindow()

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * The redundant setup that is run for each constructor
     * @param controller The controller in charge of the window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param closeOperation The operation to be carried out on the closing of the window (should be one of:
     *                       JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE, JFrame.HIDE_ON_CLOSE, or
     *                       JFrame.DO_NOTHING_ON_CLOSE)
     * @param isVisible If the window is visible or not
     */
    private void setup(ControllerInterface controller, String title, int width, int height, int xLocation,
                       int yLocation, int closeOperation, boolean isVisible) {

        // Setting up the window
        this.controller = controller;
        super.setTitle(title);
        super.setSize(width, height);
        super.setLocation(xLocation, yLocation);
        super.setDefaultCloseOperation(closeOperation);
        super.setVisible(isVisible);
    }//end setup()

    /* Public */

    // Getters

    /**
     * Gets the title of the window
     * @return The title of the window
     */
    @Override
    public String getTitle() { return super.getTitle(); }//end getTitle()

    /**
     * Gets the width (in pixels) of the window
     * @return The width (in pixels) of the window
     */
    @Override
    public int getWidth() { return super.getWidth(); }//end getWidth()

    /**
     * Gets the height (in pixels) of the window
     * @return The height (in pixels) of the window
     */
    @Override
    public int getHeight() { return super.getHeight(); }//end getHeight()

    /**
     * Gets the operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     * @return The operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     */
    public int getCloseOperation() { return super.getDefaultCloseOperation(); }//end getCloseOperation()

    /**
     * Gets if the window is visible or not
     * @return If the window is visible or not
     */
    public boolean getIsVisible() { return super.isVisible(); }//end getIsVisible()

    /**
     * Gets the controller of the window
     * @return The controller of the window
     */
    public ControllerInterface getController() { return this.controller; }//end getController()

    /**
     * Gets the window's x coordinate for the top-left corner
     * @return The top-left corner's x coordinate of the window
     */
    @Override
    public int getLocationX() {
        return super.getLocation().x;
    }//end getLocationX

    /**
     * Gets the window's y coordinate for the top-left corner
     * @return The top-left corner's y coordinate of the window
     */
    @Override
    public int getLocationY() {
        return super.getLocation().y;
    }//end getLocationX

    // Setters

    /**
     * Sets the title of the window
     * @param title The title of the window
     */
    @Override
    public void setTitle(String title) { super.setTitle(title); }//end setTitle()

    /**
     * Sets the width (in pixels) of the window
     * @param width The width (in pixels) of the window
     */
    public void setWidth(int width) { super.setSize(width, super.getHeight()); }//end setWidth()

    /**
     * Sets the height (in pixels) of the window
     * @param height The height (in pixels) of the window
     */
    public void setHeight(int height) { super.setSize(super.getWidth(), height); }//end setHeight()

    /**
     * Sets the operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     * @param closeOperation The operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE,
     *                       JFrame.DISPOSE_ON_CLOSE, JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     */
    public void setCloseOperation(int closeOperation) { super.setDefaultCloseOperation(closeOperation); }//end setCloseOperation()

    /**
     * Sets if the window is visible or not
     * @param isVisible If the window is visible or not
     */
    public void setIsVisible(boolean isVisible) { super.setVisible(isVisible); }//end setIsVisible()

    /**
     * Sets the window's location on the screen
     * @param x The x coordinate of the top left of the screen
     * @param y The y coordinate of the top left of the screen
     */
    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
    }//end location()

    // Other

    /**
     * TODO: Fill in
     */
    public void refreshWindow() {
        this.setIsVisible(false);
        this.setIsVisible(true);
    }//end refreshWindow()

    /**
     * Closes the window
     */
    @Override
    public void close() {
        super.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
}//end AbstractWindow
