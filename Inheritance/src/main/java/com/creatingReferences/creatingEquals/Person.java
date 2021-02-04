package com.creatingReferences.creatingEquals;

public class Person {

    private String name;
    private String birthday;

    public Person (String name, String birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }

    public String getBirthday(){
        return birthday;
    }

    public String getName(){
        return name;
    }

    //Create a equals method here
    public boolean equals(Person person){
        return person.getName().equals(name) && person.getBirthday().equals(birthday);
    }
}
