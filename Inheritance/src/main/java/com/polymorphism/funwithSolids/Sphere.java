package com.polymorphism.funwithSolids;

import java.lang.Math;

public class Sphere extends Solid
{
    // Code goes here
    private double r;
    
    public Sphere(String name, double rad){
        super(name);
        r = rad;
    }
    
    @Override
    public double volume(){
        return (4.0/3) * Math.PI * Math.pow(r, 3);
    }
    
    @Override
    public double surfaceArea(){
        return 4 * Math.PI * Math.pow(r, 2);
    }
}