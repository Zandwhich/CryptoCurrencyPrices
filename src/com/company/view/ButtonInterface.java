package com.company.view;

/**
 * TODO: Fill this out
 */
public interface ButtonInterface {

    /**
     * Gets the width (in pixels) of the button
     * @return The width (in pixels) of the button
     */
    public abstract int getWidth();

    /**
     * Gets the height (in pixels) of the button
     * @return The height (in pixels) of the button
     */
    public abstract int getHeight();

    /**
     * Action that happens when the button is pressed
     */
    public abstract void press();

}//end ButtonInterface
