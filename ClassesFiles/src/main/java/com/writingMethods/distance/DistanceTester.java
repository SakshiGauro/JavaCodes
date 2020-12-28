package com.writingMethods.distance;

public class DistanceTester
{
    public static void main(String[] args)   
    {
        // Create three Distance objects
        Distance obj1 = new Distance(5);
        Distance obj2 = new Distance(10);
        Distance obj3 = new Distance(12);
        // Convert one to yards, one to kilometers,
        // and the last one to feet
        System.out.println(obj1.toYards());
        System.out.println(obj2.toKilometers());
        System.out.println(obj3.toFeet());
        
        // Print out the converted values
    }
}
