package com.StringMethodExamples;
public class Filer
{
    private String word;
    
    public Filer(String theWord)
    {
        word = theWord;
    }
    
    // Returns the word
    public String getWord()
    {
        return word;
    }
    
    // Returns true if word comes
    // before otherWord.
    // Returns false otherwise.
    public boolean comesBefore(String otherWord)
    {
        boolean before= word.compareTo(otherWord) <0;
        return before;
   
    }
    
    
    // Returns true if word comes
    // after otherWord.
    // Returns false otherwise.
    public boolean comesAfter(String otherWord)
    {
        boolean after= word.compareTo(otherWord) >0;
        return after;
    }
    
    
    // Returns true if word is equal to otherWord.
    // Returns false otherwise.
    public boolean isEqual(String otherWord)
    {
        boolean equal= word.compareTo(otherWord)== 0;
        return equal;
    }
    
    
}