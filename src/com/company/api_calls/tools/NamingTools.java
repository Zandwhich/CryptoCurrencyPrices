package com.company.api_calls.tools;

import com.sun.istack.internal.NotNull;
import static com.company.api_calls.tools.FiatCurrencies.*;
import static com.company.api_calls.tools.CryptoCurrencies.*;

/**
 * TODO: Fill in
 */
public class NamingTools {

    /****************
     *    Fields    *
     ****************/

    /* Fiat Currencies */

    /**
     * All of the fiat currencies that CoinBase supports (https://api.coinbase.com/v2/currencies)
     */
    public static final FiatCurrencies[] COINBASE_FIAT_CURRENCIES = {AED, AFN, ALL, AMD, ANG, AOA, ARS, AUD, AWG, AZN,
            BAM, BBD, BDT, BGN, BHD, BIF, BMD, BND, BOB, BRL, BSD, BTN, BWP, BYN, BYR, BZD, CAD, CDF, CHF, CLF, CLP,
            CNH, CNY, COP, CRC, CUC, CVE, CZK, DJF, DKK, DOP, DZD, EEK, EGP, ERN, ETB, EUR, FJD, JEP, JMD, JOD, JPY,
            KES, KGS, KHR, KMF, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LRD, LSL, LTL, LVL, LYD, MAD, MDL, MGA, MKD, MMK,
            MNT, MOP, MRO, MTL, MUR, MVR, MWK, MXN, MYR, MZN, NAD, NGN, NIO, NOK, NPR, NZD, OMR, PAB, PEN, PGK, PHP,
            PKR, PLN, PYG, QAR, RON, RSD, RUB, RWF, SAR, SBD, SCR, SEK, SGD, SHP, SLL, SOS, SRD, SSP, STD, SVC, SZL,
            THB, TJS, TMT, TND, TOP, TRY, TTD, TWD, TZS, UAH, UGX, USD, UYU, UZS, VEF, VND, VUV, WST, XAF, XAG, XAU,
            XCD, XDR, XOF, XPD, XPF, XPT, YER, ZAR, ZMK, ZMW, ZWL};

    /**
     * All of the fiat currencies that CoinCap supports (http://coincap.io/page/ETC)
     */
    public static final FiatCurrencies[] COINCAP_FIAT_CURRENCIES = {FiatCurrencies.BTC, FiatCurrencies.ETH, EUR,
            FiatCurrencies.LTC, USD, FiatCurrencies.ZEC};

    /**
     * All of the fiat currencies that CoinMarketCap supports (TODO: Put useful URL here)
     */
    // TODO: Actually fill in
    public static final FiatCurrencies[] COINMARKETCAP_FIAT_CURRENCIES = {};

    /**
     * All of the fiat currencies that CryptoCompare supports (TODO: Put useful URL here)
     */
    // TODO: Actually fill in
    public static final FiatCurrencies[] CRYPTOCOMPARE_FIAT_CURRENCIES = {};

    /**
     * All of the fiat currencies that Liqui supports (TODO: Put useful URL here)
     */
    // TODO: Actually fill in
    public static final FiatCurrencies[] LIQUI_FIAT_CURRENCIES = {};

    /**
     * All of the fiat currencies that Quadrigacx supports (TODO: Put useful URL here)
     */
    // TODO: Actually fill in
    public static final FiatCurrencies[] QUADRIGACX_FIAT_CURRENCIES = {};

    /**
     * All of the fiat currencies that ShapeShift supports (TODO: Put useful URL here)
     */
    // TODO: Actually fill in
    public static final FiatCurrencies[] SHAPESHIFT_FIAT_CURRENCIES = {};

    /* Crypto Currencies */

    /**
     * All of the cryptocurrencies that CoinBase supports
     * (https://support.coinbase.com/customer/en/portal/articles/2630943-supported-digital-currencies)
     */
    public static final CryptoCurrencies[] COINBASE_CRYPTO_CURRENCIES = {BCH, CryptoCurrencies.BTC,
            CryptoCurrencies.ETH, CryptoCurrencies.LTC};

    /**
     * All of the cryptocurrencies that CoinCap supports (http://coincap.io/map)
     */
    // TODO: Actually fill in
    public static final CryptoCurrencies[] COINCAP_CRYPTO_CURRENCIES = {};

