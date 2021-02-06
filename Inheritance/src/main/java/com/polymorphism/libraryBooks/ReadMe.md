# Library Books
In this exercise, you are going to be working with 4 classes, a `Book` superclass with `TextBook` and `Novel` subclasses, and a `BookTester` class to run your program. For the `Book`, `TextBook`, and `Novel` class, you will create a constructor and all getters and setters. Be sure to follow standard naming conventions for your getters and setters! Additional information for each class is below.

##Book Class
The `Book` class will have a title and author as instance variables and the constructor should follow this format:
```
public Book(String title, String author)
```
##TextBook Class
The `TextBook` class will have a subject and edition as instance variables and the constructor should follow this format:
```
public TextBook(String title, String author,String subject, String edition)
```
##Novel Class
The `Novel` class will have a genre and pages as instance variables and the constructor should follow this format:
```
public Novel(String title, String author,String genre, int pages)
```
##BookTester
In the tester class, you should create an ArrayList that will store all the books in your library. Then create you library by adding at least 3 textbooks and 3 novels to the ArrayList.

After creating your library, use a loop to access the ArrayList and print out any information you have access to.
