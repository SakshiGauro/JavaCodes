package com.StringObjectsExamples;
import java.util.Scanner;

public class CalculatorTester
{
    public static void main(String[] args)
    {
        // Ask for two doubles.
        Scanner input= new Scanner(System.in);
        System.out.println("Enter 2 doubles");
        double num1=input.nextDouble();
        double num2=input.nextDouble();
        
        Calculator cal= new Calculator();

        double sum=cal.sum(num1,num2);
        double diff=cal.subtract(num1,num2);
        double product=cal.multiply(num1,num2);
        double quotient=cal.divide(num1,num2);
        
        System.out.println(num1+" + "+ num2+" = "+ sum);
        System.out.println(num1+" - "+ num2+" = "+ diff);
        System.out.println(num1+" * "+ num2+" = "+ product);
        System.out.println(num1+" / "+ num2+" = "+ quotient);
    }
}
