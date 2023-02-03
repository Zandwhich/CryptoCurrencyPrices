package com.company.controller;

import com.company.api_call.APICallerContract;
import com.company.api_call.JSONCallerContract;
import com.company.tools.enums.Errors;
import com.company.view.button.refresh.RefreshButtonContractInterface;

/**
 * The general interface for all controllers
 */
public interface ControllerInterface extends APICallerContract, JSONCallerContract, RefreshButtonContractInterface {

    /**
     * Pops up a window that displays an error message
     * @param error The type of error
     */
    void errorDisplay(final Errors error);

    /**
     * Checks the internet connection and returns if it is connected or not
     * @return If there is a connection to the internet
     */
    boolean checkConnection();

}
