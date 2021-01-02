package com.algorithms.lastMultiple;

public class LastMultipleOfThree
{

    public static void main(String[] args)
    {
        int[] numbers1 = {76, 75, 3, 17, 12, 22, 7};
        System.out.print("The following index holds the LAST multiple of 3: " + findMultipleOfThree(numbers1));
        
    }
    
    public static int findMultipleOfThree(int[] arr)
    {
        // your code goes here! 
        for (int i = arr.length - 1 ; i >= 0; i--)
        {
            if (arr[i] % 3 == 0)
                return i;
        }
        return -1;
    }
}