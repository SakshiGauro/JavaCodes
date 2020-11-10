package com.examples;
import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 2 integers");
        int a=input.nextInt();
        int b= input.nextInt();
        double divide=(double)a/b;
        System.out.println(divide);

    }
}