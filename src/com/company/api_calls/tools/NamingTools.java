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
    public static final FiatCurrencies[] COINBASE_FIAT_CURRENCIES = {AED, AFN, FiatCurrencies.ALL, AMD, ANG, AOA, ARS,
            AUD, AWG, AZN, BAM, BBD, BDT, BGN, BHD, BIF, BMD, BND, FiatCurrencies.BOB, BRL, FiatCurrencies.BSD, BTN,
            BWP, BYN, BYR, BZD, FiatCurrencies.CAD, CDF, CHF, CLF, CLP, CNH, CNY, COP, FiatCurrencies.CRC, CUC, CVE,
            CZK, DJF, DKK, DOP, DZD, EEK, EGP, ERN, ETB, FiatCurrencies.EUR, FJD, JEP, JMD, JOD, FiatCurrencies.JPY,
            KES, KGS, KHR, KMF, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LRD, LSL, LTL, LVL, LYD, FiatCurrencies.MAD, MDL,
            MGA, MKD, MMK, MNT, MOP, MRO, FiatCurrencies.MTL, MUR, MVR, MWK, MXN, MYR, MZN, NAD, NGN,
            FiatCurrencies.NIO, NOK, NPR, NZD, OMR, PAB, PEN, PGK, PHP, PKR, PLN, PYG, QAR, RON, RSD, RUB, RWF, SAR,
            FiatCurrencies.SBD, SCR, SEK, SGD, FiatCurrencies.SHP, SLL, SOS, SRD, FiatCurrencies.SSP, STD, SVC, SZL,
            THB, TJS, TMT, TND, TOP, TRY, TTD, TWD, TZS, UAH, UGX, FiatCurrencies.USD, UYU, UZS, VEF, VND, VUV, WST,
            XAF, XAG, XAU, XCD, XDR, XOF, FiatCurrencies.XPD, XPF, XPT, YER, ZAR, ZMK, ZMW, ZWL};

    /**
     * All of the fiat currencies that CoinCap supports (http://coincap.io/page/ETC)
     */
    public static final FiatCurrencies[] COINCAP_FIAT_CURRENCIES = {FiatCurrencies.BTC, FiatCurrencies.ETH, FiatCurrencies.EUR,
            FiatCurrencies.LTC, FiatCurrencies.USD, FiatCurrencies.ZEC};

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
    public static final CryptoCurrencies[] COINCAP_CRYPTO_CURRENCIES = {A0XBTC, A1ST, A1WO, A2GIVE, A300, A611, A808,
            A888, A8BIT, ABJ, ABJC, ABT, ABY, ABYSS, AC, AC3, ACAT, ACC, ACE, ACOIN, ACP, ACT, ADA, ADB, ADC, ADCN, ADH,
            ADI, ADL, ADST, ADT, ADX, ADZ, AE, AEON, AERM, AGI, AGLC, AGRS, AHT, AI, AIB, AID, AIDOC, AIO, AION, AIR,
            AIT, AIX, ALIS, CryptoCurrencies.ALL, ALQO, ALT, ALTCOM, ALX, AMB, AMBER, AMLT, AMM, AMMO, AMN, AMP, AMS,
            ANC, ANT, APH, APIS, APPC, APR, APX, ARB, ARC, ARCO, ARCT, ARDR, ARG, ARGUS, ARI, ARK, ARN, ART, ARY,
            ASAFE2, AST, ASTRO, ATB, ATL, ATM, ATMOS, ATMS, ATN, ATOM, ATS, ATX, AU, AUC, AUR, AURA, AUTO, AVA, AVT,
            AXP, B2B, BANCA, BANK, BAS, BASH, BAT, BAX, BAY, BBC, BBI, BBN, BBO, BBP, BBR, BBT, BCA, BCD, BCF, BCH, BCI,
            BCN, BCO, BCPT, BCY, BDG, BDL, BEE, BELA, BENJI, BERN, BERRY, BET, BETR, BEZ, BFT, BIGUP, BIO, BIOB, BIP,
            BIS, BITB, BITCNY, BITEUR, BITG, BITGOLD, BITS, BITSILVER, BITUSD, BITZ, BIX, BKX, BLAS, BLC, BLITZ, BLK,
            BLN, BLOCK, BLOCKPAY, BLT, BLU, BLUE, BLZ, BMC, BMX, BNB, BNT, BNTY, BNX, BOAT, CryptoCurrencies.BOB, BOLI,
            BON, BOS, BOST, BOT, BOUTS, BPC, BPL, BPT, BQ, BRAT, BRD, BRIA, BRIT, BRK, BRM, BRO, BRX, BSC,
            CryptoCurrencies.BSD, BSM, BSTAR, BSTN, BSTY, BTA, BTB, CryptoCurrencies.BTC, BTCA, BTCD, BTCP, BTCR,
            BTCRED, BTCS, BTCZ, BTDX, BTG, BTG2, BTM, BTM2, BTO, BTPL, BTQ, BTRN, BTS, BTW, BTWTY, BTX2, BUCKS, BUMBA,
            BUN, BURST, BUZZ, BWK, BXC, BXT, BYC, BZ, BZNT, C2, CAB, CACH, CryptoCurrencies.CAD, CAG, CALC, CAN, CANN,
            CAPP, CARBON, CAS, CASH, CAT, CAT2, CAZ, CBC, CBT, CBX, CCCX, CCN, CCO, CCRB, CCT, CDN, CDT, CDX, CEEK,
            CENNZ, CESC, CF, CFD, CFI, CFT, CFUN, CHAN, CHC, CHESS, CHIPS, CHP, CHSB, CHX, CJ, CJT, CL, CLAM, CLN, CLO,
            CLOAK, CLR, CLUB, CMCT, CMPCO, CMT, CND, CNNC, CNO, CNT, CNX, COAL, COB, COFI, COLX, CON, CONX, COSM, COSS,
            COUPE, COV, COVAL, COXST, CPAY, CPC, CPN, CPT, CPX, CPY, CRAVE, CRB, CryptoCurrencies.CRC, CRDNC, CREA,
            CRED, CREDO, CREVA, CRM, CRPT, CRW, CRX, CS, CSC, CSNO, CTIC2, CTIC3, CTO, CTR, CTX, CTXC, CUBE, CURE, CV,
            CV2, CVC, CVCOIN, CVT, CXO, CXT, CYP, DAD, DADI, DAG, DAI, DALC, DAN, DAR, DASH, DAT, DATA, DATX, DAX, DAXX,
            DAY, DBC, DBET, DBIX, DBTC, DCC, DCN, DCR, DCT, DCY, DDD, DDF, DEB, DEM, DENT, DERO, DEUS, DEV, DEW, DFS,
            DFT, DGB, DGC, DGD, DGPT, DGTX, DGX, DIBC, DICE, DIM, DIME, DIVX, DIX, DLC, DLISK, DLT, DMB, DMD, DMT, DNA,
            DNR, DNT, DOCK, DOGE, DOLLAR, DOPE, DOR, DOT, DOVU, DP, DPY, DRGN, DRM, DROP, DRP, DRPU, DRS, DRT, DRXNE,
            DSH, DSR, DTA, DTB, DTC, DTH, DTR, DTRC, DTX, DUO, DXT, DYN, EAC, EAGLE, EARTH, EBCH, EBET, EBST, EBT, EBTC,
            ECA, ECASH, ECC, ECN, ECO, ECOB, EDG, EDO, EDR, EFL, EFX, EFYT, EGC, EGT, EKO, EKT, EL, ELA, ELC, ELE, ELEC,
            ELF, ELIX, ELLA, ELS, ELTCOIN, ELY, EMC, EMC2, EMD, EMPR, EMV, ENG, ENJ, ENRG, ENT, EOS, EOSDAC, EOT, EPY,
            EQL, EQT, ERA, ERC, ERO, ERY, ESC, ESP, ESS, ESZ, ETBS, ETC, ETG, CryptoCurrencies.ETH, ETHD, ETHOS, ETK,
            ETN, ETP, ETT, EUC, CryptoCurrencies.EUR, EVC, EVE, EVIL, EVN, EVO, EVR, EVT, EVX, EXC, EXCL, EXN, EXP,
            EXRN, EXY, EZT, FACE, FAIR, FANS, FC2, FCN, FCT, FDX, FDZ, FGC, FID, FIMK, FIRE, FJC, FLAP, FLASH, FLAX,
            FLDC, FLIK, FLIXX, FLO, FLP, FLT, FLUZ, FLY, FNC, FND, FOR, FOTA, FRC, FRD, FRST, FRV, FSBT, FSN, FST, FT,
            FTC, FTX, FUCK, FUEL, FUN, FUNC, FUNK, FUZZ, FXE, FXT, FYN, FYP, GAIA, GAM, GAME, GAP, GAS, GAT, GB, GBC,
            GBG, CryptoCurrencies.GBP, GBX, GBYTE, GCC, GCN, GCR, GEERT, GEM, GEN, GENE, GEO, GET, GETX, GIN, GJC, GLA,
            GLC, GLD, GLS, GLT, GMT, GNO, GNT, GNX, GO, GOLF, GOLOS, GOOD, GOT, GP, GPL, GPU, GRC, GRE, GRFT, GRID,
            GRIM, GRLC, GRMD, GRN, GRS, GRWI, GSR, GTC, GTO, GUESS, GUN, GUP, GVT, GXS, HAC, HADE, HAL, HAT, HAV, HBC,
            HBN, HBT, HBZ, HC, HDG, HEAT, HER, HERO, HGT, HIRE, HKN, HMC, HMP, HMQ, HNC, HODL, HOLD, HONEY, HORSE, HOT,
            HOT2, HPB, HPC, HQX, HSR, HST, HT, HTC, HTML, HUC, HUR, HUSH, HVCO, HVN, HWC, HXX, HYDRO, HYP, I0C, IBANK,
            IC, ICE, ICN, ICN2, ICOB, ICON, ICOO, ICOS, ICX, IDH, IDXM, IETH, IFLT, IFT, IGNIS, IHT, IMS, IMX, INCNT,
            IND, INFX, ING, INK, INN, INPAY, INS, INSN, INSTAR, INT, INV, INXT, IOC, ION, IOP, IOS, IOST, IOT, IOTX,
            IPBC, IPL, IPSX, IQX, IRL, ISL, ITC, ITI, ITNS, ITT, ITZ, IVY, IXC, IXT, J8T, JC, JET, JEW, JIN, JIYO, JNT,
            JOBS, JOT, CryptoCurrencies.JPY, JS, JWL, KAYI, KB3, KBR, KCS, KED, KEK, KEY, KICK, KIN, KLC, KLN, KMD, KNC,
            KNC2, KNDC, KOBO, KORE, KRB, KRL, KRM, KRONE, KURT, KUSH, KZC, LA, LALA, LANA, LATX, LBA, LBC, LBTC, LCC,
            LCP, LCT, LDC, LDOGE, LEA, LEAF, LEDU, LEND, LEO, LET, LEV, LGD, LGO, LIFE, LINDA, LINK, LINX, LIR, LIVE,
            LKK, LMC, LNC, LND, LNK, LOC, LOCI, LOG, LOKI, LOOM, LPC, LRC, LSK, LTB, CryptoCurrencies.LTC, LTCR, LTCU,
            LUN, LUNA, LUX, LVPS, LWF, LYL, LYM, MAC, CryptoCurrencies.MAD, MAG, MAGE, MAID, MAN, MANA, MANNA, MAO, MAR,
            MARS, MAX, MAY, MAZA, MBI, MBRS, MCAP, MCI, MCO, MCRN, MDA, MDC, MDS, MDT, MEC, MED, MEDIC, MEDX, MEE, MEET,
            MEME, MER, MET, METAL, MFG, MFT, MGM, MGO, MILO, MINT, MIT, MITH, MITX, MKR, MLM, MLN, MNA, MNC, MND, MNE,
            MNM, MNTP, MNX, MOAC, MOBI, MOC, MOD, MOIN, MOJO, MONA, MONK, MOON, MORE, MORPH, MOT, MOTO, MRJA, MRK, MRT,
            MSCN, MSP, MSR, MST, MTC, MTH, CryptoCurrencies.MTL, MTN, MTNC, MTX, MUE, MUSE, MUSIC, MVC, MVP, MWAT, MXT,
            MYB, MYST, MZC, NANJ, NANO, NANOX, NAS, NAV, NAVI, NBAI, NBT, NCA, NCASH, NCT, NDC, NEBL, NEC, NEO, NEOS,
            NET, NET2, NETKO, NEU, NEVA, NEWB, NEXO, NGC, CryptoCurrencies.NIO, NKA, NKC, NKN, NLC2, NLG, NLX, NMC, NMR,
            NMS, NOAH, NOBL, NODC, NOTE, NOX, NPER, NPX, NRO, NSR, NTK, NTO, NTRN, NTWK, NTY, NUKO, NULS, NVC, NVST,
            NXC, NXS, NXT, NXX, NYAN, NYC, OAX, OBITS, OCC, OCL, OCN, OCT, ODE, ODN, OFF, OK, OLE, OMG, OMNI, OMX, ONG,
            ONION, ONL, ONT, ONX, OOT, OPAL, OPC, OPT, ORB, ORE, ORI, ORLY, ORME, ORS, OST, OTN, OTX, OXY, PAC, PAI,
            PAK, PAL, PARETO, PART, PASC, PASL, PAT, PAY, PAYX, PBL, PBT, PCH, PCL, PCN, PCOIN, PDC, PEPECASH, PEX, PFR,
            PGL, PHI, PHO, PHR, PHS, PIE, PIGGY, PING, PINK, PIPL, PIRL, PIVX, PIX, PIZZA, PKB, PKC, PKT, PLACO, PLAN,
            PLAY, PLBT, PLC, PLNC, PLR, PLU, PMNT, PND, PNX, POA, POE, POLIS, POLL, POLY, POP, POS, POST, POSW, POT,
            POWR, POY, PPC, PPP, PPT, PPY, PR, PRA, PRC, PRE, PRG, PRIX, PRL, PRO, PROC, PRX, PST, PTC, PTOY, PTT,
            PULSE, PURA, PURE, PUT, PX, PXC, PXI, PYLNT, PZM, Q2C, QASH, QAU, QBC, QBIC, QBT, QCN, QKC, QLC, QRK, QRL,
            QSH, QSP, QTL, QTM, QTUM, QUN, QVT, QWARK, R, RADS, RAIN, RBIES, RBT, RBX, RBY, RC, RCN, RCT, RDD, RDN,
            REAL, REBL, REC, RED, REE, REF, REM, REN, REP, REQ, REX, RFR, RHOC, RIC, RIDE, RISE, RIYA, RKC, RKT, RLC,
            RLT, RMC, RMC2, RMT, RNS, RNT, RNTB, ROOFS, RPC, RPX, RRT, RTB, RTE, RUFF, RUP, RUPX, RUSTBITS, RVN, RVR,
            RVT, SAC, SAFEX, SAGA, SALT, SAN, SANDG, CryptoCurrencies.SBD, SC, SCL, SCORE, SCRL, SCRT, SCS, SCT, SDC,
            SDRN, SEE, SEN, SENC, SEND, SENSE, SENT, SEQ, SETH, SEXC, SFC, SGN, SGR, SH, SHDW, SHIFT, SHIP, SHL, SHND,
            SHORTY, CryptoCurrencies.SHP, SIB, SIG, SIGT, SKB, SKC, SKIN, SKY, SLEVIN, SLG, SLM, SLR, SLS, SLT, SMART,
            SMC, SMLY, SMS, SMT, SNC, SNG, SNGLS, SNM, SNOV, SNRG, SNT, SNTR, SOAR, SOC, SOCC, SOIL, SOJ, SONG, SOON,
            SOUL, SPACE, SPANK, SPC, SPD, SPEX, SPF, SPHR, SPHTX, SPK, SPR, SPRTS, SPT, SRC, SRCOIN, SRN, SS, SSC,
            CryptoCurrencies.SSP, SSS, STA, STAC, STAK, STAR, STARS, START, STEEM, STJ, STK, STN, STORJ, STORM, STQ,
            STR, STRAT, STRC, STU, STV, STX, SUB, SUMO, SUPER, SUR, SWFTC, SWH, SWIFT, SWING, SWM, SWT, SWTH, SXC, SXDT,
            SXUT, SYNX, SYS, TAAS, TAG, TAJ, TALK, TAU, TBAR, TBX, TCC, TCT, TDS, TDX, TEAM, TEK, TEL, TEN, TERN, TES,
            TFD, TFL, TGAME, TGC, TGT, THC, THETA, THRT, TIE, TIG, TIME, TIO, TIPS, TIT, TIX, TKA, TKN, TKR, TKS, TKY,
            TNB, TNC, TNS, TNT, TOA, TOK, TOKC, TOMO, TOR, TPAY, TRAC, TRAK, TRC, TRCT, TRDT, TRF, TRI, TRIA, TRIG, TRK,
            TROLL, TRST, TRTL, TRUE, TRUMP, TRUST, TRX, TSE, TSL, TSTR, TTC, TTT, TTU, TUBE, TUSD, TX, TYCHO, TZC, UBQ,
            UBT, UCASH, UCOM, UET, UFO, UFR, UGC, UIS, UKG, ULA, UNB, UNI, UNIC, UNIFY, UNIT, UNITS, UNITY, UNO, UNY,
            UP, UPP, UQC, URO, USC, CryptoCurrencies.USD, USDT, USNBT, UTC, UTK, UTNP, UTT, UUU, V, VAL, VC, VEC2, VEE,
            VEN, VERI, VIA, VIB, VIBE, VIDZ, VISIO, VIT, VITE, VIU, VIVO, VLT, VLTC, VME, VOISE, VOLT, VOT, VOX, VPRC,
            VRC, VRM, VRS, VSL, VSX, VTA, VTC, VTR, VUC, VULC, VZT, WABI, WAN, WAND, WARP, WAVES, WAX, WAY, WBB, WCT,
            WDC, WGO, WGR, WHL, WICC, WILD, WIN, WINGS, WISH, WOMEN, WORM, WPR, WRC, WSX, WTC, WTT, XAS, XAUR, XBC, XBL,
            XBP, XBTC21, XBTS, XBY, XCN, XCO, XCP, XCPO, XCRE, XCT, XCXT, XDCE, XDG, XDN, XEL, XEM, XES, XFT, XGOX, XGR,
            XHI, XHV, XIN, XIOS, XJO, XLC, XLM, XLR, XMCC, XMCT, XMG, XMR, XMX, XMY, XNG, XNK, XNN, XOC, XP, XPA,
            CryptoCurrencies.XPD, XPM, XPTX, XPY, XRA, XRC, XRE, XRH, XRL, XRP, XSG, XSH, XSN, XSPEC, XST, XSTC, XTL,
            XTO, XTZ, XUC, XVC, XVG, XVP, XWC, XYO, XZC, YAC, YASH, YEE, YOC, YOYOW, YTN, YUP, YYW, ZAP, ZBC, ZCG, ZCL,
            ZCN, ZCO, CryptoCurrencies.ZEC, ZEIT, ZEN, ZENI, ZEPH, ZER, ZET, ZIL, ZINC, ZIPT, ZLA, ZMC, ZNY, ZOI, ZPT,
            ZRC, ZRX, ZSC, ZUR, ZYD, ZZC};

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
