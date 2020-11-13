package com.WrapperClassExample;
import java.util.Scanner;
import java.lang.*;

public class ExtremeMain
{
    public static void main(String[] args)
    {
        // Create a Scanner object
        Scanner input= new Scanner(System.in);
        
        // Create an Extremes object
        Extremes ex=new Extremes ();
        
        // Ask the user to guess the maximum value of an Integer
        System.out.println("Guess the maximum Integer value: ");
        int guess= input.nextInt();
        
        
        // Compute and display the difference
        // between the max and the guess
        System.out.println("You were off by "+ ex.maxDiff(guess));
        
        // Ask the user to guess the minimum value of an Integer
        System.out.println("Guess the minimum Integer value: ");
        guess= input.nextInt();
        
        // Compute and display the difference 
        // between the min and the guess
        System.out.println("You were off by "+ ex.minDiff(guess));
        
    }
}