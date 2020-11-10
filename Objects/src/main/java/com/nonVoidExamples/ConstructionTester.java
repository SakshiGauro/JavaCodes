package com.nonVoidExamples;
import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the sales tax rate: ");
        double taxRate=input.nextDouble();
        System.out.println("How many boards do you need? ");
        int boards=input.nextInt();
        System.out.println("How many windows do you need? ");
        int window= input.nextInt();
        
        Construction tax= new Construction(8,11,taxRate);
        
        double lumberCost=tax.lumberCost(boards);
        double windowCost=tax.windowCost(window);
        
        double total=lumberCost+windowCost;
        System.out.println("Total: "+ total);
        System.out.println("Grand Total: "+tax.grandTotal(total));
    }
}
