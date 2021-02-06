# Bacteria Cultures
A chemistry teacher asked her class to answer the following question:
```
If I put 10 bacteria on the classroom doorknob tonight, how many bacteria will be on the doorknob by the time we come to school tomorrow?
```
In order to answer this question, you need to know a few things:

1. Each bacterium (a single bacteria) can create 2 more bacteria every hour
2. This means that after one hour, the doorknob will have 10 + 10 * 2 = 30 bacteria, since we started with 10 bacteria and each of those created 2 more.
3. This means that after two hours, the doorknob will have 30 + 30 * 2 = 90, since there were 30 bacteria at the beginning of hour two, and during that hour each bacteria created 2 more bacteria.
4. Continuing this pattern, the number of bacteria on the doorknob after N hours is
`numberOfBacteriaLastHour + numberOfBacteriaLastHour * 2`
5. However, if we wanted to know how many bacteria are alive after 12 hours, we need to know how many bacteria were alive at hour 11. To find out how many bacteria are alive at hour 11, we need to figure out how many were alive at hour 10. Do you see how we can use recursion to solve this problem?

Write a recursive function that computes the number of bacteria alive after _N_ hours.
The function signature is
```
public static int numBacteriaAlive(int hour)
```