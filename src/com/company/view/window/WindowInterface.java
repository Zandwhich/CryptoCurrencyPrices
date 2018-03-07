package com.company.view.window;

/**
 * The basic interface for all windows within the program
 */
public interface WindowInterface {

    /**
     * Returns the title of the window
     * @return Rhe title of the window
     */
    public abstract String getTitle();

    /**
     * Returns the width (in pixels) of the window
     * @return The width (in pixels) of the window
     */
    public abstract int getWidth();

    /**
     * Returns the height (in pixels) of the window
     * @return The height (in pixels) of the window
     */
    public abstract int getHeight();


}//end WindowInterface
