package com.examples.myAge;
import java.util.Scanner;
//Refer to your code from the previous My Age exercise. 
// Modify it using the Scanner class to take user input instead of hard coding in your age. 

public class MyAge
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= input.nextInt();
       
        System.out.println("Current age" + age);
        age ++;
        System.out.println("Age next year:"+ age);
        age --;
        System.out.println("Current age:"+age);
    }
}