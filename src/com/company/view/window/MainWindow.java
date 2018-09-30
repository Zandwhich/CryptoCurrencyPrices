package com.company.view.window;

import com.company.controller.MainControllerInterface;
import com.company.api_calls.APICallerInterface;
import com.company.view.button.ButtonInterface;
import com.company.view.button.buttons.RefreshButton;

import javax.swing.*;
import java.util.ArrayList;

/**
 * The main window to display for the application
 */
public class MainWindow extends AbstractJFrameWindow implements MainWindowInterface {

    /****************®
     *    Fields    *
     ****************/

    /* Public */

    /**
     * The title of the main window
     */
    public final static String TITLE = "CryptoCurrency Prices";

    /**
     * The default width of the main window
     */
    public final static int DEFAULT_WIDTH = 1000;

    /**
     * The default height of the main window
     */
    public final static int DEFAULT_HEIGHT = 700;

    /**
     * The default visibility of the main window
     */
    public final static boolean DEFAULT_VISIBILITY = true;

    /* Private */

    /**
     * TODO: Fill in
     */
    private ButtonInterface refreshButton = new RefreshButton(this);

    /**
     * TODO: Fill in
     */
    private JPanel panel = new JPanel();

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
     * The default constructor for the main window
     */
    public MainWindow(MainControllerInterface mainController) {
        super(MainWindow.TITLE, MainWindow.DEFAULT_WIDTH, MainWindow.DEFAULT_HEIGHT, MainWindow.DEFAULT_VISIBILITY);
        this.setup(mainController);
    }//end MainWindow()

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * The general setup method that is used for maximum abstraction
     * @param mainController TODO: Fill in
     */
    private void setup(MainControllerInterface mainController) {
        this.panel.add((JButton) refreshButton);
        this.panel.add(text);
        this.add(panel);
        super.refreshWindow();

        //this.setVisible(true);

        this.mainController = mainController;

        //this.coinBaseBTC = new CoinBaseBuyBTC_USD();

        // TODO: Add text/labels to the window
        // TODO: Add table functionality to the window
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
            this.text.setText(this.text.getText() + "\n" + website.getName() + ": " + website.getPrice());
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



    // TODO: Include more MainWindow-specific things (layout, buttons, etc.)
    // TODO: Include abstract buttons and whatnot

}//end MainWindow
