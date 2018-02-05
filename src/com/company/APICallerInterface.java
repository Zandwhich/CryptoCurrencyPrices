package com.company;

public interface APICallerInterface {

    public abstract double getPrice();
    public abstract String getCurrency();
    public abstract boolean getHasPrice();
    public abstract void updatePrice();

}//end AbstractAPICaller