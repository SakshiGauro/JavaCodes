# Randomizer
In this exercise, we are going to create a static class `Randomizer` that will allow users to get random integer values from the method `nextInt()` and `nextInt(int min, int max)`.

Remember that we can get random integers using the formula 

`int randInteger = (int)(Math.random() * (range + 1) + startingNum)`.

`nextInt()` should return a random value from 1 - 10, and `nextInt(int min, int max)` should return a random value from `min` to `max`. For instance, if `min` is 3 and `max` is 12, then the range of numbers should be from 3 - 12, including 3 and 12.