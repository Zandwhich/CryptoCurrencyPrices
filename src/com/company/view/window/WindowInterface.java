package com.company.view.window;

/**
 * The basic interface for all windows within the program
 */
public interface WindowInterface {

    /**
     * Returns the title of the window
     *
     * @return Rhe title of the window
     */
    public abstract String getTitle();

    /**
     * Returns the width (in pixels) of the window
     *
     * @return The width (in pixels) of the window
     */
    public abstract int getWidth();

    /**
     * Returns the height (in pixels) of the window
     *
     * @return The height (in pixels) of the window
     */
    public abstract int getHeight();

    /**
     * Sets the window's location on the screen
     *
     * @param x The x coordinate of the top left of the screen
     * @param y The y coordinate of the top left of the screen
     */
    public abstract void setLocation(final int x, final int y);

    /**
     * Gets the window's x coordinate for the top-left corner
     *
     * @return The top-left corner's x coordinate of the window
     */
    public abstract int getLocationX();

    /**
     * Gets the window's y coordinate for the top-left corner
     *
     * @return The top-left corner's y coordinate of the window
     */
    public abstract int getLocationY();

    /**
     * Closes the window
     */
    public abstract void close();

}
