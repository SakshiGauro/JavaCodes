package com.creatingReferences.assignments;

public class Assignment{
    
    private String name;
    private double availablePoints;
    private double earnedPoints;
    
    public Assignment(String name, double availablePoints, double earnedPoints){
        this.name = name;
        this.availablePoints = availablePoints;
        this.earnedPoints = earnedPoints;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getAvaliablePoints(){
        return availablePoints;
    }
    
    public void setAvaliablePoints(double availablePoints){
        this.availablePoints = availablePoints;
    }
    
    public double getEarnedPoints(){
        return earnedPoints;
    }
    
    public void setEarnedPoints(double points){
        earnedPoints = points;
    }
}
