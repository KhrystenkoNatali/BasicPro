/*
[поиск однофамильцев] Дан лист Person(firstName,lastName, age)
ваша задача получить Map<String, List<Person>> где ключ lastName,
 значение список Person с соответствующим lastName
 */
package app;

import model.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", "Smith", 30),
                new Person("Anna", "Brown", 25),
                new Person("Bob", "Smith", 40),
                new Person("Kate", "Brown", 20),
                new Person("Tom", "White", 50)
        );

        Map<String, List<Person>> map = people.stream()
                .collect(Collectors.groupingBy(Person::getLastName));

        map.forEach((lastName, list) -> {
            System.out.println(lastName + ":");
            list.forEach(p -> System.out.println("  " + p));
        });
    }

}
