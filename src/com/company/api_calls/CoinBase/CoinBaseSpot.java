package com.company.api_calls.CoinBase;

import com.company.api_calls.JSONCallerContract;
import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.currency.FiatCurrencies;

/**
 * The implementation for the spot endpoint in CoinBase
 */
final public class CoinBaseSpot extends AbstractCoinBase {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The url extension that hits the spot endpoint at CoinBase
     */
    private final static String SPOT_EXT = "/spot";


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor the buy endpoint for CoinBase
     * @param cryptoCurrency The cryptocurrency in the endpoint
     * @param fiatCurrency The fiat currency in the endpoint
     * @param controller The controller that implements the required methods
     */
    public CoinBaseSpot(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                        final JSONCallerContract controller) {
        super(cryptoCurrency, fiatCurrency,
                "Spot: " + cryptoCurrency.getAbbreviatedName() + "/" + fiatCurrency.getAbbreviatedName(),
                cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() +
                        CoinBaseSpot.SPOT_EXT,
                controller);
    }

}
