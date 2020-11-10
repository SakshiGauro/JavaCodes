package com.voidExamples;
public class Bot2 {

    private String name;

    public Bot2 (String yourName){
        name = yourName;
    }

    public void greeting(){
        System.out.print("Hello ");
        System.out.print(name);
        System.out.println("! My name is Hal!");
        System.out.println("How are you today!");
    }

    public void help(){
        System.out.println("You can ask me about the weather,");
        System.out.println("or how many feet are in a mile.");
        System.out.println("I can even convert feet to meters!");
    }

    public void weather(){
        System.out.println("It's always warm and dry inside your computer!");
    }

    public void feetInMile() {
        System.out.println("There are 5280 feet in a mile.");
    }

    public void goodbye(){
        System.out.println("It was nice talking with you!");
        System.out.println("Have a great day!");
    }

    public void favoriteNumber(int yourNumber){
        System.out.println("My favorite number is 8.");
        System.out.print("That is ");
        System.out.print(yourNumber - 8);
        System.out.println(" away from your number.");
    }

    public void favoriteAnimal(String yourAnimal){
        System.out.print("Cool. I also like ");
        System.out.print(yourAnimal);
        System.out.println("s.");
        System.out.println("My favorite animals are dogs. Have you met Karel?");
    }

    public void home(String location){
        System.out.print("I heard it is really nice in ");
        System.out.print(location);
        System.out.println(".");
        System.out.println("I live in a cloud, which is actually pretty cool!");
    }

    public double feetToMeters(double feet){
        double meters = feet * 0.3048;
        return meters;
    }

}
