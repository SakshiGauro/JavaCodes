package com.thisKeyword.song;

public class SongTester
{
    public static void main(String[] args)
    {
        // Start here!
        Song ABBA = new Song ("ABBA", "Dancing Queen", 3,54);
        System.out.println(ABBA);
        Song obj2 = new Song("Bruce Springsteen", "The Heart of Rock and Roll",5,14);
        System.out.println(obj2);
        obj2.setArtist("Huey Lewis & the News");
        System.out.println(obj2);
    }
}