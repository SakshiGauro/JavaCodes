package com.StringMethodExamples;
import java.util.Scanner;

public class WordGameTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Ask for a word
        System.out.println("Enter a word");
        String word1= input.nextLine();
        
        WordGames wGame= new WordGames(word1);
        System.out.println(wGame.scramble()); 
        // Scramble it
        // Print out scrambled word
        
        // Ask for an index
        // Ask for random word
        System.out.println("Enter an integer: ");
        int idx = input.nextInt();
        input.nextLine();  // skip over the newline
        System.out.println("Enter another word: ");
        String word2 = input.nextLine();
        
        // Add random word at index
        // Print out the word
        System.out.println(wGame.bananaSplit(idx,word2));
        
        // Ask for a character (store as a String)
        // Ask for random word
        System.out.println("Char");
        String cha=input.nextLine();
        System.out.print("RAndom word");
        String word3= input.nextLine();
        // Add random word at character
        // Print out the word
        
        System.out.println(wGame.bananaSplit(cha,word3));
        
        
    }
}
