package com.polymorphism.cars;

import java.util.*;
import java.util.Scanner;

public class CarTester
{
    public static void main(String[] args)
    {
        // Start here
        Scanner in = new Scanner(System.in);
        ArrayList<Car> car = new ArrayList<Car>();
        while(true){
            System.out.println("Please enter a car model name(exit to quit): ");
            String name = in.nextLine();
            
            if(name.equals("exit"))
                break;
            
            System.out.println("Is this car electric? (y or n) ");
            String ans = in.nextLine();
            
            if(ans.equals("n"))
            {
                System.out.println("How many miles per gallon: ");
                String mpg = in.nextLine();
                
                Car ca = new Car(name, mpg);
                car.add(ca);
            }
            else{
                Car ca = new ElectricCar(name);
                car.add(ca);
            }
        }
        
        for(Car var : car){
            System.out.println("Car: " + var.getModel());
            System.out.println("MPG: " + var.getMPG() + "\n");
        }
        
    }
}
