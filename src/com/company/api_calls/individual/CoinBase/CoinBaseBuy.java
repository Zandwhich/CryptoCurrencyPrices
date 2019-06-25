package com.company.api_calls.individual.CoinBase;

import com.company.controller.ControllerInterface;
import com.company.tools.CryptoCurrencies;
import com.company.tools.FiatCurrencies;

/**
 * The implementation of the CoinBase API that hits the 'buy' endpoint
 */
public class CoinBaseBuy extends AbstractCoinBase {

    /* ************ *
     *  Constants   *
     * ************ */

    /**
     * The url extension that hits the buy endpoint at CoinBase
     */
    private final static String BUY_EXT = "/buy";

    // BTC-USD/buy


    /* ************ *
     *    Fields    *
     * ************ */

    /**
     * The full url extension that is used
     */
    private String urlExt;


    /* ************ *
     * Constructors *
     * ************ */

    /**
     * The constructor the buy endpoint for CoinBase
     * @param cryptoCurrency The cryptocurrency in the endpoint
     * @param fiatCurrency The fiat currency in the endpoint
     * @param controller The controller
     */
    public CoinBaseBuy(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                       final ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, "Buy: " + fiatCurrency.getAbbreviatedName() + "/" + cryptoCurrency.getAbbreviatedName(),
                cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() + CoinBaseBuy.BUY_EXT,
                controller);
        this.urlExt = cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() + CoinBaseBuy.BUY_EXT;
    }//end CoinBaseBuy()


    /* ************ *
     *    Methods   *
     * ************ */

    /* Public */

    // Getters

    /**
     * {@inheritDoc}
     */
    @Override
    public String getUrlExt() {
        return this.urlExt;
    }

}//end CoinBaseBuy
