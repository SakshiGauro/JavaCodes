package com.inheritance.person;

public class PersonRunner
{
    public static void main(String[] args)
    {
        // Start here!
        Person thomas = new Person("Thomas Edison", "February 11, 1847");
        Student albert = new Student ("Albert Einstein", "March 14, 1879", 12, 5.0);
        
        System.out.println("Name: " + thomas.getName());
        System.out.println("Birthday: "+ thomas.getBirthday());
        
        System.out.println("Name: " + albert.getName());
        System.out.println("Birthday: "+ albert.getBirthday());
        System.out.println("Grade: " + albert.getGrade());
        System.out.println("GPA: " + albert.getGpa());
    }
}
