package com.company.view.window.windows.main_window;

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
     * Update the fiat currency and cryptocurrency dropdowns to reflect the current crypto selected
     */
    void updateDropdowns();
}
