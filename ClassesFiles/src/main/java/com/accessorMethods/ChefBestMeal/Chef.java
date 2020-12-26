package com.accessorMethods.ChefBestMeal;

public class Chef
{
    private String name;
    private String restaurant;
    private Meal bestMeal;
    private String mealName;
    private int mealCalories;
    private String mealRecipe;
    
    public Chef (String theName, String theRestaurant, Meal theBestMeal)
    {
        name = theName;
        restaurant = theRestaurant;
        bestMeal = theBestMeal;
        mealName = bestMeal.getMealName();
        mealCalories = bestMeal.getMealCalories();
        mealRecipe = bestMeal.getMealRecipe();
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getRestaurant()
    {
        return restaurant;
    }
    
    public String getMealRecipe()
    {
        return mealRecipe;
    }
    
    public String getMealName()
    {
        return mealName;
    }
    
    public int getMealCalories()
    {
        return mealCalories;
    }
    
    public String toString()
    {
        return "Chef " + name + " works at " + restaurant + " and is best known for ";
    }
}
