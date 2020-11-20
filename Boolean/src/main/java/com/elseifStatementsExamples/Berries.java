package com.elseifStatementsExamples;
import java.util.Scanner;

public class Berries
{
    public static void main(String[] args)
    {
        // Ask for a berry initial
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the initial of the berry: ");
        String berry= input.nextLine();
        
        // To get the input as a character, use the String method
        // charAt().  Use str.charAt(0) since you want the
        // first character
        char berr= berry.charAt(0);
        if (berr=='r')
            System.out.println("You ordered raspberry");
        else if (berr=='h')
            System.out.println("You ordered huckleberry");
        else if (berr=='g')
            System.out.println("You ordered goji berry");
        else
            System.out.println("Berry not recognized");
        
        
        // Now you can compare characters using ==
        
        // Use comments to list the different
        // branches you will need before you write the code
    }
}