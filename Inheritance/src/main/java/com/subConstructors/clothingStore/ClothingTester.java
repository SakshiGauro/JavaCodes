package com.subConstructors.clothingStore;

public class ClothingTester
{
    public static void main(String[] args)
    {
        // Start here!
        Jeans jean = new Jeans("XS");
        Sweatshirt ss = new Sweatshirt("M", "black", true);
        TShirt tee = new TShirt("S", "red", "cotton");
        Jeans jeanny = new Jeans("M");
        
        System.out.println(jean);
        System.out.println(ss);
        System.out.println(tee);
        System.out.println(jeanny);
    }
}