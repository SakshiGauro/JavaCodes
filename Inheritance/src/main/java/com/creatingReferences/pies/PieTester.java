package com.creatingReferences.pies;

import java.util.ArrayList;

public class PieTester
{
    public static void main(String[] args)
    {
        // Start here!
        Pie apple = new ApplePie(5);
        Pie pum = new PumpkinPie(6, true);
        Pie pie = new Pie("Blueberry", 3);
        
        ArrayList<Pie> pies = new ArrayList<Pie>();
        pies.add(apple);
        pies.add(pum);
        pies.add(pie);
        
        for(Pie var : pies)
        {
            System.out.println("Pie: " + var.getType());
        }
    }
}