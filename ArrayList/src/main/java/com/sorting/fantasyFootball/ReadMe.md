# Fantasy Football Roster
Create a program that allows you to create a fantasy football roster based on the existing list of available players.

Your team can only have 5 players, so create an array that can store 5 possible players.

Prompt the user to pick 5 players to add to their team. If the player is available in the list of `availablePlayers`, then add that player to the users array, and remove that player from the `availablePlayers` list. Then prompt the user to pick another player. Once all five players have been added, then print the list in the console.

Create a `search` method to find the index at which the player is located in the `availablePlayers` list so you can remove the player, and make sure that they are an eligible pick.

Here is a sample run of the program:
```
Enter Player you would like on your team:
Cam Newton
Great! That player is added to your team!

Enter Player you would like on your team:
Travis Kelce
Great! That player is added to your team!

Enter Player you would like on your team:
Alvin Kamara
Great! That player is added to your team!

Enter Player you would like on your team:
Alvin Kamara
That player is not available, please pick another player.

Enter Player you would like on your team:
Patrick Mahomes
Great! That player is added to your team!

Enter Player you would like on your team:
Mike Evans
Great! That player is added to your team!

Your team is:
Cam Newton
Travis Kelce
Alvin Kamara
Patrick Mahomes
Mike Evans
```