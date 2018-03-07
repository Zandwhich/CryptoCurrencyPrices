package com.company;

/**
 * TODO: Fill this out
 */
public interface APICallerInterface {

    /**
     * TODO: Fill this out
     * @return
     */
    public abstract double getPrice();

    /**
     * TODO: Fill this out
     * @return
     */
    public abstract String getCurrency();

    /**
     * TODO: Fill this out
     * @return
     */
    public abstract boolean getHasPrice();

    /**
     * TODO: Fill this out
     */
    public abstract void updatePrice();

    /**
     * TODO: FIll this out
     * @return
     */
    public abstract String getName();

}//end AbstractAPICaller
