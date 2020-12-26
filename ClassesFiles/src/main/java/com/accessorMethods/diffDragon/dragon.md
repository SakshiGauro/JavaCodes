# Different Dragon
Write a class called `Dragon`. A `Dragon` should have a name, a level, and a boolean variable, `canBreatheFire`, indicating whether or not the dragon can breathe fire. The class should have getter methods for all of these variables - `getName`, `getLevel`, and `isFireBreather`, respectively.

`Dragon` will also need a constructor, a method to gain experience, and a method to attack.

The constructor should take the name as the first argument and the level as the second argument. The constructor should initialize `canBreatheFire` based on the dragon’s level. If the dragon is level 70 or higher, the dragon can breathe fire (meaning the third member variable should be set to `true`).

You should create three getter (accessor) methods called `getName()`, `getLevel()`, and `isFireBreather()`.

You should also create a method called `attack()`. This method does not return anything. If the dragon can breathe fire, it should print
```
>>>>>>>>>>
>>>>>>>>>>>>>>
>>>>>>>>>>>>>>
>>>>>>>>>>
```
That’s 10 angle brackets, then 14, then 14, then 10 (or copy and paste them!)

If the dragon cannot breathe fire, it should print
```
~ ~ ~
```

Finally, you should have a method called `gainExperience` that takes no parameters. It should add 10 to the dragon’s level and update `canBreatheFire` if necessary.



In summary, you should have the following methods:

- A constructor that takes two parameters - the name and level (in that order)
- getName
- getLevel
- isFireBreather
- gainExperience
- attack