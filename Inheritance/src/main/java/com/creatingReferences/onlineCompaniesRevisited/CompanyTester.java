package com.creatingReferences.onlineCompaniesRevisited;

import java.util.*;
import java.util.Scanner;

public class CompanyTester
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner in = new Scanner(System.in);
        ArrayList<Company> company = new ArrayList<Company>();
        while (true)
        {
            System.out.println("Please enter a company name, enter 'exit' to quit: ");
            String name = in.nextLine();
            
            if (name.equals("exit"))
                break;
                
            System.out.println("Is this an online company, 'yes' or 'no': ");
            String ans = in.nextLine();
            
            if (ans.equals("yes"))
            {
                System.out.println("Please enter the website address: ");
                String web = in.nextLine();
                
                Company com = new OnlineCompany(name, web);
                company.add(com);
            }
            else
            {
                System.out.println("Please enter the street address: ");
                String street = in.nextLine();
                
                System.out.println("Please enter the city address: ");
                String city = in.nextLine();
                
                System.out.println("Please enter the state address: ");
                String state = in.nextLine();
                
                Company com = new Company(name, street, city, state);
                company.add(com);
            }
        }
        
        for(Company var : company)
        {
            System.out.println("\n" + var);
        }
        
    }
}