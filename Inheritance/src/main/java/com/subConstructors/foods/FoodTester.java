package com.subConstructors.foods;

public class FoodTester
{
    public static void main(String[] args)
    {
        // Start here!
        Fruit apple = new Fruit ("Apple", 150, true, "red");
        Food chips = new Food ("Chips", 350);
        
        System.out.println(apple);
        System.out.println(chips);
    }
}
