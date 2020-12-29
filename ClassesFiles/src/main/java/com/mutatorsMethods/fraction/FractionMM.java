package com.mutatorsMethods.fraction;

public class FractionMM
{
    // Create your instance variables and constructor here
    private int num;
    private int deno;
    
    public FractionMM(int x, int y){
        num = x;
        deno = y;
    }
    
    
    public int getNumerator() {
        // IMPLEMENT THIS METHOD
        return num;
    }
    
    public int getDenominator() {
        // IMPLEMENT THIS METHOD
        return deno;
    }
    
    public void setNumerator(int x) {
        // IMPLEMENT THIS METHOD
        num = x;
    }
    
    
    public void setDenominator(int x) {
        // IMPLEMENT THIS METHOD
        deno = x;
    }
    
    public void add(FractionMM other) {
        // IMPLEMENT THIS METHOD
        num = num * other.getDenominator() + deno * other.getNumerator();
        deno = deno * other.getDenominator();
    }
    
    public void subtract(FractionMM other) {
        // IMPLEMENT THIS METHOD
        num = num * other.getDenominator() - deno * other.getNumerator();
        deno = deno * other.getDenominator();
    }
    
    public void multiply(FractionMM other) {
        // IMPLEMENT THIS METHOD
        num = num * other.getNumerator();
        deno = deno * other.getDenominator();
    }
    
    public String toString() {
        // IMPLEMENT THIS METHOD
        return num + " / " + deno;
    }
}