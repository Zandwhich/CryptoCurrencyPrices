package com.company.controller;

import com.company.tools.enums.Errors;

/**
 * The general interface for all controllers
 */
public interface ControllerInterface {

    /* ************ *
     *    Methods   *
     * ************ */

    /**
     * Refreshes the controller
     */
    void refresh();

    /**
     * Pops up a window that displays an error message
     * @param error The type of error
     */
    void errorDisplay(Errors error);

    /**
     * Pops up a window that displays an error message
     * @param error The type of error
     * @param name The name of who called this error
     */
    void errorDisplay(Errors error, String name);

    /**
     * Returns true if connected to the internet, otherwise false
     * @return True if connected to the internet, otherwise false
     */
    boolean isConnected();

    /**
     * Checks the internet connection and returns if it is connected or not
     * @return If there is a connection to the internet
     */
    boolean checkConnection();

    /**
     * The method to call when there is an update to data and the window should be redrawn
     */
    void notifyWindowOfUpdate();

}
