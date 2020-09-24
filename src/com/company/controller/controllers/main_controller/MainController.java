package com.company.controller.controllers.main_controller;

import com.company.api_calls.APICallerInterface;
import com.company.api_calls.individual.CoinBase.AbstractCoinBase;
import com.company.api_calls.individual.CoinBase.CoinBaseBuy;
import com.company.api_calls.individual.CoinBase.CoinBaseSell;
import com.company.api_calls.individual.CoinBase.CoinBaseSpot;
import com.company.api_calls.individual.CoinCap.CoinCap;
import com.company.api_calls.individual.CryptoCompare.CryptoCompare;
import com.company.tools.enums.CryptoCurrencies;
import com.company.tools.enums.Errors;
import com.company.tools.enums.FiatCurrencies;
import com.company.controller.AbstractController;
import com.company.view.window.windows.error.errors.network_error.NetworkErrorWindow;
import com.company.view.window.windows.main_window.MainWindow;
import com.company.view.window.windows.main_window.MainWindowInterface;

import java.util.ArrayList;

/**
 * The main controller of the application which controls the main page
 */
final public class MainController extends AbstractController implements MainControllerInterface {

    /****************
     *    Fields    *
     ****************/

    /**
     * The list of all of the API endpoints
     */
    private final ArrayList<APICallerInterface> websiteList = new ArrayList<>();

    /**
     * The currently selected fiat currency
     */
    private FiatCurrencies currentFiat = FiatCurrencies.USD;

    /**
     * The currently selected cryptocurrency
     */
    private CryptoCurrencies currentCrypto = CryptoCurrencies.BTC;

    /**
     * The main window of the application
     */
    private final MainWindowInterface mainWindow = new MainWindow(this);

    /****************
     * Constructors *
     ****************/

    /**
     * The constructor for the MainController
     */
    public MainController() {

        /* CoinBase */
        if (AbstractCoinBase.canUseCryptoCurrency(this.currentCrypto) &&
                AbstractCoinBase.canUseFiatCurrency(this.currentFiat)) {
            websiteList.add(new CoinBaseBuy(this.currentCrypto, this.currentFiat, this));
            websiteList.add(new CoinBaseSell(this.currentCrypto, this.currentFiat, this));
            websiteList.add(new CoinBaseSpot(this.currentCrypto, this.currentFiat, this));
        }

        /* CoinMarketCap */
        //websiteList.add(new CoinMarketCap(this.currentCrypto, this.currentFiat, this));

        /* CoinCap */
        if (CoinCap.canUseCryptoCurrency(this.currentCrypto) && CoinCap.canUseFiatCurrency(this.currentFiat)) {
            websiteList.add(new CoinCap(this.currentCrypto, this.currentFiat, this));
        }

        /* CryptoCompare */
        if (CryptoCompare.canUseCryptoCurrency(this.currentCrypto) &&
                CryptoCompare.canUseFiatCurrency(this.currentFiat)) {
            websiteList.add(new CryptoCompare(this.currentCrypto, this.currentFiat, this));
        }

        //this.refresh();

        // Get the dropdown to display the default currencies
        this.mainWindow.updateDropdowns();
    }//end MainController()

    /****************
     *    Methods   *
     ****************/

    /* Private */

