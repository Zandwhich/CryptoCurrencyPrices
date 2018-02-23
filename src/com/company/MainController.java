package com.company;

import java.util.ArrayList;

/**
 * TODO: Fill this out
 */
public class MainController {

    /****************
     *    Fields    *
     ****************/

    /**
     * The list of all of the API endpoints
     */
    private ArrayList<APICallerInterface> websiteList;

    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for the MainController
     */
    public MainController() {

        websiteList = new ArrayList<APICallerInterface>();

        // TODO: Create the main window

    }//end MainController()

    /****************
     *    Methods   *
     ****************/

    /**
     * TODO: Fill this out
     */
    public void run() {

    }//end run()

    /**
     * TODO: Fill this out
     */
    public void updatePrices() {

        for (APICallerInterface website :
                this.websiteList) {
            website.updatePrice();
        }//end for websites

    }//end updatePrices()

    //TODO: Add in a method that updates the View somehow

}//end MainController
