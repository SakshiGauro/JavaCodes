package com.MathClassExamples;
public class Circle
{
    private double radius;
    
    public Circle(double theRadius)
    {
        radius = theRadius;
    }

    // Implement getArea using
    // Math.PI and
    // Math.pow
    // Area = pi * r^2
    public double getArea()
    {
        double area= Math.PI*Math.pow(radius,2);
        return area;
    }
    
    // Implement getCircumference using
    // Math.PI
    // Circumference = 2 * PI * r
    public double getCircumference()
    {
        double cir= 2* Math.PI* radius;
        return cir;
    }
    
}
