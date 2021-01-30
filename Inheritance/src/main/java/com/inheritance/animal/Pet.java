package com.inheritance.animal;

public class Pet extends Animal
{
    private String name; 
    private String size;
    
    public String getName()
    {
       return name;
    }
    
    public void setName(String name)
    {
       this.name = name;
    }
    
    private String getSize()
    {
       return size;
    }
   
    public void setSize(String size)
    {
       this.size = size;
    }
   
}
