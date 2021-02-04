package com.objSuperclass.arrayTester;

public class TwoDArray {

    private Object[][] myArray;

    public TwoDArray(Object[][] input){
        myArray = input;
    }

    public boolean equals(Object[][] other){

        // Add your code here
        if(myArray.length != other.length)
            return false;
        for(int r = 0; r < other.length; r++){
            for(int c = 0; c < other[r].length; c++){
                if(myArray[r][c] != other[r][c])
                    return false;
            }
        }
        return true;
    }

}