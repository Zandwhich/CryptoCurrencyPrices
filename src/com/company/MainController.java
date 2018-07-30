package com.company;

import com.company.api_calls.APICallerInterface;
import com.company.api_calls.individual.CoinBase.*;
import com.company.api_calls.individual.CoinCap.CoinCapBTC_USD;
import com.company.api_calls.individual.CoinMarketCap.*;
import com.company.view.window.MainWindow;
import com.company.view.window.MainWindowInterface;

import java.util.ArrayList;

/**
 * TODO: Fill this out
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

//        websiteList.add(new CoinBaseBuyBTC_USD());
//        websiteList.add(new CoinBaseBuyETH_USD());
//        websiteList.add(new CoinBaseBuyLTC_USD());
//        websiteList.add(new CoinBaseSellBTC_USD());
//        websiteList.add(new CoinBaseSellETH_USD());
//        websiteList.add(new CoinBaseSellLTC_USD());
//        websiteList.add(new CoinMarketCapBTC_USD());
//        websiteList.add(new CoinMarketCapETH_USD());
//        websiteList.add(new CoinMarketCapLTC_USD());
//        websiteList.add(new CoinMarketCapXRP_USD());
//        websiteList.add(new CoinMarketCapBTC_EUR());
//        websiteList.add(new CoinMarketCapETH_EUR());
//        websiteList.add(new CoinMarketCapLTC_EUR());
//        websiteList.add(new CoinBaseSpotBTC_USD());
//        websiteList.add(new CoinBaseSpotETH_USD());
//        websiteList.add(new CoinBaseSpotLTC_USD());
        websiteList.add(new CoinBaseBuyBCH_USD());
        websiteList.add(new CoinBaseSellBCH_USD());
        websiteList.add(new CoinBaseSpotBCH_USD());
//        websiteList.add(new CoinMarketCapXRP_EUR());
//        websiteList.add(new CoinMarketCapXRP_USD());

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
     * TODO: Fill this out
     */
    @Override
    public void refresh() {
        this.updatePrices();
    }//end refresh()

    /**
     * TODO: Fill this out
     */
    public void updatePrices() {
        for (APICallerInterface website : this.websiteList) {
            website.updatePrice();
        }//end for websites
    }//end updatePrices()

    /**
     * TODO: Fill this out
     */
    public void updateViewPrices() {
        this.mainWindow.updatePrices();
    }//end updateViewPrices()

    //TODO: Add in a method that updates the View somehow

}//end MainController
