# Distance Conversions
Implement the class `Distance`.

This class has one instance variable, a `double` called `miles`. The class has methods that convert the miles into different units.

It should have the following methods

- `public Distance(double startMiles)` - the constructor; initializes miles
- `public double toKilometers()` - converts the miles to kilometers. To convert to kilometers, divide miles by 0.62137
- `public double toYards()` - converts miles to yards. To convert to yards, multiply miles by 1760.
- `public double toFeet()` - converts miles to feet. To convert to feet, muliply miles by 5280.
- `public double getMiles()` - returns the value of `miles`

**Main Method**
To test your class, create three `Distance` objects in `main`. One represents the distance between Karel and school, Karel and the park, and Karel and his best friend.

Karel lives 5 miles from school. Karel lives 10 miles from the park. Karel lives 12 miles from his best friend.

Your program should use the methods from Distance to print the number of

- yards Karel lives from school
- kilometers Karel lives from the park
- feet Karel lives from his best friend
