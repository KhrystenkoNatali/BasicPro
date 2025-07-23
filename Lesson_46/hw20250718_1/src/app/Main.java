package app;

import app.model.BankAccount;
import app.model.Person;
import app.service.BankService;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<BankAccount> list = List.of(
                new BankAccount(new Person("Jack", "Johnson", 25, "jack@mail.com"), "DE1111", 3321.20),
                new BankAccount(new Person("Anna", "Smith", 18, "anna@mail.com"), "DE1112", 100.2),
                new BankAccount(new Person("Jack", "Brown", 33, "jack7123@mail.com"), "DE1113", 0.0),
                new BankAccount(new Person("Lena", "Johnson", 21, "lena@mail.com"), "DE1114", 1999190.20),
                new BankAccount(new Person("Michail", "White", 25, "michail@mail.com"), "DE1119", 17771881.30),
                new BankAccount(new Person("Tonny", "Anderson", 19, "tonny@mail.com"), "DE1118", 2800.20),
                new BankAccount(new Person("Mike", "Naumov", 29, "mike@mail.com"), "DE1117", 20202.20),
                new BankAccount(new Person("Georg", "Brown", 25, "georg@mail.com"), "DE1121", 55.20),
                new BankAccount(new Person("Nick", "Woker", 24, "nick@mail.com"), "DE1123", 654.20),
                new BankAccount(new Person("Nick", "Woker", 24, "nick@mail.com"), "DE1131", 1000.20),
                new BankAccount(new Person("Ringo", "Star", 38, "star@mail.com"), "DE1128", 727219.20)
        );

        BankService.print(list);
        System.out.println();
        System.out.println("Используя stream необходимо получить List всех аккаунтов, баланс которых составляет менее 100.");
        List<BankAccount> list1 = list.stream()
                .filter(ba -> ba.getBalance() < 100)
                .toList();
        BankService.print(list1);

        System.out.println();
        System.out.println("Используя stream необходимо получить List<Person> всех владельцев счетов, баланс которых больше 10000");
        List<Person> list2 = list.stream()
                .filter(ba -> ba.getBalance() > 10000)
                .map(ba -> ba.getOwner())
                .toList();
        BankService.print(list2);

        System.out.println();
        System.out.println("Используя stream необходимо получить List<BankAccount> владельцы которых младше 21");
        int ageLimit = 21;
        //  ageLimit++; // egeLimit должна быть effective final т.е. не должна менять значение
        List<BankAccount> list3 = list.stream()
                .filter(ba -> ba.getOwner().getAge() < ageLimit)
                .toList();
        BankService.print(list3);

        System.out.println();
        System.out.println("Используя stream,  сформировать лист строк вида \"Lennon J.;IBAN: DE199988643;lennon@gmail.com\"    (т.е. ФИО; счет, email)  для всех клиентов, чей баланс более 100000");

        // Lennon J.;IBAN: DE199988643;lennon@gmail.com
        List<String> list4 = list.stream()
                .filter(ba -> ba.getBalance() > 100_000)
                //.map(ba ->toPersonInfoString(ba))
                .map(Main::toPersonInfoString)
                .toList();
        BankService.print(list4);


        System.out.println("----------------- task_2 ----------");
        List<String> list5 = list.stream()
                .map(ba -> ba.getOwner().getlName())
                .toList();
        System.out.println(BankService.countFrequency(list5));

        System.out.println(BankService.countFrequency(list.stream()
                //.map(ba -> ba.getOwner())
                .map(BankAccount::getOwner)
                .toList()));

    }




    private static String toPersonInfoString(BankAccount ba) {
        return ba.getOwner().getlName() + " "
                + ba.getOwner().getfName().charAt(0) + ".;IBAN: "
                + ba.getIban() + ";"
                + ba.getOwner().getEmail();
    }
}
