package com.mutatorsMethods.fraction;

public class FractionTester extends Object
{
    public static void main(String[] args)
    {
        // Implement the Fraction class in Fraction.java
        // Then add code here to test out your Fraction class!
        System.out.println("Fraction Method is Called=========>");
        int a=2;
        int b=3;
        System.out.println(2+3);
        FractionMM frac1= new FractionMM(2,3);
        FractionMM frac2 = new FractionMM (3,5);

        FractionMM first = new FractionMM(1, 2);
        FractionMM second = new FractionMM(1, 3);
        System.out.println();

        System.out.println("BEFORE:");
        System.out.println("first: " + first);
        System.out.println("second: " + second);

        first.multiply(second);

        System.out.println("AFTER:");

        System.out.println("first: " + first);
        System.out.println("second: " + second);
    }
}
