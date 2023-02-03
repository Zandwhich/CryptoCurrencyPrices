package com.company.api_calls.CoinBase;

import com.company.api_calls.JSONCallerContract;
import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.currency.FiatCurrencies;

/**
 * The implementation for the sell endpoint for CoinBase
 */
final public class CoinBaseSell extends AbstractCoinBase {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The url extension that hits the sell endpoint at CoinBase
     */
    private final static String SELL_EXT = "/sell";


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor the buy endpoint for CoinBase
     * @param cryptoCurrency The cryptocurrency in the endpoint
     * @param fiatCurrency The fiat currency in the endpoint
     * @param controller The controller that implements the required methods
     */
    public CoinBaseSell(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                       final JSONCallerContract controller) {
        super(cryptoCurrency, fiatCurrency,
                "Sell: " + cryptoCurrency.getAbbreviatedName() + "/" + fiatCurrency.getAbbreviatedName(),
                cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() +
                        CoinBaseSell.SELL_EXT,
                controller);
    }

}
