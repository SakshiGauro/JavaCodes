package com.efficiencyExamples;
class findCharTester
{
    public static void main(String[] args)
    {
        //this is determines the startTime of the program
        long startTime = System.nanoTime();
        String word = "This is a long word that doesn't include the letter x";
        String key = "x";
        System.out.println("The key "+ key +" is in the String: "+ findChar(word,key));
        //Determines how long that program took
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("This program took " + duration + " nanoseconds.");
        
        //=========================================================================
        //Reassign startTime
        startTime = System.nanoTime();
        // reassign so execution count is the same
        word = "This is a long word that doesn't include the letter x";
        key = "x";
        System.out.println("The key "+ key +" is in the String: "+ findChar2(word,key));
        //Determines length of program
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("This program took " + duration + " nanoseconds.");
    }

    public static boolean findChar(String string, String key)
    {
        for(int index = 0; index < string.length(); index++)
        {
            String character = string.substring(index,index+1);
            if(character.equals(key))
            {
                return true;
            }
        }
        return false;
    }
    
    public static boolean findChar2(String string, String key)
    {
        // Put your code from the last exercise here to test the times of the two algorithms
        for (int i=0; i<string.length(); i++)
        {
            //String a=string.charAt(i);
            if (string.charAt(i)==key.charAt(0))
                return true;
        }
        return false;
    }
}