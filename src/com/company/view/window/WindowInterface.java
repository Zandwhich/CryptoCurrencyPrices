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
    String getTitle();

    /**
     * Returns the width (in pixels) of the window
     *
     * @return The width (in pixels) of the window
     */
    int getWidth();

    /**
     * Returns the height (in pixels) of the window
     *
     * @return The height (in pixels) of the window
     */
    int getHeight();

    /**
     * Sets the window's location on the screen
     *
     * @param x The x coordinate of the top left of the screen
     * @param y The y coordinate of the top left of the screen
     */
    void setLocation(final int x, final int y);

    /**
     * Gets the window's x coordinate for the top-left corner
     *
     * @return The top-left corner's x coordinate of the window
     */
    int getLocationX();

    /**
     * Gets the window's y coordinate for the top-left corner
     *
     * @return The top-left corner's y coordinate of the window
     */
    int getLocationY();

    /**
     * Closes the window
     */
    void close();

}
