package com.writingMethods.food;

import java.util.Scanner;

public class FoodRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner in = new Scanner(System.in);
        Food Hamburgers = new Food("Hamburgers", 600);
        Food FrenchFries = new Food("French Fries", 350);
        Food Coke = new Food("Coke", 200);
        
        System.out.println(Hamburgers);
        System.out.println("How many would you like?");
        int hb = in.nextInt();
        
        System.out.println(FrenchFries);
        System.out.println("How many would you like?");
        int ff = in.nextInt();
        
        System.out.println(Coke);
        System.out.println("How many would you like?");
        int coke = in.nextInt();
        
        int thb = hb *Hamburgers.getCalories();
        int tff = ff * FrenchFries.getCalories();
        int tcoke = coke *Coke.getCalories();
        int total = thb + tff + tcoke;
        System.out.println("Your meal will have a total of " + total + " calories");
        
    }
}
