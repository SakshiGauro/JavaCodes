# Recursive Minimum
Write a recursive function that finds the minimum value in an ArrayList.

Your function signature should be
```
public static int findMinimum(ArrayList<Integer>)
```
One way to think of finding a minimum recursively is to think “the minimum number is either the last element in the ArrayList, or the minimum value in the rest of the ArrayList”.

For example, if you have the ArrayList

`[1, 3, 2, 567, 23, 45, 9],`

the minimum value in this ArrayList is either `9` or the minimum value in `[1, 3, 2, 567, 23, 45]`

_Hint:_
The trick is to remove the last element each time to make the ArrayList a little shorter.