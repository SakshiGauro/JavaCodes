# Tic Tac Toe Methods
For this exercise, you will complete the `TicTacToe` Board that we started in the 2D Arrays Lesson.

We will add a couple of methods to the `TicTacToe` class.

To track whose turn it is, we will use a counter `turn`. This is already declared as a private instance variable.

Create a `getTurn` method that returns the value of turn.

Other methods to implement:

1. `printBoard()`- This method should print the `TicTacToe` array onto the console. The board should include numbers that can help the user figure out which row and which column they are viewing at any given time. Sample output for this would be:
    ```
      0 1 2
    0 - - -
    1 - - -
    2 - - -
     ```
2. `pickLocation(int row, int col)`- This method returns a boolean value that determines if the spot a user picks to put their piece is valid. A valid space is one where the row and column are within the size of the board, and there are no X or O values currently present.

3. `takeTurn(int row, int col)`- This method adds an X or O to the array at position row,col depending on whose turn it is. If it’s an even turn, X should be added to the array, if it’s odd, O should be added. It also adds one to the value of turn.
4. `checkWin()`- This method returns a boolean that determines if a user has won the game. This method uses three methods to make that check:

- `checkCol`- This checks if a player has three X or O values in a single column, and returns true if that’s the case.
- `checkRow` - This checks if a player has three X or O values in a single row.
- `checkDiag` - This checks if a player has three X or O values diagonally.

`checkWin()` only returns true if one of these three checks is true.