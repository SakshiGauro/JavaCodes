package com.WrapperClassExample;
public class Currency
{
    private Double value;
    //private int dol;
    //private double cent;
    
    // Constructor
    public Currency(Double startValue)
    {
        value = startValue;
    }
    
    // Sets value to newValue
    public void setValue(Double newValue)
    {
        value = newValue;
    }
    
    // Returns the dollar portion of value
    // if value is 12.34, returns 12
    public Integer getDollars()
    {
        double d= value.doubleValue();
        int dollars= (int)(d);
        //dol= dollars;
        return dollars;
    }
    
    // Returns the cents portion of value
    // as an Integer
    // if value is 12.34, returns 34
    public Integer getCents()
    {
        int cents= (int)(value * 100) % 100;
        //cent
        return cents;
    }
    
    // Returns a String representation
    // in the format
    // $12.34
    public String toString()
    {
        String to=("$"+getDollars()+"."+getCents());
        return to;
    }
}
