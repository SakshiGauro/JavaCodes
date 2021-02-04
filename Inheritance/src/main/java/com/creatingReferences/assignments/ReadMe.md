# Assignments
In this lesson, we are going to create an `Assignment` superclass with a `Test` and `Project` subclass.

##Assignment class
The `Assignment` class should have the following three instance variables:

- `String name`
- `double availablePoints`
- `double earnedPoints`

The constructor heading should be:
```
public Assignment(String name, double availablePoints, double earnedPoints)
```
##Test class
The `Test` class should have the following instance variable:

- `String testDate`
The constructor heading should be:
```
public Test(String name, double availablePoints, double earnedPoints, String testDate)
```
##Project class
The `Project` class should have the following instance variables:

- `String dueDate`
- `boolean groups`

The constructor heading should be:
```
public Project(String name, double availablePoints, double earnedPoints, String dueDate, boolean groups)
```
**Each class should have getters and setters for each of its instance variables.**

##AssignmentRunner class
The `AssignmentRunner` should loop and prompt users for an assignment name until they enter `exit`. After getting the name, it should prompt the user for each of the pieces of information needed to create either a test or a project.

Once the user has finished entering information, the program should call a static method to calculate the average (total points earned / total points available * 100).

**Note:** Remember that the Scanner `nextInt()`, `nextBoolean()`, and `nextDouble()` lines only read part of the line. Don’t forget to use a `nextLine()` before reading a new string!

###Sample Output
```
Please enter an assignment name (exit to quit): Array Test
Please enter the available points: 100
Please enter the earned points: 95
Is this a (t)est or (p)roject: t
Please enter the test date: 4/25
Please enter an assignment name (exit to quit): MadLibs Project
Please enter the available points: 75
Please enter the earned points: 75
Is this a (t)est or (p)roject: p
Please enter the due date: 4/15
Group project? true or false: true
Please enter an assignment name (exit to quit): exit
Your average: 97.14285714285714
```
**Also Note:** Your output must contain the phrase `Your Average:` to pass the autograder.