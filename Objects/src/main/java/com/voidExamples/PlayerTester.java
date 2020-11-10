package com.voidExamples;
public class PlayerTester
{
    public static void main(String[] args)
    {
        String name1="Lebron James";
        String team="AHS";
        String name2="Michael Jordan";
        
        BasketballPlayer bbp= new BasketballPlayer(name1,team);
        
        bbp.addGame(5,9);
        bbp.addGame(6,8);
        bbp.addGame(10,10);
        bbp.addGame(4,18);
        
        BasketballPlayer bbpnt= new BasketballPlayer(name2);
        bbpnt.addGame(5,9);
        bbpnt.addGame(6,8);
        bbpnt.addGame(10,10);
        bbpnt.addGame(4,18);
        
        System.out.println(name1);
        bbp.printPPG();
        bbp.printAPG();
        System.out.println(bbp);
        System.out.println();
        
        System.out.println(name2);
        bbpnt.printPPG();
        bbpnt.printAPG();
        System.out.println(bbpnt);
    
    }
}
