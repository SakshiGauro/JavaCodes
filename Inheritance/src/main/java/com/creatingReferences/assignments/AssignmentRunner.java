package com.creatingReferences.assignments;

import java.util.*;
import java.util.Scanner;

public class AssignmentRunner {

    public static void main(String[] args) {

        // Start here
        Scanner in = new Scanner(System.in);
        ArrayList<Assignment> asg = new ArrayList<Assignment>();
        while(true){
            System.out.println("Please enter an assignment name (exit to quit): ");
            String name = in.nextLine();
            
            if(name.equals("exit"))
                break;
            
            System.out.println("Please enter the available points: ");
            double avp = in.nextDouble();
            
            System.out.println("Please enter the earned points: ");
            double ep = in.nextDouble();
            
            in.nextLine();
            System.out.println("Is this a (t)est or (p)roject: ");
            String ans = in.nextLine();
            
            if(ans.equals("t")){
                System.out.println("Please enter the test date: ");
                String testDate = in.nextLine();
                
                Assignment obj = new Test(name, avp, ep, testDate);
                asg.add(obj);
            }
            else{
                System.out.println("Please enter the due date: ");
                String dueDate = in.nextLine();
                
                System.out.println("Group project? true or false: ");
                boolean grp = in.nextBoolean();
                
                in.nextLine();
                
                Assignment obj = new Project(name, avp, ep, dueDate, grp);
                asg.add(obj);
            }
        }
        System.out.println("Your average: " + average(asg));
    }

    public static double average(ArrayList<Assignment> assignments) {
       Double tpe = 0.0;
       Double tpa = 0.0;
       for(Assignment var : assignments){
           tpa += var.getAvaliablePoints();
           tpe += var.getEarnedPoints();
       }
       return (tpe/tpa) * 100;
    }
}