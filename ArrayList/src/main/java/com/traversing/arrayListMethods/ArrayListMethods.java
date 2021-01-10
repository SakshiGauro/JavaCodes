package com.traversing.arrayListMethods;

import java.util.ArrayList;
public class ArrayListMethods
{
    public static void  print(ArrayList<String> arr)
    {
        for (int i = 0; i < arr.size(); i++)
        {
            System.out.println(arr.get(i));
        }
    }
    
    public static void condense(ArrayList<String> arr)
    {
        int i = 0;
        while (i < arr.size() -1)
        {
            arr.set(i,arr.get(i) + arr.get(i+1));
            arr.remove(i+1);
            i++;
        }
    }
    
    public static void duplicate(ArrayList<String> arr)
    {
        int i = 0;
        while (i < arr.size())
        {
            arr.add(i,arr.get(i));
            i +=2;
        }
    }
}