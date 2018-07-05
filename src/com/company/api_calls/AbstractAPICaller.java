package com.company.api_calls;

import java.net.MalformedURLException;
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
     * The crypto currency (i.e. BTC, ETH, LTC, etc.)
     */
    private String cryptoCurrency;

    /**
     * The fiat currency (i.e. USD, CAD, PLN, etc.)
     */
    private String fiatCurrency;

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
     * @param cryptoCurrency The currency (i.e. BTC, ETH, LTC, etc.)
     * @param name The name of the API endpoint
     */
    public AbstractAPICaller(final String cryptoCurrency, final String fiatCurrency, final String name,
                             final String url) {
        this.cryptoCurrency = cryptoCurrency;
        this.fiatCurrency = fiatCurrency;
        this.hasPrice = false;
        this.price = 0.0;
        this.name = name;
        try {
            this.url = new URL(url);
        }//end try
        catch (MalformedURLException e) {
            // Bad URL inputted
            // TODO: Figure out what to do when a bad URL is inputted (this shouldn't happen as the URLs are to be hard-coded in)
        }//end catch(MalformedURLException)
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
    public double getPrice() { return this.price; }//end getPrice()

    /**
     * Gets the crypto currency (i.e. BTC, ETH, LTC, etc.)
     * @return The crypto currency (i.e. BTC, ETH, LTC, etc.)
     */
    @Override
    public String getCryptoCurrency() { return this.cryptoCurrency; }//end getCryptoCurrency()

    /**
     * Gets the fiat currency (i.e. USD, CAD, PLN, etc.)
     * @return The fiat currency (i.e. USD, CAD, PLN, etc.)
     */
    public String getFiatCurrency() { return this.fiatCurrency; }//end getFiatCurrency()

    /**
     * Gets if the API has received a price
     * @return If the API ahs received a price
     */
    @Override
    public boolean getHasPrice() { return this.hasPrice; }//end getHasPrice()

    /**
     * Gets the name of the API endpoint
     * @return The name of the API endpoint
     */
    @Override
    public String getName() { return this.name; }//end getName()

    /**
     * Gets the URL to update the prices
     * @return The URL to update the prices
     */
    public URL getUrl() { return this.url; }//end getUrl()

    /**
     * Gets the URL in a string format
     * @return The URL in a string format
     */
    public String getUrlString() { return this.url.toString(); }//end getUrlString()

    /**
     * Gets the Base URL of the API call
     * @return The Base URL of the API call
     */
    public abstract String getBaseUrl();

    /**
     * Gets the URL extension of the API call
     * @return The URL extension of the API call
     */
    public abstract String getUrlExt();

    // Other

    /**
     * Updates the price
     */
    @Override
    public void updatePrice() { this.price = this.getNewPrice(); }//end updatePrice()

    /* Protected */

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

    // Other

    /**
     * Gets the new updated price from the API endpoint
     * @return The new updated price from the API endpoint
     */
    protected abstract double getNewPrice();
}//end AbstractModel
