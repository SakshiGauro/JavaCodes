package com.ifStatementsExamples;
import java.util.Scanner;

public class RelativeNumbers
{
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        // Ask for two numbers
        System.out.println("Enter two numbers: ");
        int a= input.nextInt();
        int b= input.nextInt();
        
        boolean greater= a<b;
        boolean equal= a==b;
        boolean less= a>b;
        // Compare the numbers as instructed
        
        System.out.println(a+" < "+b+": "+greater);
        System.out.println(a+" == "+b+": "+equal);
        System.out.println(a+" > "+b+": "+less);
        // Display the results
    }
}
