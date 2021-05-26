package com.company.tools;

import static com.company.tools.FiatCurrencies.*;
import static com.company.tools.CryptoCurrencies.*;

/**
 * TODO: Fill in
 */
public class NamingTools {

    /*
     * REMINDER:
     * This file's primary focus is names, but on top of the that it is used to tell which of the currencies are
     * supported by which of the providers.
     */

    /****************
     *    Fields    *
     ****************/

    /* Fiat Currencies */

    /**
     * All of the fiat currencies that CoinBase supports (https://api.coinbase.com/v2/currencies)
     */
    public static final FiatCurrencies[] COINBASE_FIAT_CURRENCIES = { AED, AFN, FiatCurrencies.ALL, AMD, ANG, AOA, ARS,
            AUD, AWG, AZN, BAM, BBD, BDT, BGN, BHD, BIF, BMD, BND, FiatCurrencies.BOB, BRL, FiatCurrencies.BSD, BTN,
            BWP, BYN, BYR, BZD, FiatCurrencies.CAD, CDF, CHF, CLF, CLP, CNH, CNY, COP, FiatCurrencies.CRC, CUC, CVE,
            CZK, DJF, DKK, DOP, DZD, EEK, EGP, ERN, ETB, FiatCurrencies.EUR, FJD, JEP, JMD, JOD, FiatCurrencies.JPY,
            KES, KGS, KHR, KMF, KRW, KWD, KYD, KZT, LAK, LBP, LKR, LRD, LSL, LTL, LVL, LYD, FiatCurrencies.MAD, MDL,
            MGA, MKD, MMK, MNT, MOP, MRO, FiatCurrencies.MTL, MUR, MVR, MWK, MXN, MYR, MZN, NAD, NGN,
            FiatCurrencies.NIO, NOK, NPR, NZD, OMR, PAB, PEN, PGK, PHP, PKR, PLN, PYG, QAR, RON, RSD, RUB, RWF, SAR,
            FiatCurrencies.SBD, SCR, SEK, SGD, FiatCurrencies.SHP, SLL, SOS, SRD, FiatCurrencies.SSP, STD, SVC, SZL,
            THB, TJS, TMT, TND, TOP, TRY, TTD, TWD, TZS, UAH, UGX, FiatCurrencies.USD, UYU, UZS, VEF, VND, VUV, WST,
            XAF, XAG, XAU, XCD, XDR, XOF, FiatCurrencies.XPD, XPF, XPT, YER, ZAR, ZMK, ZMW, ZWL };

