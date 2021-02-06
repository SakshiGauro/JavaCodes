package com.recursion.factorial;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = in.nextInt();

        System.out.println(calcFactorial(num));
    }

    public static int calcFactorial(int x){
        if (x == 0)
            return 1;
        return x * calcFactorial(x - 1);
    }
}
