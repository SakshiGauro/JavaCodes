package com.objSuperclass.equalsPart2;

public class Ball
{
   private String color;
   
   public Ball(String color){
       this.color = color;
   }
   
   public String getColor(){
       return color;
   }
   
   // Write an equals method here that returns true if
   // the colors are the same.
    public boolean equals(Ball other){
        return this.getColor().equals(other.getColor());
    }
   // Write a toString statement here, for example:
   // Color: Red
    public String toString(){
        return "Color: " + this.getColor();
    }
   
}