package com.staticVariablesMethods.rockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors
{
    private static final String USER_PLAYER = "User wins!";
    private static final String COMPUTER_PLAYER = "Computer wins!";
    private static final String TIE = "Tie";
        
    public static String getWinner(String user, String computer)
    {
        System.out.println("User: " + user);
        System.out.println("Computer: " + computer);
        if (user.equals(computer))
            return TIE;
        else if ((user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper")) ||
            (user.equals("rock") && computer.equals("scissors")))
            return USER_PLAYER;
        else
            return COMPUTER_PLAYER;
    }
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String compChoice="";
        while (true)
        {
            int comp= Randomizer.nextInt(1,3);
            if (comp == 1)
                compChoice = "rock";
            else if (comp ==2)
                compChoice = "paper";
            else
                compChoice = "scissors";
            
            System.out.println("Enter your choice (rock, paper, or scissors): ");
            String user= in.nextLine();
            if (user.equals(""))
                break;
            System.out.println(RockPaperScissors.getWinner(user,compChoice));
        }
        System.out.println("Thanks for playing!");
    }
}
