package com.overboarding;
public class Pinata
{
    // Instance variables
    private String candy;    // what kind of candy is inside
    private String color;    
    private String shape;
    
    // Constructor without parameters
    public Pinata()
    {
        candy = "hard candy";
        color = "rainbow";
        shape = "donkey";
    }
    
    // Add an overloaded constructor that allows the user
    // to customize all of the instance variables
    public Pinata(String pCandy, String pColor, String pShape)
    {
        candy= pCandy;
        color=pColor;
        shape=pShape;
    }
    
    // Add an overloaded constructor that allows the user
    // to customize the color and shape
    public Pinata(String pColor,String pShape)
    {
        color=pColor;
        shape=pShape;
        candy="hard candy";
    }
    // Add an overloaded constructor that allows the user
    // to customize the candy
    public Pinata(String pCandy)
    {
        candy= pCandy;
        color="rainbow";
        shape="donkey";
   }
    
    public String toString()
    {
        return color + " " + shape + " pinata filled with " + candy;
    }
}
