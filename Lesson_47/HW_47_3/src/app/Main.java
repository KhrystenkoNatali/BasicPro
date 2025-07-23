/*
Дан список Account (String iban, Person owner, double balance).
У одного владельца может быть несколько счетов.
Ваша задача получить Map<Person,Long> где ключ, владелец счета,
значение сумма его вкладов.
 */
package app;

import model.Account;
import model.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", "Smith", 30);
        Person p2 = new Person("Bob", "Brown", 40);
        Person p3 = new Person("Alice", "Smith", 30); // равен p1

        List<Account> accounts = List.of(
                new Account("DE111", p1, 5000),
                new Account("DE222", p2, 10000),
                new Account("DE333", p3, 3000),
                new Account("DE444", p1, 7000)
        );

        Map<Person, Double> result = accounts.stream()
                .collect(Collectors.groupingBy(
                        Account::getOwner,
                        Collectors.summingDouble(Account::getBalance)
                ));

        result.forEach((person, total) ->
                System.out.println(person + " → " + total)
        );

    }
}
