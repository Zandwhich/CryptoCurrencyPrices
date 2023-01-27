package com.company.view.window;


import com.company.controller.ControllerInterface;

import javax.swing.*;
import java.awt.event.WindowEvent;

/**
 * The abstract window class which uses Java's JFrame
 */
public abstract class AbstractJFrameWindow extends JFrame implements WindowInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The controller for the window
     */
    private ControllerInterface controller;

    /* ************ *
     * Constructors *
     * ************ */

    /**
     * Constructor for an AbstractJFrameWindow
     * @param controller The controller in charge of the window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     */
    public AbstractJFrameWindow(ControllerInterface controller, String title, int width, int height) {
        this.setup(controller, title, width, height, JFrame.DISPOSE_ON_CLOSE, true);
    }

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
    public AbstractJFrameWindow(ControllerInterface controller, String title, int width, int height,
                                int closeOperation) {
        this.setup(controller, title, width, height, closeOperation, true);
    }

    /**
     * Constructor for an AbstractJFrameWindow
     * @param controller The controller in charge of the window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param isVisible If the window is visible or not
     */
    public AbstractJFrameWindow(ControllerInterface controller, String title, int width, int height,
                                boolean isVisible) {
        this.setup(controller, title, width, height, JFrame.DISPOSE_ON_CLOSE, isVisible);
    }

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
    public AbstractJFrameWindow(ControllerInterface controller, String title, int width, int height, int closeOperation,
                                boolean isVisible) {
        this.setup(controller, title, width, height, closeOperation, isVisible);
    }

    /* ************ *
     *    Methods   *
     * ************ */

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
    private void setup(ControllerInterface controller, String title, int width, int height, int closeOperation,
                       boolean isVisible) {

        // Setting up the window
        this.controller = controller;
        super.setTitle(title);
        super.setSize(width, height);
        super.setDefaultCloseOperation(closeOperation);
        super.setVisible(isVisible);
    }

    /* Public */

    // Getters

    /**
     * Gets the title of the window
     * @return The title of the window
     */
    @Override
    public String getTitle() { return super.getTitle(); }

    /**
     * Gets the width (in pixels) of the window
     * @return The width (in pixels) of the window
     */
    @Override
    public int getWidth() { return super.getWidth(); }

    /**
     * Gets the height (in pixels) of the window
     * @return The height (in pixels) of the window
     */
    @Override
    public int getHeight() { return super.getHeight(); }

    /**
     * Gets the operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     * @return The operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     */
    public int getCloseOperation() { return super.getDefaultCloseOperation(); }

    /**
     * Gets if the window is visible or not
     * @return If the window is visible or not
     */
    public boolean getIsVisible() { return super.isVisible(); }

    /**
     * Gets the controller of the window
     * @return The controller of the window
     */
    public ControllerInterface getController() { return this.controller; }

    /**
     * Gets the window's x coordinate for the top-left corner
     * @return The top-left corner's x coordinate of the window
     */
    @Override
    public int getLocationX() {
        return super.getLocation().x;
    }

    /**
     * Gets the window's y coordinate for the top-left corner
     * @return The top-left corner's y coordinate of the window
     */
    @Override
    public int getLocationY() {
        return super.getLocation().y;
    }

    // Setters

    /**
     * Sets the title of the window
     * @param title The title of the window
     */
    @Override
    public void setTitle(String title) { super.setTitle(title); }

    /**
     * Sets the width (in pixels) of the window
     * @param width The width (in pixels) of the window
     */
    public void setWidth(int width) { super.setSize(width, super.getHeight()); }

    /**
     * Sets the height (in pixels) of the window
     * @param height The height (in pixels) of the window
     */
    public void setHeight(int height) { super.setSize(super.getWidth(), height); }

    /**
     * Sets the operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     * @param closeOperation The operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE,
     *                       JFrame.DISPOSE_ON_CLOSE, JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     */
    public void setCloseOperation(int closeOperation) { super.setDefaultCloseOperation(closeOperation); }

    /**
     * Sets if the window is visible or not
     * @param isVisible If the window is visible or not
     */
    public void setIsVisible(boolean isVisible) { super.setVisible(isVisible); }

    /**
     * Sets the window's location on the screen
     * @param x The x coordinate of the top left of the screen
     * @param y The y coordinate of the top left of the screen
     */
    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
    }

    // Other

    /**
     * Refreshes the window
     */
    public void refreshWindow() {
        this.setIsVisible(false);
        this.setIsVisible(true);
    }

    /**
     * Closes the window
     */
    @Override
    public void close() {
        super.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
}
