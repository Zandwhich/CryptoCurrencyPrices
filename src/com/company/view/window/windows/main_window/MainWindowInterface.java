package com.company.view.window.windows.main_window;

import com.company.view.window.WindowInterface;

/**
 * TODO: Fill this out
 */
public interface MainWindowInterface extends WindowInterface {

    /**
     * Refreshes the page with the newest cryptocurrency rates
     */
    void refresh();

    /**
     * TODO: Fill in
     */
    void updatePrices();

    /**
     * Update the fiat currency and cryptocurrency dropdowns to reflect the current crypto selected
     */
    void updateDropdowns();
}
