package com.company.api_calls.individual.CoinBase;

import com.company.controller.ControllerInterface;
import com.company.tools.CryptoCurrencies;
import com.company.tools.FiatCurrencies;

/**
 * The implementation for the sell endpoint for CoinBase
 */
public class CoinBaseSell extends AbstractCoinBase {

    /* ************ *
     *  Constants   *
     * ************ */

    /**
     * The url extension that hits the sell endpoint at CoinBase
     */
    private final static String SELL_EXT = "/sell";


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
    public CoinBaseSell(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                       final ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, "Sell: " + fiatCurrency.getAbbreviatedName() + "/" + cryptoCurrency.getAbbreviatedName(),
                cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() + CoinBaseSell.SELL_EXT,
                controller);
        this.urlExt = cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() + CoinBaseSell.SELL_EXT;
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
    }//end getUrlExt()

}//end CoinBaseSell