package com.whileLoopsExamples;
import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        // Your code goes here!
        // It is useful to plan out your steps before you get started!
        // ask user
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number (-1 to quit): ");
        int num= input.nextInt();
        // store maxi and min value
        int min = num;
        int max=num;
        while (num != -1)
        {
            System.out.println("Smallest # so far: "+min);
            System.out.println("Largest # so far: "+ max);
            System.out.println("Enter a number (-1 to quit): ");
            num= input.nextInt();
            if (num<min)
                min = num;
            else if (num>max)
                max=num;
        }
        
        // print max and min
        // ask user
        // if -1 then stop
    }
}