package com.subConstructors.foods;

public class HealthyFood extends Food
{
    private String group;
    
    public HealthyFood(String name, int cal, String group)
    {
        super(name, cal);
        this.group = group;
    }
    
    public String getGroup()
    {
        return group;
    }
    
    public void setGroup(String group)
    {
        this.group = group;
    }
}
