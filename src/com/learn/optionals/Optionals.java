package com.learn.optionals;

import com.learn.optionals.Person;

import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {

       Optional<Person> person = findPersonByName("Mira");

       /** If it is null, return the value of orElse */
       Person p = person.orElse(new Person("", 0));

       System.out.println(p);
    }

    public static Optional<Person> findPersonByName(String name) {

        Person person = new Person("Lizzy", 23);

        return Optional.ofNullable(person);
    }
}
