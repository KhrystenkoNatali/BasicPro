/*
Дан список  BankAccount {Person owner, String IBAN, double balance).
Класс Person состоит из {String fName, String lName, int age, String email)

Используя stream необходимо получить List всех аккаунтов, баланс которых составляет менее 100.

Используя stream необходимо получить List<Person> всех владельцев счетов,
баланс которых больше 10000

Используя stream необходимо получить List<BankAccount> владельцы которых младше 21

Используя stream,  сформировать лист строк вида
“Lennon J.;IBAN: DE199988643;lennon@gmail.com”
(т.е. ФИО; счет, email)  для всех клиентов, чей баланс более 100000

 */
package app;
//Группа 68m
import app.model.*;
import app.service.BankAccountService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> list = List.of(
                new BankAccount(new Person("John", "Lennon", 45, "lennon@gmail.com"), "DE199988643", 120000),
                new BankAccount(new Person("Paul", "Smith", 19, "paul.smith@mail.com"), "DE123456789", 90),
                new BankAccount(new Person("Anna", "White", 30, "anna.white@gmail.com"), "DE987654321", 15000),
                new BankAccount(new Person("Max", "Green", 20, "max.green@mail.com"), "DE222333444", 500),
                new BankAccount(new Person("Liza", "Miller", 22, "liza.miller@mail.com"), "DE111222333", 99999)
        );

        System.out.println("Счета с балансом < 100:");
        BankAccountService.filterByLowBalance(list).forEach(System.out::println);

        System.out.println("\nВладельцы счетов с балансом > 10000:");
        BankAccountService.richOwners(list).forEach(System.out::println);

        System.out.println("\nСчета владельцев младше 21:");
        BankAccountService.ownersYoungerThan21(list).forEach(System.out::println);

        System.out.println("\nСтроки о клиентах с балансом > 100000:");
        BankAccountService.formatRichAccounts(list).forEach(System.out::println);
    }
}
