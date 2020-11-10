package com.examples;
import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
    	Scanner input= new Scanner(System.in);
        System.out.println("Enter a movie rating (as a decimal)");
        double movRate= input.nextDouble();
        int rateRound= (int)(movRate+0.5);
        System.out.println("Rating Rounded "+ rateRound);
    }
}