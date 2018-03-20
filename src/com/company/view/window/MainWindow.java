package com.company.view.window;

/**
 * The main window to display for the application
 */
public class MainWindow extends AbstractJFrameWindow implements WindowListenerInterface {

    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * A constructor for the main window
     */
    public MainWindow() {
        super("CryptoCurrency Prices", 1000, 700);
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

    /**
     * TODO: Fill this out
     */
    @Override
    public void doSomething() {

    }//end doSomething

    // TODO: Add a bunch of different MainWindow constructors using different params
    // TODO: Add a default MainWindow constructor

    // TODO: Probably (Maybe?) need to add a 'setup' method

    // TODO: Include more MainWindow-specific things (layout, buttons, etc.)
    // TODO: Include abstract buttons and whatnot

}//end MainWindow
