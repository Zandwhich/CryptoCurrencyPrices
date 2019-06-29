package com.company.api_calls;

import com.company.api_calls.APICallerInterface;
import com.company.controller.ControllerInterface;
import com.company.tools.CryptoCurrencies;
import com.company.tools.FiatCurrencies;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * The abstract class for API calls, which all API calls are based off of
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
    private CryptoCurrencies cryptoCurrency;

    /**
     * The fiat currency (i.e. USD, CAD, PLN, etc.)
     */
    private FiatCurrencies fiatCurrency;

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

    /**
     * The extension used in the url
     */
    private String urlExt;

    /**
     * If the last attempt to update the prices ended in failure
     */
    private boolean hasFailedLastUpdate;

    /**
     * The controller that calls this API caller
     */
    private ControllerInterface controller;

    /**
     * The cryptocurrencies that this website can use
     */
    private CryptoCurrencies[] acceptedCryptoCurrencies;

    /**
     * The fiat currencies that this website can use
     */
    private FiatCurrencies[] acceptedFiatCurrencies;


    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for AbstractAPICaller
     * @param cryptoCurrency The currency (i.e. BTC, ETH, LTC, etc.)
     * @param fiatCurrency The fiat currency to compare against (USD, CAD, PLN, etc.)
     * @param acceptedCryptoCurrencies The accepted cryptocurrencies for this website
     * @param acceptedFiatCurrencies The accepted fiat currencies for this website
     * @param name The name of the API endpoint
     * @param url The url to hit
     * @param urlExt The extension of the url to hit
     * @param controller The controller that calls this API caller
     */
    public AbstractAPICaller(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                             final CryptoCurrencies[] acceptedCryptoCurrencies,
                             final FiatCurrencies[] acceptedFiatCurrencies, final String name, final String url,
                             final String urlExt, final ControllerInterface controller) {
        this.controller = controller;
        this.cryptoCurrency = cryptoCurrency;
        this.fiatCurrency = fiatCurrency;
        this.hasPrice = false;
        // There has not been a failure to update, as there hasn't been a request made yet
        this.hasFailedLastUpdate = false;
        this.price = 0.0;
        this.name = name;
        try {
            this.url = new URL(url);
        }//end try
        catch (MalformedURLException e) {
            // Bad URL inputted
            // TODO: Figure out what to do when a bad URL is inputted (this shouldn't happen as the URLs are to be hard-coded in)
        }//end catch(MalformedURLException)
        this.urlExt = urlExt;
        this.acceptedCryptoCurrencies = acceptedCryptoCurrencies;
        this.acceptedFiatCurrencies = acceptedFiatCurrencies;
    }//end AbstractAPICaller()

    /****************
     *    Methods   *
     ****************/

    /* Public */

    // Getters

    /**
     * {@inheritDoc}
     */
    @Override
    public double getPrice() { return this.price; }//end getPrice()

    /**
     * {@inheritDoc}
     */
    @Override
    public CryptoCurrencies getCryptoCurrency() { return this.cryptoCurrency; }//end getCryptoCurrency()

    /**
     * {@inheritDoc}
     */
    public FiatCurrencies getFiatCurrency() { return this.fiatCurrency; }//end getFiatCurrency()

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean getHasPrice() { return this.hasPrice; }//end getHasPrice()

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() { return this.name; }//end getName()

    /**
     * {@inheritDoc}
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
    public String getUrlExt()
    {
        return this.urlExt;
    }//end getUrlExt()

    /**
     * Gets if the last attempt at updating the price ended in failure
     * @return If the last attempt at updating the price ended in failure
     */
    public boolean getHasFailedLastUpdate() { return this.hasFailedLastUpdate; }//end getHasFailedLastUpdate()

    /**
     * Gets the controller
     * @return The controller
     */
    public ControllerInterface getController() { return this.controller; }//end getController()

    /**
     * Retruns the accepted cryptocurrencies
     * @return The accepted cryptocurrencies
     */
    public CryptoCurrencies[] getAcceptedCryptoCurrencies() {
        return this.acceptedCryptoCurrencies;
    }//end getAcceptedCryptoCurrencies()

    /**
     * Returns the accepted fiat currencies
     * @return The accepted fiat currencies
     */
    public FiatCurrencies[] getAcceptedFiatCurrencies() {
        return this.acceptedFiatCurrencies;
    }//end getAcceptedFiatCurrencies()

    // Other

    /**
     * Updates the price
     */
    @Override
    public void updatePrice() {
        double newPrice = this.getNewPrice();
        if (newPrice != -1) {
            this.price = newPrice;
            this.hasFailedLastUpdate = false;
            this.hasPrice = true;
        }//end if has received a new price successfully
        else {
            this.hasFailedLastUpdate = true;
        }//end else there has not been a new price received successfully
    }//end updatePrice()

    /* Protected */

    // Setters

    /**
     * Sets the price
     * @param price The new price
     */
    protected void setPrice(final double price) { this.price = price; }//end setPrice()

    /**
     * Sets the cryptocurrency
     * @param cryptoCurrency The cryptocurrency
     */
    protected void setCryptoCurrency(final CryptoCurrencies cryptoCurrency) { this.cryptoCurrency = cryptoCurrency; }//end setCryptoCurrency()

    /**
     * Sets the fiat currency
     * @param fiatCurrency The fiat currency
     */
    protected void setFiatCurrency(final FiatCurrencies fiatCurrency) { this.fiatCurrency = fiatCurrency; }//end fiatCurrency()

    /**
     * Sets the name of the API endpoint
     * @param name The name of the API endpoint
     */
    public void setName(final String name) { this.name = name; }//end setName()

    /**
     * Sets the URL to hit
     * @param url The url to hit
     */
    public void setUrl(final URL url) { this.url = url; }//end setUrl()

    /**
     * Sets if the last update failed
     * @param hasFailedLastUpdate If the last update failed
     */
    public void setHasFailedLastUpdate(final boolean hasFailedLastUpdate) { this.hasFailedLastUpdate = hasFailedLastUpdate; }//end setHasFailedLastUpdate()

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
