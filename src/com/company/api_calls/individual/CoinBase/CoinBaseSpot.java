package com.company.api_calls.individual.CoinBase;

import com.company.controller.ControllerInterface;
import com.company.tools.CryptoCurrencies;
import com.company.tools.FiatCurrencies;

/**
 * The implementation for the spot endpoint in CoinBase
 */
public class CoinBaseSpot extends AbstractCoinBase {

    /* ************ *
     *  Constants   *
     * ************ */

    /**
     * The url extension that hits the spot endpoint at CoinBase
     */
    private final static String SPOT_EXT = "/spot";


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
    public CoinBaseSpot(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency,
                        final ControllerInterface controller) {
        super(cryptoCurrency, fiatCurrency, "Spot: " + fiatCurrency.getAbbreviatedName() + "/" + cryptoCurrency.getAbbreviatedName(),
                cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() + CoinBaseSpot.SPOT_EXT,
                controller);
        this.urlExt = cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() + CoinBaseSpot.SPOT_EXT;
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

}//end CoinBaseSpot
