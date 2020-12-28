# Chef's Best Meal
In this exercise, we will create two distinct classes, a `Meal` and a `Chef`.

A `Meal` consists of three attributes - a name, the number of calories in the meal, and a recipe. The `Meal` class should include getter methods for all instance variables, and a `toString` that provides the name, and the number of calories that make up the meal. For example, the `toString` for the meal ``Meal toast = new Meal("Toast", 100, "Put in toaster for 3 mins");`` would return:
```
Toast, which has 100 calories."
```
The `Chef` class also has three instance variables - the chef’s name, the name of the restaurant they work at, and their best meal. Their best meal should be a `Meal` object.

The `Chef` class should have getter methods for all instance variables, _as well as getter methods for each instance variable of their meal._ For example, there should be a `getMealRecipe`, `getMealCalories` and `getMealName` getter methods to access information about the meal.

The `Chef` class should also have a `toString` that when printed returns the name of the chef, the restaurant they work at, and the meal that they are best known for:
```
Chef Karel works at Chuck E Cheese and is best known for Toast, which has 100 calories.
```
There is a `Meal` and `Chef` already prepared for you in the `ChefTester` class. Please add another meal and chef and print the `toString` and the meal recipe to the console.