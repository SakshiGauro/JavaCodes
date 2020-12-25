# MovieRatings

Movies always come with ratings. A bad movie may have 1.4 stars, and a great movie may have 4.9 stars.

Your job is to write a program that asks the user for a movie rating as a `double`, and then rounds to the nearest `int`
using the rounding with casting technique.

For example, a run of your program may look like this:
```
Enter movie rating (as a decimal)
1.4 Rating rounded: 1 
```
Another run may look like this:
```
Enter movie rating (as a decimal)
3.7 Rating rounded: 4 
```
If the initialized value has a decimal place of .5 or greater, you should round up:
```
Enter movie rating (as a decimal)
3.5 Rating rounded: 4 
```
HINT:
To see how you can use casting to round double values to the nearest int value, refer to the previous example Rounding
using Casting.
