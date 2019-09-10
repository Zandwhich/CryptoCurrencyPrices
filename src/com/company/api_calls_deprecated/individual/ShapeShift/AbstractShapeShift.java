//package com.company.api_calls_deprecated.individual.ShapeShift;
//
//import com.company.api_calls.AbstractJSONCaller;
//import com.company.controller.ControllerInterface;
//
///**
// * TODO: Fill in
// */
//public abstract class AbstractShapeShift extends AbstractJSONCaller {
//
//    /****************
//     *    Fields    *
//     ****************/
//
//    /**
//     * The base URL for ShapeShift requests
//     * TODO: Put in actual base URL
//     */
//    public final static String BASE_URL = "";
//
//    /****************
//     * Constructors *
//     ****************/
//
//    /**
//     * A constructor for the AbstractShapeShift class
//     * @param cryptoCurrency The cryptocurrency
//     * @param fiatCurrency The fiat currency
//     * @param name The name of class
//     * @param urlExt The specific extension of the url
//     * @param controller The controller that calls this endpoint
//     */
//    public AbstractShapeShift(final String cryptoCurrency, final String fiatCurrency, final String name,
//                              final String urlExt, ControllerInterface controller) {
//        super(cryptoCurrency, fiatCurrency, name, AbstractShapeShift.BASE_URL + urlExt, controller);
//    }//end AbstractShapeShift()
//
//    /****************
//     *   Methods    *
//     ****************/
//
//    /* Public */
//
//    // Getters
//
//    /**
//     * Returns the base URL
//     * @return The base URL
//     */
//    @Override
//    public String getBaseUrl() { return AbstractShapeShift.BASE_URL; }//end getBaseUrl()
//
//    /* Protected */
//
//    // TODO: Override the extract price method
//}//end AbstractShapeShift
