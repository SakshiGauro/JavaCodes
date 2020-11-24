package com.nestedLoopsExamples;
public class MultiplicationTable
{
    public static void main(String[] args)
    {
        // Call makeMultiplicationTable 
       makeMultiplicationTable();
    }
    
    // Makes a multiplcation table
    public static void makeMultiplicationTable()
    {
        // Your code goes here!!!
        for (int p=1; p<=10; p++)
        {
            for (int q=1; q<=10; q++)
            {
                   System.out.print(p*q+" ");
            }
            System.out.println();
        }
    }
}