package com.company.view.window;

/**
 * The basic interface for all windows within the program
 */
public interface WindowInterface {

    /**
     * Sets the window's location on the screen
     *
     * @param x The x coordinate of the top left of the screen
     * @param y The y coordinate of the top left of the screen
     */
    void setLocation(final int x, final int y);

    /**
     * Closes the window
     */
    void close();

}
