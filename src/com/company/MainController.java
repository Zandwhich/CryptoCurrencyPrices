package com.company;

import java.util.ArrayList;

public class MainController {

    /****************/
    /*    Fields    */
    /****************/

    private ArrayList<APICallerInterface> websiteList;

    /****************/
    /* Constructors */
    /****************/

    public MainController() {

        websiteList = new ArrayList<APICallerInterface>();

    }//end MainController()

    /****************/
    /*    Methods   */
    /****************/

    public void run() {

    }//end run()

    public void updatePrices() {

        for (APICallerInterface website :
                this.websiteList) {
            website.updatePrice();
        }//end for websites

    }//end updatePrices()

    //TODO: Add in a method that updates the View somehow

}//end MainController
