package com.stringTraversingExamples;
import java.util.Scanner;

public class Grammar
{
    public static void main(String[] args)
    {
        // Ask the user to enter a sentence that uses the word 2 instead of to.
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a string");
        String text= input.nextLine();
        
        // Call the method useProperGrammar to process the string according to 
        // the directions.
        System.out.println(Grammar.useProperGrammar(text));
    }
    
    public static String useProperGrammar(String theText)
    {
        // Process the sentence that is sent to this method and replace every 2
        // with the word to.
        int c=0;
        int i=0;
        String str= theText;
        while (i<str.length())
        {
            String check= str.substring(i, i+1);
            //System.out.println(check);
           
            if (check.equals("2"))
            {
                c++;
                str= str.substring(0,i)+"to"+str.substring(i+1);
                
                //System.out.println(str);
            }
            i++;
        }
        System.out.println("Fixed "+c+" grammatical errors:");
        return str;
    }
}