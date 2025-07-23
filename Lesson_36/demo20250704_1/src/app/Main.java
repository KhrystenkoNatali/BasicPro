package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(   // не изменяемый лист !!!!
                new Person("Jack", 12, 48.2, 154),
                new Person("Nick", 10, 40.3, 140),
                new Person("Ann", 14, 49.2, 157),
                new Person("Mike", 15, 55.2, 170),
                new Person("Lena", 13, 46.1, 154)
        );
        List<Person> personList = new ArrayList<>(people); // стандартный изменяемый лист
        System.out.println("------------- начальный лист ----------------------");
        System.out.println(personList);

        System.out.println("----------------- By Name (Comparable) -------------");
        Collections.sort(personList);
        System.out.println(personList);

        System.out.println("----------------- By Age -------------");
        Collections.sort(personList,new ComparatorByAge());
        System.out.println(personList);

        System.out.println("----------------- By Weight -------------");
        Collections.sort(personList,new ComparatorByWeight());
        System.out.println(personList);

        System.out.println("----------------- By Name -------------");
        Collections.sort(personList,new ComparatorByName());
        System.out.println(personList);

        System.out.println("----------------- By Name -------------");
        //ComparatorByName comparatorByName = new ComparatorByName();
        Collections.sort(personList,new ComparatorByName().reversed());
        System.out.println(personList);



    }
}
