package com.constructors.schoolClubClass;
public class StudentTester
{
    public static void main(String[] args)
    {
        Student alan = new Student("Alan", "Turing", 11, "Liberty High School");
        Student ada = new Student("Ada", "Lovelace", 5);
        
        System.out.println(alan);
        System.out.println(ada);
        
        SchoolClub alanClub = new SchoolClub(alan,"drama");
        SchoolClub adaClub = new SchoolClub(ada,"piano");
        
        System.out.println(alanClub);
        System.out.println(adaClub);
    }
}
