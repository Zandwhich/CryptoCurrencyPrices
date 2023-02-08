package com.company.controller.main;

import com.company.api_call.APICallerInterface;
import com.company.api_call.CoinBase.AbstractCoinBase;
import com.company.api_call.CoinBase.CoinBaseBuy;
import com.company.api_call.CoinBase.CoinBaseSell;
import com.company.api_call.CoinBase.CoinBaseSpot;
import com.company.api_call.CoinCap.CoinCap;
import com.company.api_call.CryptoCompare.CryptoCompare;
import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.Errors;
import com.company.tools.enums.currency.FiatCurrencies;
import com.company.controller.AbstractController;
import com.company.view.window.about.AboutJFrameWindow;
import com.company.view.window.error.network_error.NetworkErrorWindow;
import com.company.view.window.main.MainJFrameWindow;
import com.company.view.window.main.MainWindowInterface;

import java.util.ArrayList;

/**
 * The main controller of the application which controls the main page
 */
final public class MainController extends AbstractController implements MainControllerInterface {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The list of all the API endpoints
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
    private final MainWindowInterface mainWindow = new MainJFrameWindow(this);


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor for the MainController
     */
    public MainController() {

        /* CoinBase */
        if (AbstractCoinBase.endpointCanUseCryptoCurrency(this.currentCrypto) &&
                AbstractCoinBase.endpointCanUseFiatCurrency(this.currentFiat)) {
            websiteList.add(new CoinBaseBuy(this.currentCrypto, this.currentFiat, this));
            websiteList.add(new CoinBaseSell(this.currentCrypto, this.currentFiat, this));
            websiteList.add(new CoinBaseSpot(this.currentCrypto, this.currentFiat, this));
        }

        /* CoinMarketCap */
        // websiteList.add(new CoinMarketCap(this.currentCrypto, this.currentFiat, this));

        /* CoinCap */
        if (CoinCap.endpointCanUseCryptoCurrency(this.currentCrypto) &&
                CoinCap.endpointCanUseFiatCurrency(this.currentFiat)) {
            websiteList.add(new CoinCap(this.currentCrypto, this.currentFiat, this));
        }

        /* CryptoCompare */
        if (CryptoCompare.endpointCanUseCryptoCurrency(this.currentCrypto) &&
                CryptoCompare.endpointCanUseFiatCurrency(this.currentFiat)) {
            websiteList.add(new CryptoCompare(this.currentCrypto, this.currentFiat, this));
        }

        // this.refresh();

        // Get the dropdown to display the default currencies
        this.mainWindow.updateDropdowns();
    }


    /* ************ *
     *    Methods   *
     * ************ */

    /**
     * Because the logic for changing either cryptocurrency or fiat currency is the same, have one method
     * that both methods call
     */
    private void updateChangedCurrency() {
        for (final APICallerInterface website : this.websiteList) {
            if (website.canUseCryptoCurrency(this.currentCrypto) && website.canUseFiatCurrency(this.currentFiat)) {
                website.setCryptoCurrency(this.currentCrypto);
                website.setFiatCurrency(this.currentFiat);
                website.setActive(true);
            } else {
                // TODO: Should I set the currencies to null in this instance?
                website.setActive(false);
            }
        }

        this.refresh();
    }

    /**
     * Changes the fiat currency that is being used in each of the endpoints
     */
    private void updateWebsiteFiat() {
        this.updateChangedCurrency();
    }

    /**
     * Changes the cryptocurrency that is being used in each of the endpoints
     */
    private void updateWebsitesCrypto() {
        this.updateChangedCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ArrayList<APICallerInterface> getWebsiteList() { return this.websiteList; }

    /**
     * {@inheritDoc}
     */
    @Override
    public FiatCurrencies getCurrentFiat() {
        return this.currentFiat;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CryptoCurrencies getCurrentCrypto() {
        return this.currentCrypto;
    }

    /**
     * The method to be run on a near-infinite loop to run the program
     */
    public void run() {
      
        while (true) {
            // System.out.println("Current window location: (" + this.mainWindow.getLocationX() + ", " + this.mainWindow.getLocationY() + ")");
        }

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void refresh() {
        super.checkConnection();
        if (!super.isConnected()) this.errorDisplay(Errors.NETWORK_CONNECTION);
        else this.updatePrices();
    }

    /**
     * Updates the prices displayed on the controller.
     * Calls on each of the websites to update their individual prices.
     */
    public void updatePrices() {
        for (final APICallerInterface website : this.websiteList) {
            if (website.isActive()) new Thread(website::updatePriceAndNotify).start();
        }

        // this.updateViewPrices();
    }

    /**
     * Updates the prices in the view
     */
    public void updateViewPrices() {
        this.mainWindow.updatePrices();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void errorDisplay(final Errors error, final String name) {

        switch (error) {
            case NETWORK_CONNECTION:
                new NetworkErrorWindow(this, name);
                return;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void errorDisplay(final Errors error) {

        switch (error) {
            case NETWORK_CONNECTION:
                new NetworkErrorWindow(this);
                return;
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateFiatCurrency(final FiatCurrencies fiatCurrency) {
        this.currentFiat = fiatCurrency;
        this.updateWebsiteFiat();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateCryptocurrency(final CryptoCurrencies cryptoCurrency) {
        this.currentCrypto = cryptoCurrency;
        this.updateWebsitesCrypto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void notifyWindowOfUpdate() {
        this.updateViewPrices();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void aboutPagePopUp() {
        new AboutJFrameWindow();
    }

}
