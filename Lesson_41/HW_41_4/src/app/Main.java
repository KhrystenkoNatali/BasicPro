/*
Дано два списка с Person необходимо получить Set
с персонами которые присутствуют и в том и в другом списке

 */
package app;

import app.model.Person;
import app.util.PersonUtil;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> listA = List.of(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 28)
        );

        List<Person> listB = List.of(
                new Person("David", 31),
                new Person("Bob", 30),
                new Person("Charlie", 28)
        );

        Set<Person> common = PersonUtil.findCommon(listA, listB);

        System.out.println("Персонажи, которые есть в обоих списках:");
        for (Person p : common) {
            System.out.println(p);
        }
    }
}
