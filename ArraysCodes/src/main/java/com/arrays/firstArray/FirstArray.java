package com.arrays.firstArray;

public class FirstArray
{
    public static void main(String[] args)
    {
      // Create the 3 arrays here
      String[] cities = {"Las Vegas", "Minsk", "Sao Paulo"};
      int[] temp = {104, 73, 80};
      double[] prep = {4.17,26.7, 55.0};
        
      // Print all 3 arrays according to the output in the description
      for (int i=0; i<cities.length; i++)
      {
        System.out.println(cities[i] + " has an average annual precipitation of " + prep[i] +" inches.");
        System.out.println(cities[i] + " has an average annual high temp of " + temp[i] + " degrees Fahrenheit.");
      }
    }
}