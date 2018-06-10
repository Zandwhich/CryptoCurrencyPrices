package com.company.view.window;

import com.company.MainControllerInterface;
import com.company.api_calls.APICallerInterface;
import com.company.api_calls.AbstractAPICaller;
import com.company.api_calls.individual.CoinBase;
import com.company.view.button.ButtonInterface;
import com.company.view.button.RefreshButton;

import javax.swing.*;
import java.util.ArrayList;

/**
 * The main window to display for the application
 */
public class MainWindow extends AbstractJFrameWindow implements MainWindowInterface {

    /****************
     *    Fields    *
     ****************/

    /**
     * TODO: Fill in
     */
    private ButtonInterface refreshButton = new RefreshButton(this);

    /**
     * TODO: Fill in
     */
    private JPanel panel = new JPanel();

    /**
     * Temporary. Used now just for testing
     */
    private APICallerInterface coinBaseBTC;

    /**
     * TODO: Fill in
     */
    private MainControllerInterface mainController;

    /**
     * Temporary for now
     */
    private JLabel text = new JLabel();

    /****************
     * Constructors *
     ****************/

    /**
     * A constructor for the main window
     */
    public MainWindow(MainControllerInterface mainController) {
        super("CryptoCurrency Prices", 1000, 700, false);
        this.setup(mainController);
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
     * The general setup method that is used in for maximum abstraction
     */
    private void setup(MainControllerInterface mainController) {
        this.panel.add((JButton) refreshButton);
        this.panel.add(text);
        this.add(panel);
        super.refreshWindow();

        //this.setVisible(true);

        this.mainController = mainController;

        this.coinBaseBTC = new CoinBase();

        // TODO: Add text/labels to the window
        // TODO: Add a panel to the window
        // TODO: Add table functionality to the window
        // TODO: Add it so that the window calls controller's methods after button presses
    }//end setup()

    /* Protected */

    /* Public */

    /**
     * TODO: Fill this in
     */
    public void updatePrices() {
        this.text.setText("");
        ArrayList<APICallerInterface> websiteList= this.mainController.getWebsiteList();
        for (APICallerInterface website : websiteList) {
            this.text.setText(this.text.getText() + "\n" + website.getName() + ": " + website.getCurrency() + ": " + website.getPrice());
        }//end for each website
    }//end updatePrices()

    /**
     * TODO: Fill this out
     */
    @Override
    public void refresh() {
        this.mainController.updatePrices();
        this.updatePrices();

        //this.coinBaseBTC.updatePrice();
        //String something = "" + this.coinBaseBTC.getPrice();
        //super.setTitle(something);
    }//end doSomething

    // TODO: Add a bunch of different MainWindow constructors using different params
    // TODO: Add a default MainWindow constructor


    // TODO: Include more MainWindow-specific things (layout, buttons, etc.)
    // TODO: Include abstract buttons and whatnot

}//end MainWindow
