package com.compoundExpExamples;
import java.util.Scanner;

public class RollerCoasters 
{
    public static void main(String[] args)
    {	//nested if statements
        Scanner input = new Scanner(System.in);        
        System.out.println("How tall are you? ");
        int height=input.nextInt();
        System.out.println("How old are you? ");
        int age=input.nextInt();
        
        if (height>=42)
        {
            if (age>=9)
                System.out.println("Welcome aboard!");
            else
            {
                System.out.println("Sorry, you are not eligible to ride");
            }
        }
        else
            {
                System.out.println("Sorry, you are not eligible to ride");
            }
        
    }
} 