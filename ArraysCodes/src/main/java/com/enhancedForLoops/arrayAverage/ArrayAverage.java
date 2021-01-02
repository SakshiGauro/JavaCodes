package com.enhancedForLoops.arrayAverage;

public class ArrayAverage
{
   private int[] values;

   public ArrayAverage(int[] theValues)
   {
      values = theValues;
   }

   public double getAverage()
   {
     // your code goes here!
    double avg = 0;
    for (int val : values)
    {
        avg += val;
    }
    return (avg / values.length);
   }
}