package com.polymorphism.libraryBooks;

import java.util.ArrayList;

public class BookTester
{
    public static void main(String[] args)
    {
        // Start here!
        ArrayList<Book> lib = new ArrayList<Book>();
        Book tb1 = new TextBook("ABC", "ABC", "MATH","9th" );
        Book tb2 = new TextBook("ABC", "ABC", "Science","10th" );
        Book tb3 = new TextBook("ABC", "ABC", "Social","6th" );
        
        Book n1 = new Novel("ABC", "ABC", "Horror", 200);
        Book n2 = new Novel("ABC", "ABC", "Comic", 200);
        Book n3 = new Novel("ABC", "ABC", "Mystery", 200);
        
        lib.add(tb1);
        lib.add(tb2);
        lib.add(tb3);
        lib.add(n1);
        lib.add(n2);
        lib.add(n3);
        for(Book var : lib){
            System.out.println(var.getTitle());
            System.out.println(var.getAuthor());
        }
    }
}