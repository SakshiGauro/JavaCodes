# Airline Tickets
The ticketing system at the airport is broken, and passengers have lined up to board the plane in the incorrect order. The line of passengers has already been created for you, and is stored in the `ArrayList` tickets in the `AirlineTester` class.

Devise a way to separate passengers into the correct boarding groups.

Currently, there is an `AirlineTicket` class that holds the information for each passengers ticket. They have a name, seat, row, and boarding group.

Use the ``TicketOrganizer`` class to help fix the order of passengers boarding. First, create a constructor that takes an ArrayList of AirlineTickets and assigns it to the instance variable `tickets`. Then, create a `getTickets` method to get the ArrayList of `AirlineTickets`.

In the `TicketOrganizer` class, create a method called `printPassengersByBoardingGroup` that prints out the name of the passengers organized by boarding group. The boarding groups go from 1-5, and have been predetermined for you. This should print the boarding group followed by all passengers in the group:
```
Boarding Group 1:
Passenger 2
Passenger 9
Passenger 11
Passenger 12
Boarding Group 2:
Passenger 4
Boarding Group 3:
Passenger 5
Passenger 6
Passenger 7
Passenger 8
Passenger 13
Boarding Group 4:
Passenger 14
Boarding Group 5:
Passenger 1
Passenger 3
Passenger 10
Passenger 15
```
You should also create a method named `canBoardTogether` which determines if passengers already in line in the `tickets` ArrayList can board with the people they are standing next to in line. If a passenger has the same row and boarding group as the person behind them, this method should print that those two passengers can board together. For instance if Passenger 11 and Passenger 12 are both in Row 3, and in Boarding Group 4, the method would print:
```
Passenger 11 can board with Passenger 12.
```
If there are no passengers that can board together, then it should print that out to the console.