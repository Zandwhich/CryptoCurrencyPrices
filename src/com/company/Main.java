package com.company;

import com.company.controller.controllers.main_controller.MainController;

/**
 * The main class which launches the application
 */
public class Main {

    /**
     * The main method which launches the application
     * @param args Standard main method args
     */
    public static void main(String[] args) {
        MainController controller = new MainController();
        controller.run();
    }//end main()
}//end Main
