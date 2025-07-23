package app.service;

import app.model.BankAccount;
import app.model.Person;

import java.util.List;
import java.util.stream.Collectors;

public class BankAccountService {
    public static List<BankAccount> filterByLowBalance(List<BankAccount> list) {
        return list.stream()
                .filter(acc -> acc.getBalance() < 100)
                .collect(Collectors.toList());
    }

    public static List<Person> richOwners(List<BankAccount> list) {
        return list.stream()
                .filter(acc -> acc.getBalance() > 10000)
                .map(BankAccount::getOwner)
                .collect(Collectors.toList());
    }

    public static List<BankAccount> ownersYoungerThan21(List<BankAccount> list) {
        return list.stream()
                .filter(acc -> acc.getOwner().getAge() < 21)
                .collect(Collectors.toList());
    }

    public static List<String> formatRichAccounts(List<BankAccount> list) {
        return list.stream()
                .filter(acc -> acc.getBalance() > 100000)
                .map(acc -> acc.getOwner().getlName() + " " + acc.getOwner().getfName().charAt(0) + ".;IBAN: " + acc.getIBAN() + ";" + acc.getOwner().getEmail())
                .collect(Collectors.toList());
    }

}
