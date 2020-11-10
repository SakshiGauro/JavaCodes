package com.voidExamples;
import java.util.Scanner;

public class BotTester
{
    public static void main(String[] args) {

        //Put your code here
        Scanner input=new Scanner(System.in);
        System.out.println("Hello. What is your name? What's the weather like?How many feet in a mile?");
        String name=input.nextLine();
        
        Bot bot=new Bot(name);
        bot.greeting();
        bot.help();
        bot.weather();
        bot.feetInMile();
        bot.goodbye();
        
        
    }
}
