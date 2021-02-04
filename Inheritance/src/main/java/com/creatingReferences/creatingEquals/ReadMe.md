# Creating .equals
For this exercise, we are going to look at how we can create a `.equals` method. Remember, to compare objects, we cannot just use ==. We need to create a criteria to determine if the objects are equal.

In our case, we will say that two people are the same if both the name and birthday match. We are going to write a program that prompts the user for a person’s name and birthday and a student’s name, birthday, and grade, and decide if they are the same person.

Start in the `Person` class creating the `.equals` method. Remember, this should take the other `Person` as an input and return a boolean if both the name and birthday are equal.

Once completed, create the tester class where you will prompt the user for information. Sample output is provided below.

###Sample Output
```
Please enter the Person's name: Tanner
Please enter the Person's birthday: 5/4/2005
Please enter the Student's name: Tanner
Please enter the Student's birthday: 5/4/2005
Please enter the Student's grade: 12
Same: true
Please enter the Person's name: Tanner
Please enter the Person's birthday: 5/4/2005
Please enter the Student's name: Angela
Please enter the Student's birthday: 5/4/2005
Please enter the Student's grade: 12
Same: false
```