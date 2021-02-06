package com.recursion.recursiveMinimum;
import java.util.*;

public class RecursiveMin {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while(true){
            System.out.println("Please enter numbers. Enter -1 to quit: ");
            int num = in.nextInt();

            if(num == -1)
                break;
            else
                numbers.add(num);
        }

        System.out.println("Minimum: " + findMinimum(numbers));
    }

    public static int findMinimum(ArrayList<Integer> numbers){
        if(numbers.size() == 1)
            return numbers.get(0);
        if(numbers.get(0) > numbers.get(1))
            numbers.remove(0);
        else
            numbers.remove(1);
        return findMinimum(numbers);
    }
}
