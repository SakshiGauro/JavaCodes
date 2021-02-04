package com.polymorphism.funwithSolids;

public class RectangularPrism extends Solid
{
    // Code goes here
    private int l;
    private int w;
    private int h;
    
    public RectangularPrism(String name, int len, int wid, int hei){
        super(name);
        l = len;
        w = wid;
        h = hei;
    }
    
    @Override
    public double volume(){
        return l * w * h;
    }
    
    @Override
    public double surfaceArea(){
        return 2*(w * l + h * l + h * w);
    }
}
