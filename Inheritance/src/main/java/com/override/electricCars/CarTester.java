package com.override.electricCars;

public class CarTester
{
    public static void main(String[] args)
    {
        // Create a Car object
        Car car = new Car("Tesla","30 mpg");
        // Print out the model
        System.out.println(car.getModel());
        
        // Print out the MPG
        System.out.println(car.getMPG());
        // Print the object
        System.out.println(car);
        
        // Create an ElectricCar object
        ElectricCar ee = new ElectricCar("Honda");
        // Print out the model
        System.out.println(ee.getModel());
        // Print out the MPG
        System.out.println(ee.getMPG());
        // Print the object
        System.out.println(ee);
    }
}
