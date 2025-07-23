package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("jack",10));
        list.add(new Person("ann",12));
        list.add(new Person("john",24));
        list.add(new Person("joan",31));
        list.add(new Person("mike",18));

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });



        //Collections.sort(list,(o1, o2) -> Integer.compare(o1.getAge(),o2.getAge()) );
        System.out.println(list);

    }
}