    /**
     * All of the cryptocurrencies that CoinMarketCap supports (TODO: Put useful URL here)
     */
    // TODO: Actually fill in
    public static final CryptoCurrencies[] COINMARKETCAP_CRYPTO_CURRENCIES = {};

    /**
     * All of the cryptocurrencies that CryptoCompare supports (TODO: Put useful URL here)
     */
    // TODO: Actually fill in
    public static final CryptoCurrencies[] CRYPTOCOMPARE_CRYPTO_CURRENCIES = {};

    /**
     * All of the cryptocurrencies that Liqui supports (TODO: Put useful URL here)
     */
    // TODO: Actually fill in
    public static final CryptoCurrencies[] LIQUI_CRYPTO_CURRENCIES = {};

    /**
     * All of the cryptocurrencies that Quadrigacx supports (TODO: Put useful URL here)
     */
    // TODO: Actually fill in
    public static final CryptoCurrencies[] QUADRIGACX_CRYPTO_CURRENCIES = {};

    /**
     * All of the cryptocurrencies that ShapeShift supports (TODO: Put useful URL here)
     */
    // TODO: Actually fill in
    public static final CryptoCurrencies[] SHAPESHIFT_CRYPTO_CURRENCIES = {};

    /****************
     *   Methods    *
     ****************/

    // Full Names

