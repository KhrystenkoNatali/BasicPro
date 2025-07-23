/*
В программе задан список Person{ String fName, String lName, String email, String
phone, Address address}. Address{String postcode, String city, String street, String
house}
Реализовать следующие функции:
-получить список всех ФИО
-получить список всех e-mail
-получить список всех телефонов
-получить список всех адресов в виде строки адреса

Естественно, все вышеперечисленные функции может и должен реализовать
один метод, в который в качестве параметра должен приходить список Person и
реализация необходимого способа обработки.
создать функциональный  интерфейс с методом String personToString(Person p)
В main реализовать метод, который в качестве параметра принимает лист Person,
а возвращает лист строк. Вторым параметром метод должен принимать интерфейс ваш
функциональный интерфейс

 */
package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Jack", "Smith", "jack@example.com", "111-111",
                        new Address("12345", "Berlin", "Main", "1")),
                new Person("Anna", "Müller", "anna@example.com", "222-222",
                        new Address("54321", "Hamburg", "Elm", "10"))
        );

        // Получаем список ФИО
        List<String> fullNames = convertAll(people, p -> p.getfName() + " " + p.getlName());
        System.out.println("ФИО:");
        fullNames.forEach(System.out::println);

        // Получаем список e-mail
        List<String> emails = convertAll(people, p -> p.getEmail());
        System.out.println("\nEmails:");
        emails.forEach(System.out::println);

        // Получаем список телефонов
        List<String> phones = convertAll(people, p -> p.getPhone());
        System.out.println("\nТелефоны:");
        phones.forEach(System.out::println);

        // Получаем список адресов
        List<String> addresses = convertAll(people, p -> p.getAddress().toString());
        System.out.println("\nАдреса:");
        addresses.forEach(System.out::println);
    }

    public static List<String> convertAll(List<Person> list, PersonConverter converter) {
        List<String> result = new ArrayList<>();
        for (Person p : list) {
            result.add(converter.convert(p));
        }
        return result;
    }
}
