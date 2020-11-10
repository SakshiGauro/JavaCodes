package com.voidExamples;
import java.util.Scanner;

public class Bot2Tester
{
    public static void main(String[] args) {

       Scanner input= new Scanner(System.in);
       System.out.println("Hello. What is your name?");
       String name=input.nextLine();
       Bot2 convo= new Bot2(name);
       convo.greeting();
      
       System.out.println("What is your favorite animal?");
       String animalName= input.nextLine();
       convo.favoriteAnimal(animalName);
       
       System.out.println("Where do you live?");
       String place= input.nextLine();
       convo.home(place);
       
       System.out.println("What is your favorite number?");
       int num= input.nextInt();
       convo.favoriteNumber(num);
       
       convo.goodbye();
      
      
    }
}