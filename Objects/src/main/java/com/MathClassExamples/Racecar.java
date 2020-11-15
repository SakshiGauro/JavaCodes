package com.MathClassExamples;
public class Racecar
{
    private double accel; // acceleration
    private String name; // name of driver
    
    public Racecar(double acceleration, String driver)
    {
        accel = acceleration;
        name = driver;
    }
    
    // Returns the time it takes the racecar
    // to complete the track
    public double computeTime(double distance)
    {
        double rd=Math.pow((2*distance/accel),(1/2.0));
        double t =Math.round(rd * 100) /100.0;
        return t;
    }
    
    public String toString()
    {
        return "Racer " + name;
    }
}
//
