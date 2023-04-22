package com.company.controller.main;

import com.company.api_call.APICallerInterface;
import com.company.api_call.CoinBase.CoinBaseBuy;
import com.company.api_call.CoinBase.CoinBaseSell;
import com.company.api_call.CoinBase.CoinBaseSpot;
import com.company.api_call.CoinCap.CoinCap;
import com.company.api_call.CryptoCompare.CryptoCompare;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.Errors;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.controller.AbstractController;
import com.company.tool.exception.currency_not_supported.AbstractCurrencyNotSupported;
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

        /* CoinBase */
        try {
            endpointList.add(new CoinBaseBuy(this.currentCrypto, this.currentFiat, this));
            endpointList.add(new CoinBaseSell(this.currentCrypto, this.currentFiat, this));
            endpointList.add(new CoinBaseSpot(this.currentCrypto, this.currentFiat, this));
        } catch (final AbstractCurrencyNotSupported exception) {
            endpointList.add(new CoinBaseBuy(this));
            endpointList.add(new CoinBaseSell(this));
            endpointList.add(new CoinBaseSell(this));
        }

        /* CoinCap */
        try {
            endpointList.add(new CoinCap(this.currentCrypto, this.currentFiat, this));
        } catch (final AbstractCurrencyNotSupported exception) {
            endpointList.add(new CoinCap(this));
        }

        /* CryptoCompare */
        try {
            endpointList.add(new CryptoCompare(this.currentCrypto, this.currentFiat, this));
        } catch (final AbstractCurrencyNotSupported exception) {
            endpointList.add(new CryptoCompare(this));
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
     * </p>
     * TODO: Should we split this up into two functions: one for the cryptocurrency and one for the fiat currency?
     */
    private void updateChangedCurrency() {
        for (final APICallerInterface website : this.endpointList) {
            try {
                website.setCryptoCurrency(this.currentCrypto);
                website.setFiatCurrency(this.currentFiat);
                website.setActive(true);
            } catch (final AbstractCurrencyNotSupported e) {
                website.setCryptoCurrencyToNull();
                website.setFiatCurrencyToNull();
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
            website.updatePriceAndNotify();
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
