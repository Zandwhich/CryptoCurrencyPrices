package com.company;

public abstract class AbstractAPICaller implements APICallerInterface {

    /****************/
    /*    Fields    */
    /****************/

    private double price;
    private String currency;
    private boolean hasPrice;


    /****************/
    /* Constructors */
    /****************/

    public AbstractAPICaller(final String currency) {
        this.currency = currency;
        this.hasPrice = false;
        this.price = 0.0;
    }//end AbstractAPICaller()

    /****************/
    /*    Methods   */
    /****************/

    /* Public */

    // Getters
    @Override
    public double getPrice() { return price; }//end getPrice()
    @Override
    public String getCurrency() { return currency; }//end getCurrency()
    @Override
    public boolean getHasPrice() { return hasPrice; }//end getHasPrice()

    // Other
    @Override
    public void updatePrice() { price = getNewPrice(); }//end updatePrice()

    // Setters
    protected void setPrice(final double price) { this.price = price; }//end setPrice()
    protected void setHasPrice(final boolean hasPrice) { this.hasPrice = hasPrice; }//end setHasPrice();

    /* Protected */

    protected abstract double getNewPrice();

}//end AbstractModel
