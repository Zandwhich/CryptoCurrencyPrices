package com.company.view.window.main;

import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.view.window.WindowInterface;

/**
 * The intractable interface for the main window
 */
public interface MainWindowInterface extends WindowInterface {

    /**
     * Fetches the latest prices and updates the window with the new prices
     */
    void updatePrices();

    /**
     * Updates a single endpoint's price and success icon
     * @param name The name of the endpoint (used to identify the endpoint in the table)
     * @param price The new price of the endpoint
     * @param hasSucceeded If the call to update the price succeeded or not
     */
    void updatePrice(final String name, final double price, final boolean hasSucceeded);

    /**
     * Sets the endpoints that this table will have. (This is normally done at the beginning of the program.)
     * @param endpointNames This list of the names of the endpoints. These will be the names that they will be
     *                      referenced when updating them in the future.
     */
    void setEndpoints(final Iterable<String> endpointNames);

    /**
     * Update the fiat currency and cryptocurrency dropdowns to reflect the current crypto selected
     * @param currentCrypto The current cryptocurrency selected
     * @param currentFiat The current fiat currency selected
     */
    void updateDropdowns(final CryptoCurrencies currentCrypto, final FiatCurrencies currentFiat);

}
