package com.company.api_calls;

/**
 * TODO: Fill this out
 */
public abstract class AbstractJSONCaller extends AbstractAPICaller {

    /****************
     *    Fields    *
     ****************/

    /****************
     * Constructors *
     ****************/

    /**
     * A constructor for the Abstract JSON caller
     * @param currency
     */
    public AbstractJSONCaller(String currency, String name) {
        super(currency, name);
    }//end AbstractJSONCaller()

    /****************
     *   Methods    *
     ****************/

    /**
     * Gets the new price of the currency
     * @return The new price of the currency
     */
    @Override
    protected double getNewPrice() {
        // TODO: Figure out how to do the JSON (JSON.SIMPLE or whatever it's called)
        try {
            /*InputStream is = url.openStream();
            JSONReader reader = ;
            JSON*/

        }
        catch (Exception e) {
            // If we can't get the new price, return the price that we have
            // TODO: Do something in the future to notify there was a failure in getting the updated price
            return this.getPrice();
        }
        // TODO: Change the return statement once everything is figured out
        return 0;
    }//end getNewPrice()
}//end AbstractJSONCaller
