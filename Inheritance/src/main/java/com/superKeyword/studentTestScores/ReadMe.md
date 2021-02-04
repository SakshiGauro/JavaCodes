# Student Test Scores
For this exercise, we are going to do a variation on our Student class by looking at a `StudentTest` class. The `StudentTest` class stores math and ELA test scores for a student.

We will then extend this class in the `HSStudent` class, which will check the math and ELA scores to determine if the student has passed. Combined with service hours, the `HSStudent` class will also check to see if the student has qualified for graduation.

Details for each class are outlined in the starter code for each class.

In the `StudentTester` class, you will prompt the user for test scores and service hours, then use these to create a `HSStudent` object. After creating the object, print out the results.

###Sample Output
```
Please enter the student name:
Ryan
Please enter the Math Score:
500
Please enter the ELA Score:
600
Please enter the Service Hours:
100
Pass Math? false
Pass ELA? true
Completed Service Hours? true
Ryan has not yet qualified for graduation.
```