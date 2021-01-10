package com.traversing.roadTrip;

import java.util.ArrayList;

public class RoadTrip
{
    private ArrayList<GeoLocation> stops = new ArrayList<GeoLocation>();
    
    // public Roadtrip()
    // {
    // }
    // Create a GeoLocation and add it to the road trip
    public void addStop(String name, double latitude, double longitude)
    {
        GeoLocation temp = new GeoLocation(name,latitude,longitude);
        stops.add(temp);
    }
    // Get the total number of stops in the trip
    public int getNumberOfStops()
    {
        return stops.size();
    }
    
    // Get the total miles of the trip
    public double getTripLength()
    {
        double total = 0.0;
        for (int i = 0; i < stops.size()-1; i++)
        {
            total += stops.get(i).distanceFrom(stops.get(i+1));
        }
        return total;
    }
    
    // Return a formatted toString of the trip
    public String toString()
    {
        String result = "";
        stops.size();
        int c= 1;
        for (int i = 0; i < stops.size(); i++)
        {
            result += c +". " + stops.get(i).toString()+"\n";
            c++;
        }
        return result;
    }
}