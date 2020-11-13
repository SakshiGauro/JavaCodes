package com.WrapperClassExample;
public class Extremes
{
    Integer min;
    Integer max;
    
    // Constructor
    public Extremes()
    {
        min= Integer.MIN_VALUE;
        max= Integer.MAX_VALUE;
    }
    
    // Returns the difference
    // max - number
    public Integer maxDiff(Integer number)
    {
        int diff= max-number;
        return diff;
    }

    // Returns the difference
    // min - number
    public Integer minDiff(Integer number)
    {
        int diff= min-number;
        return diff;
    }
    
    // Returns a String representation
    // in the form
    // [min, max]
    public String toString()
    {
        return "[" + min + ", " + max + "]";   
    }
}
