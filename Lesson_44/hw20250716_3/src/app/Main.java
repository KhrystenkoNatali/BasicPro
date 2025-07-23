package app;

import app.model.Account;
import app.model.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();
        list.add(new Account("DE1234 1", new Person("jack", 20)));
        list.add(new Account("DE1234 2", new Person("anna", 23)));
        list.add(new Account("DE1234 3", new Person("jack", 20)));
        list.add(new Account("DE1234 4", new Person("nick", 25)));
        list.add(new Account("DE1234 5", new Person("nick", 25)));
        list.add(new Account("DE1234 6", new Person("jack", 20)));
        list.add(new Account("DE1234 7", new Person("nick", 25)));

        System.out.println(mapOwnerToAccounts(list));
    }

    private static Map<Person, List<String>> mapOwnerToAccounts (List<Account> list){
        Map<Person, List<String>> map = new HashMap<>();
        for (Account account: list){
            List<String> listAccOfPerson = map.get(account.getOwner());
            if (listAccOfPerson == null){
                listAccOfPerson = new ArrayList<>();
                map.put(account.getOwner(), listAccOfPerson);
            }
            listAccOfPerson.add(account.getIban());

        }

        return map;
    }

}
