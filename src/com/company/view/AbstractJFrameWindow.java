package com.company.view;

import javax.swing.*;

public class AbstractJFrameWindow extends JFrame implements WindowInterface {

    /****************
     *    Fields    *
     ****************/

    /**
     * The title of the window
     */
    private String title;

    /**
     * The width of the window (in pixels)
     */
    private int width;

    /**
     * The height of the window (in pixels)
     */
    private int height;

    /**
     * The operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     */
    private int closeOperation;

    /**
     * If the window is visible or not.
     */
    private boolean isVisible;

    /****************
     * Constructors *
     ****************/

    /**
     * Constructor for an Abstract Window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     */
    public AbstractJFrameWindow(String title, int width, int height) {
        this.setup(title, width, height, JFrame.EXIT_ON_CLOSE, true);
    }//end AbstractWindow()

    /**
     * Constructor for an Abstract Window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param closeOperation The operation to be carried out on the closing of the window (should be one of:
     *                       JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE, JFrame.HIDE_ON_CLOSE, or
     *                       JFrame.DO_NOTHING_ON_CLOSE)
     */
    public AbstractJFrameWindow(String title, int width, int height, int closeOperation) {
        this.setup(title, width, height, closeOperation, true);
    }//end AbstractWindow()

    /**
     * Constructor for an Abstract Window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param isVisible If the window is visible or not
     */
    public AbstractJFrameWindow(String title, int width, int height, boolean isVisible) {
        this.setup(title, width, height, JFrame.EXIT_ON_CLOSE, isVisible);
    }//end AbstractWindow()

    /**
     * Constructor for an Abstract Window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param closeOperation The operation to be carried out on the closing of the window (should be one of:
     *                       JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE, JFrame.HIDE_ON_CLOSE, or
     *                       JFrame.DO_NOTHING_ON_CLOSE)
     * @param isVisible If the window is visible or not
     */
    public AbstractJFrameWindow(String title, int width, int height, int closeOperation, boolean isVisible) {
        this.setup(title, width, height, closeOperation, isVisible);
    }//end AbstractJFrameWindow()

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * The redundant setup that is run for each constructor
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param closeOperation The operation to be carried out on the closing of the window (should be one of:
     *                       JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE, JFrame.HIDE_ON_CLOSE, or
     *                       JFrame.DO_NOTHING_ON_CLOSE)
     * @param isVisible If the window is visible or not
     */
    private void setup(String title, int width, int height, int closeOperation, boolean isVisible) {
        // Setting up fields
        this.title = title;
        this.width = width;
        this.height = height;
        this.closeOperation = closeOperation;
        this.isVisible = isVisible;

        // Setting up the window
        super.setTitle(this.title);
        super.setSize(this.width, this.height);
        super.setDefaultCloseOperation(this.closeOperation);
        super.setVisible(this.isVisible);
    }

    /* Public */

    // Getters

    /**
     * Gets the title of the window
     * @return The title of the window
     */
    public String getTitle() { return this.title; }//end getTitle()

    /**
     * Gets the width (in pixels) of the window
     * @return The width (in pixels) of the window
     */
    public int getWidth() { return this.width; }//end getWidth()

    /**
     * Gets the height (in pixels) of the window
     * @return The height (in pixels) of the window
     */
    public int getHeight() { return this.height; }//end getHeight()

    /**
     * Gets the operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     * @return The operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     */
    public int getCloseOperation() { return this.closeOperation; }//end getCloseOperation()

    /**
     * Gets if the window is visible or not
     * @return If the window is visible or not
     */
    public boolean getIsVisible() { return this.isVisible; }//end getIsVisible()

    // Setters

    /**
     * Sets the title of the window
     * @param title The title of the window
     */
    @Override
    public void setTitle(String title) {
        this.title = title;
        super.setTitle(this.title);
    }//end setTitle()

    /**
     * Sets the width (in pixels) of the window
     * @param width The width (in pixels) of the window
     */
    public void setWidth(int width) {
        this.width = width;
        super.setSize(this.width, this.height);
    }//end setWidth()

    /**
     * Sets the height (in pixels) of the window
     * @param height The height (in pixels) of the window
     */
    public void setHeight(int height) {
        this.height = height;
        super.setSize(this.width, this.height);
    }//end setHeight()

    /**
     * Sets the operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE,
     * JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     * @param closeOperation The operation to be carried out on close. Should be one of JFrame.EXIT_ON_CLOSE,
     *                       JFrame.DISPOSE_ON_CLOSE, JFrame.HIDE_ON_CLOSE, or JFrame.DO_NOTHING_ON_CLOSE
     */
    public void setCloseOperation(int closeOperation) {
        this.closeOperation = closeOperation;
        super.setDefaultCloseOperation(this.closeOperation);
    }//end setCloseOperation()

    /**
     * Sets if the window is visible or not
     * @param isVisible If the window is visible or not
     */
    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
        super.setVisible(this.isVisible);
    }//end setIsVisible()

}//end AbstractWindow
