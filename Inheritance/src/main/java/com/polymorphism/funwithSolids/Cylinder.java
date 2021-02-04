package com.polymorphism.funwithSolids;

import java.lang.Math;

public class Cylinder extends Solid
{
    // Code goes here
    private int r;
    private int h;
    
    public Cylinder(String name, int rad, int hei)
    {
        super(name);
        r = rad;
        h = hei;
    }
    
    @Override
    public double volume(){
        return Math.PI * Math.pow(r, 2) * h;
    }
    
    @Override
    public double surfaceArea(){
        return 2 * Math.PI * r * h + 2 * Math.PI * Math.pow(r, 2);
    }
}