    /**
     * Because the logic for changing either cryptocurrency or fiat currency is the same, have one method
     * that both methods call
     */
    private void updateChangedCurrency() {
        // For now, delete all of the websites and recreate them with the new fiat currencies
        this.websiteList.clear();

        /* CoinBase */
        if (AbstractCoinBase.canUseFiatCurrency(this.currentFiat) &&
                AbstractCoinBase.canUseCryptoCurrency(this.currentCrypto)) {
            this.websiteList.add(new CoinBaseBuy(this.currentCrypto, this.currentFiat, this));
            this.websiteList.add(new CoinBaseSell(this.currentCrypto, this.currentFiat, this));
            this.websiteList.add(new CoinBaseSpot(this.currentCrypto, this.currentFiat, this));
        }//end if CoinBase

        /* CoinMarketCap */
//        if (CoinMarketCap.canUseFiatCurrency(this.currentFiat))
//        {
//            this.websiteList.add(new CoinMarketCap(this.currentCrypto, this.currentFiat, this));
//        }//end if CoinMarketCap

        /* CoinCap */
        if (CoinCap.canUseFiatCurrency(this.currentFiat) && CoinCap.canUseCryptoCurrency(this.currentCrypto)) {
            this.websiteList.add(new CoinCap(this.currentCrypto, this.currentFiat, this));
        }//end if CoinCap

        /* CryptoCompare */
        if (CryptoCompare.canUseFiatCurrency(this.currentFiat) &&
                CryptoCompare.canUseCryptoCurrency(this.currentCrypto)) {
            this.websiteList.add(new CryptoCompare(this.currentCrypto, this.currentFiat, this));
        }//end if CryptoCompare

        this.refresh();
    }// updateChangedCurrency()

    /**
     * Changes the fiat currency that is being used in each of the endpoints
     */
    private void updateWebsiteFiat() {
        this.updateChangedCurrency();
    }//end updateWebsiteFiat()

    /**
     * Changes the cryptocurrency that is begin used in each of the endpoints
     */
    private void updateWebsitesCrypto() {
        this.updateChangedCurrency();
    }//end updateWebsitesCrypto()

    /* Public */

    // Getters

    /**
     * Gets the list of websites of URLs to hit
     * @return The list of websites of URLs to hit
     */
    @Override
    public ArrayList<APICallerInterface> getWebsiteList() { return this.websiteList; }//end getWebsiteList()

    /**
     * {@inheritDoc}
     */
    @Override
    public FiatCurrencies getCurrentFiat() {
        return this.currentFiat;
    }//end getCurrentFiat()

    /**
     * {@inheritDoc}
     */
    @Override
    public CryptoCurrencies getCurrentCrypto() {
        return this.currentCrypto;
    }//end getCurrentCrypto()

    // Other

    /**
     * The method to be run on a near-infinite loop to run the program
     */
    public void run() {
      
        while(true) {
            // System.out.println("Current window location: (" + this.mainWindow.getLocationX() + ", " + this.mainWindow.getLocationY() + ")");
        }//end while

    }//end run()

    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh() {
        super.checkConnection();
        if (!super.isConnected()) this.errorDisplay(Errors.NETWORK_CONNECTION);
        else this.updatePrices();
    }//end refresh()

    /**
     * Updates the prices displayed on the controller.
     * Calls on each of the websites to update their individual prices.
     */
    public void updatePrices() {
        for (final APICallerInterface website : this.websiteList) {
            new Thread(website::updatePriceAndNotify).start(); // Do this asynchronously
        }//end for websites
        //this.updateViewPrices();
    }//end updatePrices()

    /**
     * Updates the prices in the view
     */
    public void updateViewPrices() {
        this.mainWindow.updatePrices();
    }//end updateViewPrices()

    /**
     * {@inheritDoc}
     */
    @Override
    public void errorDisplay(final Errors error, final String name) {

        switch (error) {
            case NETWORK_CONNECTION:
                new NetworkErrorWindow(this, name);
                return;
        }//end switch
    }//end errorDisplay()

    /**
     * {@inheritDoc}
     */
    @Override
    public void errorDisplay(final Errors error) {

        switch (error) {
            case NETWORK_CONNECTION:
                new NetworkErrorWindow(this);
                return;
        }//end switch
    }//end errorDisplay()

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateFiatCurrency(final FiatCurrencies fiatCurrency) {
        this.currentFiat = fiatCurrency;
        this.updateWebsiteFiat();
    }//end updateFiatCurrency()

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateCryptocurrency(final CryptoCurrencies cryptoCurrency) {
        this.currentCrypto = cryptoCurrency;
        this.updateWebsitesCrypto();
    }//end updateCryptocurrency()

    /**
     * {@inheritDoc}
     */
    @Override
    public void notifyWindowOfUpdate() {
        this.updateViewPrices();
    }//end notifyWindowOfUpdate()
}//end MainController
