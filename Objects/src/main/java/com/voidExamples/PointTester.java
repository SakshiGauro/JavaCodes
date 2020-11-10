package com.voidExamples;
public class PointTester
{
    public static void main(String[] args)
    {
        Point p = new Point(10, 5);
        System.out.println(p);
        p.move(3, 4);
        
        System.out.println(p);
        
        // Make a new point here at position (2, 4)
        Point newPoint = new Point(2,4);
         // Then print it out
        System.out.println(newPoint);
       
        
        // Move the point 5 units in the x direction and
        // 2 units in the y direction
        newPoint.move(5,2);
        // Print out the point again to see that it moved
        System.out.println(newPoint);
    }
}
