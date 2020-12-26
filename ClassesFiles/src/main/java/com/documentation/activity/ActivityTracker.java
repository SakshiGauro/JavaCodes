package com.documentation.activity;

public class ActivityTracker
{
    public static void main(String[] args)
    {
        //creates a new object named myLog 
        ActivityLog mylog = new ActivityLog();
        
        //calls addMiles(double) and addHours(double) 
        mylog.addMiles(5);
        mylog.addHours(1);
        
        //prints "Total Miles: " in the console
        System.out.print("Total Miles: ");
        System.out.println(mylog.getMiles());
        //calls getMiles()
        
        double hoursToday = mylog.getHours();
        /*creates a double variable- hoursToday
        calls getHours()
        stores the returned value to hoursToday
        */
        mylog.addHours(1.5);
        mylog.addHours(3);
        //calls addHours(double) 
        //calls addHours(double)
        
        double increase = mylog.getHours() - hoursToday;
        /*creates a double variable- increase
        calls getHours() and subtracts that hoursToday from it and stores it in- increase
        */
        System.out.print("There are ");
        System.out.print(increase);
        System.out.println(" more hours today than two days ago");
    }
}
