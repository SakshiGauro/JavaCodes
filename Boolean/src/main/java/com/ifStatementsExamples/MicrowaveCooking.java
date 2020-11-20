package com.ifStatementsExamples;
public class MicrowaveCooking
{
    public static void main(String[] args)
    {
       // Generate a random number of seconds
       // between 0 and 60
       int time=(int)(Math.random()*(60+1));
       
       // Print the number of seconds
       System.out.println("Microwaving for "+ time+" seconds");
       
       // Use two if statements to print
       // whether the roll is fine or will catch fire
        if (time<= 20)
            System.out.println("Perfect cooking time!");
        if (time>20)
            System.out.println("Your roll will catch fire!");
    }
}