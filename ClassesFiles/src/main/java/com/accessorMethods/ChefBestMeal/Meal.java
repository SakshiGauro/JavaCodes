package com.accessorMethods.ChefBestMeal;

public class Meal
{
    private String name;
    private int calories;
    private String recipe;
    
    public Meal (String theName, int theCalories, String theRecipe)
    {
        name = theName;
        calories = theCalories;
        recipe = theRecipe;
    }
    
    public String getMealName()
    {
        return name;
    }
    
    public int getMealCalories()
    {
        return calories;
    }
    
    public String getMealRecipe()
    {
        return recipe;
    }
    
    public String toString()
    {
        return name + ", which has " + calories + " calories.";
    }
}
