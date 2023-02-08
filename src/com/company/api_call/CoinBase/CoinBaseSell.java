package com.company.api_call.CoinBase;

import com.company.api_call.APICallerContract;
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
                       final APICallerContract controller) {
        super(cryptoCurrency, fiatCurrency,
                "Sell", cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() +
                        CoinBaseSell.SELL_EXT,
                controller);
    }

    /**
     * {@inheritDoc}
     * </p>
     * In addition, it also updates the endpoint for the CoinBase calls
     * @param cryptoCurrency The cryptocurrency to be used for this endpoint
     */
    @Override
    public void setCryptoCurrency(final CryptoCurrencies cryptoCurrency) {
        super.setCryptoCurrency(cryptoCurrency);
        super.updateUrlWithNewExtension(cryptoCurrency.getAbbreviatedName() + "-" +
                super.getCurrentFiatCurrency().getAbbreviatedName() + CoinBaseSell.SELL_EXT);
    }

    /**
     * {@inheritDoc}
     * </p>
     * In addition, it also updates the endpoint for the CoinBase calls
     * @param fiatCurrency The fiat currency to be used for this endpoint
     */
    @Override
    public void setFiatCurrency(final FiatCurrencies fiatCurrency) {
        super.setFiatCurrency(fiatCurrency);
        super.updateUrlWithNewExtension(super.getCurrentCryptoCurrency().getAbbreviatedName() + "-" +
                fiatCurrency.getAbbreviatedName() + CoinBaseSell.SELL_EXT);
    }

}
