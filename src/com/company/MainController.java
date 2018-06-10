package com.company;

import com.company.api_calls.APICallerInterface;
import com.company.api_calls.individual.CoinBaseBTC;
import com.company.api_calls.individual.CoinBaseETH;
import com.company.api_calls.individual.CoinBaseLTC;
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

        websiteList.add(new CoinBaseBTC());
        websiteList.add(new CoinBaseETH());
        websiteList.add(new CoinBaseLTC());

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
