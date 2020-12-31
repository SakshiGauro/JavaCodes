package com.traversingArrays.matchingString;

public class MatchingString
{

    private static String[] arr = {"Hello", "Karel", "CodeHS!"};
    
    public static int findString(String myString)
    {
        // your code goes here!
        int i = 0; 
        while(i < arr.length)
        {
            if(arr[i].equals(myString))
                return i; 
            i++;
        }
        return -1;
        
    }
}
