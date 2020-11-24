package com.stringTraversingExamples;
import java.util.Scanner;

public class Letter
{
    public static void main(String[] args)
    {
        // Ask the user for 3 things: their word, letter they want to replace,
        // and replacing letter.
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your word: ");
        String str= input.nextLine();
        System.out.println("\nEnter the letter you want to replace: ");
        String toReplace= input.nextLine();
        System.out.println("\nEnter the replacing letter: ");
        String replace= input.nextLine();
        
        // Call the method replaceLetter and pass all 3 of these items to it for 
        // string processing.
        System.out.println(Letter.replaceLetter(str, toReplace,replace));
    }
    
    // Modify this method so that it will take a third parameter from a user that is the String they want to
    //to replace letterToReplace with. This method should return the modified String.
    public static String replaceLetter(String word, String letterToReplace, String replace)
    {
        
        String newStr=word;
        for(int i = 0; i < word.length(); i++)
        {
            if(word.substring(i, i+1).equals(letterToReplace))
            {
                // for debug:System.out.println(i);
                newStr= newStr.substring(0,i)+replace+newStr.substring(i+1);
                // System.out.println(newStr);
            }
        }
        return newStr;
    }
}