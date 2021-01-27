package com.sorting.insertionSort;

import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};
        
        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array
        insertionSort(array1);
        // sort second array
        insertionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }
    
    /*
     * Insertion sort takes in an array of integers and
     * returns a sorted array of the same integers.
     */
    public static void insertionSort(int[] arr)
    {
        for (int i = 1;i < arr.length; i++)
        {
            int currNum = arr[i];
            int currIndex = i - 1;
            
            while(currIndex > -1 && arr[currIndex] < currNum)
            {
                arr[currIndex + 1] = arr[currIndex];
                currIndex--;
            }
            
            arr[currIndex + 1] = currNum;
        }
        
    }
}