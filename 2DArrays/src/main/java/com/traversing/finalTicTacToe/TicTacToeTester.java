package com.traversing.finalTicTacToe;

import java.util.Scanner;

public class TicTacToeTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        TicTacToe game = new TicTacToe();
        int row, col;
        while(true)
        {
            game.printBoard();
            System.out.println("UserX: enter rows");
            row = in.nextInt();
            System.out.println("UserX: enter columns");
            col = in.nextInt();
            
            if (game.userInput(row,col,"X"))
            {
                System.out.println("UserX won!");
                break;
            }
                
            game.printBoard();
            
            System.out.println("UserO: enter rows");
            row = in.nextInt();
            System.out.println("UserO: enter columns");
            col = in.nextInt();
            
            if(game.userInput(row,col,"O"))
            {
                System.out.println("UserO won!");
                break;
            }
            game.printBoard();
        }
    }
}
