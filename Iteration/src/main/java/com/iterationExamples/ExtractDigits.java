package com.iterationExamples;
public class ExtractDigits
{
    public static void main(String[] args)
    {
        extractDigits(2938724);
        
    }
    
    public static void extractDigits(int num)
    {
        int c=0;
        while (num!=0)
        {
            c= num % 10;
            num /=10;
            System.out.println(c);
        }
        
    }
}