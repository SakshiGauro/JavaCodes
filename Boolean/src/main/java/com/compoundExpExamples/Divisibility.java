package com.compoundExpExamples;
import java.util.Scanner;

public class Divisibility 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int dend= input.nextInt();
        System.out.print("Enter the divisor: ");
        int sor= input.nextInt();
        
        if (sor !=0 && dend % sor ==0)
            System.out.println(dend +" is divisible by " +sor+"!");
        else 
            System.out.println(dend +" is not divisible by " +sor+"!");
    }
}
