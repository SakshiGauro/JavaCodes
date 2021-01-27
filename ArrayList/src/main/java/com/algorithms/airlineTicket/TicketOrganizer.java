package com.algorithms.airlineTicket;

import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;

    public TicketOrganizer(ArrayList<AirlineTicket> tickets)
    {
        this.tickets = tickets;
    }
    
    public void printPassengersByBoardingGroup()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Boarding Group " + i + ":");
            for(int j = 0; j < tickets.size() ;j++)
            {
                if (tickets.get(j).getBoardingGroup() == i)
                    System.out.println(tickets.get(j).getName());
            }
        }
    }
    
    public void canBoardTogether()
    {
        int c = 0;
        for (int i = 0; i < tickets.size() -1; i++)
        {
            if (tickets.get(i).getBoardingGroup() == tickets.get(i+1).getBoardingGroup() && 
                tickets.get(i).getRow() == tickets.get(i+1).getRow())
                {
                    System.out.println(tickets.get(i).getName() + " can board with " + tickets.get(i+1).getName() + ".");
                    c++;
                }
                
        }
        if (c == 0)
        {
            System.out.println("There are no passengers with the same row and boarding group.");
        }
        
    }
}