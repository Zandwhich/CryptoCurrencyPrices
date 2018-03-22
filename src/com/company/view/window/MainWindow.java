package com.company.view.window;

import com.company.view.button.ButtonInterface;
import com.company.view.button.RefreshButton;

import javax.swing.*;
import java.util.ArrayList;

/**
 * The main window to display for the application
 */
public class MainWindow extends AbstractJFrameWindow implements MainWindowListenerInterface {

    /****************
     *    Fields    *
     ****************/

    private ButtonInterface refreshButton = new RefreshButton(this);

    /****************
     * Constructors *
     ****************/

    /**
     * A constructor for the main window
     */
    public MainWindow() {
        super("CryptoCurrency Prices", 1000, 700);
        this.setup();
    }//end MainWindow()

    /**
     * A constructor for the main window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     */
    public MainWindow(String title, int width, int height) {
        super(title, width, height);
    }//end MainWindow()

    /**
     * A constrcutor for the main window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param closeOperation TODO: Fill this out
     */
    public MainWindow(String title, int width, int height, int closeOperation) {
        super(title, width, height, closeOperation);
    }//end MainWindow()

    /**
     * A constructor for the main window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param isVisible If the window is visible or not
     */
    public MainWindow(String title, int width, int height, boolean isVisible) {
        super(title, width, height, isVisible);
    }//end MainWindow()

    /**
     * A constructor for the main window
     * @param title The title of the window
     * @param width The width (in pixels) of the window
     * @param height The height (in pixels) of the window
     * @param closeOperation TODO: Fill this out
     * @param isVisible If the window is visible or not
     */
    public MainWindow(String title, int width, int height, int closeOperation, boolean isVisible) {
        super(title, width, height, closeOperation, isVisible);
    }//end MainWindow()

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * The general setup method that is used in for the most abstraction
     */
    private void setup() {
        this.add((JButton) refreshButton);
        //this.setVisible(true);

        // TODO: Figure out why the button resizes upon moving the screen
        // TODO: Add text/labels to the window
        // TODO: Add table functionality to the window
    }//end setup()

    /* Protected */

    /* Public */

    /**
     * TODO: Fill this out
     */
    @Override
    public void refresh() {
        super.setTitle("Refreshed");
    }//end doSomething

    // TODO: Add a bunch of different MainWindow constructors using different params
    // TODO: Add a default MainWindow constructor

    // TODO: Probably (Maybe?) need to add a 'setup' method

    // TODO: Include more MainWindow-specific things (layout, buttons, etc.)
    // TODO: Include abstract buttons and whatnot

}//end MainWindow
