package com.examples.castingToInt;
import java.util.Scanner;

public class CastingToInt
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a decimal value");
        double myDouble= input.nextDouble();
        int myInt= (int)myDouble;
        System.out.print(myInt);
    }
}