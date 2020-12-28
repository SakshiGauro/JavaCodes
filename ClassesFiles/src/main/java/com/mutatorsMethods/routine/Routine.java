package com.mutatorsMethods.routine;

public class Routine
{
    private double sleep;
    private double fun;
    private double school;
    private double sports;
    
    public Routine()
    {
        sleep = 0;
        fun = 0;
        school = 0;
        sports = 0;
    }
    
    public void setSleep(double hoursSleep)
    {
        sleep = hoursSleep;
    }
    
    public void setFun(double hoursFun)
    {
        fun = hoursFun;
    }
    
    public void setSchool(double hoursSchool)
    {
        school = hoursSchool;
    }
    
    public void setSports(double hoursSports)
    {
        sports = hoursSports;
    }
    
    public void printTotal()
    {
        double total = 7 *sleep + 7* fun + 7*school + 7*sports;
        System.out.println("Weekly Totals");
        System.out.println("Sleep: " + (7* sleep));
        System.out.println("School: " + (7* school));
        System.out.println("Sports: " + (7* sports));
        System.out.println("Fun: " + (7* fun));
        System.out.println("Grand Total: " + total);
        System.out.println("Hours left over: " + (168 - total));
    }
}
