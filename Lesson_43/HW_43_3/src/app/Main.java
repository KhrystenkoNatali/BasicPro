/*
Предположим, у вас есть список объектов Account { String iban, Person owner}.
У каждого клиента может быть несколько счетов. Ваша задача написать метод,
который сформирует Map<Person, List<String>>, где ключом будет владелец счета,
а значением - список номеров (iban) счетов.

Подсказка: т.к. Person это ключ, система должна уметь определить равен ли один Person другому.
Т.е. equals и hashCode

 */
package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Alice");
        Person p2 = new Person("Bob");

        List<Account> accounts = List.of(
                new Account("DE001", p1),
                new Account("DE002", p1),
                new Account("DE003", p2)
        );

        Map<Person, List<String>> result = AccountUtils.groupAccounts(accounts);

        for (Map.Entry<Person, List<String>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
