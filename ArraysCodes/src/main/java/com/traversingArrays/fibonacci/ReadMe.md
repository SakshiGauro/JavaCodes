# Fibonacci Sequence
The Fibonacci sequence is the sequence of numbers:

0, 1, 1, 2, 3, 5, 8, 13, 21, 34, …

The next number is found by adding up the two numbers before it.

For example, the 2 is found by adding the two numbers before it (1+1). The 3 is found by adding the two numbers before it (1+2). The 5 is found by adding the two numbers before it (2+3), and so on! Each number in the sequence is called a term.

In this exercise, you will need to:

- Create the array `int[] sequence` that holds the values of the first 15 terms of the Fibonacci sequence. Think carefully about what happens to the index when iterating through the loop to fill this array. Read the Fibonacci description above to help!
- Then print out the sequence of numbers separated by a space.
- Finally, create a method `findIndex` to find the index of the term 55.

###Sample output:
```
Fibonacci sequences up to 15 terms:
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
Index position of 55 is: 10
```
**Hint:** You will need to use several loops: One to fill the array, one to print the array, and one to traverse the array!