package com.whileLoopsExamples;
import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       
       // Your code starts here
       Scanner in= new Scanner(System.in);
       System.out.println("Starting Taffy Timer...");
       int temp=0;
       while (true)
       {
          System.out.println("Enter the temperature: ");
          temp= in.nextInt();
          System.out.println("");
          if (temp>=270)
          {
              System.out.println("Your taffy is ready for the next step!");
              break;
          }
          System.out.println("The mixture isn't ready yet.");
       }
       
    }
}