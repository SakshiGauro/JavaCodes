package com.constructors.battingAverage;
public class BaseballPlayer
{
    private int hits;
    private int atBats;
    private String name;
    
    //Add constructor here
    public BaseballPlayer(String nName, int hHits, int aAtBats)
    {
        name=nName;
        hits=hHits;
        atBats=aAtBats;
    }
    
    public void printBattingAverage()
    {
        double battingAverage = hits / (double) atBats;
        System.out.println(battingAverage);
    }
    
    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }
    
    
}
