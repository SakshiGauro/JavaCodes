package com.documentation.CYOA;
import java.util.Scanner;

public class CYOA
{
    public static void main(String[] args)
    {
// Start by importing your code from the previous exercise
        // new Scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Only use lower cases! \n Choose your adventure");
        // ask the user to choose between kitchen and Living room and bathroom (2 choice)
        System.out.println("Choose one of these: [k]itchen, [l]iving room, [b]athroom");
        String choice = input.nextLine();
    /*             if the user chose kitchen
             ask if the want to look in the cabinets or the oven or fridge (2 choice)
             if: cabinets
                 nothing is here
             if oven
                 congrats you got yourself a pizza
             if fridge
                 only bad milk is here :( */
        if (choice.substring(0,1).equals("k")){
            System.out.println("choose one of these actions: look into the [c]abinets, the [o]ven, the [f]ridge");
            choice = input.nextLine();
            if (choice.substring(0,1).equals("c")){
                System.out.println("Nothing's here :(");
            }
            else if(choice.substring(0,1).equals("o")){
                System.out.println("Congrats! you earned yourself a pizza");
            }
            else if(choice.substring(0,1).equals("f")){
                System.out.println("Only spoiled milk is here.");
            }
        }
        // living room:
        //     ask if they want to look under carpet, inside the cushion, behind the TV, inside drawers (3 choice)
        //     if: under carpet
        //         nothing here other than some dusts
        //     if: inside the cushions
        //         found $25
        //     if: behind the TV
        //         found the car keys
        //     if: inside the drawers
        //         I would certainly not hide it here
        else if(choice.substring(0,1).equals("l")){
            System.out.println("Choose these options: look under [ca]rpet, inside the [cu]shion, behind the [TV], inside [d]rawers");
            choice = input.nextLine();
            if (choice.substring(0,2).equals("ca")){
                System.out.println("A reminder to dust off your carpet");
            }
            else if(choice.substring(0,2).equals("cu")){
                System.out.println("You found a $25 bill!");
            }
            else if(choice.substring(0,2).equals("TV")){
                System.out.println("HUhh?! a new car key");
            }
            else if(choice.substring(0,1).equals("d")){
                System.out.println("I would certainly not hide it here");
            }
        }
        // bathroom:
        //     ask if they want to look under the sink, on the shower curtains
        //     if: under the sink
        //         gold ring
        //     if: shower curtain
        //         Try again next time
        else if(choice.substring(0,1).equals("b")){
            System.out.println("Choose: under the [s]ink or shower [c]urtains");
            choice = input.nextLine();
            if (choice.substring(0,1).equals("s")){
                System.out.println("A gold ring!");
            }
            else if(choice.substring(0,1).equals("c")){
                System.out.println("Nothing.");
            }
        }
    }
}