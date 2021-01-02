package com.enhancedForLoops.largestValue;

public class LargestValueWhileLoop
{ 
    public static void main(String[] arg) 
    { 
        { 
            int[] values = {32, 56, 79, 2, 150, 37}; 
              
            int highestValue = findMax(values); 
            System.out.println("The highest score is " + highestValue); 
        } 
    } 
    public static int findMax(int[] numbers) 
    {  
        int maxSoFar = numbers[0];
        
        // for each loop to rewrite as for loop 
        int i=0;
        while (i < numbers.length)
        { 
            if (numbers[i]> maxSoFar) 
            { 
                maxSoFar = numbers[i]; 
            }
            i++;
        } 
    return maxSoFar; 
    } 
}