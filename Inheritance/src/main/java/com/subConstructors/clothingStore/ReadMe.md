# Clothing Store
In this problem, you’ll design and test a few classes that represent different pieces of clothing in a clothing store.

You’ll write the classes for `TShirt`, `Jeans`, `Sweatshirt` and `Clothing`.

The `Clothing` class should have two instance variables: one for the size of the clothing (a String), and another for the clothing’s color (also a string).

Clothing should have two accessor (getter methods) as well:
```
public String getSize()
public String getColor()
```
The `Sweatshirt` class should have a private instance variable (or field) to store whether or not it has a hood, and a corresponding getter method
```
public boolean hasHood()
```
The `TShirt` class should have a private field to store the fabric and a corresponding getter for that called
```
public String getFabric()
```
All Jeans should have the color blue.

The constructors should be of this format:
```
public Clothing(String size, String color)
public TShirt(String size, String color, String fabric)
public Sweatshirt(String size, String color, boolean hasHood)
public Jeans(String size)
```
Be sure and test in the `ClothingTester` class.