package com.nestedLoopsExamples;
public class TreeOfStars
{
    public static void main(String[] args)
    {
       // Call makeATree 
       makeATree();
    }
    public static void makeATree()
    {
        // Your code goes here!!!
        for (int p=9; p>=1; p--)
        {
             for (int j=p; j>=0; j--)
            {
                
                System.out.print(" ");
              //  j;
            } 
            for (int q=9; q>=p; q--)
            {
                
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
//((p-1)/2)