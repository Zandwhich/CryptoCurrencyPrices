package com.company;

import com.company.controller.controllers.main_controller.MainController;

/**
 * The main class which launches the application
 */
public final class CryptoCurrencyPrices {

    /**
     * The main method which launches the application
     * @param args Standard main method args
     */
    public static void main(final String[] args) {
        final MainController controller = new MainController();
        controller.run();
    }

}
