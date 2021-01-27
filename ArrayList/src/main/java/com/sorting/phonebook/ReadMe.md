# Phonebook
When you add a contact to your phone, it automatically sorts those names alphabetically. In this exercise, we are going to create a phonebook that automatically sorts everytime a new number is added to the phonebook.

A `PhoneNumber` class has been created already that has the instance variables `name` and `number`. Your job is to create the `PhoneBook` class that will store an ArrayList of `PhoneNumbers`.

The `PhoneBook` class does not have a constructor - it only contains an ArrayList that can store the individual phone numbers that are added to it.

There should be three methods in the `PhoneBook` class:

1. `addNumber`- This method takes a `PhoneNumber` and adds it to the directory. Once the number has been added, the `sort` method is called on the directory to sort that new address into the phone book.


2. `sort`- This method sorts the directory in alphabetical order A-Z.
    
    **a.** Remember that in order to compare Strings, we can use the `compareTo()` method. This returns an integer that indicates whether a String’s characters are higher or lower in order than the other String. If the value is `-`, then it means the String is alphabetically higher. For example `"S".compareTo("T")` will return -1, indicating that `S` is 1 spot higher than `T`. Use this to help sort your phonebook.

    **b.** If the phonebook sorts after each add, then the list will be sorted completely except for new entry - which sorting method should you use?


3. `printPhoneBook` - This prints each name in the directory on the console. Use this to help you debug your program!