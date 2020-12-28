# Full Fraction Class
**YOUR JOB:**

Implement the following methods in the Fraction class:
```
public void add(Fraction other)
public void subtract(Fraction other)
public void multiply(Fraction other)
public int getNumerator()
public int getDenominator()
public void setNumerator(int x)
public void setDenominator(int x)
public String toString()
```
Use the FractionTester file to test as you go along.

**HINTS:**

Note that
```
public void add(Fraction other)
public void subtract(Fraction other)
public void multiply(Fraction other)
```
are `void` methods. They do not return anything. These methods should not create a new Fraction and return it.

Instead, these methods should modify the instance variables to be added, subtracted, or multiplied by the Fraction `other`.

For example, if you had the following code in your FractionTester class:
```
Fraction first = new Fraction(1, 2);
Fraction second = new Fraction(1, 3);
System.out.println();

System.out.println("BEFORE:");
System.out.println("first: " + first);
System.out.println("second: " + second);

first.multiply(second);

System.out.println("AFTER:");

System.out.println("first: " + first);
System.out.println("second: " + second);
```
Running should print out:
```
BEFORE:
first: 1 / 2
second: 1 / 3

AFTER:
first: 1 / 6
second: 1 / 3
```
The Fraction `first` was modified by being multiplied by the Fraction `second`. `first` was affected, `second` was not. `1/2` became `1/6` because it was multiplied by `1/3`.