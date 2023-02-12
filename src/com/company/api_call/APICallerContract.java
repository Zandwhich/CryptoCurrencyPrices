package com.company.api_call;

import com.company.tools.enums.Errors;

/**
 * Whoever wants to use an instantiation of APICallerInterface needs to provide these methods
 */
public interface APICallerContract {

    /**
     * The function to call when there is an update in the data of an endpoint and the window needs to be re-drawn
     */
    void notifyWindowOfUpdate();

    /**
     * The function to call when a single endpoint has received an update on its price, but successful or not
     * @param name The name of the endpoint (this is what will be used to check against in the table)
     * @param price The new price to display for this endpoint
     * @param hasSucceeded If this last call was successful or not
     */
    void updatePrice(final String name, final double price, final boolean hasSucceeded);

    /**
     * Returns true if connected to the internet, otherwise false
     * @return True if connected to the internet, otherwise false
     */
    boolean isConnected();

    /**
     * Pops up a window that displays an error message
     * @param error The type of error
     * @param name The name of whoever called this error
     */
    void errorDisplay(final Errors error, final String name);
}
