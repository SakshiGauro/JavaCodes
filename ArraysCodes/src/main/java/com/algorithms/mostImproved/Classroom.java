package com.algorithms.mostImproved;

public class Classroom
{
    Student[] students;
    int numStudentsAdded;
    
    public Classroom(int numStudents)
    {
        students = new Student[numStudents];
        numStudentsAdded = 0;
    }
    
    public Student getMostImprovedStudent()
    {
        // your code goes here! 
        int index = 0;
        for (int i = 0; i<numStudentsAdded - 1; i++)
        {
            System.out.println("Stdents" + students[i].getName());
            if (students[i].getExamRange() < students[i+1].getExamRange())
                index = i+1;
        }
        return students[index];
    }
    
    public void addStudent(Student s)
    {
        students[numStudentsAdded] = s;
        numStudentsAdded++;
    }
    
    public void printStudents()
    {
        for(int i = 0; i < numStudentsAdded; i++)
        {
            System.out.println(students[i]);
        }
    }
}
