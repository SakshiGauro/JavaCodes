package com.twodArray.chessBoard;

public class ChessBoard
{
    public static void main(String[] args)
    {
        //Create an 8x8 2D String array called chess.
        String[][] chess = new String[8][8];
        String[] arr1 = {"Rook","Knight","Bishop","Queen","King","Bishop","Knight","Rook"};
        chess[0]=arr1;
        String[] arr2 = {"Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn"};
        chess[1]= arr2;
        
        for(int i = 2; i < 6; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                chess[i][j] = "-";
            }
        }
        chess[6] = arr2;
        chess[7] = arr1;
        
        //Use this method to print the chess board onto the console
        print(chess);
        

    }
    
    //Do not make alterations to this method!
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}