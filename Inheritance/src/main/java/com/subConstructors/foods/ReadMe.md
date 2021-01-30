# Foods
For this exercise, you are going to create a `Food` superclass with a `HealthyFood` subclass. The `HealthyFood` will also have a `Fruit` subclass. After creating these classes, test the results in the `FoodTester` class.

The `Food` class will have two instance variables, one to store the name and one to store the calories.

`Food` should have two accessor (getter methods) as well:
```
public String getName()
public int getCal()
```
The `HealthyFood` class will only have one instance variable, group, which represents the food group and should have the following accessor (getter method):
```
public String getGroup()
```
The `Fruit` class will have two instance variables, a boolean indicator if the fruit is local and the color. The accessor methods should be:
```
public boolean isLocal()
public String getColor()
```
Constructors should follow this format:
```
public Food (String foodName, int calories)
public HealthyFood(String foodName, int calories, String foodGroup)
public Fruit(String foodName, int calories, boolean isLocal, String foodColor)
```
Finally, the `Food` class should have a toString that prints:
_name_ has _cal_ calories

For example:

`Ice Cream has 200 calories`
