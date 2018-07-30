package com.company.controller;

import com.company.api_calls.APICallerInterface;

import java.util.ArrayList;

/**
 * TODO: Fill in
 */
public interface MainControllerInterface {

    /**
     * TODO: Fill in
     */
    public abstract void refresh();

    /**
     * TODO: Fill in
     */
    public abstract void updatePrices();

    /**
     * Gets the list of websites of URLs to hit
     * @return The list of websites of URLs to hit
     */
    public abstract ArrayList<APICallerInterface> getWebsiteList();

}//end MainControllerInterface
