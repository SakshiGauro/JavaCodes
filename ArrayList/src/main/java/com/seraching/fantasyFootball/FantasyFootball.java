package com.seraching.fantasyFootball;

import java.util.ArrayList;
import java.util.Scanner;

public class FantasyFootball
{
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);
        
        ArrayList<String> team = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        int index;
        while(team.size() < 5)
        {
            System.out.println("Enter Player you would like on your team: ");
            String name = in.nextLine();
            index = search(availablePlayers, name); 
            if (index == -1)
                System.out.println("That player is not available, please pick another player.\n");
            else
            {
                team.add(availablePlayers.remove(index));
                System.out.println("Great! That player is added to your team!\n");
            }
        }
        
        System.out.println("Your team is:");
        for( String var : team)
        {
            System.out.println(var);
        }
    }
    
    public static int search(ArrayList<String> array, String player)
    {
        for (int i = 0; i < array.size(); i++)
        {
            if (array.get(i).equals(player))
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void addPlayers(ArrayList<String> array)
    {
        array.add("Cam Newton");
        array.add("Antonio Brown");
        array.add("Leveon Bell");
        array.add("Patrick Mahomes");
        array.add("Saquon Barkley");
        array.add("Mike Evans");
        array.add("Odell Beckham Jr.");
        array.add("Travis Kelce");
        array.add("Baker Mayfield");
        array.add("Michael Thomas");
        array.add("Julio Jones");
        array.add("Ezekial Elliott");
        array.add("Alvin Kamara");
        array.add("Davante Adams");
        array.add("Aaron Rogers");
    }
}