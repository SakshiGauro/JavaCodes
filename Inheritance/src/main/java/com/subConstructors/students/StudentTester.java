package com.subConstructors.students;

public class StudentTester
{
    public static void main(String[] args)
    {
        
        /**
         * Create a student in the class of 2020
         */
        Student noAth = new Student ("AMIGO", 2020);
         
         /**
         * Create a student athlete in the class of 2022
         * that is eligible and plays soccer.
         */
         StudentAthlete alth = new StudentAthlete("ABC", 2022, "soccer", true);
         
         // Print out both objects
         System.out.println(noAth);
         System.out.println(alth);
    }
}