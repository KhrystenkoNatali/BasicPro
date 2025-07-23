/*
Напишите обобщенный метод (пока без stream), который принимает список каких то объектов,
например Person или строк, и формирует Map< … , Integer > - где ключем является объект,
значением, сколько раз этот объект встречается в изначальном списке.
Например: есть список Person, метод должен сформировать Map<Person, Integer>,
где ключ person, значение сколько раз встретился данный человек в списке.
Или есть список BankAccount, метод должен сформировать Map<BankAccount, Integer>,
где ключ account, значение сколько раз встретился данный счет в списке.

 */
package app;

import model.Person;
import service.FrequencyCounter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Jack", "Brown", 30, "jack@mail.com"),
                new Person("Anna", "Smith", 25, "anna@mail.com"),
                new Person("Jack", "Brown", 30, "jack@mail.com")
        );

        Map<Person, Integer> personCounts = FrequencyCounter.count(people);

        for (Map.Entry<Person, Integer> entry : personCounts.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        // Пример со строками
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Integer> wordCounts = FrequencyCounter.count(words);

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
