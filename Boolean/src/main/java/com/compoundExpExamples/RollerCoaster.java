package com.compoundExpExamples;
import java.util.Scanner;
 
public class RollerCoaster 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);      
        System.out.println("Enter height in inches");
        int height=input.nextInt();
        System.out.println("Enter age");
        int age= input.nextInt();
        
        if (height>=42 && age>=9)
            System.out.println("Welcome aboard!");
        else
            System.out.println("Sorry, you are not eligible to ride");
    }
}