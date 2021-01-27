package com.traversing.sum;

public class Sum
{
    public static void main(String[] args)
    {
        int[][] array = {{32, 4, 14, 65, 23, 6},
                        {4, 2, 53, 31, 765, 34},
                        {64235, 23, 522, 124, 42, 64}};
        int sum;
        for(int r = 0; r < array.length; r++)
        {
            sum = 0;
            for(int c = 0; c < array[r].length; c++)
            {
                sum += array[r][c];
            }
            System.out.println(sum);
        }
    }
    
    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;
        for(int col = 0; col < array[row].length; col++)
        {
            sum += array[row][col];
        }
        return sum;
    }
}