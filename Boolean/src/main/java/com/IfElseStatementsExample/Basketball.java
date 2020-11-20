package com.IfElseStatementsExample;
import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Start by listing the steps you need to take
        System.out.println("Enter player one's name: ");
        String pName1= input.nextLine();
        System.out.println("Enter player two's name: ");
        String pName2=input.nextLine();
        
        System.out.println("Enter "+pName1+"'s score");
        int score1= input.nextInt();
        System.out.println("Enter "+pName2+"'s score");
        int score2= input.nextInt();
        
        if (pName1.compareTo(pName2)<0)
        {
            System.out.println(pName1+" scored "+ score1+" points");
            System.out.println(pName2+" scored "+ score2+" points");
        }
        else
        {
            System.out.println(pName2+" scored "+ score2+" points");
            System.out.println(pName1+" scored "+ score1+" points");
        }
        
        if (score1>score2)
            System.out.println(pName1 +" wins!");
        else
            System.out.println(pName2+ " wins!");
        
    }
}