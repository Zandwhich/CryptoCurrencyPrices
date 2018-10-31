package com.company.view.button;

import com.company.controller.ControllerInterface;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

/**
 * TODO: Fill this out
 */
public abstract class AbstractJButtonButton extends JButton implements ButtonInterface {

    /****************
     *    Fields    *
     ****************/

    /* Constants */

    /**
     * The default width of a button
     */
    public static final int DEFAULT_WIDTH = 100;

    /**
     * The default height of a button
     */
    public static final int DEFAULT_HEIGHT = 100;

    /* Variables */

    /**
     * The controller that holds and subscribes to the button
     */
    protected ControllerInterface controller;

    /**
     * The path to the image file
     */
    private String imagePath;

    /**
     * TODO: Fill this out
     * Not too sure exactly how this works. Need to research this further. All I know is that it works.
     */
    private class ClickListener implements ActionListener {

        /**
         * TODO: Fill this in
         * @param e TODO: Fill this in
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            /* TODO: Figure out if overriding onClick actually works as expected in this case (also if I can construct
             * it at the super-class level or if it needs to be done at the sub-class level)
             */

            onClick(e);
        }//end actionPerformed()
    }//end ClickListener

    /****************
     * Constructors *
     ****************/

    /**
     * A constructor for AbstractJButtonButton
     * @param controller The window that holds and subscribes to the button
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     */
    public AbstractJButtonButton(int width, int height, ControllerInterface controller) {
        this.setup(width, height, controller);
    }//end AbstractJButtonButton()

    /**
     * A constructor for AbstractJButtonButton
     * @param controller The controller that holds and subscribes to the button
     */
    public AbstractJButtonButton(ControllerInterface controller) {
        this.setup(AbstractJButtonButton.DEFAULT_WIDTH, AbstractJButtonButton.DEFAULT_HEIGHT, controller);
    }//end AbstractJButtonButton()

    /**
     * A constructor for AbstractJButtonButton
     * @param imagePath The path for the image of the button
     * @param controller The controller that holds and subscribes to the button
     */
    public AbstractJButtonButton(String imagePath, ControllerInterface controller) {
        this.setup(imagePath, controller);
    }//end AbstractJButtonButton()

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * The method that is run during the constructor in order to abstract the process as much as possible
     * @param width The width (in pixels) of the button
     * @param height The height (in pixels) of the button
     * @param controller The controller that holds and subscribes to the button
     */
    private void setup(int width, int height, ControllerInterface controller) {
        this.generalSetup(controller);

        // Setting up the window
        //if (!name.equals("")) super.setName(name);
        //System.out.println("Width: " + width + ", Height: " + height);
        super.setSize(width, height);
    }//end setup()

    /**
     * The setup method that is run by the constructor who gets passed in an imagePath and a controller
     * @param imagePath The path for the image of the button
     * @param controller The controller that holds and subscribes to the button
     */
    private void setup(String imagePath, ControllerInterface controller) {
        this.generalSetup(controller);

        this.imagePath = imagePath;
        this.setImage(this.imagePath);
    }//end setup()

    /**
     * The method that is run by any of the setup methods
     * @param controller The controller that holds and subscribes to the button
     */
    private void generalSetup(ControllerInterface controller) {
        this.controller = controller;
        this.addActionListener(new ClickListener());
        super.setVisible(true);
    }//end generalSetup()

    /* Protected */

    /**
     * TODO: Fill this in
     * @param event TODO: Fill this in
     */
    protected abstract void onClick(ActionEvent event);

    /**
     * TODO: Fill in
     * @param imagePath The path of the image displayed by the button
     */
    public void setImage(String imagePath) {
        this.imagePath = imagePath;
        super.setIcon(new ImageIcon(this.imagePath));
    }//end setImage()

    /* Public */

    // Getters

    /**
     * Gets the controller that the button is posting to
     * @return The controller that the button is posting to
     */
    public ControllerInterface getController() { return this.controller; }//end getWindow()

    /**
     * Gets the path of the image of the button. If no image is used, returns 'null'
     * @return The path of the image of the button. If no image is used, returns 'null'
     */
    public String getImagePath() { return this.imagePath; }//end getImagePath()

    // Setters

    /**
     * Sets the width (in pixels) of the button
     * @param width The new width (in pixels) of the button
     */
    public void setWidth(int width) { super.setSize(width, this.getHeight()); }//end setWidth()

    /**
     * Sets the height (in pixels) of the button
     * @param height The new height (in pixels) of the button
     */
    public void setHeight(int height) { super.setSize(this.getWidth(), height); }//end setHeight()

}//end AbstractJButtonButton
