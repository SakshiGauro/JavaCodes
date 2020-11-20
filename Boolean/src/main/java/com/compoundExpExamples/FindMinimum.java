package com.compoundExpExamples;
import java.util.Scanner;
 
public class FindMinimum 
{
    public static void main(String[] args)
    {
        // Ask the user for three ints and 
        // print out the minimum.
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int int1=input.nextInt();
        System.out.println("Enter the second integer: ");
        int int2=input.nextInt();
        System.out.println("Enter the third integer: ");
        int int3= input.nextInt();
        
        if (int1<=int2 && int1<=int3)
        {
             System.out.println("The minimum is "+int1);
        }
        else if (int2<=int1 && int2<=int3)
        {
             System.out.println("The minimum is "+int2);
        }
        else
            System.out.println("The minimum is "+int3);
    }
}