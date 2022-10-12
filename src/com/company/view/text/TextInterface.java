package com.company.view.text;

/**
 * TODO: Write documentation
 */
public interface TextInterface {

    /**
     * TODO: Write documentation
     * @return
     */
    public abstract String getText();

    /**
     * TODO: Write documentation
     * @param text
     */
    public abstract void setText(String text);

    /**
     * Gets the height of the text field
     * @return The height of the text field
     */
    public abstract int getHeight();

    /**
     * Gets the width of the text field
     * @return The width of the text field
     */
    public abstract int getWidth();

    /**
     * Sets the height of the text field
     * @param height The height of the text field
     */
    public abstract void setHeight(int height);

    /**
     * Sets the width of the text field
     * @param width The width of the text field
     */
    public abstract void setWidth(int width);

}
