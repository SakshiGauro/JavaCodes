package com.IfElseStatementsExample;
import java.util.Scanner;

public class Numbers
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input= new Scanner(System.in);
        System.out.println("Enter number");
        int num= input.nextInt();
        
        if (num>=0)
            System.out.println("The number is positive!");
        else
            System.out.println("The number is negative!");
    }
}