package com.MathClassExamples;
public class UnitCircle 
{
    public static void main(String[] args)
    {
        System.out.println("Radians: (cos, sin)");
        double a1 = 0;
        double a2=Math.PI/2;
        double a3=Math.PI;
        
        double cosine = Math.cos(a1);
        cosine = Math.round(cosine * 100) / 100.0;
        double sin = Math.sin(a1);
        sin = Math.round(sin * 100) / 100.0;
        
        System.out.println(a1+": "+cosine+ ", "+sin );
        
        cosine = Math.cos(a2);
        cosine = Math.round(cosine * 100) / 100.0;
        sin = Math.sin(a2);
        sin = Math.round(sin * 100) / 100.0;
        
        System.out.println(a2+": "+cosine+ ", "+sin );
        
        cosine = Math.cos(a3);
        cosine = Math.round(cosine * 100) / 100.0;
        sin = Math.sin(a3);
        sin = Math.round(sin * 100) / 100.0;
        
        System.out.println(a3+": "+cosine+ ", "+sin );
        
    }
}