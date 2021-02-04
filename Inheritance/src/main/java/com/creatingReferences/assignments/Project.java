package com.creatingReferences.assignments;

public class Project extends Assignment {
    private String dueDate;
    private boolean groups;
    
    public Project(String name, double availablePoints, double earnedPoints, String dueDate, boolean groups){
        super(name, availablePoints, earnedPoints);
        this.dueDate = dueDate;
        this.groups = groups;
    }
    
    public String getDueDate(){
        return dueDate;
    }
    
    public void setDueDate(String dueDate){
        this.dueDate = dueDate;
    }
    
    public boolean getGroups(){
        return groups;
    }
    
    public void setGroups(boolean groups){
        this.groups = groups;
    }
}
