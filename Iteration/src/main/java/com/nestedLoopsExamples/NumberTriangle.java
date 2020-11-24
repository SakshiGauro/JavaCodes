package com.nestedLoopsExamples;
public class NumberTriangle
{
    public static void main(String[] args)
    {
       // Call makeNumberTriangle 
       makeNumberTriangle();
    }
    
    // Makes an upright triangle with the numbers 1-5
    public static void makeNumberTriangle()
    {
        // Your code goes here! 
        for (int p=1; p<=5; p++)
        {
            for (int q=1; q<=p; q++)
            {
                System.out.print(q+" ");
            }
            System.out.println();
        }
    }
}