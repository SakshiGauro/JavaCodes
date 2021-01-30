# Students
In this exercise, we are going to look at creating a Superclass / Subclass relationship for Students.

Our superclass will be the `Student` class and contain the following instance variables:

- `String name` - Students first and last name
- `int classYear` - Graduating year, ie. 2022

Our subclass will be `StudentAthlete` and contain the following instance variables:

- `String sport` - Name of sport student plays
- `boolean eligible` - Indicated whether the student is acedemically eligible to play

For this exercise, you will focus on the constructors for both classes. Remember that your subclass constructor needs to call the superclass constructor, so make sure you have the parameters to do that.

The classes will have getters and a toString, but no setters. You can use these to test, but do not need to alter them.

Once completed, create two students as noted in the `StudentTester` class.