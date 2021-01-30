package com.inheritance.animal;

public class AnimalTester
{
    public static void main(String[] args)
    {
        // Add code to test your hierarchy
        Fish bet = new Fish();
        bet.setWater("salt water");
        bet.setName("Bet");
        bet.setIsPet(true);
        
        System.out.println("Name: "+ bet.getName());
        System.out.println("Water: "+ bet.getWater());
        System.out.println("Is a pet: "+ bet.getIsPet());
    }
}
