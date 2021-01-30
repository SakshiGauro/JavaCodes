package com.subConstructors.clothingStore;

public class Sweatshirt extends Clothing
{
    private boolean hood;
    
    public Sweatshirt(String size, String color, boolean hasHood)
    {
        super(size, color);
        hood = hasHood;
    }
    
    public boolean hasHood()
    {
        return hood;
    }
}
