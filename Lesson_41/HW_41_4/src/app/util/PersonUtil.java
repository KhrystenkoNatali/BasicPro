package app.util;

import app.model.Person;

import java.util.*;

public class PersonUtil {
    public static Set<Person> findCommon(List<Person> list1, List<Person> list2) {
        Set<Person> set1 = new HashSet<>(list1);
        Set<Person> result = new HashSet<>();

        for (Person p : list2) {
            if (set1.contains(p)) {
                result.add(p);
            }
        }
        return result;
    }
}
