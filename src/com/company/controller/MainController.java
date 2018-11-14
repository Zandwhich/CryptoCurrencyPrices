package com.company.controller;

import com.company.api_calls.APICallerInterface;
import com.company.api_calls.individual.CoinBase.*;
import com.company.api_calls.individual.CoinMarketCap.*;
import com.company.view.window.MainWindow;
import com.company.view.window.MainWindowInterface;

import java.util.ArrayList;

/**
 * The main controller of the application which controls the main page
 */
public class MainController implements MainControllerInterface{

    /****************
     *    Fields    *
     ****************/

    /**
     * The list of all of the API endpoints
     */
    private ArrayList<APICallerInterface> websiteList = new ArrayList<>();

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
        websiteList.add(new CoinBaseBuyBCH_USD());
        websiteList.add(new CoinBaseBuyBTC_USD());
        websiteList.add(new CoinBaseBuyETH_USD());
        websiteList.add(new CoinBaseBuyLTC_USD());
        websiteList.add(new CoinBaseBuyZRX_USD());
        // Sell
        websiteList.add(new CoinBaseSellBCH_USD());
        websiteList.add(new CoinBaseSellBTC_USD());
        websiteList.add(new CoinBaseSellETH_USD());
        websiteList.add(new CoinBaseSellLTC_USD());
        websiteList.add(new CoinBaseSellZRX_USD());
        // Spot
        websiteList.add(new CoinBaseSpotBCH_USD());
        websiteList.add(new CoinBaseSpotBTC_USD());
        websiteList.add(new CoinBaseSpotETH_USD());
        websiteList.add(new CoinBaseSpotLTC_USD());
        websiteList.add(new CoinMarketCapBTC_USD());

        /* CoinMarketCap */
        websiteList.add(new CoinMarketCapETH_USD());
        websiteList.add(new CoinMarketCapLTC_USD());
        websiteList.add(new CoinMarketCapXRP_USD());
        websiteList.add(new CoinMarketCapBTC_EUR());
        websiteList.add(new CoinMarketCapETH_EUR());
        websiteList.add(new CoinMarketCapLTC_EUR());
        websiteList.add(new CoinMarketCapXRP_EUR());
        websiteList.add(new CoinMarketCapXRP_USD());

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

    // Other

    /**
     * The method to be run on a near-infinite loop to run the program
     */
    public void run() {
      
        while(true) {}//end while

    }//end run()

    /**
     * Refreshes the controller
     */
    @Override
    public void refresh() {
        this.updatePrices();
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

    //TODO: Add in a method that updates the View somehow (Do I still need this?)

}//end MainController
