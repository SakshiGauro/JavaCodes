package com.constructors.studentOverLoad;
public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private String school;

    /**
     * Constructors go here.
     * Check out StudentTester.java for an example of how to use
     * this constructor. Make sure your code matches the call in the
     * tester.
     */
    public Student(String fFirstName, String lLastName, int gGradeLevel, String sSchool)
    {
        firstName=fFirstName;
        lastName=lLastName;
        gradeLevel=gGradeLevel;
        school=sSchool;
    }
    
    public Student (String fFirstName, String lLastName, int gGradeLevel)
    {
        firstName=fFirstName;
        lastName=lLastName;
        gradeLevel=gGradeLevel;
        if (gradeLevel >=9 && gradeLevel <= 12)
            school="high school";
        else if (gradeLevel >=6 && gradeLevel <=8)
            school= "middle school";
        else
            school="elementary school";
    }
    
    /**
     * This is a toString for the Student class. It returns a String
     * representation of the object, which includes the fields
     * in that object.
     * 
     * Modify the to string to add 'and goes to _____' at the end
     */
    public String toString()
    {
        return firstName + " " + lastName + " is in grade " + gradeLevel+ " and goes to " +school;
    }
    
    public String getFirstName(){
        return firstName;
    }
}