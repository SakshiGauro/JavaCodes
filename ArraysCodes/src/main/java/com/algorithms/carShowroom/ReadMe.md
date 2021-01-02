# Car Showroom
In this exercise, you will need to write two methods.

A car showroom consists of N numbered spaces. Each space can hold at most one car. The spaces are indexed starting from 0 though the last space, N - 1. No two cars in the showroom are the same model.

1.  Write the `CarShowroom` method `findCarSpace`. This method returns the index of the space in which the car with the specified model is located. If there is no car of that model in the showroom, the method returns -1.

2.  Then write the `CarShowroom` method `consolidate`. This method should move the cars so that cars in adjacent spaces, starting at index 0, have no empty spaces between any two cars. Keep the order of the cars the same as the array in the code shows. The `toString` method has been provided to print out filled and unfilled spaces.

Output:
```
Space 0 has a Mustang with a top speed of 157
Space 1 has a Camaro with a top speed of 155
Space 2 has a  null
Space 3 has a Corvette with a top speed of 194
Space 4 has a  null
Space 5 has a  null
Space 6 has a Porshe with a top speed of 210

Index of Mustang should be 0 and is 0
Index of Corvette should be 3 and is 3
Index of Miata should be -1 and is -1

Original Car Showroom:
Space 0 has a Mustang with a top speed of 157
Space 1 has a Camaro with a top speed of 155
Space 2 has a  null
Space 3 has a Corvette with a top speed of 194
Space 4 has a  null
Space 5 has a  null
Space 6 has a Porshe with a top speed of 210

Car Showroom after cars have been consolidated:
Space 0 has a Mustang with a top speed of 157
Space 1 has a Camaro with a top speed of 155
Space 2 has a Corvette with a top speed of 194
Space 3 has a Porshe with a top speed of 210
Space 4 has a  null
Space 5 has a  null
Space 6 has a  null 
```