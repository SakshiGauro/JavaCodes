package com.subConstructors.foods;

public class Fruit extends HealthyFood
{
    private boolean isLocal;
    private String foodColor;
    
    public Fruit(String foodName, int calories, boolean isLocal, String foodColor)
    {
        super(foodName, calories, "Fruit");
        this.isLocal = isLocal;
        this.foodColor = foodColor;
    }
    
    public String getColor()
    {
        return foodColor;
    }
    
    public void setFoodColor(String foodColor)
    {
        this.foodColor = foodColor;
    }
    
    public boolean isLocal()
    {
        return isLocal;
    }
    
    public void setIsLocal(boolean isLocal)
    {
        this.isLocal = isLocal;
    }
    
}
