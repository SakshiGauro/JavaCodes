package com.polymorphism.libraryBooks;

public class Novel extends Book{
    // Start here!
    private String genre;
    private int pages;
    
    public Novel(String title, String author, String genre, int pages){
        super(title, author);
        this.genre = genre;
        this.pages = pages;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public void setGenre(String genre){
        this.genre = genre;
    }
    
    public int getPages(){
        return pages;
    }
    
    public void setPages(int pages){
        this.pages = pages;
    }
}
