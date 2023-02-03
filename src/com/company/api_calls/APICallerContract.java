package com.company.api_calls;

/**
 * Whoever wants to use an instantiation of APICallerInterface needs to provide these methods
 */
public interface APICallerContract {

    /**
     * The function to call when there is an update in the data of an endpoint and the window needs to be re-drawn
     */
    void notifyWindowOfUpdate();
}
