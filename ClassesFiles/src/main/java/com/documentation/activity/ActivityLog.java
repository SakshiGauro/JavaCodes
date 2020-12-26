package com.documentation.activity;

public class ActivityLog
{
    //instance variables for ActivityLog object
    private double numHours;
    private double numMiles;
    
    /** 
     Initializes a ActivityLog object.
     Precondition: ActivityLog object must be created.
     Postcondition: Instance variables double numHours and numMiles are initialized to 0.
     */
    public ActivityLog()
    {
        numHours = 0;
        numMiles = 0;
    }
    
    /**
    Adds a value to numHours.
    Precondition: ActivityLog object must be initialized.
    Postcondition: the value of double hours is added to double numHours of ActivityLog object.
    
    @param hours -the value of hours to be added to numHours of the ActivityLog object
     */
    public void addHours(double hours)
    {
        numHours += hours;
    }
    
    /**
    Adds a value to numMiles.
    Precondition: ActivityLog object must be initialized.
    Postcondtion: The value of double miles is added to numMiles of ActivityLog object.
    
    @param miles- the value of miles to be added to numMiles of the ActivityLog object
    */
    public void addMiles(double miles)
    {
        numMiles += miles;
    }
    
    /**
    Returns the double numMiles of a given ActivityLog object.
    Precondition: ActivityLog object must be initialized.
    Postcondition: Returns double numMiles accessed from the ActivityLog object.
    
    @return numMiles -the number of miles of the ActivityLog object
     */
    public double getMiles()
    {
        return numMiles;
    }
    
    /**
    Returns the double numHours of a given ActivityLog object.
    Preconditions: AcitivityLog object must be initialized.
    Postcondtiton: Returns double numHours accessed from the ActivityLog object.
    
    @return numHours -the number of hours of the ActivityLog object
     */
    public double getHours() 
    {
        return numHours;
    }
    
}