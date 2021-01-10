# ArrayList Helper Methods
In this exercise, you will create a couple of helper methods for ArrayLists in a class called `ArrayListMethods`.

Create three static methods:

1. `print`- This method takes an `ArrayList<String>` as a parameter, and simply prints each value of the ArrayList on a separate line in the console.
2. `condense`- This method takes an `ArrayList<String>` as a parameter, and condenses the ArrayList into half the amount of values. While traversing, this method will take the existing value at the index and add the index following to the existing value. For example, if we had an ArrayList that consisted of Strings `["0", "1", "2", "3"]`, the `ArrayListMethods.condense(["0", "1", "2", "3"])` would alter the ArrayList to be `["01", "23"]`.
3. `duplicate`- This method takes an `ArrayList<String>` and duplicates the value of the index at the position index + 1. As a result, `ArrayListMethods.duplicate(["01", "23"]` would be `["01", "01", "23", "23"]`.

If done correctly, the methods should work in the `ArrayListMethodsTester` file.