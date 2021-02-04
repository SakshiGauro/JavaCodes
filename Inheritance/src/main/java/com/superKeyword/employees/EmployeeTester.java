package com.superKeyword.employees;

public class EmployeeTester
{
    public static void main(String[] args)
    {
        // Start here!
        Employee obj1 = new Employee("Mr. Karel", 75000.0);
        HourlyEmployee obj2 = new HourlyEmployee("Mike", 18.0, 11.0);
        
        System.out.println(obj1);
        System.out.println(obj2);
    }
}