package com.examples;
public class FallingBodies
{
    public static void main(String[] args)
    {
        double g= 9.8;
        double t=10;
        double height=0.5 * g * (t*t);
        double v=g*t;
        System.out.println("The height is "+ height +" m.");
        System.out.println("The velocity is "+ v + "m/s.");

    }
}