package com.company.controller;

import com.company.api_calls.APICallerInterface;

import java.util.ArrayList;

/**
 * The interface for specifically the main controller
 */
public interface MainControllerInterface extends ControllerInterface{

    /**
     * Update the prices that are listed on the main screen
     */
    public abstract void updatePrices();

    /**
     * Gets the list of websites of URLs to hit
     * @return The list of websites of URLs to hit
     */
    public abstract ArrayList<APICallerInterface> getWebsiteList();

}//end MainControllerInterface
