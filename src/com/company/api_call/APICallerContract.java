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
