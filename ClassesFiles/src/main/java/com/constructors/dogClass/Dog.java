package com.constructors.dogClass;
public class Dog
{
    private String name;
    private int age;
    private double weight;

    // Add your constructors here
    public Dog(String theName, int theAge, double theWeight)
    {
        name=theName;
        age=theAge;
        weight=theWeight;
    }
    
    public Dog(String theName, int theAge)
    {
        name=theName;
        age=theAge;
        weight=0.0;
    }

    public String toString(){
        return "Name: " + name + "\nWeight: " + weight +  "\nAge: " + age;
    }
}
