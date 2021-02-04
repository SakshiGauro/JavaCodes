package com.polymorphism.funwithSolids;

import java.lang.Math;

public class Pyramid extends Solid
{
    // Code goes here
    private double l;
    private int w;
    private int h;
    
    public Pyramid(String name, double len, int wid, int hei){
        super(name);
        l = len;
        w = wid;
        h = hei;
    }
    
    @Override
    public double volume(){
        return (l * w * h) / 3;
    }
    
    @Override
    public double surfaceArea(){
        return (l * w) + 
            (l * Math.sqrt(Math.pow((w/2.0), 2) + Math.pow(h, 2))) + 
            (w * Math.sqrt(Math.pow((l/2.0), 2) + Math.pow(h, 2)));
    }
}
