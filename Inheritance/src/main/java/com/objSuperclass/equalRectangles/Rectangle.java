package com.objSuperclass.equalRectangles;

public class Rectangle{

    private int width;
    private int height;
     
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public int getWidth(){
        return width;
    }
    
    public int getHeight(){
        return height;
    }
    
    public boolean equals(Rectangle other){
        return this.getWidth() == other.getWidth() && this.getHeight() == other.getHeight();
    }
    @Override
    public String toString(){
        return "A rectangle with a width of " + width + " and a height of " + height;
    }
    
   
}