package com.polymorphism.cars;

public class ElectricCar extends Car {

    /**
     * If you completed the Electric Car exercise in lesson 3,
     * copy your code for the ElectricCar class here.
     */ 

    // Complete the constructor
    public ElectricCar(String model){
       super(model,"N/A");
    }

    // Override the getMPG here.
    // It shouls return: "Electric cars do not calcualte MPG
    @Override
    public String getMPG(){
        return "Electric cars do not calculate MPG";
    }

    // Override the toString() here.
    // (model) is an  electric car.
    // Remember, to get the name, use super.getModel()
    public String toString(){
        return super.getModel() + " is an electric car.";
    }
}