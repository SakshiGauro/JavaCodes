package com.arrays.snapShot;

public class SnapShot
{
    public static void main(String[] args)
    {
        // Start here!
        String[] snap = {"Welcome", "to", "the snap shot", "app!"};
        
        for (int i=0; i<snap.length; i++){
            System.out.println(snap[i]);
        }
        
        snap[0] = "Upgrade";
        snap[3] = "premium app!";
        System.out.println();
        
        for (int i=0; i<snap.length; i++){
            System.out.println(snap[i]);
        }
    }
}