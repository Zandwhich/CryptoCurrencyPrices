package com.company.view.window.windows.main_window;

import com.company.tools.enums.CryptoCurrencies;
import com.company.tools.enums.FiatCurrencies;
import com.company.controller.controllers.main_controller.MainControllerInterface;
import com.company.api_calls.APICallerInterface;
import com.company.view.combo_box.crypto_dropdown.CryptoDropdownInterface;
import com.company.view.combo_box.crypto_dropdown.CryptoDropdownJComboBox;
import com.company.view.combo_box.fiat_dropdown.FiatDropdownInterface;
import com.company.view.combo_box.fiat_dropdown.FiatDropdownJComboBox;
import com.company.view.table_pane.table_panes.MainTablePane.MainTablePane;
import com.company.view.table_pane.table_panes.MainTablePane.MainTablePaneInterface;
import com.company.view.button.buttons.refresh_button.RefreshButton;
import com.company.view.button.buttons.refresh_button.RefreshButtonInterface;
import com.company.view.window.AbstractJFrameWindow;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Vector;

/**
 * The main window to display for the application
 */
final public class MainWindow extends AbstractJFrameWindow implements MainWindowInterface {

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
    public final static int DEFAULT_WIDTH = 1300;

    /**
     * The default height of the main window
     */
    public final static int DEFAULT_HEIGHT = 700;

    /**
     * The default x position of the window
     */
    public final static int DEFAULT_X = 155;

    /**
     * The default y position of the window
     */
    public final static int DEFAULT_Y = 58;

    /**
     * The default visibility of the main window
     */
    public final static boolean DEFAULT_VISIBILITY = true;

    /**
     * The text to display above the fiat currency dropdown
     */
    public final static String FIAT_DROPDOWN_TEXT = "Fiat Currency";

    /**
     * The text to display above the cryptocurrency dropdown
     */
    public final static String CRYPTO_DROPDOWN_TEXT = "Cryptocurrency";

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

    /**
     * The dropdown to choose the fiat currency
     */
    private FiatDropdownJComboBox fiatDropdown;

    /**
     * The dropdown to choose the cryptocurrency
     */
    private CryptoDropdownJComboBox cryptoDropdown;

    /****************
     * Constructors *
     ****************/

    /**
     * The default constructor for the main window
     * @param mainController The MainController of the application
     */
    public MainWindow(MainControllerInterface mainController) {
        super(mainController, MainWindow.TITLE, MainWindow.DEFAULT_WIDTH, MainWindow.DEFAULT_HEIGHT,
                JFrame.EXIT_ON_CLOSE, MainWindow.DEFAULT_VISIBILITY);
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
        super.setLocation(MainWindow.DEFAULT_X, MainWindow.DEFAULT_Y);

        this.mainController = (MainControllerInterface) super.getController();
        this.table = new MainTablePane(this.data);
        this.refreshButton = new RefreshButton(this.mainController, this);
        this.fiatDropdown = new FiatDropdownJComboBox(FiatCurrencies.toStringArray(), this.mainController);
        this.cryptoDropdown = new CryptoDropdownJComboBox(CryptoCurrencies.toStringArray(), this.mainController);

        final JTextField fiat_dropdown_text = new JTextField(MainWindow.FIAT_DROPDOWN_TEXT);
        fiat_dropdown_text.setEditable(false);
        final JTextField crypto_dropdown_text = new JTextField(MainWindow.CRYPTO_DROPDOWN_TEXT);
        crypto_dropdown_text.setEditable(false);

        this.panel.add(fiat_dropdown_text);
        this.panel.add(this.fiatDropdown);
        this.panel.add(crypto_dropdown_text);
        this.panel.add(this.cryptoDropdown);
        // TODO: Figure out how to resize the image
        this.panel.add((JButton) this.refreshButton);
        this.panel.add((JScrollPane) this.table);
        this.add(this.panel);

        this.updatePrices();
        this.setVisible(MainWindow.DEFAULT_VISIBILITY);

        // TODO: Add text/labels to the window
    }//end setup()

    /* Protected */

    /* Public */

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateDropdowns() {
        this.fiatDropdown.setSelectedItem(this.mainController.getCurrentFiat().getAbbreviatedName());
        this.cryptoDropdown.setSelectedItem(this.mainController.getCurrentCrypto().getAbbreviatedName());
    }//end updateDropdowns()

    /**
     * TODO: Fill this in
     */
    public void updatePrices() {
        this.websites = this.mainController.getWebsiteList();
        this.data.clear();

        // TODO: Clean this up a bit?
        for (APICallerInterface website : this.websites) {
            Vector<String> websiteVec = new Vector<>();
            websiteVec.add(website.getName());
            websiteVec.add("" + website.getPrice());
            this.data.add(websiteVec);
        }//end for each website
        this.table.setData(this.data);
    }//end updatePrices()

    /**
     * TODO: Fill this out
     */
    @Override
    public void refresh() {
        // TODO: Include an actual message that says that the information was updated in the MainController,
        //       and this is simply updating the view
        this.updatePrices();
    }//end doSomething

    /**
     * TODO: Fill in
     */
    @Override
    public void close() {
        // TODO: Figure out how to close the window, but close the whole application as well
    }//end close()



    // TODO: Include more MainWindow-specific things (layout, buttons, etc.)
    // TODO: Include abstract buttons and whatnot

}//end MainWindow
