package com.company.controller;

import com.company.api_calls.tools.Errors;

/**
 * The general interface for all controllers
 */
public interface ControllerInterface {

    /****************
     *    Methods   *
     *****************/

    /**
     * Refreshes the controller
     */
    public abstract void refresh();

    /**
     * Pops up a window that displays an error message
     * @param error The type of error
     */
    public abstract void errorDisplay(Errors error);

}//end ControllerInterface