    /**
     * TODO: Fill in
     * @param fiatCurrency
     * @return
     */
    public static String fullName(@NotNull FiatCurrencies fiatCurrency) {
        switch (fiatCurrency) {
            case AED:
                return "United Arab Emirates Dirham";
            case AFN:
                return "Afghan Afghani";
            case ALL:
                return "Albanian Lek";
            case AMD:
                return "Armenian Dram";
            case ANG:
                return "Netherlands Antillean Gulden";
            case AOA:
                return "Angolan Kwanza";
            case ARS:
                return "Argentine Peso";
            case AUD:
                return "Australian Dollar";
            case AWG:
                return "Aruban Florin";
            case AZN:
                return "Azerbaijani Manat";
            case BAM:
                return "Bosnia and Herzegovina Convertible Mark";
            case BBD:
                return "Barbadian Dollar";
            case BDT:
                return "Bangladeshi Taka";
            case BGN:
                return "Bulgarian Lev";
            case BHD:
                return "Bahraini Dinar";
            case BIF:
                return "Burundian Franc";
            case BMD:
                return "Bermudian Dollar";
            case BND:
                return "Brunei Dollar";
            case BOB:
                return "Bolivian Boliviano";
            case BRL:
                return "Brazilian Real";
            case BSD:
                return "Bahamian Dollar";
            case BTC:
                return "Bitcoin";
            case BTN:
                return "Bhutanese Ngultrum";
            case BWP:
                return "Botswana Pula";
            case BYN:
                return "Belarusian Ruble (BYN)";
            case BYR:
                return "Belarusian Ruble (BYR)";
            case BZD:
                return "Belize Dollar";
            case CAD:
                return "Canadian Dollar";
            case CDF:
                return "Congolese Franc";
            case CHF:
                return "Swiss Franc";
            case CLF:
                return "Unidad de Fomento";
            case CLP:
                return "Chilean Peso";
            case CNH:
                return "Chinese Renminbi Yuan Offshore";
            case CNY:
                return "Chinese Renminbi Yuan";
            case COP:
                return "Colombian Peso";
            case CRC:
                return "Costa Rican Colón";
            case CUC:
                return "Cuban Convertible Peso";
            case CVE:
                return "Cape Verdean Escudo";
            case CZK:
                return "Czech Koruna";
            case DJF:
                return "Djiboutian Franc";
            case DKK:
                return "Danish Krone";
            case DOP:
                return "Dominican Peso";
            case DZD:
                return "Algerian Dinar";
            case EEK:
                return "Estonian Kroon";
            case EGP:
                return "Egyptian Pound";
            case ERN:
                return "Eritrean Nakfa";
            case ETB:
                return "Ethiopian Birr";
            case EUR:
                return "Euro";
            case FJD:
                return "Fijian Dollar";
            case FKP:
                return "Falkland Pound";
            case GBP:
                return "British Pound";
            case GEL:
                return "Georgian Lari";
            case GGP:
                return "Guernsey Pound";
            case GHS:
                return "Ghanaian Cedi";
            case GIP:
                return "Gibraltar Pound";
            case GMD:
                return "Gambian Dalasi";
            case GNF:
                return "Guinean Franc";
            case GTQ:
                return "Guatemalan Quetzal";
            case GYD:
                return "Guyanese Dollar";
            case HKD:
                return "Hong Kong Dollar";
            case HNL:
                return "Honduran Lempira";
            case HRK:
                return "Croatian Kuna";
            case HTG:
                return "Haitian Gourde";
            case HUF:
                return "Hungarian Forint";
            case IDR:
                return "Indonesian Rupiah";
            case ILS:
                return "Israeli New Sheqel";
            case IMP:
                return "Isle of Man Pound";
            case INR:
                return "Indian Rupee";
            case IQD:
                return "Iraqi Dinar";
            case ISK:
                return "Icelandic Króna";
            case JEP:
                return "Jersey Pound";
            case JMD:
                return "Jamaican Dollar";
            case JOD:
                return "Jordanian Dinar";
            case JPY:
                return "Japanese Yen";
            case KES:
                return "Kenyan Shilling";
            case KGS:
                return "Kyrgyzstani Som";
            case KHR:
                return "Cambodian Riel";
            case KMF:
                return "Comorian Franc";
            case KRW:
                return "South Korean Won";
            case KWD:
                return "Kuwaiti Dinar";
            case KYD:
                return "Cayman Islands Dollar";
            case KZT:
                return "Kazakhstani Tenge";
            case LAK:
                return "Lao Kip";
            case LBP:
                return "Lebanese Pound";
            case LKR:
                return "Sri Lankan Rupee";
            case LRD:
                return "Liberian Dollar";
            case LSL:
                return "Lesotho Loti";
            case LTL:
                return "Lithuanian Litas";
            case LVL:
                return "Latvian Lats";
            case LYD:
                return "Libyan Dinar";
            case MAD:
                return "Moroccan Dirham";
            case MDL:
                return "Moldovan Leu";
            case MGA:
                return "Malagasy Ariary";
            case MKD:
                return "Macedonian Denar";
            case MMK:
                return "Myanmar Kyat";
            case MNT:
                return "Mongolian Tögrög";
            case MOP:
                return "Macanese Pataca";
            case MRO:
                return "Mauritanian Ouguiya";
            case MTL:
                return "Maltese Lira";
            case MUR:
                return "Mauritian Rupee";
            case MVR:
                return "Maldivian Rufiyaa";
            case MWK:
                return "Malawian Kwacha";
            case MXN:
                return "Mexican Peso";
            case MYR:
                return "Malaysian Ringgit";
            case MZN:
                return "Mozambican Metical";
            case NAD:
                return "Namibian Dollar";
            case NGN:
                return "Nigerian Naira";
            case NIO:
                return "Nicaraguan Córdoba";
            case NOK:
                return "Norwegian Krone";
            case NPR:
                return "Nepalese Rupee";
            case NZD:
                return "New Zealand Dollar";
            case OMR:
                return "Omani Rial";
            case PAB:
                return "Panamanian Balboa";
            case PEN:
                return "Peruvian Sol";
            case PGK:
                return "Papua New Guinean Kina";
            case PHP:
                return "Philippine Peso";
            case PKR:
                return "Pakistani Rupee";
            case PLN:
                return "Polish Złoty";
            case PYG:
                return "Paraguayan Guaraní";
            case QAR:
                return "Qatari Riyal";
            case RON:
                return "Romanian Leu";
            case RSD:
                return "Serbian Dinar";
            case RUB:
                return "Russian Ruble";
            case RWF:
                return "Rwandan Franc";
            case SAR:
                return "Saudi Riyal";
            case SBD:
                return "Solomon Islands Dollar";
            case SCR:
                return "Seychellois Rupee";
            case SEK:
                return "Swedish Krona";
            case SGD:
                return "Singapore Dollar";
            case SHP:
                return "Saint Helenian Pound";
            case SLL:
                return "Sierra Leonean Leone";
            case SOS:
                return "Somali Shilling";
            case SRD:
                return "Surinamese Dollar";
            case SSP:
                return "South Sudanese Pound";
            case STD:
                return "São Tomé and Príncipe Dobra";
            case SVC:
                return "Salvadoran Colón";
            case SZL:
                return "Swazi Lilangeni";
            case THB:
                return "Thai Baht";
            case TJS:
                return "Tajikistani Somoni";
            case TMT:
                return "Turkmenistani Manat";
            case TND:
                return "Tunisian Dinar";
            case TOP:
                return "Tongan Paʻanga";
            case TRY:
                return "Turkish Lira";
            case TTD:
                return "Trinidad and Tobago Dollar";
            case TWD:
                return "New Taiwan Dollar";
            case TZS:
                return "Tanzanian Shilling";
            case UAH:
                return "Ukrainian Hryvnia";
            case UGX:
                return "Ugandan Shilling";
            case USD:
                return "United States Dollar";
            case UYU:
                return "Uruguayan Peso";
            case UZS:
                return "Uzbekistan Som";
            case VEF:
                return "Venezuelan Bolívar";
            case VND:
                return "Vietnamese Đồng";
            case VUV:
                return "Vanuatu Vatu";
            case WST:
                return "Samoan Tala";
            case XAF:
                return "Central African Cfa Franc";
            case XAG:
                return "Silver (Troy Ounce)";
            case XAU:
                return "Gold (Troy Ounce)";
            case XCD:
                return "East Caribbean Dollar";
            case XDR:
                return "Special Drawing Rights";
            case XOF:
                return "West African Cfa Franc";
            case XPD:
                return "Palladium";
            case XPF:
                return "Cfp Franc";
            case XPT:
                return "Platinum";
            case YER:
                return "Yemeni Rial";
            case ZAR:
                return "South African Rand";
            case ZMK:
                return "Zambian Kwacha";
            case ZMW:
                return "Zambian Kwacha";
            case ZWL:
                return "Zimbabwean Dollar";
            default:
                return "N/A";
        }//end switch
    }//end fullName(FiatCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency
     * @return
     */
    public static String fullName(CryptoCurrencies cryptoCurrency) {
        switch(cryptoCurrency) {
            case BCH:
                return "Bitcoin Cash";
            case BTC:
                return "Bitcoin";
            case ETH:
                return "Ethereum";
            case LTC:
                return "Litecoin";
            case XRP:
                return "Ripple";
            default:
                return "N/A";
        }//end switch
    }//end fullName(CryptoCurrency)

