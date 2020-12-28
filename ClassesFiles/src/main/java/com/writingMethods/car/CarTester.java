package com.writingMethods.car;

public class CarTester {

    public static void main(String[] args) {
        //Create a car that gets 20 mpg and has a 15 gallon tank
        Car obj = new Car(20, 15);
        //Fill up the gas tank
        obj.addGas();
        
        //Check the miles available
        System.out.println("Miles available: "+ obj.milesAvailable());

        //Drive 100 miles
        obj.drive(100);

        //Check the miles available
        System.out.println("Miles available: "+ obj.milesAvailable());
        
        //Add 2 gallons to the gas tank
        obj.addGas(2);

        //Check the miles available
        System.out.println("Miles available: "+ obj.milesAvailable());
        
        //Try driving more miles than available
        obj.drive(1000);

        //Drive 200 miles
        obj.drive(200);

        //Check how much gas you have left
        System.out.println("Gas remaining: " + obj.getGas());

        //Print total miles driven
        System.out.println("Total Miles Driven: " + obj.getTotalMilesDriven());

    }
}
