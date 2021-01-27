package com.algorithms.billboard;

import java.util.ArrayList;
public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<Musician>();
    
    public void add(Musician singer)
    {
        if (top10.size() < 10 && singer.getIsPlatinum())
        {
            top10.add(singer);
        }
        else if (!singer.getIsPlatinum())
            System.out.println("Sorry, " + singer.getName() + " does not qualify for Top 10");
        else 
            replace(singer);
    }
    
    public void replace (Musician singer)
    {
        int minWeeks = top10.get(0).getWeeksInTop40();
        int indexOld = 0; 
        for (int i = 0; i < top10.size(); i++)
        {
            if (top10.get(i).getWeeksInTop40() < minWeeks)
            {
                minWeeks = top10.get(i).getWeeksInTop40();
                indexOld = i;
            }
        }
        if (minWeeks < singer.getWeeksInTop40())
        {
            System.out.println("The musician " + top10.get(indexOld).getName() + " has been replaced by " + singer.getName()+ ".");
            top10.set(indexOld, singer);
        }
        else
            System.out.println("Sorry, " + singer.getName() + " has less weeks in the Top 40 than the other musicians.");
        
    }
 
 
 
 
 
    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}