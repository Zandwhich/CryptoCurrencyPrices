package com.company;

public abstract class AbstractModel {

    /****************/
    /*    Fields    */
    /****************/

    private double price;
    private String currency;
    private boolean hasPrice;


    /****************/
    /* Constructors */
    /****************/

    public AbstractModel(final String currency) {
        this.currency = currency;
        this.hasPrice = false;
        this.price = 0.0;
    }

    /****************/
    /*    Methods   */
    /****************/

    /* Public */

    // Getters
    public final double getPrice() { return price; }
    public final String getCurrency() { return currency; }
    public final boolean getHasPrice() { return hasPrice; }


    // Setters
    protected void setPrice(final double price) { this.price = price; }
    protected void setHasPrice(final boolean hasPrice) { this.hasPrice = hasPrice; }

    public void updatePrice() {
        price = getNewPrice();
    }

    /* Private */

    protected abstract double getNewPrice();

}//end AbstractModel
