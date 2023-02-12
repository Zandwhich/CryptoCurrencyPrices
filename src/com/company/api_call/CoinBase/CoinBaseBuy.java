package com.company.api_call.CoinBase;

import com.company.api_call.APICallerContract;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.tool.exception.currency_not_supported.CryptoCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.FiatCurrencyNotSupported;

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
                "Buy",
                cryptoCurrency == null || fiatCurrency == null ?
                        null :
                        cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() +
                                CoinBaseBuy.BUY_EXT,
                controller);
    }

    /**
     * {@inheritDoc}
     * </p>
     * In addition, it also updates the endpoint for the CoinBase calls
     * @param cryptoCurrency The cryptocurrency to be used for this endpoint
     */
    @Override
    public void setCryptoCurrency(final CryptoCurrencies cryptoCurrency) throws CryptoCurrencyNotSupported {
        super.setCryptoCurrency(cryptoCurrency);
        super.updateUrlWithNewExtension(cryptoCurrency == null ?
                null :
                cryptoCurrency.getAbbreviatedName() + "-" + super.getCurrentFiatCurrency().getAbbreviatedName() +
                        CoinBaseBuy.BUY_EXT);
    }

    /**
     * {@inheritDoc}
     * </p>
     * In addition, it also updates the endpoint for the CoinBase calls
     * @param fiatCurrency The fiat currency to be used for this endpoint
     */
    @Override
    public void setFiatCurrency(final FiatCurrencies fiatCurrency) throws FiatCurrencyNotSupported {
        super.setFiatCurrency(fiatCurrency);
        super.updateUrlWithNewExtension(fiatCurrency == null ?
                null :
                super.getCurrentCryptoCurrency().getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() +
                        CoinBaseBuy.BUY_EXT);
    }
}
