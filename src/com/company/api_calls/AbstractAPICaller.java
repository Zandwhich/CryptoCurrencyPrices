package com.company.api_calls;

import com.company.api_calls.APICallerInterface;

import java.net.URL;

/**
 * TODO: Fill this out
 */
public abstract class AbstractAPICaller implements APICallerInterface {

    /****************
     *    Fields    *
     ****************/

    /**
     * The last received price
     */
    private double price;

    /**
     * The currency (i.e. BTC, ETH, LTC, etc.)
     */
    private String currency;

    /**
     * If the API has a price to display
     */
    private boolean hasPrice;

    /**
     * The name of the API endpoint
     */
    private String name;

    /**
     * TODO: Figure out a better way to phrase this
     * The url to hit
     */
    private URL url;


    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for AbstractAPICaller
     * @param currency The currency (i.e. BTC, ETH, LTC, etc.)
     * @param name The name of the API endpoint
     */
    public AbstractAPICaller(final String currency, final String name) {
        this.currency = currency;
        this.hasPrice = false;
        this.price = 0.0;
        this.name = name;
    }//end AbstractAPICaller()

    /****************
     *    Methods   *
     ****************/

    /* Public */

    // Getters

    /**
     * Gets the last received price
     * @return The last received price
     */
    @Override
    public double getPrice() { return price; }//end getPrice()

    /**
     * Gets the currency (i.e. BTC, ETH, LTC, etc.)
     * @return The currency (i.e. BTC, ETH, LTC, etc.)
     */
    @Override
    public String getCurrency() { return currency; }//end getCurrency()

    /**
     * Gets if the API has received a price
     * @return If the API ahs received a price
     */
    @Override
    public boolean getHasPrice() { return hasPrice; }//end getHasPrice()

    /**
     * Gets the name of the API endpoint
     * @return The name of the API endpoint
     */
    @Override
    public String getName() { return name; }//end getName()

    // Other

    /**
     * Updates the price
     */
    @Override
    public void updatePrice() { this.price = getNewPrice(); }//end updatePrice()

    // Setters

    /**
     * Sets the price
     * @param price The new price
     */
    protected void setPrice(final double price) { this.price = price; }//end setPrice()

    /**
     * Sets if there is a price to display
     * @param hasPrice If there is a price to display
     */
    protected void setHasPrice(final boolean hasPrice) { this.hasPrice = hasPrice; }//end setHasPrice();

    /* Protected */

    /**
     * Gets the new updated price from the API endpoint
     * @return The new updated price from the API endpoint
     */
    protected abstract double getNewPrice();

    protected abstract void /* TODO: Figure out the correct return type (String? HTML-Specific Object?) */ getRequestCall();

}//end AbstractModel