    /* Is In */

    /**
     * TODO: Fill in
     * @param website
     * @param fiatCurrency
     * @return
     */
    public static boolean isInGivenFiat(FiatCurrencies[] website, @NotNull FiatCurrencies fiatCurrency) {
        for (FiatCurrencies currency : website) {
            if (fiatCurrency.equals(currency)) return true;
        }//end for
        return false;
    }//end isInGivenFiat()

    /**
     * TODO: Fill in
     * @param website
     * @param cryptoCurrency
     * @return
     */
    public static boolean isInGivenCrypto(CryptoCurrencies[] website, @NotNull CryptoCurrencies cryptoCurrency) {
        for (CryptoCurrencies currency : website) {
            if (cryptoCurrency.equals(currency)) return true;
        }//end for
        return false;
    }//end isInGivenCrypto()

    // Is In Fiats

    /**
     * TODO: Fill in
     * @param fiatCurrency
     * @return
     */
    public static boolean isInCoinBase(@NotNull FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.COINBASE_FIAT_CURRENCIES, fiatCurrency);
    }//end isInCoinBase(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency
     * @return
     */
    public static boolean isInCoinCap(@NotNull FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.COINCAP_FIAT_CURRENCIES, fiatCurrency);
    }//end isInCoinCap(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency
     * @return
     */
    public static boolean isInCoinMarketCap(@NotNull FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.COINMARKETCAP_FIAT_CURRENCIES, fiatCurrency);
    }//end isInCoinMarketCap(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency
     * @return
     */
    public static boolean isInCryptoCompare(@NotNull FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.CRYPTOCOMPARE_FIAT_CURRENCIES, fiatCurrency);
    }//end isInCryptoCompare(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency
     * @return
     */
    public static boolean isInLiqui(@NotNull FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.LIQUI_FIAT_CURRENCIES, fiatCurrency);
    }//end isInLiqui(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency
     * @return
     */
    public static boolean isInQuadrigacx(@NotNull FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.QUADRIGACX_FIAT_CURRENCIES, fiatCurrency);
    }//end isInQuadrigacx(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency
     * @return
     */
    public static boolean isInShapeShift(@NotNull FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.SHAPESHIFT_FIAT_CURRENCIES, fiatCurrency);
    }//end isInShapeShift(FiatCurrency)

    // Is In Crypto

    /**
     * TODO: Fill in
     * @param cryptoCurrency
     * @return
     */
    public static boolean isInCoinBase(@NotNull CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.COINBASE_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInCoinBase(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency
     * @return
     */
    public static boolean isInCoinCap(@NotNull CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.COINCAP_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInCoinCap(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency
     * @return
     */
    public static boolean isInCoinMarketCap(@NotNull CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.COINMARKETCAP_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInCoinMarketCap(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency
     * @return
     */
    public static boolean isInCryptoCompare(@NotNull CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.CRYPTOCOMPARE_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInCryptoCompare(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency
     * @return
     */
    public static boolean isInLiqui(@NotNull CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.LIQUI_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInLiqui(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency
     * @return
     */
    public static boolean isInQuadrigacx(@NotNull CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.QUADRIGACX_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInQuadrigacx(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency
     * @return
     */
    public static boolean isInShapeShift(@NotNull CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.SHAPESHIFT_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInShapeShift(CryptoCurrency)

    /* Get Names */

    // Get Fiat Names

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getCoinBaseCurrencyName(@NotNull FiatCurrencies currency) {
        if (!NamingTools.isInCoinBase(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinBase
        return currency.toString();
    }//end getCoinBaseCurrencyName(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getCoinCapCurrencyName(@NotNull FiatCurrencies currency) {
        if (!NamingTools.isInCoinCap(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinCap
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getCoinCapCurrencyName(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getCoinMarketCapCurrencyName(@NotNull FiatCurrencies currency) {
        if (!NamingTools.isInCoinMarketCap(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinMarketCap
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getCoinMarketCapCurrencyName(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getCryptoCompareCurrencyName(@NotNull FiatCurrencies currency) {
        if (!NamingTools.isInCryptoCompare(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CryptoCompare
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getCryptoCompareCurrencyName(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getLiquiCurrencyName(@NotNull FiatCurrencies currency) {
        if (!NamingTools.isInLiqui(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in Liqui
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getLiquiCurrencyName(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getQuadrigacxCurrencyName(@NotNull FiatCurrencies currency) {
        if (!NamingTools.isInQuadrigacx(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in Quadrigacx
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getQuadrigacxCurrencyName(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getShapeShiftCurrencyName(@NotNull FiatCurrencies currency) {
        if (!NamingTools.isInShapeShift(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in ShapeShift
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getShapeShiftCurrencyName(FiatCurrency)

    // Get Crypto Names

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getCoinBaseCurrencyName(@NotNull CryptoCurrencies currency) {
        if (!NamingTools.isInCoinBase(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinBase
        return currency.toString();
    }//end getCoinBaseCurrencyName(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getCoinCapCurrencyName(@NotNull CryptoCurrencies currency) {
        if (!NamingTools.isInCoinCap(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinCap
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getCoinCapCurrencyName(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getCoinMarketCapCurrencyName(@NotNull CryptoCurrencies currency) {
        if (!NamingTools.isInCoinMarketCap(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinMarketCap
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getCoinMarketCapCurrencyName(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getCryptoCompareCurrencyName(@NotNull CryptoCurrencies currency) {
        if (!NamingTools.isInCryptoCompare(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CryptoCompare
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getCryptoCompareCurrencyName(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getLiquiCurrencyName(@NotNull CryptoCurrencies currency) {
        if (!NamingTools.isInLiqui(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in Liqui
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getLiquiCurrencyName(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getQuadrigacxCurrencyName(@NotNull CryptoCurrencies currency) {
        if (!NamingTools.isInQuadrigacx(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in Quadrigacx
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getQuadrigacxCurrencyName(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency
     * @return
     */
    public static String getShapeShiftCurrencyName(@NotNull CryptoCurrencies currency) {
        if (!NamingTools.isInShapeShift(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in ShapeShift
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getShapeShiftCurrencyName(CryptoCurrency)

}//end NamingTools
