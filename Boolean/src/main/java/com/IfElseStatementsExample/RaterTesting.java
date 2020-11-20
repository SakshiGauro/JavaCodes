package com.IfElseStatementsExample;
public class RaterTesting
{
    public static void main(String[] args)
    {
        // Start here!
        Rater rate=new Rater("ABC",2.0);
        rate.updateReview();
        System.out.println(rate);
        
        rate.setRating(4);
        rate.updateReview();
        System.out.println(rate);
    }
}
 