# Cars
In this exercise, we are going to revist our `Car` and `ElectricCar` class from lesson 3. In lesson 3, you were given the `Car` class and needed to complete the `ElectricCar` class. You can use your code from that exercise to get started here.

The focus of this exercise is the `CarTester` class. In this class, you will prompt the user for a car model and if the car is not electric, you will also prompt the user for the miles per gallon. For each car, you will add it to a single ArrayList.

You will continue asking the user until they exit, then you will loop through your ArrayList and print the results.

Remember, for a method call to compile, it needs to be defined in the reference type (the `Car` class in this exercise), but the actual method that executes will be based on the instantiated class. In this exercise, we want electric cars to run the Override methods.

###Sample Output
```
Please enter a car model name(exit to quit):
Tesla
Is this car electric? (y or n)
y
Please enter a car model name(exit to quit):
F-150
Is this car electric? (y or n)
n
How many miles per gallon:
18
Please enter a car model name(exit to quit):
exit
Car: Tesla
MPG: Electric cars do not calculate MPG

Car: F-150
MPG: 18
```
