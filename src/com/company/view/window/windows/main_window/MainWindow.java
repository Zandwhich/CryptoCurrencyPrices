package com.company.view.window.windows.main_window;

import com.company.controller.MainControllerInterface;
import com.company.api_calls.APICallerInterface;
import com.company.view.button.ButtonInterface;
import com.company.view.button.buttons.RefreshButton;
import com.company.view.button.buttons.RefreshButtonInterface;
import com.company.view.table_pane.table_panes.MainTablePane.MainTablePane;
import com.company.view.table_pane.table_panes.MainTablePane.MainTablePaneInterface;
import com.company.view.window.AbstractJFrameWindow;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 * The main window to display for the application
 */
public class MainWindow extends AbstractJFrameWindow implements MainWindowInterface {

    /****************
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
    private RefreshButtonInterface refreshButton;

    /**
     * TODO: Fill in
     */
    private JPanel panel = new JPanel();

    /**
     * TODO: Fill in
     */
    private MainControllerInterface mainController;

    /**
     * The list of website objects
     */
    private ArrayList<APICallerInterface> websites;

    /**
     * The data to be displayed in the main table
     */
    private Vector<Vector<String>> data = new Vector<>();

    /**
     * The main table that displays all of the information
     */
    private MainTablePaneInterface table;

    /**
     * The list of website names that are displayed
     */
    private JList<String> websiteNames = new JList<>();

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for the main window
     */
    public MainWindow(MainControllerInterface mainController) {
        super(mainController, MainWindow.TITLE, MainWindow.DEFAULT_WIDTH, MainWindow.DEFAULT_HEIGHT,
                MainWindow.DEFAULT_VISIBILITY);
        this.setup();
    }//end MainWindow()

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * The general setup method that is used for maximum abstraction
     */
    private void setup() {
        super.setLocation(155, 58);

        this.mainController = (MainControllerInterface) super.getController();
        this.updatePrices();
        this.table = new MainTablePane(this.data);
        this.refreshButton = new RefreshButton(this.mainController);
        // TODO: Figure out how to resize the image
        this.panel.add((JButton) this.refreshButton);
        this.panel.add((JScrollPane) this.table);
        this.add(this.panel);

        this.setVisible(true);

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
        this.websites = this.mainController.getWebsiteList();
        this.data.clear();
        for (APICallerInterface website : this.websites) {
            Vector<String> websiteVec = new Vector<>();
            websiteVec.add(website.getCryptoCurrency());
            websiteVec.add("" + website.getPrice());
            this.data.add(websiteVec);
        }//end for each website
    }//end updatePrices()

    /**
     * TODO: Fill this out
     */
    @Override
    public void refresh() {
        // TODO: Include an actual message that says that the information was updated in the MainController,
        //       and this is simply updating the view
        this.updatePrices();

        //this.coinBaseBTC.updatePrice();
        //String something = "" + this.coinBaseBTC.getPrice();
        //super.setTitle(something);
    }//end doSomething



    // TODO: Include more MainWindow-specific things (layout, buttons, etc.)
    // TODO: Include abstract buttons and whatnot

}//end MainWindow
