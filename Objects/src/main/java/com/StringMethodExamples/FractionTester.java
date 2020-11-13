package com.StringMethodExamples;
import java.util.Scanner;

public class FractionTester
{
    public static void main(String[] args)
    {
        // Create objects
        Scanner input = new Scanner(System.in);
        
        // Ask for input
        System.out.println("Enter the numerator: ");
        int num=input.nextInt();
        System.out.println("Enter the denominator: ");
        int deno=input.nextInt();
        
        // Create a new Fraction with the user's input
        Fraction frac1= new Fraction(num,deno);
    
        
        int a=frac1.getNumerator();
        int b=frac1.getDenominator();
        
        int c=1*b + 2*a;
        int d=2*b;
        
        
        // Add the fractions
        // Make use of the getDenominator and getNumerator methods
        
        // Print out the fractions as an equation
        // Remember you don't have to call toString yourself!
        Fraction frac2= new Fraction(c,d);
        System.out.print(1+"/"+2+" + "+ a+"/"+b+" = " + frac2);
       // System.out.print(frac2);
        
        
    }
}