    /**
     * All of the fiat currencies that CoinCap supports (http://coincap.io/page/ETC)
     */
    public static final FiatCurrencies[] COINCAP_FIAT_CURRENCIES = { FiatCurrencies.BTC, FiatCurrencies.ETH,
            FiatCurrencies.EUR, FiatCurrencies.LTC, FiatCurrencies.USD, FiatCurrencies.ZEC };

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
     * @param fiatCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String fullName(FiatCurrencies fiatCurrency) {
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
                return "Zambian Kwacha (ZMK)";
            case ZMW:
                return "Zambian Kwacha (ZMW)";
            case ZWL:
                return "Zimbabwean Dollar";
            default:
                return "N/A";
        }//end switch
    }//end fullName(FiatCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String fullName(CryptoCurrencies cryptoCurrency) {
        switch(cryptoCurrency) {
            case A0XBTC:
                return "0xBitcoin";
            case A1ST:
                return "FirstBlood";
            case A1WO:
                return "1World";
            case A2GIVE:
                return "2GIVE";
            case A300:
                return "300 Token";
            case A611:
                return "SixEleven";
            case A808:
                return "808Coin";
            case A888:
                return "OctoCoin";
            case A8BIT:
                return "8Bit";
            case ABJ:
                return "Abjcoin";
            case ABJC:
                return "Abjcoin Commerce";
            case ABT:
                return "Arcblock";
            case ABY:
                return "ArtByte";
            case ABYSS:
                return "The Abyss";
            case AC:
                return "AsiaCoin";
            case AC3:
                return "AC3";
            case ACAT:
                return "Alphacat";
            case ACC:
                return "AdCoin";
            case ACE:
                return "ACE (TokenStars)";
            case ACOIN:
                return "Acoin";
            case ACP:
                return "AnarchistsPrime";
            case ACT:
                return "Achain";
            case ADA:
                return "Cardano";
            case ADB:
                return "adbank";
            case ADC:
                return "AudioCoin";
            case ADCN:
                return "Asiadigicoin";
            case ADH:
                return "AdHive";
            case ADI:
                return "Aditus";
            case ADL:
                return "Adelphoi";
            case ADST:
                return "AdShares";
            case ADT:
                return "adToken";
            case ADX:
                return "AdEx";
            case ADZ:
                return "Adzcoin";
            case AE:
                return "Aeternity";
            case AEON:
                return "Aeon";
            case AERM:
                return "Aerium";
            case AGI:
                return "SingularityNET";
            case AGLC:
                return "AgrolifeCoin";
            case AGRS:
                return "Agoras Tokens";
            case AHT:
                return "Bowhead";
            case AI:
                return "POLY AI";
            case AIB:
                return "Advanced Inte...";
            case AID:
                return "AidCoin";
            case AIDOC:
                return "AI Doctor";
            case AIO:
                return "AIO"; // TODO: Make sure this is correct
            case AION:
                return "Aion";
            case AIR:
                return "AirToken";
            case AIT:
                return "AICHAIN";
            case AIX:
                return "Aigang";
            case ALIS:
                return "ALIS";
            case ALL:
                return "Allion";
            case ALQO:
                return "ALQO";
            case ALT:
                return "Altcoin";
            case ALTCOM:
                return "SONO";
            case ALX:
                return "ALAX";
            case AMB:
                return "Ambrosus";
            case AMBER:
                return "AmberCoin";
            case AMLT:
                return "AMLT";
            case AMM:
                return "MicroMoney";
            case AMMO:
                return "Ammo Reloaded";
            case AMN:
                return "Amon";
            case AMP:
                return "Synereo";
            case AMS:
                return "AmsterdamCoin";
            case ANC:
                return "Anoncoin";
            case ANT:
                return "Aragon";
            case APH:
                return "Aphelion";
            case APIS:
                return "APIS";
            case APPC:
                return "AppCoins";
            case APR:
                return "APR Coin";
            case APX:
                return "APX";
            case ARB:
                return "ARbit";
            case ARC:
                return "Advanced Tech...";
            case ARCO:
                return "AquariusCoin";
            case ARCT:
                return "ArbitrageCT";
            case ARDR:
                return "Ardor";
            case ARG:
                return "Argentum";
            case ARGUS:
                return "Argus";
            case ARI:
                return "Aricoin";
            case ARK:
                return "Ark";
            case ARN:
                return "Aeron";
            case ART:
                return "Maecenas";
            case ARY:
                return "Block Array";
            case ASAFE2:
                return "AllSafe";
            case AST:
                return "AirSwap";
            case ASTRO:
                return "Astro";
            case ATB:
                return "ATBCoin";
            case ATL:
                return "ATLANT";
            case ATM:
                return "ATMChain";
            case ATMOS:
                return "Atmos";
            case ATMS:
                return "Atmos";
            case ATN:
                return "ATN";
            case ATOM:
                return "Atomic Coin";
            case ATS:
                return "Authorship";
            case ATX:
                return "Artex Coin";
            case AU:
                return "AurumCoin";
            case AUC:
                return "Auctus";
            case AUR:
                return "Auroracoin";
            case AURA:
                return "Aurora DAO";
            case AUTO:
                return "Cube";
            case AVA:
                return "Travala";
            case AVT:
                return "Aventus";
            case AXP:
                return "aXpire";
            case B2B:
                return "B2BX";
            case BANCA:
                return "Banca";
            case BANK:
                return "Bank Coin";
            case BAS:
                return "BitAsean";
            case BASH:
                return "LuckChain";
            case BAT:
                return "Basic Attenti...";
            case BAX:
                return "BABB";
            case BAY:
                return "BitBay";
            case BBC:
                return "TraDove B2BCoin";
            case BBI:
                return "BelugaPay";
            case BBN:
                return "Banyan Network";
            case BBO:
                return "Bigbom";
            case BBP:
                return "BiblePay";
            case BBR:
                return "Boolberry";
            case BBT:
                return "BitBoost";
            case BCA:
                return "Bitcoin Atom";
            case BCD:
                return "Bitcoin Diamond";
            case BCF:
                return "Bitcoin Fast";
            case BCH:
                return "Bitcoin Cash";
            case BCI:
                return "Bitcoin Interest";
            case BCN:
                return "Bytecoin";
            case BCO:
                return "BridgeCoin";
            case BCPT:
                return "BlockMason Cr...";
            case BCY:
                return "Bitcrystals";
            case BDG:
                return "BitDegree";
            case BDL:
                return "Bitdeal";
            case BEE:
                return "Bee Token";
            case BELA:
                return "Bela";
            case BENJI:
                return "BenjiRolls";
            case BERN:
                return "BERNcash";
            case BERRY:
                return "Rentberry";
            case BET:
                return "DAO.Casino";
            case BETR:
                return "BetterBetting";
            case BEZ:
                return "Bezop";
            case BFT:
                return "BnkToTheFuture";
            case BIGUP:
                return "BigUp";
            case BIO:
                return "BioCoin";
            case BIOB:
                return "BioBar";
            case BIP:
                return "BipCoin";
            case BIS:
                return "Bismuth";
            case BITB:
                return "Bean Cash";
            case BITCNY:
                return "bitCNY";
            case BITEUR:
                return "bitEUR";
            case BITG:
                return "Bitcoin Green";
            case BITGOLD:
                return "bitGold";
            case BITS:
                return "Bitstar";
            case BITSILVER:
                return "bitSilver";
            case BITUSD:
                return "bitUSD";
            case BITZ:
                return "Bitz";
            case BIX:
                return "Bibox Token";
            case BKX:
                return "Bankex";
            case BLAS:
                return "BlakeStar";
            case BLC:
                return "Blakecoin";
            case BLITZ:
                return "Blitzcash";
            case BLK:
                return "BlackCoin";
            case BLN:
                return "Bolenum";
            case BLOCK:
                return "Blocknet";
            case BLOCKPAY:
                return "BlockPay";
            case BLT:
                return "Bloom";
            case BLU:
                return "BlueCoin";
            case BLUE:
                return "Blue Protocol";
            case BLZ:
                return "BlazeCoin";
            case BMC:
                return "Blackmoon";
            case BMX:
                return "BitMart Token";
            case BNB:
                return "Binance Coin";
            case BNT:
                return "Bancor";
            case BNTY:
                return "Bounty0x";
            case BNX:
                return "BnrtxCoin";
            case BOAT:
                return "BOAT";
            case BOB:
                return "Bob's Repair";
            case BOLI:
                return "Bolivarcoin";
            case BON:
                return "Bonpay";
            case BOS:
                return "BOScoin";
            case BOST:
                return "BoostCoin";
            case BOT:
                return "Bodhi";
            case BOUTS:
                return "BoutsPro";
            case BPC:
                return "Bitpark Coin";
            case BPL:
                return "Blockpool";
            case BPT:
                return "Blockport";
            case BQ:
                return "bitqy";
            case BRAT:
                return "BROTHER";
            case BRD:
                return "Bread";
            case BRIA:
                return "BriaCoin";
            case BRIT:
                return "BritCoin";
            case BRK:
                return "Breakout";
            case BRM:
                return "BrahmaOS";
            case BRO:
                return "Bitradio";
            case BRX:
                return "Breakout Stake";
            case BSC:
                return "BowsCoin";
            case BSD:
                return "BitSend";
            case BSM:
                return "Bitsum";
            case BSTAR:
                return "Blackstar";
            case BSTN:
                return "BitStation";
            case BSTY:
                return "GlobalBoost-Y";
            case BTA:
                return "Bata";
            case BTB:
                return "BitBar";
            case BTC:
                return "Bitcoin";
            case BTCA:
                return "Bitair";
            case BTCD:
                return "BitcoinDark";
            case BTCP:
                return "Bitcoin Private";
            case BTCR:
                return "Bitcurrency";
            case BTCRED:
                return "Bitcoin Red";
            case BTCS:
                return "Bitcoin Scrypt";
            case BTCZ:
                return "BitcoinZ";
            case BTDX:
                return "Bitcloud";
            case BTG:
                return "Bitcoin Gold";
            case BTG2:
                return "Bitgem";
            case BTM:
                return "Bytom";
            case BTM2:
                return "Bitmark";
            case BTO:
                return "Bottos";
            case BTPL:
                return "Bitcoin Planet";
            case BTQ:
                return "BitQuark";
            case BTRN:
                return "Biotron";
            case BTS:
                return "BitShares";
            case BTW:
                return "BitWhite";
            case BTWTY:
                return "Bit20";
            case BTX2:
                return "Bitcore";
            case BUCKS:
                return "SwagBucks";
            case BUMBA:
                return "BumbaCoin";
            case BUN:
                return "BunnyCoin";
            case BURST:
                return "Burst";
            case BUZZ:
                return "BuzzCoin";
            case BWK:
                return "Bulwark";
            case BXC:
                return "Bitcedi";
            case BXT:
                return "BitTokens";
            case BYC:
                return "Bytecent";
            case BZ:
                return "Bit-Z Token";
            case BZNT:
                return "Bezant";
            case C2:
                return "Coin2.1";
            case CAB:
                return "Cabbage";
            case CACH:
                return "CacheCoin";
            case CAD:
                return "Canadian Dollar";
            case CAG:
                return "Change";
            case CALC:
                return "CaliphCoin";
            case CAN:
                return "CanYaCoin";
            case CANN:
                return "CannabisCoin";
            case CAPP:
                return "Cappasity";
            case CARBON:
                return "Carboncoin";
            case CAS:
                return "Cashaa";
            case CASH:
                return "Cashcoin";
            case CAT:
                return "BlockCAT";
            case CAT2:
                return "Catcoin";
            case CAZ:
                return "Cazcoin";
            case CBC:
                return "CashBet Coin";
            case CBT:
                return "CommerceBlock";
            case CBX:
                return "Bullion";
            case CCCX:
                return "Clipper Coin";
            case CCN:
                return "CannaCoin";
            case CCO:
                return "Ccore";
            case CCRB:
                return "CryptoCarbon";
            case CCT:
                return "Crystal Clear ";
            case CDN:
                return "Canada eCoin";
            case CDT:
                return "Blox";
            case CDX:
                return "Commodity Ad ...";
            case CEEK:
                return "CEEK VR";
            case CENNZ:
                return "Centrality";
            case CESC:
                return "CryptoEscudo";
            case CF:
                return "Californium";
            case CFD:
                return "Confido";
            case CFI:
                return "Cofound.it";
            case CFT:
                return "CryptoForecast";
            case CFUN:
                return "CFun";
            case CHAN:
                return "ChanCoin";
            case CHC:
                return "ChainCoin";
            case CHESS:
                return "ChessCoin";
            case CHIPS:
                return "CHIPS";
            case CHP:
                return "CoinPoker";
            case CHSB:
                return "SwissBorg";
            case CHX:
                return "Chainium";
            case CJ:
                return "Cryptojacks";
            case CJT:
                return "ConnectJob";
            case CL:
                return "Coinlancer";
            case CLAM:
                return "Clams";
            case CLN:
                return "Colu Local Ne...";
            case CLO:
                return "Callisto Network";
            case CLOAK:
                return "CloakCoin";
            case CLR:
                return "ClearCoin";
            case CLUB:
                return "CLUB"; // TODO: Make sure this is correct
            case CMCT:
                return "Crowd Machine";
            case CMPCO:
                return "CampusCoin";
            case CMT:
                return "Comet";
            case CND:
                return "Cindicator";
            case CNNC:
                return "Cannation";
            case CNO:
                return "Coin(O)";
            case CNT:
                return "Centurion";
            case CNX:
                return "Cryptonex";
            case COAL:
                return "BitCoal";
            case COB:
                return "Cobinhood";
            case COFI:
                return "CoinFi";
            case COLX:
                return "ColossusXT";
            case CON:
                return "PayCon";
            case CONX:
                return "Concoin";
            case COSM:
                return "Cosmo Coin";
            case COSS:
                return "COSS";
            case COUPE:
                return "Coupecoin";
            case COV:
                return "Covesting";
            case COVAL:
                return "Circuits of V...";
            case COXST:
                return "CoExistCoin";
            case CPAY:
                return "Cryptopay";
            case CPC:
                return "Capricoin";
            case CPN:
                return "CompuCoin";
            case CPT:
                return "Cryptaur";
            case CPX:
                return "Apex";
            case CPY:
                return "COPYTRACK";
            case CRAVE:
                return "Crave";
            case CRB:
                return "Creditbit";
            case CRC:
                return "CryCash";
            case CRDNC:
                return "Credence Coin";
            case CREA:
                return "Creativecoin";
            case CRED:
                return "Verify";
            case CREDO:
                return "Credo";
            case CREVA:
                return "CrevaCoin";
            case CRM:
                return "Cream";
            case CRPT:
                return "Crypterium";
            case CRW:
                return "Crown";
            case CRX:
                return "Chronos";
            case CS:
                return "Credits";
            case CSC:
                return "CasinoCoin";
            case CSNO:
                return "BitDice";
            case CTIC2:
                return "Coimatic 2.0";
            case CTIC3:
                return "Coimatic 3.0";
            case CTO:
                return "Crypto";
            case CTR:
                return "Centra";
            case CTX:
                return "CarTaxi Token";
            case CTXC:
                return "Cortex";
            case CUBE:
                return "DigiCube";
            case CURE:
                return "Curecoin";
            case CV:
                return "carVertical";
            case CV2:
                return "Colossuscoin V2";
            case CVC:
                return "Civic";
            case CVCOIN:
                return "CVCoin";
            case CVT:
                return "CyberVein";
            case CXO:
                return "CargoX";
            case CXT:
                return "Coinonat";
            case CYP:
                return "Cypher";
            case DAD:
                return "DAD"; // TODO: Make sure this is correct
            case DADI:
                return "DADI";
            case DAG:
                return "Constellation";
            case DAI:
                return "Dai";
            case DALC:
                return "Dalecoin";
            case DAN:
                return "Daneel";
            case DAR:
                return "Darcrus";
            case DASH:
                return "Dash";
            case DAT:
                return "Datum";
            case DATA:
                return "Streamr DATAcoin";
            case DATX:
                return "DATx";
            case DAX:
                return "DAEX";
            case DAXX:
                return "DaxxCoin";
            case DAY:
                return "Chronologic";
            case DBC:
                return "DeepBrain Chain";
            case DBET:
                return "DecentBet";
            case DBIX:
                return "DubaiCoin";
            case DBTC:
                return "Debitcoin";
            case DCC:
                return "Distributed C...";
            case DCN:
                return "Dentacoin";
            case DCR:
                return "Decred";
            case DCT:
                return "DECENT";
            case DCY:
                return "Dinastycoin";
            case DDD:
                return "Scry.info";
            case DDF:
                return "DigitalDevelo...";
            case DEB:
                return "Debitum";
            case DEM:
                return "Deutsche eMark";
            case DENT:
                return "Dent";
            case DERO:
                return "Dero";
            case DEUS:
                return "DeusCoin";
            case DEV:
                return "DeviantCoin";
            case DEW:
                return "DEW";
            case DFS:
                return "DFSCoin";
            case DFT:
                return "DraftCoin";
            case DGB:
                return "DigiByte";
            case DGC:
                return "Digitalcoin";
            case DGD:
                return "DigixDAO";
            case DGPT:
                return "DigiPulse";
            case DGTX:
                return "Digitex Futures";
            case DGX:
                return "Digix Gold Token";
            case DIBC:
                return "DIBCOIN";
            case DICE:
                return "Etheroll";
            case DIM:
                return "DIMCOIN";
            case DIME:
                return "Dimecoin";
            case DIVX:
                return "Divi";
            case DIX:
                return "Dix Asset";
            case DLC:
                return "Dollarcoin";
            case DLISK:
                return "DAPPSTER";
            case DLT:
                return "Agrello";
            case DMB:
                return "Digital Money...";
            case DMD:
                return "Diamond";
            case DMT:
                return "DMarket";
            case DNA:
                return "EncrypGen";
            case DNR:
                return "Denarius";
            case DNT:
                return "district0x";
            case DOCK:
                return "Dock";
            case DOGE:
                return "Dogecoin";
            case DOLLAR:
                return "Dollar Online";
            case DOPE:
                return "DopeCoin";
            case DOR:
                return "Dorado";
            case DOT:
                return "Dotcoin";
            case DOVU:
                return "Dovu";
            case DP:
                return "DigitalPrice";
            case DPY:
                return "Delphy";
            case DRGN:
                return "Dragonchain";
            case DRM:
                return "Dreamcoin";
            case DROP:
                return "Dropil";
            case DRP:
                return "DCORP";
            case DRPU:
                return "DCORP Utility";
            case DRS:
                return "Digital Rupees";
            case DRT:
                return "DomRaider";
            case DRXNE:
                return "DROXNE";
            case DSH:
                return "Dashcoin";
            case DSR:
                return "Desire";
            case DTA:
                return "DATA";
            case DTB:
                return "Databits";
            case DTC:
                return "Datacoin";
            case DTH:
                return "Dether";
            case DTR:
                return "Dynamic Tradi...";
            case DTRC:
                return "Datarius Credit";
            case DTX:
                return "DaTa eXchange";
            case DUO:
                return "ParallelCoin";
            case DXT:
                return "Datawallet";
            case DYN:
                return "Dynamic";
            case EAC:
                return "EarthCoin";
            case EAGLE:
                return "EagleCoin";
            case EARTH:
                return "Earth Token";
            case EBCH:
                return "EBCH";
            case EBET:
                return "EthBet";
            case EBST:
                return "eBoost";
            case EBT:
                return "Ebittree Coin";
            case EBTC:
                return "eBitcoin";
            case ECA:
                return "Electra";
            case ECASH:
                return "Ethereum Cash";
            case ECC:
                return "ECC";
            case ECN:
                return "E-coin";
            case ECO:
                return "EcoCoin";
            case ECOB:
                return "Ecobit";
            case EDG:
                return "Edgeless";
            case EDO:
                return "Eidoo";
            case EDR:
                return "Endor Protocol";
            case EFL:
                return "e-Gulden";
            case EFX:
                return "Effect.AI";
            case EFYT:
                return "Ergo";
            case EGC:
                return "EverGreenCoin";
            case EGT:
                return "Egretia";
            case EKO:
                return "EchoLink";
            case EKT:
                return "EDUCare";
            case EL:
                return "Elcoin";
            case ELA:
                return "Elastos";
            case ELC:
                return "Elacoin";
            case ELE:
                return "Elementrem";
            case ELEC:
                return "Electrify.Asia";
            case ELF:
                return "aelf";
            case ELIX:
                return "Elixir";
            case ELLA:
                return "Ellaism";
            case ELS:
                return "Elysium";
            case ELTCOIN:
                return "ELTCOIN";
            case ELY:
                return "Elysian";
            case EMC:
                return "Emercoin";
            case EMC2:
                return "Einsteinium";
            case EMD:
                return "Emerald Crypto";
            case EMPR:
                return "empowr coin";
            case EMV:
                return "Ethereum Movi...";
            case ENG:
                return "Enigma";
            case ENJ:
                return "Enjin Coin";
            case ENRG:
                return "Energycoin";
            case ENT:
                return "Eternity";
            case EOS:
                return "EOS";
            case EOSDAC:
                return "eosDAC";
            case EOT:
                return "EOT Token";
            case EPY:
                return "Emphy";
            case EQL:
                return "Equal";
            case EQT:
                return "EquiTrader";
            case ERA:
                return "ERA";
            case ERC:
                return "EuropeCoin";
            case ERO:
                return "Eroscoin";
            case ERY:
                return "Eryllium";
            case ESC:
                return "Escroco";
            case ESP:
                return "Espers";
            case ESS:
                return "ESS"; // TODO: Make sure this is correct
            case ESZ:
                return "EtherSportz";
            case ETBS:
                return "Ethbits";
            case ETC:
                return "Ethereum Classic";
            case ETG:
                return "Ethereum Gold";
            case ETH:
                return "Ethereum";
            case ETHD:
                return "Ethereum Dark";
            case ETHOS:
                return "Ethos";
            case ETK:
                return "EnergiToken";
            case ETN:
                return "Electroneum";
            case ETP:
                return "Metaverse ETP";
            case ETT:
                return "EncryptoTel [...";
            case EUC:
                return "Eurocoin";
            case EUR:
                return "Euro";
            case EVC:
                return "EventChain";
            case EVE:
                return "Devery";
            case EVIL:
                return "Evil Coin";
            case EVN:
                return "Envion";
            case EVO:
                return "Evotion";
            case EVR:
                return "Everus";
            case EVT:
                return "EVT"; // TODO: Make sure this is correct
            case EVX:
                return "Everex";
            case EXC:
                return "Eximchain";
            case EXCL:
                return "ExclusiveCoin";
            case EXN:
                return "ExchangeN";
            case EXP:
                return "Expanse";
            case EXRN:
                return "EXRNchain";
            case EXY:
                return "Experty";
            case EZT:
                return "EZToken";
            case FACE:
                return "Faceter";
            case FAIR:
                return "FairCoin";
            case FANS:
                return "Fantasy Cash";
            case FC2:
                return "FuelCoin";
            case FCN:
                return "Fantomcoin";
            case FCT:
                return "Factom";
            case FDX:
                return "FidentiaX";
            case FDZ:
                return "Friendz";
            case FGC:
                return "FantasyGold";
            case FID:
                return "Fidelium";
            case FIMK:
                return "FIMKrypto";
            case FIRE:
                return "Firecoin";
            case FJC:
                return "FujiCoin";
            case FLAP:
                return "FlappyCoin";
            case FLASH:
                return "Flash";
            case FLAX:
                return "Flaxscript";
            case FLDC:
                return "FoldingCoin";
            case FLIK:
                return "FLiK";
            case FLIXX:
                return "Flixxo";
            case FLO:
                return "FlorinCoin";
            case FLP:
                return "FLIP";
            case FLT:
                return "FlutterCoin";
            case FLUZ:
                return "Fluz Fluz";
            case FLY:
                return "Flycoin";
            case FNC:
                return "FinCoin";
            case FND:
                return "FundRequest";
            case FOR:
                return "FORCE";
            case FOTA:
                return "Fortuna";
            case FRC:
                return "Freicoin";
            case FRD:
                return "Farad";
            case FRST:
                return "FirstCoin";
            case FRV:
                return "Fitrova";
            case FSBT:
                return "Forty Seven Bank";
            case FSN:
                return "Fusion";
            case FST:
                return "Fastcoin";
            case FT:
                return "Fabric Token";
            case FTC:
                return "Feathercoin";
            case FTX:
                return "FintruX Network";
            case FUCK:
                return "FuckToken";
            case FUEL:
                return "Etherparty";
            case FUN:
                return "FunFair";
            case FUNC:
                return "FUNCoin";
            case FUNK:
                return "The Cypherfunks";
            case FUZZ:
                return "FuzzBalls";
            case FXE:
                return "FuturXe";
            case FXT:
                return "FuzeX";
            case FYN:
                return "FundYourselfNow";
            case FYP:
                return "FlypMe";
            case GAIA:
                return "GAIA";
            case GAM:
                return "Gambit";
            case GAME:
                return "GameCredits";
            case GAP:
                return "Gapcoin";
            case GAS:
                return "Gas";
            case GAT:
                return "Gatcoin";
            case GB:
                return "GoldBlocks";
            case GBC:
                return "GBCGoldCoin";
            case GBG:
                return "GBG"; // TODO: Make sure this is correct
            case GBP:
                return "British Pound";
            case GBX:
                return "GoByte";
            case GBYTE:
                return "Byteball Bytes";
            case GCC:
                return "GuccioneCoin";
            case GCN:
                return "GCN Coin";
            case GCR:
                return "Global Curren...";
            case GEERT:
                return "GeertCoin";
            case GEM:
                return "Gems ";
            case GEN:
                return "DAOstack";
            case GENE:
                return "Parkgene";
            case GEO:
                return "GeoCoin";
            case GET:
                return "GET Protocol";
            case GETX:
                return "Guaranteed Et...";
            case GIN:
                return "GINcoin";
            case GJC:
                return "Global Jobcoin";
            case GLA:
                return "Gladius Token";
            case GLC:
                return "GlobalCoin";
            case GLD:
                return "GoldCoin";
            case GLS:
                return "GlassCoin";
            case GLT:
                return "GlobalToken";
            case GMT:
                return "Mercury Protocol";
            case GNO:
                return "Gnosis";
            case GNT:
                return "Golem";
            case GNX:
                return "Genaro Network";
            case GO:
                return "GoChain";
            case GOLF:
                return "Golfcoin";
            case GOLOS:
                return "Golos";
            case GOOD:
                return "Goodomy";
            case GOT:
                return "GoNetwork";
            case GP:
                return "GoldPieces";
            case GPL:
                return "Gold Pressed ...";
            case GPU:
                return "GPU Coin";
            case GRC:
                return "GridCoin";
            case GRE:
                return "Greencoin";
            case GRFT:
                return "Graft";
            case GRID:
                return "Grid+";
            case GRIM:
                return "Grimcoin";
            case GRLC:
                return "Garlicoin";
            case GRMD:
                return "GreenMed";
            case GRN:
                return "Granite";
            case GRS:
                return "Groestlcoin";
            case GRWI:
                return "Growers Inter...";
            case GSR:
                return "GeyserCoin";
            case GTC:
                return "Game.com";
            case GTO:
                return "Gifto";
            case GUESS:
                return "Peerguess";
            case GUN:
                return "Guncoin";
            case GUP:
                return "Matchpool";
            case GVT:
                return "Genesis Vision";
            case GXS:
                return "GXChain";
            case HAC:
                return "Hackspace Cap...";
            case HADE:
                return "Hade Platform";
            case HAL:
                return "Halcyon";
            case HAT:
                return "Hat.Exchange";
            case HAV:
                return "Havven";
            case HBC:
                return "HomeBlockCoin";
            case HBN:
                return "HoboNickels";
            case HBT:
                return "Hubii Network";
            case HBZ:
                return "Helbiz";
            case HC:
                return "Harvest Maste...";
            case HDG:
                return "Hedge";
            case HEAT:
                return "HEAT";
            case HER:
                return "HeroNode";
            case HERO:
                return "Sovereign Hero";
            case HGT:
                return "HelloGold";
            case HIRE:
                return "HireMatch";
            case HKN:
                return "Hacken";
            case HMC:
                return "Hi Mutual Soc...";
            case HMP:
                return "HempCoin";
            case HMQ:
                return "Humaniq";
            case HNC:
                return "Helleniccoin";
            case HODL:
                return "HOdlcoin";
            case HOLD:
                return "Stellar Holdings";
            case HONEY:
                return "Honey";
            case HORSE:
                return "Ethorse";
            case HOT:
                return "Holo";
            case HOT2:
                return "Hydro Protocol";
            case HPB:
                return "High Performa...";
            case HPC:
                return "Happycoin";
            case HQX:
                return "HOQU";
            case HSR:
                return "Hshare";
            case HST:
                return "Decision Token";
            case HT:
                return "Huobi Token";
            case HTC:
                return "HitCoin";
            case HTML:
                return "HTMLCOIN";
            case HUC:
                return "HunterCoin";
            case HUR:
                return "Hurify";
            case HUSH:
                return "Hush";
            case HVCO:
                return "High Voltage";
            case HVN:
                return "Hive Project";
            case HWC:
                return "HollyWoodCoin";
            case HXX:
                return "Hexx";
            case HYDRO:
                return "Hydro";
            case HYP:
                return "HyperStake";
            case I0C:
                return "I0Coin";
            case IBANK:
                return "iBank";
            case IC:
                return "Ignition";
            case ICE:
                return "iDice";
            case ICN:
                return "Iconomi";
            case ICN2:
                return "iCoin";
            case ICOB:
                return "ICOBID";
            case ICON:
                return "Iconic";
            case ICOO:
                return "ICO OpenLedger";
            case ICOS:
                return "ICOS";
            case ICX:
                return "ICON";
            case IDH:
                return "indaHash";
            case IDXM:
                return "IDEX Membership";
            case IETH:
                return "iEthereum";
            case IFLT:
                return "InflationCoin";
            case IFT:
                return "InvestFeed";
            case IGNIS:
                return "Ignis";
            case IHT:
                return "IHT Real Esta...";
            case IMS:
                return "Independent M...";
            case IMX:
                return "Impact";
            case INCNT:
                return "Incent";
            case IND:
                return "Indorse Token";
            case INFX:
                return "Influxcoin";
            case ING:
                return "Iungo";
            case INK:
                return "Ink";
            case INN:
                return "Innova";
            case INPAY:
                return "InPay";
            case INS:
                return "INS Ecosystem";
            case INSN:
                return "InsaneCoin";
            case INSTAR:
                return "Insights Network";
            case INT:
                return "Internet Node...";
            case INV:
                return "Invacio";
            case INXT:
                return "Internxt";
            case IOC:
                return "I/O Coin";
            case ION:
                return "ION";
            case IOP:
                return "Internet of P...";
            case IOS:
                return "IOS"; // TODO: Make sure this is correct
            case IOST:
                return "IOST";
            case IOT:
                return "IOTA";
            case IOTX:
                return "IoTeX";
            case IPBC:
                return "Interplanetar...";
            case IPL:
                return "InsurePal";
            case IPSX:
                return "IP Exchange";
            case IQX:
                return "IQX"; // TODO: Make sure this is correct
            case IRL:
                return "IrishCoin";
            case ISL:
                return "IslaCoin";
            case ITC:
                return "IoT Chain";
            case ITI:
                return "iTicoin";
            case ITNS:
                return "IntenseCoin";
            case ITT:
                return "Intelligent T...";
            case ITZ:
                return "Interzone";
            case IVY:
                return "Ivy";
            case IXC:
                return "Ixcoin";
            case IXT:
                return "IXT";
            case J8T:
                return "JET8";
            case JC:
                return "Jesus Coin";
            case JET:
                return "Jetcoin";
            case JEW:
                return "Shekel";
            case JIN:
                return "Jin Coin";
            case JIYO:
                return "Jiyo";
            case JNT:
                return "Jibrel Network";
            case JOBS:
                return "JobsCoin";
            case JOT:
                return "Jury.Online T...";
            case JPY:
                return "Japanese Yen";
            case JS:
                return "JavaScript Token";
            case JWL:
                return "Jewels";
            case KAYI:
                return "Kayicoin";
            case KB3:
                return "B3Coin";
            case KBR:
                return "Kubera Coin";
            case KCS:
                return "KuCoin Shares";
            case KED:
                return "Darsek";
            case KEK:
                return "KekCoin";
            case KEY:
                return "Selfkey";
            case KICK:
                return "KickCoin";
            case KIN:
                return "Kin";
            case KLC:
                return "KiloCoin";
            case KLN:
                return "Kolion";
            case KMD:
                return "Komodo";
            case KNC:
                return "Kyber Network";
            case KNC2:
                return "KingN Coin";
            case KNDC:
                return "KanadeCoin";
            case KOBO:
                return "Kobocoin";
            case KORE:
                return "Kore";
            case KRB:
                return "Karbo";
            case KRL:
                return "Kryll";
            case KRM:
                return "Karma";
            case KRONE:
                return "Kronecoin";
            case KURT:
                return "Kurrent";
            case KUSH:
                return "KushCoin";
            case KZC:
                return "Kzcash";
            case LA:
                return "LATOKEN";
            case LALA:
                return "LALA World";
            case LANA:
                return "LanaCoin";
            case LATX:
                return "LatiumX";
            case LBA:
                return "Libra Credit";
            case LBC:
                return "LBRY Credits";
            case LBTC:
                return "LiteBitcoin";
            case LCC:
                return "Litecoin Cash";
            case LCP:
                return "Litecoin Plus";
            case LCT:
                return "LendConnect";
            case LDC:
                return "Leadcoin";
            case LDOGE:
                return "LiteDoge";
            case LEA:
                return "LeaCoin";
            case LEAF:
                return "LeafCoin";
            case LEDU:
                return "Education Eco...";
            case LEND:
                return "ETHLend";
            case LEO:
                return "LEOcoin";
            case LET:
                return "LinkEye";
            case LEV:
                return "Leverj";
            case LGD:
                return "Legends Room";
            case LGO:
                return "LGO Exchange";
            case LIFE:
                return "LIFE";
            case LINDA:
                return "Linda";
            case LINK:
                return "ChainLink";
            case LINX:
                return "Linx";
            case LIR:
                return "LetItRide";
            case LIVE:
                return "Live Stars";
            case LKK:
                return "Lykke";
            case LMC:
                return "LoMoCoin";
            case LNC:
                return "Blocklancer";
            case LND:
                return "Lendingblock";
            case LNK:
                return "Link Platform";
            case LOC:
                return "LockTrip";
            case LOCI:
                return "LOCIcoin";
            case LOG:
                return "Woodcoin";
            case LOKI:
                return "Loki";
            case LOOM:
                return "Loom Network";
            case LPC:
                return "Lightpaycoin";
            case LRC:
                return "Loopring";
            case LSK:
                return "Lisk";
            case LTB:
                return "LiteBar";
            case LTC:
                return "Litecoin";
            case LTCR:
                return "Litecred";
            case LTCU:
                return "LiteCoin Ultra";
            case LUN:
                return "Lunyr";
            case LUNA:
                return "Luna Coin";
            case LUX:
                return "LUXCoin";
            case LVPS:
                return "LevoPlus";
            case LWF:
                return "Local World F...";
            case LYL:
                return "LoyalCoin";
            case LYM:
                return "Lympo";
            case MAC:
                return "Machinecoin";
            case MAD:
                return "SatoshiMadness";
            case MAG:
                return "Magnet";
            case MAGE:
                return "MagicCoin";
            case MAID:
                return "MaidSafeCoin";
            case MAN:
                return "Matrix AI Net...";
            case MANA:
                return "Decentraland";
            case MANNA:
                return "Manna";
            case MAO:
                return "Mao Zedong";
            case MAR:
                return "Marijuanacoin";
            case MARS:
                return "Marscoin";
            case MAX:
                return "MaxCoin";
            case MAY:
                return "Theresa May Coin";
            case MAZA:
                return "MAZA";
            case MBI:
                return "Monster Byte";
            case MBRS:
                return "Embers";
            case MCAP:
                return "MCAP";
            case MCI:
                return "Musiconomi";
            case MCO:
                return "MCO";
            case MCRN:
                return "MACRON";
            case MDA:
                return "Moeda Loyalty...";
            case MDC:
                return "Madcoin";
            case MDS:
                return "MediShares";
            case MDT:
                return "Measurable Da...";
            case MEC:
                return "Megacoin";
            case MED:
                return "MediBloc [QRC20]";
            case MEDIC:
                return "MedicCoin";
            case MEDX:
                return "MediBloc [ERC20]";
            case MEE:
                return "CoinMeet";
            case MEET:
                return "CoinMeet";
            case MEME:
                return "Memetic / Pep...";
            case MER:
                return "Mercury";
            case MET:
                return "Metronome";
            case METAL:
                return "MetalCoin";
            case MFG:
                return "SyncFab";
            case MFT:
                return "Mainframe";
            case MGM:
                return "Magnum";
            case MGO:
                return "MobileGo";
            case MILO:
                return "MiloCoin";
            case MINT:
                return "Mintcoin";
            case MIT:
                return "MIT"; // TODO: Make sure this is correct
            case MITH:
                return "Mithril";
            case MITX:
                return "Morpheus Labs";
            case MKR:
                return "Maker";
            case MLM:
                return "MktCoin";
            case MLN:
                return "Melon";
            case MNA:
                return "MNA"; // TODO: Make sure this is correct
            case MNC:
                return "Mincoin";
            case MND:
                return "MindCoin";
            case MNE:
                return "Minereum";
            case MNM:
                return "Mineum";
            case MNTP:
                return "GoldMint";
            case MNX:
                return "MinexCoin";
            case MOAC:
                return "MOAC";
            case MOBI:
                return "Mobius";
            case MOC:
                return "Mossland";
            case MOD:
                return "Modum";
            case MOIN:
                return "Moin";
            case MOJO:
                return "MojoCoin";
            case MONA:
                return "MonaCoin";
            case MONK:
                return "Monkey Project";
            case MOON:
                return "Mooncoin";
            case MORE:
                return "More Coin";
            case MORPH:
                return "Morpheus Network";
            case MOT:
                return "Olympus Labs";
            case MOTO:
                return "Motocoin";
            case MRJA:
                return "GanjaCoin";
            case MRK:
                return "MARK.SPACE";
            case MRT:
                return "Miners' Rewar...";
            case MSCN:
                return "Master Swiscoin";
            case MSP:
                return "Mothership";
            case MSR:
                return "Masari";
            case MST:
                return "MustangCoin";
            case MTC:
                return "Docademic";
            case MTH:
                return "Monetha";
            case MTL:
                return "Metal";
            case MTN:
                return "Medicalchain";
            case MTNC:
                return "Masternodecoin";
            case MTX:
                return "Matryx";
            case MUE:
                return "MonetaryUnit";
            case MUSE:
                return "MUSE";
            case MUSIC:
                return "Musicoin";
            case MVC:
                return "Maverick Chain";
            case MVP:
                return "Merculet";
            case MWAT:
                return "Restart Energ...";
            case MXT:
                return "MarteXcoin";
            case MYB:
                return "MyBit Token";
            case MYST:
                return "Mysterium";
            case MZC:
                return "MAZA";
            case NANJ:
                return "NANJCOIN";
            case NANO:
                return "Nano";
            case NANOX:
                return "Project-X";
            case NAS:
                return "Nebulas";
            case NAV:
                return "NavCoin";
            case NAVI:
                return "Naviaddress";
            case NBAI:
                return "Nebula AI";
            case NBT:
                return "NBT"; // TODO: Make sure this is correct
            case NCA:
                return "NCA"; // TODO: Make sure this is correct
            case NCASH:
                return "Nucleus Vision";
            case NCT:
                return "PolySwarm";
            case NDC:
                return "NEVERDIE";
            case NEBL:
                return "Neblio";
            case NEC:
                return "Nectar";
            case NEO:
                return "NEO";
            case NEOS:
                return "NeosCoin";
            case NET:
                return "Nimiq Exchang...";
            case NET2:
                return "NetCoin";
            case NETKO:
                return "Netko";
            case NEU:
                return "Neumark";
            case NEVA:
                return "NevaCoin";
            case NEWB:
                return "Newbium";
            case NEXO:
                return "Nexo";
            case NGC:
                return "NAGA";
            case NIO:
                return "Autonio";
            case NKA:
                return "IncaKoin";
            case NKC:
                return "Nework";
            case NKN:
                return "NKN";
            case NLC2:
                return "NoLimitCoin";
            case NLG:
                return "Gulden";
            case NLX:
                return "Nullex";
            case NMC:
                return "Namecoin";
            case NMR:
                return "Numeraire";
            case NMS:
                return "Numus";
            case NOAH:
                return "Noah Coin";
            case NOBL:
                return "NobleCoin";
            case NODC:
                return "NodeCoin";
            case NOTE:
                return "DNotes";
            case NOX:
                return "Nitro";
            case NPER:
                return "NPER";
            case NPX:
                return "NaPoleonX";
            case NRO:
                return "Neuro";
            case NSR:
                return "NuShares";
            case NTK:
                return "Neurotoken";
            case NTO:
                return "Fujinto";
            case NTRN:
                return "Neutron";
            case NTWK:
                return "Network Token";
            case NTY:
                return "Nexty";
            case NUKO:
                return "Nekonium";
            case NULS:
                return "Nuls";
            case NVC:
                return "Novacoin";
            case NVST:
                return "NVO";
            case NXC:
                return "Nexium";
            case NXS:
                return "Nexus";
            case NXT:
                return "Nxt";
            case NXX:
                return "Nexxus";
            case NYAN:
                return "Nyancoin";
            case NYC:
                return "NewYorkCoin";
            case OAX:
                return "OAX";
            case OBITS:
                return "OBITS";
            case OCC:
                return "Octoin Coin";
            case OCL:
                return "Oceanlab";
            case OCN:
                return "Odyssey";
            case OCT:
                return "OracleChain";
            case ODE:
                return "ODEM";
            case ODN:
                return "Obsidian";
            case OFF:
                return "Cthulhu Offer...";
            case OK:
                return "OKCash";
            case OLE:
                return "Olive";
            case OMG:
                return "OmiseGO";
            case OMNI:
                return "Omni";
            case OMX:
                return "Shivom";
            case ONG:
                return "onG.social";
            case ONION:
                return "DeepOnion";
            case ONL:
                return "On.Live";
            case ONT:
                return "Ontology";
            case ONX:
                return "Onix";
            case OOT:
                return "Utrum";
            case OPAL:
                return "Opal";
            case OPC:
                return "OP Coin";
            case OPT:
                return "Opus";
            case ORB:
                return "Orbitcoin";
            case ORE:
                return "Galactrum";
            case ORI:
                return "Origami";
            case ORLY:
                return "Orlycoin";
            case ORME:
                return "Ormeus Coin";
            case ORS:
                return "Origin Sport";
            case OST:
                return "OST";
            case OTN:
                return "Open Trading ...";
            case OTX:
                return "Octanox";
            case OXY:
                return "Oxycoin";
            case PAC:
                return "PACcoin";
            case PAI:
                return "PCHAIN";
            case PAK:
                return "Pakcoin";
            case PAL:
                return "PolicyPal Net...";
            case PARETO:
                return "Pareto Network";
            case PART:
                return "Particl";
            case PASC:
                return "Pascal Coin";
            case PASL:
                return "Pascal Lite";
            case PAT:
                return "Patron";
            case PAY:
                return "TenX";
            case PAYX:
                return "Paypex";
            case PBL:
                return "Publica";
            case PBT:
                return "Primalbase Token";
            case PCH:
                return "POPCHAIN";
            case PCL:
                return "Peculium";
            case PCN:
                return "PeepCoin";
            case PCOIN:
                return "Pioneer Coin";
            case PDC:
                return "Project Decorum";
            case PEPECASH:
                return "Pepe Cash";
            case PEX:
                return "PosEx";
            case PFR:
                return "Payfair";
            case PGL:
                return "Prospectors Gold";
            case PHI:
                return "PHI Token";
            case PHO:
                return "Photon";
            case PHR:
                return "Phore";
            case PHS:
                return "Philosopher S...";
            case PIE:
                return "PIECoin";
            case PIGGY:
                return "Piggycoin";
            case PING:
                return "CryptoPing";
            case PINK:
                return "PinkCoin";
            case PIPL:
                return "PiplCoin";
            case PIRL:
                return "Pirl";
            case PIVX:
                return "PIVX";
            case PIX:
                return "Lampix";
            case PIZZA:
                return "PizzaCoin";
            case PKB:
                return "ParkByte";
            case PKC:
                return "PikcioChain";
            case PKT:
                return "Playkey";
            case PLACO:
                return "PlayerCoin";
            case PLAN:
                return "Plancoin";
            case PLAY:
                return "HEROcoin";
            case PLBT:
                return "Polybius";
            case PLC:
                return "Polcoin";
            case PLNC:
                return "PLNcoin";
            case PLR:
                return "Pillar";
            case PLU:
                return "Pluton";
            case PMNT:
                return "Paymon";
            case PND:
                return "Pandacoin";
            case PNX:
                return "Phantomx";
            case POA:
                return "POA Network";
            case POE:
                return "Po.et";
            case POLIS:
                return "Polis";
            case POLL:
                return "ClearPoll";
            case POLY:
                return "Polymath";
            case POP:
                return "PopularCoin";
            case POS:
                return "PoSToken";
            case POST:
                return "PostCoin";
            case POSW:
                return "PoSW Coin";
            case POT:
                return "PotCoin";
            case POWR:
                return "Power Ledger";
            case POY:
                return "POY"; // TODO: Make sure this is correct
            case PPC:
                return "Peercoin";
            case PPP:
                return "PayPie";
            case PPT:
                return "Populous";
            case PPY:
                return "Peerplays";
            case PR:
                return "Prototanium";
            case PRA:
                return "ProChain";
            case PRC:
                return "PRCoin";
            case PRE:
                return "Presearch";
            case PRG:
                return "Paragon";
            case PRIX:
                return "Privatix";
            case PRL:
                return "Oyster";
            case PRO:
                return "Propy";
            case PROC:
                return "ProCurrency";
            case PRX:
                return "Printerium";
            case PST:
                return "Primas";
            case PTC:
                return "Pesetacoin";
            case PTOY:
                return "Patientory";
            case PTT:
                return "Proton Token";
            case PULSE:
                return "Pulse";
            case PURA:
                return "Pura";
            case PURE:
                return "Pure";
            case PUT:
                return "PutinCoin";
            case PX:
                return "PX";
            case PXC:
                return "Phoenixcoin";
            case PXI:
                return "Prime-XI";
            case PYLNT:
                return "Pylon Network";
            case PZM:
                return "PRIZM";
            case Q2C:
                return "QubitCoin";
            case QASH:
                return "QASH";
            case QAU:
                return "Quantum";
            case QBC:
                return "Quebecoin";
            case QBIC:
                return "Qbic";
            case QBT:
                return "Qbao";
            case QCN:
                return "QuazarCoin";
            case QKC:
                return "QuarkChain";
            case QLC:
                return "QLINK";
            case QRK:
                return "Quark";
            case QRL:
                return "Quantum Resis...";
            case QSH:
                return "QSH"; // TODO: Make sure this is correct
            case QSP:
                return "Quantstamp";
            case QTL:
                return "Quatloo";
            case QTM:
                return "QTM"; // TODO: Make sure this is correct
            case QTUM:
                return "Qtum";
            case QUN:
                return "QunQun";
            case QVT:
                return "Qvolta";
            case QWARK:
                return "Qwark";
            case R:
                return "Revain";
            case RADS:
                return "Radium";
            case RAIN:
                return "Condensate";
            case RBIES:
                return "Rubies";
            case RBT:
                return "Rimbit";
            case RBX:
                return "Ripto Bux";
            case RBY:
                return "Rubycoin";
            case RC:
                return "RussiaCoin";
            case RCN:
                return "Ripio Credit ...";
            case RCT:
                return "RealChain";
            case RDD:
                return "ReddCoin";
            case RDN:
                return "Raiden Networ...";
            case REAL:
                return "REAL";
            case REBL:
                return "REBL";
            case REC:
                return "Regalcoin";
            case RED:
                return "RedCoin";
            case REE:
                return "ReeCoin";
            case REF:
                return "RefToken";
            case REM:
                return "Remme";
            case REN:
                return "Republic Prot...";
            case REP:
                return "Augur";
            case REQ:
                return "Request Network";
            case REX:
                return "imbrex";
            case RFR:
                return "Refereum";
            case RHOC:
                return "RChain";
            case RIC:
                return "Riecoin";
            case RIDE:
                return "Ride My Car";
            case RISE:
                return "Rise";
            case RIYA:
                return "Etheriya";
            case RKC:
                return "Royal Kingdom...";
            case RKT:
                return "Rock";
            case RLC:
                return "iExec RLC";
            case RLT:
                return "RouletteToken";
            case RMC:
                return "Russian Miner...";
            case RMC2:
                return "Remicoin";
            case RMT:
                return "SureRemit";
            case RNS:
                return "Renos";
            case RNT:
                return "OneRoot Network";
            case RNTB:
                return "BitRent";
            case ROOFS:
                return "Roofs";
            case RPC:
                return "RonPaulCoin";
            case RPX:
                return "Red Pulse";
            case RRT:
                return "RRT"; // TODO: Make sure this is correct
            case RTB:
                return "AB-Chain RTB";
            case RTE:
                return "Rate3";
            case RUFF:
                return "Ruff";
            case RUP:
                return "Rupee";
            case RUPX:
                return "Rupaya";
            case RUSTBITS:
                return "Rustbits";
            case RVN:
                return "Ravencoin";
            case RVR:
                return "RevolutionVR";
            case RVT:
                return "Rivetz";
            case SAC:
                return "SACoin";
            case SAFEX:
                return "Safe Exchange...";
            case SAGA:
                return "SagaCoin";
            case SALT:
                return "SALT";
            case SAN:
                return "Santiment Net...";
            case SANDG:
                return "Save and Gain";
            case SBD:
                return "Steem Dollars";
            case SC:
                return "Siacoin";
            case SCL:
                return "Sociall";
            case SCORE:
                return "Scorecoin";
            case SCRL:
                return "Scroll";
            case SCRT:
                return "SecretCoin";
            case SCS:
                return "SpeedCash";
            case SCT:
                return "Soma";
            case SDC:
                return "ShadowCash";
            case SDRN:
                return "Senderon";
            case SEE:
                return "SEE"; // TODO: Make sure this is correct
            case SEN:
                return "SEN"; // TODO: Make sure this is correct
            case SENC:
                return "Sentinel Chain";
            case SEND:
                return "Social Send";
            case SENSE:
                return "Sense";
            case SENT:
                return "Sentinel";
            case SEQ:
                return "Sequence";
            case SETH:
                return "Sether";
            case SEXC:
                return "ShareX";
            case SFC:
                return "Solarflarecoin";
            case SGN:
                return "Signals Network";
            case SGR:
                return "Sugar Exchange";
            case SH:
                return "Shilling";
            case SHDW:
                return "Shadow Token";
            case SHIFT:
                return "Shift";
            case SHIP:
                return "ShipChain";
            case SHL:
                return "Oyster Shell";
            case SHND:
                return "StrongHands";
            case SHORTY:
                return "Shorty";
            case SHP:
                return "Sharpe Platfo...";
            case SIB:
                return "SIBCoin";
            case SIG:
                return "Spectiv";
            case SIGT:
                return "Signatum";
            case SKB:
                return "Sakura Bloom";
            case SKC:
                return "Skeincoin";
            case SKIN:
                return "SkinCoin";
            case SKY:
                return "Skycoin";
            case SLEVIN:
                return "Slevin";
            case SLG:
                return "Sterlingcoin";
            case SLM:
                return "Slimcoin";
            case SLR:
                return "SolarCoin";
            case SLS:
                return "SaluS";
            case SLT:
                return "Smartlands";
            case SMART:
                return "SmartCash";
            case SMC:
                return "SmartCoin";
            case SMLY:
                return "SmileyCoin";
            case SMS:
                return "Speed Mining ...";
            case SMT:
                return "SmartMesh";
            case SNC:
                return "SunContract";
            case SNG:
                return "SNG"; // TODO: Make sure this is correct
            case SNGLS:
                return "SingularDTV";
            case SNM:
                return "SONM";
            case SNOV:
                return "Snovio";
            case SNRG:
                return "Synergy";
            case SNT:
                return "Status";
            case SNTR:
                return "Silent Notary";
            case SOAR:
                return "Soarcoin";
            case SOC:
                return "All Sports";
            case SOCC:
                return "SocialCoin";
            case SOIL:
                return "SOILcoin";
            case SOJ:
                return "Sojourn";
            case SONG:
                return "SongCoin";
            case SOON:
                return "SoonCoin";
            case SOUL:
                return "Phantasma";
            case SPACE:
                return "SpaceCoin";
            case SPANK:
                return "SpankChain";
            case SPC:
                return "SpaceChain";
            case SPD:
                return "Stipend";
            case SPEX:
                return "SproutsExtreme";
            case SPF:
                return "SportyCo";
            case SPHR:
                return "Sphere";
            case SPHTX:
                return "SophiaTX";
            case SPK:
                return "Sparks";
            case SPR:
                return "SpreadCoin";
            case SPRTS:
                return "Sprouts";
            case SPT:
                return "Spots";
            case SRC:
                return "SecureCoin";
            case SRCOIN:
                return "SRCOIN";
            case SRN:
                return "SIRIN LABS Token";
            case SS:
                return "Sharder";
            case SSC:
                return "SelfSell";
            case SSP:
                return "Smartshare";
            case SSS:
                return "Sharechain";
            case STA:
                return "Starta";
            case STAC:
                return "StarterCoin";
            case STAK:
                return "STRAKS";
            case STAR:
                return "Starbase";
            case STARS:
                return "StarCash Network";
            case START:
                return "Startcoin";
            case STEEM:
                return "Steem";
            case STJ:
                return "STJ"; // TODO: Make sure this is correct
            case STK:
                return "STK";
            case STN:
                return "Steneum Coin";
            case STORJ:
                return "Storj";
            case STORM:
                return "Storm";
            case STQ:
                return "Storiqa";
            case STR:
                return "STR"; // TODO: Make sure this is correct
            case STRAT:
                return "Stratis";
            case STRC:
                return "StarCredits";
            case STU:
                return "bitJob";
            case STV:
                return "Sativacoin";
            case STX:
                return "Stox";
            case SUB:
                return "Substratum";
            case SUMO:
                return "Sumokoin";
            case SUPER:
                return "SuperCoin";
            case SUR:
                return "Suretly";
            case SWFTC:
                return "SwftCoin";
            case SWH:
                return "Switcheo";
            case SWIFT:
                return "Bitswift";
            case SWING:
                return "Swing";
            case SWM:
                return "Swarm";
            case SWT:
                return "Swarm City";
            case SWTH:
                return "Switcheo";
            case SXC:
                return "Sexcoin";
            case SXDT:
                return "Spectre.ai Di...";
            case SXUT:
                return "Spectre.ai Ut...";
            case SYNX:
                return "Syndicate";
            case SYS:
                return "Syscoin";
            case TAAS:
                return "TaaS";
            case TAG:
                return "TagCoin";
            case TAJ:
                return "TajCoin";
            case TALK:
                return "BTCtalkcoin";
            case TAU:
                return "Lamden";
            case TBAR:
                return "Titanium BAR";
            case TBX:
                return "Tokenbox";
            case TCC:
                return "The ChampCoin";
            case TCT:
                return "TokenClub";
            case TDS:
                return "TokenDesk";
            case TDX:
                return "Tidex Token";
            case TEAM:
                return "TEAM (TokenSt...";
            case TEK:
                return "TEKcoin";
            case TEL:
                return "Telcoin";
            case TEN:
                return "Tokenomy";
            case TERN:
                return "Ternio";
            case TES:
                return "TeslaCoin";
            case TFD:
                return "TE-FOOD";
            case TFL:
                return "TrueFlip";
            case TGAME:
                return "Truegame";
            case TGC:
                return "Tigercoin";
            case TGT:
                return "Target Coin";
            case THC:
                return "HempCoin";
            case THETA:
                return "Theta Token";
            case THRT:
                return "Thrive Token";
            case TIE:
                return "Ties.DB";
            case TIG:
                return "Tigereum";
            case TIME:
                return "Chronobank";
            case TIO:
                return "Trade Token";
            case TIPS:
                return "FedoraCoin";
            case TIT:
                return "Titcoin";
            case TIX:
                return "Blocktix";
            case TKA:
                return "Tokia";
            case TKN:
                return "TokenCard";
            case TKR:
                return "CryptoInsight";
            case TKS:
                return "Tokes";
            case TKY:
                return "THEKEY";
            case TNB:
                return "Time New Bank";
            case TNC:
                return "Trinity Netwo...";
            case TNS:
                return "Transcodium";
            case TNT:
                return "Tierion";
            case TOA:
                return "ToaCoin";
            case TOK:
                return "Tokugawa";
            case TOKC:
                return "TOKYO";
            case TOMO:
                return "TomoChain";
            case TOR:
                return "Torcoin";
            case TPAY:
                return "TokenPay";
            case TRAC:
                return "OriginTrail";
            case TRAK:
                return "TrakInvest";
            case TRC:
                return "Terracoin";
            case TRCT:
                return "Tracto";
            case TRDT:
                return "Trident Group";
            case TRF:
                return "Travelflex";
            case TRI:
                return "Triangles";
            case TRIA:
                return "Triaconta";
            case TRIG:
                return "Triggers";
            case TRK:
                return "Truckcoin";
            case TROLL:
                return "Trollcoin";
            case TRST:
                return "WeTrust";
            case TRTL:
                return "Turtlecoin";
            case TRUE:
                return "True Chain";
            case TRUMP:
                return "TrumpCoin";
            case TRUST:
                return "TrustPlus";
            case TRX:
                return "TRON";
            case TSE:
                return "Tattoocoin (S...";
            case TSL:
                return "Energo";
            case TSTR:
                return "Tristar Coin";
            case TTC:
                return "TittieCoin";
            case TTT:
                return "TrustNote";
            case TTU:
                return "TaTaTu";
            case TUBE:
                return "BitTube";
            case TUSD:
                return "TrueUSD";
            case TX:
                return "TransferCoin";
            case TYCHO:
                return "Tychocoin";
            case TZC:
                return "TrezarCoin";
            case UBQ:
                return "Ubiq";
            case UBT:
                return "Unibright";
            case UCASH:
                return "U.CASH";
            case UCOM:
                return "United Crypto...";
            case UET:
                return "Useless Ether...";
            case UFO:
                return "Uniform Fisca...";
            case UFR:
                return "Upfiring";
            case UGC:
                return "ugChain";
            case UIS:
                return "Unitus";
            case UKG:
                return "Unikoin Gold";
            case ULA:
                return "Ulatech";
            case UNB:
                return "UnbreakableCoin";
            case UNI:
                return "Universe";
            case UNIC:
                return "UniCoin";
            case UNIFY:
                return "Unify";
            case UNIT:
                return "Universal Cur...";
            case UNITS:
                return "GameUnits";
            case UNITY:
                return "SuperNET";
            case UNO:
                return "Unobtanium";
            case UNY:
                return "Unity Ingot";
            case UP:
                return "UpToken";
            case UPP:
                return "Sentinel Prot...";
            case UQC:
                return "Uquid Coin";
            case URO:
                return "Uro";
            case USC:
                return "Ultimate Secu...";
            case USD:
                return "United States Dollar";
            case USDT:
                return "Tether";
            case USNBT:
                return "NuBits";
            case UTC:
                return "UltraCoin";
            case UTK:
                return "UTRUST";
            case UTNP:
                return "Universa";
            case UTT:
                return "United Trader...";
            case UUU:
                return "U Network";
            case V:
                return "Version";
            case VAL:
                return "Valorbit";
            case VC:
                return "VirtualCoin";
            case VEC2:
                return "VectorAI";
            case VEE:
                return "BLOCKv";
            case VEN:
                return "VeChain";
            case VERI:
                return "Veritaseum";
            case VIA:
                return "Viacoin";
            case VIB:
                return "Viberate";
            case VIBE:
                return "VIBE";
            case VIDZ:
                return "PureVidz";
            case VISIO:
                return "Visio";
            case VIT:
                return "Vice Industry...";
            case VITE:
                return "VITE";
            case VIU:
                return "Viuly";
            case VIVO:
                return "VIVO";
            case VLT:
                return "Veltor";
            case VLTC:
                return "Vault Coin";
            case VME:
                return "VeriME";
            case VOISE:
                return "Voise";
            case VOLT:
                return "Bitvolt";
            case VOT:
                return "VoteCoin";
            case VOX:
                return "Voxels";
            case VPRC:
                return "VapersCoin";
            case VRC:
                return "VeriCoin";
            case VRM:
                return "VeriumReserve";
            case VRS:
                return "Veros";
            case VSL:
                return "vSlice";
            case VSX:
                return "Vsync";
            case VTA:
                return "Virtacoin";
            case VTC:
                return "Vertcoin";
            case VTR:
                return "vTorrent";
            case VUC:
                return "Virta Unique ...";
            case VULC:
                return "Vulcano";
            case VZT:
                return "Vezt";
            case WABI:
                return "WaBi";
            case WAN:
                return "Wanchain";
            case WAND:
                return "WandX";
            case WARP:
                return "WARP";
            case WAVES:
                return "Waves";
            case WAX:
                return "WAX";
            case WAY:
                return "WayGuide";
            case WBB:
                return "Wild Beast Block";
            case WCT:
                return "Waves Communi...";
            case WDC:
                return "WorldCoin";
            case WGO:
                return "WavesGo";
            case WGR:
                return "Wagerr";
            case WHL:
                return "WhaleCoin";
            case WICC:
                return "WaykiChain";
            case WILD:
                return "Wild Crypto";
            case WIN:
                return "WCOIN";
            case WINGS:
                return "Wings";
            case WISH:
                return "MyWish";
            case WOMEN:
                return "WomenCoin";
            case WORM:
                return "HealthyWormCoin";
            case WPR:
                return "WePower";
            case WRC:
                return "Worldcore";
            case WSX:
                return "WeAreSatoshi";
            case WTC:
                return "Waltonchain";
            case WTT:
                return "Giga Watt Token";
            case XAS:
                return "Asch";
            case XAUR:
                return "Xaurum";
            case XBC:
                return "Bitcoin Plus";
            case XBL:
                return "Billionaire T...";
            case XBP:
                return "BlitzPredict";
            case XBTC21:
                return "Bitcoin 21";
            case XBTS:
                return "Beatcoin";
            case XBY:
                return "XTRABYTES";
            case XCN:
                return "Cryptonite";
            case XCO:
                return "X-Coin";
            case XCP:
                return "Counterparty";
            case XCPO:
                return "Copico";
            case XCRE:
                return "Creatio";
            case XCT:
                return "C-Bit";
            case XCXT:
                return "CoinonatX";
            case XDCE:
                return "XinFin Network";
            case XDG:
                return "XDG"; // TODO: Make sure this is correct
            case XDN:
                return "DigitalNote";
            case XEL:
                return "Elastic";
            case XEM:
                return "NEM";
            case XES:
                return "Proxeus";
            case XFT:
                return "Footy Cash";
            case XGOX:
                return "XGOX";
            case XGR:
                return "GoldReserve";
            case XHI:
                return "HiCoin";
            case XHV:
                return "Haven Protocol";
            case XIN:
                return "Mixin";
            case XIOS:
                return "Xios";
            case XJO:
                return "Joulecoin";
            case XLC:
                return "Leviar";
            case XLM:
                return "Stellar";
            case XLR:
                return "Solaris";
            case XMCC:
                return "Monoeci";
            case XMCT:
                return "XMCT";
            case XMG:
                return "Magi";
            case XMR:
                return "Monero";
            case XMX:
                return "XMax";
            case XMY:
                return "Myriad";
            case XNG:
                return "Enigma";
            case XNK:
                return "Ink Protocol";
            case XNN:
                return "Xenon";
            case XOC:
                return "Xonecoin";
            case XP:
                return "Experience Po...";
            case XPA:
                return "XPA";
            case XPD:
                return "PetroDollar";
            case XPM:
                return "Primecoin";
            case XPTX:
                return "PlatinumBAR";
            case XPY:
                return "PayCoin";
            case XRA:
                return "Ratecoin";
            case XRC:
                return "Rawcoin";
            case XRE:
                return "RevolverCoin";
            case XRH:
                return "Rhenium";
            case XRL:
                return "Rialto";
            case XRP:
                return "Ripple";
            case XSG:
                return "SnowGem";
            case XSH:
                return "SHIELD";
            case XSN:
                return "Stakenet";
            case XSPEC:
                return "Spectrecoin";
            case XST:
                return "Stealth";
            case XSTC:
                return "Safe Trade Coin";
            case XTL:
                return "Stellite";
            case XTO:
                return "Tao";
            case XTZ:
                return "Tezos";
            case XUC:
                return "Exchange Union";
            case XVC:
                return "Vcash";
            case XVG:
                return "Verge";
            case XVP:
                return "Virtacoinplus";
            case XWC:
                return "WhiteCoin";
            case XYO:
                return "XYO Network";
            case XZC:
                return "ZCoin";
            case YAC:
                return "Yacoin";
            case YASH:
                return "YashCoin";
            case YEE:
                return "YEE";
            case YOC:
                return "Yocoin";
            case YOYOW:
                return "YOYOW";
            case YTN:
                return "YENTEN";
            case YUP:
                return "Crowdholding";
            case YYW:
                return "YYW"; // TODO: Make sure this is correct
            case ZAP:
                return "Zap";
            case ZBC:
                return "Zilbercoin";
            case ZCG:
                return "Zlancer";
            case ZCL:
                return "ZClassic";
            case ZCN:
                return "0chain";
            case ZCO:
                return "Zebi";
            case ZEC:
                return "Zcash";
            case ZEIT:
                return "Zeitcoin";
            case ZEN:
                return "ZenCash";
            case ZENI:
                return "Zennies";
            case ZEPH:
                return "Zephyr";
            case ZER:
                return "Zero";
            case ZET:
                return "Zetacoin";
            case ZIL:
                return "Zilliqa";
            case ZINC:
                return "ZINC";
            case ZIPT:
                return "Zippie";
            case ZLA:
                return "Zilla";
            case ZMC:
                return "ZetaMicron";
            case ZNY:
                return "Bitzeny";
            case ZOI:
                return "Zoin";
            case ZPT:
                return "Zeepin";
            case ZRC:
                return "ZrCoin";
            case ZRX:
                return "0x";
            case ZSC:
                return "Zeusshield";
            case ZUR:
                return "Zurcoin";
            case ZYD:
                return "Zayedcoin";
            case ZZC:
                return "ZoZoCoin";
            default:
                return "N/A";
        }//end switch
    }//end fullName(CryptoCurrency)

    /* Is In */

    /**
     * TODO: Fill in
     * @param website TODO: Fill in
     * @param fiatCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInGivenFiat(FiatCurrencies[] website, FiatCurrencies fiatCurrency) {
        for (FiatCurrencies currency : website) {
            if (fiatCurrency.equals(currency)) return true;
        }//end for
        return false;
    }//end isInGivenFiat()

    /**
     * TODO: Fill in
     * @param website TODO: Fill in
     * @param cryptoCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInGivenCrypto(CryptoCurrencies[] website, CryptoCurrencies cryptoCurrency) {
        for (CryptoCurrencies currency : website) {
            if (cryptoCurrency.equals(currency)) return true;
        }//end for
        return false;
    }//end isInGivenCrypto()

    // Is In Fiats

    /**
     * TODO: Fill in
     * @param fiatCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInCoinBase(FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.COINBASE_FIAT_CURRENCIES, fiatCurrency);
    }//end isInCoinBase(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInCoinCap(FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.COINCAP_FIAT_CURRENCIES, fiatCurrency);
    }//end isInCoinCap(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInCoinMarketCap(FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.COINMARKETCAP_FIAT_CURRENCIES, fiatCurrency);
    }//end isInCoinMarketCap(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInCryptoCompare(FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.CRYPTOCOMPARE_FIAT_CURRENCIES, fiatCurrency);
    }//end isInCryptoCompare(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInLiqui(FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.LIQUI_FIAT_CURRENCIES, fiatCurrency);
    }//end isInLiqui(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInQuadrigacx(FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.QUADRIGACX_FIAT_CURRENCIES, fiatCurrency);
    }//end isInQuadrigacx(FiatCurrency)

    /**
     * TODO: Fill in
     * @param fiatCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInShapeShift(FiatCurrencies fiatCurrency) {
        return isInGivenFiat(NamingTools.SHAPESHIFT_FIAT_CURRENCIES, fiatCurrency);
    }//end isInShapeShift(FiatCurrency)

    // Is In Crypto

    /**
     * TODO: Fill in
     * @param cryptoCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInCoinBase(CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.COINBASE_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInCoinBase(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInCoinCap(CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.COINCAP_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInCoinCap(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInCoinMarketCap(CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.COINMARKETCAP_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInCoinMarketCap(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInCryptoCompare(CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.CRYPTOCOMPARE_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInCryptoCompare(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInLiqui(CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.LIQUI_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInLiqui(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInQuadrigacx(CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.QUADRIGACX_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInQuadrigacx(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param cryptoCurrency TODO: Fill in
     * @return TODO: Fill in
     */
    public static boolean isInShapeShift(CryptoCurrencies cryptoCurrency) {
        return isInGivenCrypto(NamingTools.SHAPESHIFT_CRYPTO_CURRENCIES, cryptoCurrency);
    }//end isInShapeShift(CryptoCurrency)

    /* Get Names */

    // Get Fiat Names

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getCoinBaseCurrencySymbol(FiatCurrencies currency) {
        if (!NamingTools.isInCoinBase(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinBase
        return currency.toString();
    }//end getCoinBaseCurrencySymbol(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getCoinCapCurrencySymbol(FiatCurrencies currency) {
        if (!NamingTools.isInCoinCap(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinCap
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getCoinCapCurrencySymbol(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getCoinMarketCapCurrencySymbol(FiatCurrencies currency) {
        if (!NamingTools.isInCoinMarketCap(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinMarketCap
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getCoinMarketCapCurrencySymbol(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getCryptoCompareCurrencySymbol(FiatCurrencies currency) {
        if (!NamingTools.isInCryptoCompare(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CryptoCompare
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getCryptoCompareCurrencySymbol(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getLiquiCurrencySymbol(FiatCurrencies currency) {
        if (!NamingTools.isInLiqui(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in Liqui
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getLiquiCurrencySymbol(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getQuadrigacxCurrencySymbol(FiatCurrencies currency) {
        if (!NamingTools.isInQuadrigacx(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in Quadrigacx
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getQuadrigacxCurrencySymbol(FiatCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getShapeShiftCurrencySymbol(FiatCurrencies currency) {
        if (!NamingTools.isInShapeShift(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in ShapeShift
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getShapeShiftCurrencySymbol(FiatCurrency)

    // Get Crypto Names

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getCoinBaseCurrencySymbol(CryptoCurrencies currency) {
        if (!NamingTools.isInCoinBase(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinBase
        return currency.toString();
    }//end getCoinBaseCurrencySymbol(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getCoinCapCurrencySymbol(CryptoCurrencies currency) {
        if (!NamingTools.isInCoinCap(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinCap
        // TODO: Figure out what to actually return
        switch (currency) {
            case A0XBTC:
                return "0XBTC";
            case A1ST:
                return "1ST";
            case A1WO:
                return "1WO";
            case A2GIVE:
                return "2GIVE";
            case A300:
                return "300";
            case A611:
                return "611";
            case A808:
                return "808";
            case A888:
                return "888";
            case A8BIT:
                return "8BIT";
            default:
                return currency.toString();
        }//end switch
    }//end getCoinCapCurrencySymbol(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getCoinMarketCapCurrencySymbol(CryptoCurrencies currency) {
        if (!NamingTools.isInCoinMarketCap(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CoinMarketCap
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getCoinMarketCapCurrencySymbol(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getCryptoCompareCurrencySymbol(CryptoCurrencies currency) {
        if (!NamingTools.isInCryptoCompare(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in CryptoCompare
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getCryptoCompareCurrencySymbol(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getLiquiCurrencySymbol(CryptoCurrencies currency) {
        if (!NamingTools.isInLiqui(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in Liqui
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getLiquiCurrencySymbol(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getQuadrigacxCurrencySymbol(CryptoCurrencies currency) {
        if (!NamingTools.isInQuadrigacx(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in Quadrigacx
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getQuadrigacxCurrencySymbol(CryptoCurrency)

    /**
     * TODO: Fill in
     * @param currency TODO: Fill in
     * @return TODO: Fill in
     */
    public static String getShapeShiftCurrencySymbol(CryptoCurrencies currency) {
        if (!NamingTools.isInShapeShift(currency)) {
            // TODO: Throw some sort of error
            return "N/A";
        }//end if isn't in ShapeShift
        // TODO: Figure out what to actually return
        return currency.toString();
    }//end getShapeShiftCurrencySymbol(CryptoCurrency)

}//end NamingTools
