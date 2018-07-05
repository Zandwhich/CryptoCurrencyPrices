package com.company.view.window;


import javax.swing.*;

/**
 * The abstract window class which uses Java's JFrame
 */
public abstract class AbstractJFrameWindow extends JFrame implements WindowInterface {

    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * Constructor for an AbstractJFrameWindow
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     */
    public AbstractJFrameWindow(String title, int width, int height) {
        this.setup(title, width, height, JFrame.EXIT_ON_CLOSE, true);
    }//end AbstractJFrameWindow()

    /**
     * Constructor for an AbstractJFrameWindow
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param closeOperation The operation to be carried out on the closing of the window (should be one of:
     *                       JFrame.EXIT_ON_CLOSE, JFrame.DISPOSE_ON_CLOSE, JFrame.HIDE_ON_CLOSE, or
     *                       JFrame.DO_NOTHING_ON_CLOSE)
     */
    public AbstractJFrameWindow(String title, int width, int height, int closeOperation) {
        this.setup(title, width, height, closeOperation, true);
    }//end AbstractJFrameWindow()

    /**
     * Constructor for an AbstractJFrameWindow
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param isVisible If the window is visible or not
     */
    public AbstractJFrameWindow(String title, int width, int height, boolean isVisible) {
        this.setup(title, width, height, JFrame.EXIT_ON_CLOSE, isVisible);
    }//end AbstractJFrameWindow()

    /**
     * Constructor for an AbstractJFrameWindow
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

        // Setting up the window
        super.setTitle(title);
        super.setSize(width, height);
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

    // Other

    /**
     * TODO: Fill in
     */
    public void refreshWindow() {
        this.setIsVisible(false);
        this.setIsVisible(true);
    }//end refreshWindow()

}//end AbstractWindow
