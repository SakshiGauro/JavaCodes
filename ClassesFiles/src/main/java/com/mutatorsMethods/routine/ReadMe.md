# Weekly Routine
In this exercise, you will write a class that represents how you spend your time during the week.

The class should have four double instance variables

- `sleep`
- `fun`
- `school`
- `sports`

These variables will track the number of hours you spend doing each of these activities in a single day, respectively.

The class should also have the following methods

- A constructor that has no parameters
- `public void setSleep(double hoursSleep)`
- `public void setFun(double hoursFun)`
- `public void setSchool(double hoursSchool)`
- `public void setSports(double hoursSports)`
- `public void printTotal()`

The constructor should initialize all the instance variables to 0.

The methods that begin with “set” set the values of the corresponding instance variables to the value of the parameter.

The last method should print the total number of hours **per week** you spend doing each of these activities.

Note you will have to **calculate the weekly hours** by using the daily hours stored in the instance variables. It should also print the total number of hours in the week accounted for and how many hours are left over.

Here is an example of the output of `printTotal` if `sleep` = 8, `school` = 8, `fun` = 2, and `sports` = 3.
```
Weekly Totals
Sleep: 56.0
School 56.0
Sports: 21.0
Fun: 14.0
Grand Total: 147.0
Hours left over: 21.0
```