package com.superKeyword.studentTestScores;

import java.util.Scanner;

public class StudentTester
{
    public static void main(String[] args)
    {
        // Prompt the user for name, test scores, and service hours
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the student name: ");
        String name = in.nextLine();
        
        System.out.println("Please enter the Math Score:");
        int math = in.nextInt();
        
        System.out.println("Please enter the ELA Score: ");
        int ela = in.nextInt();
        
        System.out.println("Please enter the Service Hours:");
        int ser = in.nextInt();
        
        // Create a HSStudent object
        HSStudent obj1 = new HSStudent(name, math, ela, ser);
        // Print the results
        
        System.out.println("Pass Math? " + obj1.passMath());
        System.out.println("Pass ELA? " + obj1.passEla());
        System.out.println("Completed Service Hours? " + obj1.completeService());
        System.out.println(obj1);
        
        
    }
}