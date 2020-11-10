package com.examples;
public class AddFractions 
{
    public static void main(String[] args)
    {
         int a= 2;
         int b=15;
         int c=13;
         int d=9;
         System.out.println("The numerator of the first fraction is "+a);
         System.out.println("The denominator of the first fraction is "+ b);
         System.out.println("The numerator of the second fraction is " + c);
         System.out.println("The denominator of the second fraction is "+ d);
        int sumNum=a*d+ b*c;
         System.out.println ("The sum of "+a+"/"+b+"+"+c+"/"+d+"="+sumNum+"/" + b*d );    
    }
}