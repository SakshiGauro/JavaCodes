package com.recursion.bacteriaCultures;
import java.util.Scanner;

public class Bacteria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many hours will the bacteria sit? ");
        int hours = in.nextInt();
        System.out.println("After " + hours + ", there will be " + numBacteriaAlive(hours));
    }

    public static int numBacteriaAlive(int hour){
        if (hour == 0)
            return 10;
        return numBacteriaAlive(hour - 1) + numBacteriaAlive(hour-1) * 2;
    }
}
