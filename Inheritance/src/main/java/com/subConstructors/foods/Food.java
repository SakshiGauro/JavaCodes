package com.subConstructors.foods;

public class Food
{
    private String name;
    private int cal;
    
    public Food(String name, int cal)
    {
        this.name = name;
        this.cal = cal;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public int getCal()
    {
        return cal;    
    }
    
    public void setCal(int cal)
    {
        this.cal = cal;
    }
    
    public String toString()
    {
        return name + " has "+ cal + " calories";
    }
}
