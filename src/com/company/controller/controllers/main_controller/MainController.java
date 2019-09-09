package com.company.controller.controllers.main_controller;

import com.company.api_calls.APICallerInterface;
//import com.company.api_calls_deprecated.individual.CoinBase.*;
//import com.company.api_calls_deprecated.individual.CoinMarketCap.*;
import com.company.api_calls.individual.CoinBase.AbstractCoinBase;
import com.company.api_calls.individual.CoinBase.CoinBaseBuy;
import com.company.api_calls.individual.CoinBase.CoinBaseSell;
import com.company.api_calls.individual.CoinBase.CoinBaseSpot;
import com.company.api_calls.individual.CoinMarketCap.CoinMarketCap;
import com.company.tools.CryptoCurrencies;
import com.company.tools.Errors;
import com.company.tools.FiatCurrencies;
import com.company.controller.AbstractController;
import com.company.view.window.windows.error.errors.network_error.NetworkErrorWindow;
import com.company.view.window.windows.main_window.MainWindow;
import com.company.view.window.windows.main_window.MainWindowInterface;

import java.util.ArrayList;

/**
 * The main controller of the application which controls the main page
 */
public class MainController extends AbstractController implements MainControllerInterface {

    /****************
     *    Fields    *
     ****************/

    /**
     * The list of all of the API endpoints
     */
    private ArrayList<APICallerInterface> websiteList = new ArrayList<>();

    /**
     * The currently selected
     */
    private FiatCurrencies currentFiat = FiatCurrencies.USD;

    /**
     * The main window of the application
     */
    private MainWindowInterface mainWindow = new MainWindow(this);

    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for the MainController
     */
    public MainController() {

        // TODO: CoinBase added in a bunch of new cryptocurrencies that need to be added in

        // All of the websites we currently have. In the future, we will only add a select amount at a time
        // TODO: Do the thing above

        /* CoinBase */
        // Buy
        websiteList.add(new CoinBaseBuy(CryptoCurrencies.BTC, FiatCurrencies.USD, this));
        websiteList.add(new CoinBaseBuy(CryptoCurrencies.ETH, FiatCurrencies.USD, this));
        websiteList.add(new CoinBaseBuy(CryptoCurrencies.LTC, FiatCurrencies.USD, this));
        // Sell
        websiteList.add(new CoinBaseSell(CryptoCurrencies.BTC, FiatCurrencies.USD, this));
        websiteList.add(new CoinBaseSell(CryptoCurrencies.ETH, FiatCurrencies.USD, this));
        websiteList.add(new CoinBaseSell(CryptoCurrencies.LTC, FiatCurrencies.USD, this));
        // Spot
        websiteList.add(new CoinBaseSpot(CryptoCurrencies.BTC, FiatCurrencies.USD, this));
        websiteList.add(new CoinBaseSpot(CryptoCurrencies.ETH, FiatCurrencies.USD, this));
        websiteList.add(new CoinBaseSpot(CryptoCurrencies.LTC, FiatCurrencies.USD, this));


        /* CoinMarketCap */
        websiteList.add(new CoinMarketCap(CryptoCurrencies.BTC, FiatCurrencies.USD, this));
        websiteList.add(new CoinMarketCap(CryptoCurrencies.ETH, FiatCurrencies.USD, this));
        websiteList.add(new CoinMarketCap(CryptoCurrencies.LTC, FiatCurrencies.USD, this));
        websiteList.add(new CoinMarketCap(CryptoCurrencies.XRP, FiatCurrencies.USD, this));
        websiteList.add(new CoinMarketCap(CryptoCurrencies.BTC, FiatCurrencies.EUR, this));
        websiteList.add(new CoinMarketCap(CryptoCurrencies.ETH, FiatCurrencies.EUR, this));
        websiteList.add(new CoinMarketCap(CryptoCurrencies.LTC, FiatCurrencies.EUR, this));
        websiteList.add(new CoinMarketCap(CryptoCurrencies.XRP, FiatCurrencies.EUR, this));

    }//end MainController()

    /****************
     *    Methods   *
     ****************/

    /* Public */

    // Getters

    /**
     * Gets the list of websites of URLs to hit
     * @return The list of websites of URLs to hit
     */
    @Override
    public ArrayList<APICallerInterface> getWebsiteList() { return this.websiteList; }//end getWebsiteList()

    /**
     * Returns the current fiat currency selected
     * @return The current fiat currency selected
     */
    @Override
    public FiatCurrencies getCurrentFiat() {
        return this.currentFiat;
    }//end getCurrentFiat()

    // Other

    /**
     * The method to be run on a near-infinite loop to run the program
     */
    public void run() {
      
        while(true) {
            // System.out.println("Current window location: (" + this.mainWindow.getLocationX() + ", " + this.mainWindow.getLocationY() + ")");
        }//end while

    }//end run()

    /**
     * Refreshes the controller
     */
    @Override
    public void refresh() {
        // TODO: First check if there is a network connection, then attempt to get the prices
        super.checkConnection();
        if (!super.isConnected()) this.errorDisplay(Errors.NETWORK_CONNECTION);
        else this.updatePrices();
    }//end refresh()

    /**
     * Updates the prices displayed on the controller.
     * Calls on each of the websites to update their individual prices.
     */
    public void updatePrices() {
        for (APICallerInterface website : this.websiteList) {
            website.updatePrice();
        }//end for websites
        this.updateViewPrices();
    }//end updatePrices()

    /**
     * Updates the prices in the view
     */
    public void updateViewPrices() {
        this.mainWindow.updatePrices();
    }//end updateViewPrices()

    // TODO: Add in a method that updates the View somehow (Do I still need this?)

    /**
     * Pops up a window that displays an error message
     * @param error The type of error
     * @param name The name of who called this error
     */
    @Override
    public void errorDisplay(Errors error, String name) {

        switch (error) {
            case NETWORK_CONNECTION:
                new NetworkErrorWindow(this, name);
                return;
        }//end switch
    }//end errorDisplay()

    /**
     * Pops up a window that displays an error message
     * @param error The type of error
     */
    @Override
    public void errorDisplay(Errors error) {

        switch (error) {
            case NETWORK_CONNECTION:
                new NetworkErrorWindow(this);
                return;
        }//end switch
    }//end errorDisplay()

    /**
     * Updates the fiat currency to the one passed in
     * @param fiatCurrency The new fiat currency
     */
    @Override
    public void updateFiatCurrency(FiatCurrencies fiatCurrency) {
        this.currentFiat = fiatCurrency;
    }//end updateFiatCurrency
}//end MainController
