package com.MathClassExamples;
public class RaceMain
{
    public static void main(String[] args)
    {
        // Length of the course in meters
        double distance = 2414; // ~ 1.5 miles
        
        // Generate a random acceleration for each car
        double acc1= Math.random()*(100);
        double acc2= Math.random()*(100);
        
        // Create two Racecar objects
        Racecar car1= new Racecar(acc1,"X");
        Racecar car2= new Racecar(acc2,"y");
        
        // Compute the finishing times for both cars
        double t1= car1.computeTime(distance);
        double t2=car2.computeTime(distance);
        // Print times of each car
        System.out.println("First car finished in " +t1+" seconds");
        //System.out.println(t1);
        
        System.out.println("Second car finished in "+t2+" seconds");
       
    }
}