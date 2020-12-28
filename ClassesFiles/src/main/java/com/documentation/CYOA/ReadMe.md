# Choose Your Own Adventure
One way we can use comments is to help us layout our program before we actually type code. For this exercise you are going to create the structure for a Choose Your Own Adventure game using only comments.

Your adventure can be anything school appropriate and it should ask the user for at least 2 choices, which should lead to at least 4 endings.

Here is an abbreviated example to help:
```
//Intro

//First choice: Kitchen or Dining Room

    //User Chooses Kitchen

        //Kitchen Description
           ...

    //User Chooses Dining Room
        ...
```
Your program should have 10 to 15 comments to help layout the structure.

You are now going to complete your Choose Your Own Adventure program that you outlined in the previuous exercise.

You should start by copying over your code from the previous exercise and then start filling in the details. You will be using nested if statements to help choose the path to one of your four endings.

**Hint:**
It can be hard to predict what the user will enter, so you may want to cast the user input to uppercase and then just look at the first letter to help analze their input. For example:
```
System.out.print("Do you want to head [U]pstairs or to the [B]asement? ");
String firstChoice = input.nextLine();
if (firstChoice.toUpperCase().substring(0,1).equals("U"))
...
```