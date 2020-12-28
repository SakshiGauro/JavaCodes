package com.writingMethods.car;

public class Car {

    // Start here
    private double efficiency; // this is miles per gallon
    private double gas;
    private double tankCapacity;
    private double totalMilesDriven;
    
    public Car(double carEfficiency, double carTankCapacity)
    {
        efficiency = carEfficiency;
        tankCapacity = carTankCapacity;
    }
    
    public void addGas()
    {
        System.out.println("Filling up ...");
        gas = tankCapacity;
    }
    
    public void addGas(double amount) 
    {
        System.out.println("Adding gas ...");
        if (amount >= tankCapacity)
            gas = tankCapacity;
        else
            gas += amount;
    }
    
    public double getTotalMilesDriven()
    {
        return totalMilesDriven;
    }
    
    public void drive(double distance)
    {
        double dis = efficiency * gas;
        if (distance <= dis)
        {
            System.out.println("Driving " + distance);
            totalMilesDriven += distance;
            gas -= distance / efficiency;
        }
        else
            System.out.println("Can't drive " + distance + ". That's too far!");
    }
    
    public boolean canDrive (double distance)
    {
        return (efficiency * gas) >= distance;
    }
    
    public double milesAvailable()
    {
        return (efficiency * gas);
    }
    
    public double getGas()
    {
        return gas;   
    }
}