package app;

import java.util.*;

public class AccountUtils {
    public static Map<Person, List<String>> groupAccounts(List<Account> accounts) {
        Map<Person, List<String>> map = new HashMap<>();

        for (Account account : accounts) {
            Person person = account.getOwner();
            String iban = account.getIban();

            if (!map.containsKey(person)) {
                map.put(person, new ArrayList<>());
            }
            map.get(person).add(iban);
        }

        return map;
    }
}
