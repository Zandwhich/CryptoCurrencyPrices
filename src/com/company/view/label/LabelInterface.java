package com.company.view.label;

/**
 * The base label interface that all other interfaces extend from
 */
public interface LabelInterface {

    /**
     * Returns the text that is being displayed
     * @return The text that is being displayed
     */
    String getText();

    /**
     * Sets the text that will be displayed
     * @param text The text that will be displayed
     */
    void setText(String text);

}
