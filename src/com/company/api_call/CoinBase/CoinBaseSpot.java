package com.company.api_call.CoinBase;

import com.company.api_call.APICallerContract;
import com.company.tool.enums.currency.CryptoCurrencies;
import com.company.tool.enums.currency.FiatCurrencies;
import com.company.tool.exception.currency_not_supported.AbstractCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.CryptoCurrencyNotSupported;
import com.company.tool.exception.currency_not_supported.FiatCurrencyNotSupported;

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
                        final APICallerContract controller)
            throws CryptoCurrencyNotSupported, FiatCurrencyNotSupported {
        super(cryptoCurrency, fiatCurrency, "Spot", CoinBaseSpot.urlBuilder(cryptoCurrency, fiatCurrency),
                controller);
    }

    /**
     * The constructor for CoinBaseSpot when a cryptocurrency and a fiat currency aren't specified (most likely when
     * the currency is not supported for the given endpoint)
     * @param controller The controller that implements the required methods
     */
    public CoinBaseSpot(final APICallerContract controller) {
        super("Spot", CoinBaseSpot.urlBuilder(null, null), controller);
    }


    /* ************ *
     *   Methods    *
     * ************ */

    /**
     * A function through which to create the URL for the given currency outside the constructor
     * @param cryptoCurrency The cryptocurrency
     * @param fiatCurrency The fiat currency
     * @return The url to be used for the endpoint
     */
    public static String urlBuilder(final CryptoCurrencies cryptoCurrency, final FiatCurrencies fiatCurrency) {
        return cryptoCurrency == null || fiatCurrency == null ?
                null :
                cryptoCurrency.getAbbreviatedName() + "-" + fiatCurrency.getAbbreviatedName() + CoinBaseSpot.SPOT_EXT;
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
                        CoinBaseSpot.SPOT_EXT);
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
                        CoinBaseSpot.SPOT_EXT);
    }

}
