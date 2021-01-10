package com.traversing.odds;

import java.util.ArrayList;

public class Odds
{
    public static void main(String[] args)
    {
        ArrayList<Integer> odds = new ArrayList<Integer>();
        // Pre-load the array list with values.
        for(int index = 1; index <101; index++)
        {
            odds.add(index);
            odds.add(index);
        }
        //call removeEvens on the array above!
        removeEvens(odds);
    }
    
    public static void removeEvens(ArrayList<Integer> array)
    {
        int i = 0;
        while (i < array.size())
        {
            if (array.get(i) % 2 == 0)
                array.remove(i);
            else
                i++;

        }            
        for (int j = 0; j < array.size(); j++)
        {
            System.out.println(array.get(j));    
        }
    }
}