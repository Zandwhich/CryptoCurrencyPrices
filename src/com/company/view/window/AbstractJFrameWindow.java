package com.company.view.window;


import com.company.controller.ControllerInterface;;

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
    public AbstractJFrameWindow(final ControllerInterface controller, final String title, final int width,
                                final int height) {
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
     * @param isVisible If the window is visible or not
     */
    public AbstractJFrameWindow(final ControllerInterface controller, final String title, final int width,
                                final int height, final int closeOperation, final boolean isVisible) {
        this.setup(controller, title, width, height, closeOperation, isVisible);
    }

    /**
     * Constructor for an AbstractJFrameWindow that will not set the size of the window by default
     * @param controller The controller in charge of the window
     * @param title The title of the window
     */
    public AbstractJFrameWindow(final ControllerInterface controller, final String title) {
        this.setup(controller, title);
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
    private void setup(final ControllerInterface controller, final String title, final int width, final int height,
                       final int closeOperation, final boolean isVisible) {

        // Setting up the window
        this.controller = controller;
        super.setTitle(title);
        super.setSize(width, height);
        super.setDefaultCloseOperation(closeOperation);
        super.setVisible(isVisible);
    }

    /**
     * The redundant setup that is run when there is no sizing to be done for the window
     * @param controller The controller in charge of the window
     * @param title The title of the window
     */
    private void setup(final ControllerInterface controller, final String title) {
        // Setting up the window
        this.controller = controller;
        super.setTitle(title);
        super.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        super.setVisible(true);
    }

    /* Public */

    // Getters

    /**
     * {@inheritDoc}
     */
    @Override
    public final String getTitle() { return super.getTitle(); }

    /**
     * {@inheritDoc}
     */
    @Override
    public final int getWidth() { return super.getWidth(); }

    /**
     * {@inheritDoc}
     */
    @Override
    public final int getHeight() { return super.getHeight(); }

    /**
     * Gets the operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     * @return The operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     */
    public final int getCloseOperation() { return super.getDefaultCloseOperation(); }

    /**
     * Gets if the window is visible or not
     * @return If the window is visible or not
     */
    public final boolean getIsVisible() { return super.isVisible(); }

    /**
     * Gets the controller of the window
     * @return The controller of the window
     */
    public final ControllerInterface getController() { return this.controller; }

    /**
     * {@inheritDoc}
     */
    @Override
    public final int getLocationX() {
        return super.getLocation().x;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public final int getLocationY() {
        return super.getLocation().y;
    }

    // Setters

    /**
     * {@inheritDoc}
     */
    @Override
    public void setTitle(final String title) { super.setTitle(title); }

    /**
     * {@inheritDoc}
     */
    public void setWidth(final int width) { super.setSize(width, super.getHeight()); }

    /**
     * {@inheritDoc}
     */
    public void setHeight(final int height) { super.setSize(super.getWidth(), height); }

    /**
     * Sets the operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     * @param closeOperation The operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE,
     *                       JFrame.DISPOSE_ON_CLOSE, JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     */
    public void setCloseOperation(final int closeOperation) { super.setDefaultCloseOperation(closeOperation); }

    /**
     * Sets if the window is visible or not
     * @param isVisible If the window is visible or not
     */
    public void setIsVisible(final boolean isVisible) { super.setVisible(isVisible); }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setLocation(final int x, final int y) {
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
     * {@inheritDoc}
     */
    @Override
    public void close() {
        super.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }
}
