package com.arrays.scores;

public class Scores
{
    public static void main(String[] args)
    {
        // Start here!
        int[] scores = {80, 95, 82, 67, 100};
        for (int i = 0; i<scores.length; i++)
        {
            System.out.println(scores[i]);
        }
        
        scores[2] = 72;
        scores[4] = 95;
        
        System.out.println();
        
        for (int i = 0; i<scores.length; i++)
        {
            System.out.println(scores[i]);
        }
    }
}