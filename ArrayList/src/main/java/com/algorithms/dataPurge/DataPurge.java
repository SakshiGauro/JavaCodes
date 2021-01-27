package com.algorithms.dataPurge;

import java.util.ArrayList;

public class DataPurge
{
    public static void removeDuplicates(ArrayList<String> emails)
    {
        for(int i = 0; i< emails.size(); i++)
        {
            for(int j = i+1 ;j < emails.size(); j++)
            {
                if (emails.get(i).equals(emails.get(j)))
                {
                    System.out.println(emails.remove(j) + " has been removed.");
                }
            }
        }
    }
    public static void removeAOL(ArrayList<String> emails)
    {
        String check = "";
        for (int i = emails.size() - 1; i >= 0; i--)
        {
            check = emails.get(i);
            if(check.contains("@aol.com"))
            {
                System.out.println(emails.remove(i) + " has been removed.");
            }
        }
        
    }
    
    public static boolean containsOnlyEmails (ArrayList<String> emails)
    {
        for (int i = 0; i < emails.size(); i++)
        {
            if (!(emails.get(i).contains(".")) || !(emails.get(i).contains("@")))
                return false;
        }
        return true;
    }
    
    
}