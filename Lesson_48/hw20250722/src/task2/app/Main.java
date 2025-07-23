package task2.app;

import task2.app.model.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jack", "Johnson", 20),
                new Person("John", "Johnson", 3),
                new Person("Ann", "Brown", 1),
                new Person("Nick", "White", 10),
                new Person("Stan", "Black", 19),
                new Person("Melesa", "Black", 22)
        );
        people.forEach(System.out::println);

        //System.out.printf("Пример вывода 1: %s%nПример вывода 2: %s%n", people.get(0),people.get(1));

        Map<String, List<Person>> result = people.stream()
                .collect(Collectors.groupingBy(Person::getLastName));
        System.out.println("-----------------");
        result.forEach((k,v)-> System.out.printf("%s : %s%n", k,v));
    }
}
