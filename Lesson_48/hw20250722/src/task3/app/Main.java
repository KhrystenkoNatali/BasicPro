package task3.app;

import task2.app.model.Person;
import task3.app.model.Account;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Account> list = List.of(
                new Account("DE2020210", new Person("Jack", "Jackson", 20), 5800.43),
                new Account("DE2020211", new Person("Ann", "Brown", 21), 11000.00),
                new Account("DE2020212", new Person("Jack", "Jackson", 20), 4200.43),
                new Account("DE2020213", new Person("Jack", "Jackson", 20), 1100.43),
                new Account("DE2020214", new Person("Ann", "Brown", 21), 11000.00),
                new Account("DE2020215", new Person("Nick", "Jackson", 19), 100.00)
        );
        list.forEach(System.out::println);
        System.out.println("----------------------------");
        Map<Person, Double> map = list.stream().collect(Collectors.groupingBy(Account::getOwner,
                Collectors.summingDouble(Account::getBalance)));
        map.forEach((k,v)-> System.out.println(k+":"+v));

        System.out.println("-------- 2 вариант --------");
        Map<Person, Double> map2 = list.stream().collect(Collectors.toMap(Account::getOwner, Account::getBalance, Double::sum));
        map2.forEach((k,v)-> System.out.println(k+":"+v));



    }
}
