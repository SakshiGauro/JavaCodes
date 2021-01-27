# Billboard Top 10
In this exercise, you will create a Top 10 Musicians of all time list.

A `Musician` class has been built that takes the name, number of albums sold, and number of weeks that artist has been on the Top40 list. The `Musician` class also has a boolean instance variable `isPlatinum` that determines if the musician has gone platinum, meaning they’ve sold over a million copies of the same record.

The `Billboard` class currently has a `top10` ArrayList that will store the top 10 musicians as a list.

In the `Billboard` class, create an `add` method that will add a musician to the list if there are less than 10 musicians in the list, and if the musician has Platinum status. If there are 10 musicians in the list, then the method should call the `replace` method. Otherwise, a message should be displayed to the user that the musician could not be added to the `top10` list.

The `replace` method compares the total number of weeks that the musician has been on the top40 list. If the musician with the lowest number of weeks on the top40 is lower than the number of weeks on the top40 of the new musician, then the old musician is replaced by the new one. There should be a message to the user that the old musician has been replaced by the new one. Otherwise, the user should be notified that the new musician cannot be added because they don’t have enough weeks on the top40. This method should be created in the `Billboard` class.

Use the `BillboardTester` class to test if the new musicians being added are being correctly replaced, or omitted from the Top 10.