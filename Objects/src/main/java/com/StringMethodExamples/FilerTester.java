package com.StringMethodExamples;
import java.util.Scanner;

public class FilerTester
{
    public static void main(String[] args)
    {
        Filer files = new Filer("hippo");
        
        String word = "zebra";
        
        System.out.println(files.getWord() + " comes before " + word + "?");
        System.out.println(files.comesBefore(word));
        System.out.println(files.getWord() + " comes after " + word + "?");
        System.out.println(files.comesAfter(word));
        System.out.println(files.getWord() + " is equal to  " + word + "?");
        System.out.println(files.isEqual(word));
        
        
        // Notice that the capitalization matters
        word = "Hippo";
        System.out.println("\n\n");
        System.out.println(files.getWord() + " comes before " + word + "?");
        System.out.println(files.comesBefore(word));
        System.out.println(files.getWord() + " comes after " + word + "?");
        System.out.println(files.comesAfter(word));
        System.out.println(files.getWord() + " is equal to  " + word + "?");
        System.out.println(files.isEqual(word));
        
        
        
        System.out.println("\n\n");
        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        word = input.nextLine();
        System.out.println(files.getWord() + " comes before " + word + "?");
        System.out.println(files.comesBefore(word));
        System.out.println(files.getWord() + " comes after " + word + "?");
        System.out.println(files.comesAfter(word));
        System.out.println(files.getWord() + " is equal to  " + word + "?");
        System.out.println(files.isEqual(word));

    }
}
