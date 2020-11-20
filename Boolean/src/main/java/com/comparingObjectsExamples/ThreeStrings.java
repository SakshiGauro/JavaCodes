package com.comparingObjectsExamples;
import java.util.Scanner;
public class ThreeStrings
{
    public static void main(String[] args)
    {
        // Ask the user for three strings.
        Scanner input=new Scanner(System.in);
        System.out.println("First string? ");
        String str1= input.nextLine();
        System.out.println("Second string? ");
        String str2= input.nextLine();
        System.out.println("Third string? ");
        String str3= input.nextLine();
        // Use a Boolean variable to test the comparison of 
        // first+second equals third
        // Remember since you are working with strings to 
        // use equals() and NOT == !
        boolean equal= (str1+str2).equals(str3);
        if (equal)
            System.out.println(str1+" + "+str2+" is equal to "+str3+"!");
        else
            System.out.println(str1+" + "+str2+" is not equal to "+str3+"!");
    }
}