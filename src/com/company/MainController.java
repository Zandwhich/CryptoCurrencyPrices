package com.company;

import com.company.api_calls.APICallerInterface;
import com.company.view.window.MainWindow;
import com.company.view.window.WindowInterface;

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

    /**
     * The main window of the application
     */
    private WindowInterface mainWindow;

    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for the MainController
     */
    public MainController() {

        this.websiteList = new ArrayList<APICallerInterface>();
        this.mainWindow = new MainWindow();

        // TODO: Create the main window

    }//end MainController()

    /****************
     *    Methods   *
     ****************/

    /**
     * The method to be run on a near-infinite loop to run the program
     */
    public void run() {
      
        while(true) {}//end while

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
