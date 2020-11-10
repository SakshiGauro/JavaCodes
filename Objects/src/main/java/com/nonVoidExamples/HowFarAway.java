package com.nonVoidExamples;
import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        // your code here.
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter the latitude of the starting location: ");
        double latStart=input.nextDouble();
        System.out.println("Enter the longitude of the starting location: ");
        double longStart= input.nextDouble();
        System.out.println("Enter the latitude of the ending location: ");
        double latEnd= input.nextDouble();
        System.out.println("Enter the longitude of the ending location: ");
        double longEnd= input.nextDouble();
        
        GeoLocation start= new GeoLocation(latStart,longStart);
        GeoLocation end= new GeoLocation(latEnd,longEnd);
        
        double distance=start.distanceFrom(end);
        System.out.println("The distance is "+ distance+ " miles.");
    }
}