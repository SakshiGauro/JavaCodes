package com.traversing.ticTacToe;

public class TicTacToe
{
   //copy over your constructor from the Tic Tac Toe Board activity in the previous lesson!
    private int turn;
    String[][] ticTacToe = new String[3][3];
    
    public TicTacToe()
    {
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                ticTacToe[i][j] = "-";
            }
        }    
    }
   
   //this method returns the current turn
    public int getTurn()
    {
       return turn;
    }
   
   /*This method prints out the board array on to the console
   */
   public void printBoard()
   {
       System.out.println(" " + " 0 "+ "1 "+"2");
       for(int r = 0; r < ticTacToe.length; r++)
       {
           System.out.print(r + " ");
           for(int c = 0 ; c < ticTacToe[r].length; c++)
           {
               System.out.print(ticTacToe[r][c]+" ");
           }
           System.out.println();
       }
   }
   
   //This method returns true if space row, col is a valid space
   public boolean pickLocation(int row, int col)
   {
       return row < 3 && col < 3 && ticTacToe[row][col] == "-";
   }
   
   //This method places an X or O at location row,col based on the int turn
   public void takeTurn(int row, int col)
   {
       if(pickLocation(row,col))
       {
            if(turn % 2 == 0 )
                ticTacToe[row][col] ="X";
            else
                ticTacToe[row][col] ="O";
            turn++;
       }
       
   }
   
   //This method returns a boolean that returns true if a row has three X or O's in a row
   public boolean checkRow()
   {
       int X, O;
       for(int r = 0; r < ticTacToe.length; r++)
       {
           X = 0;
           O = 0;
           for(int c = 0; c < ticTacToe[r].length; c++)
           {
                if (ticTacToe[r][c].equals("X"))
                    X++;
                else
                    O++;
           }
            if (X == 3 || O == 3)
                return true;
       }
       return false;
   }
   
    //This method returns a boolean that returns true if a col has three X or O's
   public boolean checkCol()
   {
       int X, O;
       for(int r = 0; r < ticTacToe.length; r++)
       {
           X = 0;
           O = 0;
           for(int c = 0; c < ticTacToe[r].length; c++)
           {
                if (ticTacToe[c][r].equals("X"))
                    X++;
                else
                    O++;
           }
            if (X == 3 || O == 3)
                return true;
            else
                return false;
       }
       return false;
   }
   
    //This method returns a boolean that returns true if either diagonal has three X or O's
   public boolean checkDiag()
   {
        if (ticTacToe[0][0].equals("X") && ticTacToe[1][1].equals("X") && ticTacToe[2][2].equals("X"))
            return true;
        else if (ticTacToe[0][0].equals("O") && ticTacToe[1][1].equals("O") && ticTacToe[2][2].equals("O"))
            return true;
        else
            return false;
   }
   
   //This method returns a boolean that checks if someone has won the game
   public boolean checkWin()
   {
       return checkRow() || checkCol() || checkDiag();
   }

}