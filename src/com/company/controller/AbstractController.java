package com.company.controller;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 * The base controller from which to extend controllers
 */
public abstract class AbstractController implements  ControllerInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * Variable to denote if connected to the internet
     */
    private static boolean isConnected = false;


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for the abstract controller
     */
    public AbstractController() {}


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * Sets if the application is connected to the internet
     * @param isConnected The connection to the internet
     */
    protected void setConnected(final boolean isConnected) {
        AbstractController.isConnected = isConnected;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isConnected() {
        return isConnected;
    }

    /**
     * Checks the internet connection and returns if it is connected or not
     * Also alters the field isConnected
     * Currently just checks if it can hit yahoo.com
     * TODO: Figure out a better way of doing this
     * @return If there is a connection to the internet
     */
    @Override
    public boolean checkConnection() {
        boolean internet = true;
        final String yahoo = "https://yahoo.com";
        URL url;
        try {
            url = new URL(yahoo);
        }
        catch (final MalformedURLException e) {
            url = null;
            // Bad URL inputted
            // TODO: Figure out what to do when a bad URL is inputted (this shouldn't happen as the URLs are to be hard-coded in)
        }
        try {
            // Set up the connection and get the input stream
            assert url != null;
            final URLConnection connection = url.openConnection();
            connection.connect();
        }
        catch (IOException exception) {
            // Failed to connect to yahoo
            internet = false;
        }

        AbstractController.isConnected = internet;
        return this.isConnected();
    }

}
