package com.creatingReferences.creatingEquals;

import java.util.Scanner;

public class PersonTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the Person's name: ");
        String name1 = in.nextLine();
        
        System.out.println("Please enter the Person's birthday: ");
        String bday1 = in.nextLine();
        
        Person person = new Person(name1,bday1);
        
        System.out.println("Please enter the Student's name: ");
        String name2 = in.nextLine();
        
        System.out.println("Please enter the Student's birthday: ");
        String bday2 = in.nextLine();
        
        System.out.println("Please enter the Student's grade: ");
        int grade = in.nextInt();
        
        Person student = new Student(name2, bday2, grade);
        
        System.out.println("Same: " + student.equals(person));
    }
}
