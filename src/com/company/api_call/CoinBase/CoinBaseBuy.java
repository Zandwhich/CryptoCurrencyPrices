package com.company.api_call.CoinBase;

import com.company.api_call.APICallerContract;
import com.company.tools.enums.currency.CryptoCurrencies;
import com.company.tools.enums.currency.FiatCurrencies;

/**
 * The implementation of the CoinBase API that hits the 'buy' endpoint
 */
final public class CoinBaseBuy extends AbstractCoinBase {

    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The url extension that hits the buy endpoint at CoinBase
     */
    private static final String BUY_EXT = "/buy";


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor the buy endpoint for CoinBase
     * @param cryptoCurrency The cryptocurrency in the endpoint
     * @param fiatCurrency The fiat currency in the endpoint
     * @param controller The controller that implements the required methods
     */
    public CoinBaseBuy(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                       final APICallerContract controller) {
        super(cryptoCurrency, fiatCurrency,
                "Buy: " + cryptoCurrency.getAbbreviatedName() + "/" + fiatCurrency.getAbbreviatedName(),
                cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() +
                        CoinBaseBuy.BUY_EXT,
                controller);
    }

}
