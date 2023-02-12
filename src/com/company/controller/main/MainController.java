package com.company.controller.main;

import com.company.api_call.APICallerInterface;
import com.company.api_call.CoinBase.AbstractCoinBase;
import com.company.api_call.CoinBase.CoinBaseBuy;
import com.company.api_call.CoinBase.CoinBaseSell;
import com.company.api_call.CoinBase.CoinBaseSpot;
import com.company.api_call.CoinCap.CoinCap;
import com.company.api_call.CryptoCompare.CryptoCompare;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.Errors;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.controller.AbstractController;
import com.company.view.window.about.AboutJFrameWindow;
import com.company.view.window.error.network_error.NetworkErrorWindow;
import com.company.view.window.main.MainJFrameWindow;
import com.company.view.window.main.MainWindowInterface;

import java.util.ArrayList;
import java.util.stream.Collectors;

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
    private final ArrayList<APICallerInterface> endpointList = new ArrayList<>();

    /**
     * The currently selected fiat currency
     */
    private FiatCurrencies currentFiat = FiatCurrencies.EUR;

    /**
     * The currently selected cryptocurrency
     */
    private CryptoCurrencies currentCrypto = CryptoCurrencies.LTC;

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

        // Get the dropdown to display the default currencies
        this.mainWindow.updateDropdowns(this.currentCrypto, this.currentFiat);

        // TODO: Work to be done in the refactor_api_calls branch: update this so that if the endpoint doesn't accept
        //       the starting currencies, it gets its currencies set to null
        /* CoinBase */
        if (AbstractCoinBase.endpointCanUseCryptoCurrency(this.currentCrypto) &&
                AbstractCoinBase.endpointCanUseFiatCurrency(this.currentFiat)) {
            endpointList.add(new CoinBaseBuy(this.currentCrypto, this.currentFiat, this));
            endpointList.add(new CoinBaseSell(this.currentCrypto, this.currentFiat, this));
            endpointList.add(new CoinBaseSpot(this.currentCrypto, this.currentFiat, this));
        } else {
            endpointList.add(new CoinBaseBuy(null, null, this));
            endpointList.add(new CoinBaseSell(null, null, this));
            endpointList.add(new CoinBaseSell(null, null, this));
        }

        /* CoinMarketCap */
        // endpointList.add(new CoinMarketCap(this.currentCrypto, this.currentFiat, this));

        /* CoinCap */
        if (CoinCap.endpointCanUseCryptoCurrency(this.currentCrypto) &&
                CoinCap.endpointCanUseFiatCurrency(this.currentFiat)) {
            endpointList.add(new CoinCap(this.currentCrypto, this.currentFiat, this));
        } else {
            endpointList.add(new CoinCap(null, null, this));
        }

        /* CryptoCompare */
        if (CryptoCompare.endpointCanUseCryptoCurrency(this.currentCrypto) &&
                CryptoCompare.endpointCanUseFiatCurrency(this.currentFiat)) {
            endpointList.add(new CryptoCompare(this.currentCrypto, this.currentFiat, this));
        } else {
            endpointList.add(new CryptoCompare(null, null, this));
        }

        this.mainWindow.setEndpoints(
                endpointList
                        .stream()
                        .map(APICallerInterface::getName)
                        .collect(Collectors.toList()));

        this.refresh();
    }


    /* ************ *
     *    Methods   *
     * ************ */

    /**
     * Because the logic for changing either cryptocurrency or fiat currency is the same, have one method
     * that both methods call
     */
    private void updateChangedCurrency() {
        for (final APICallerInterface website : this.endpointList) {
            if (website.canUseCryptoCurrency(this.currentCrypto) && website.canUseFiatCurrency(this.currentFiat)) {
                website.setCryptoCurrency(this.currentCrypto);
                website.setFiatCurrency(this.currentFiat);
                website.setActive(true);
            } else {
                // TODO: Should I set the currencies to null in this instance?
                website.setCryptoCurrency(null);
                website.setFiatCurrency(null);
                website.setActive(false);
            }
        }

        this.refresh();
    }

    /**
     * Changes the fiat currency that is being used in each of the endpoints
     */
    private void updateWebsiteFiat() {
        new Thread(this::updateChangedCurrency).start();
    }

    /**
     * Changes the cryptocurrency that is being used in each of the endpoints
     */
    private void updateWebsitesCrypto() {
        new Thread(this::updateChangedCurrency).start();
    }

    @Override
    public ArrayList<APICallerInterface> getEndpointList() { return this.endpointList; }

    @Override
    public FiatCurrencies getCurrentFiat() {
        return this.currentFiat;
    }

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

    @Override
    public void refresh() {
        super.checkConnection();
        if (!super.isConnected()) this.errorDisplay(Errors.NETWORK_CONNECTION);
        else this.updatePrices();
    }

    @Override
    public void updatePrices() {
        for (final APICallerInterface website : this.endpointList) {
            new Thread(website::updatePriceAndNotify).start();
        }

        // this.updateViewPrices();
    }

    @Override
    public void updatePrice(final String name, final double price, final boolean hasSucceeded) {
        this.mainWindow.updatePrice(name, price, hasSucceeded);
    }

    /**
     * Updates the prices in the view
     */
    public void updateViewPrices() {
        this.mainWindow.updatePrices();
    }

    @Override
    public void errorDisplay(final Errors error, final String name) {

        switch (error) {
            case NETWORK_CONNECTION:
                new NetworkErrorWindow(this, name);
                return;
        }
    }

    @Override
    public void errorDisplay(final Errors error) {

        switch (error) {
            case NETWORK_CONNECTION:
                new NetworkErrorWindow(this);
                return;
        }
    }

    @Override
    public void updateFiatCurrency(final FiatCurrencies fiatCurrency) {
        this.currentFiat = fiatCurrency;
        this.updateWebsiteFiat();
    }

    @Override
    public void updateCryptocurrency(final CryptoCurrencies cryptoCurrency) {
        this.currentCrypto = cryptoCurrency;
        this.updateWebsitesCrypto();
    }

    @Override
    public void notifyWindowOfUpdate() {
        this.updateViewPrices();
    }

    @Override
    public void aboutPagePopUp() {
        new AboutJFrameWindow();
    }

}
