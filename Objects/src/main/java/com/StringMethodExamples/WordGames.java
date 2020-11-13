package com.StringMethodExamples;
public class WordGames
{
    private String word;
    
    public WordGames(String text)
    {
        word = text;
    }
    
    public String scramble()
    {
        int len=word.length() /2;
        String first= word.substring(0,len);
        String second= word.substring(len);
        String scram=second+first; 
        return scram;
    }
    
    
    public String bananaSplit(int insertIdx, String insertText)
    {
        String first= word.substring(0,insertIdx);
        String second= word.substring(insertIdx);
        String split= first +insertText+second;
        return split;
       
    }
    
    
    public String bananaSplit(String insertChar, String insertText)
    {
        int index= word.indexOf(insertChar);
        String first= word.substring(0,index);
        String second= word.substring(index);
        String split= first +insertText+second;
        return split;
        
    }
    
    
    public String toString()
    {
        String nWord="["+word+"]";
        return nWord;
        
    }
    
    
}
