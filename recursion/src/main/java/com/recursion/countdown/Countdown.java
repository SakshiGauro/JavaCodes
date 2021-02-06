package com.recursion.countdown;
import java.util.Scanner;

public class Countdown {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter a number to start: ");
        int num = in.nextInt();

        System.out.println(countdown(num));
    }

    public static String countdown(int n){
        if(n == 0)
            return "Blastoff!";
        return n + " " + countdown(n - 1);
    }
}
