package app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>(List.of(
                new Person("Jack",21),
                new Person("Mike",24),
                new Person("John",21),
                new Person("Jack",20),
                new Person("Nick",20),
                new Person("Misha",22),
                new Person("Jack",23)
        ));

        PredicatePerson predicate1 = new PredicatePerson() {
            @Override
            public boolean test(Person person) {

                return person.getName().equalsIgnoreCase("jack");
            }
        };
        System.out.println("====== все jack");
        System.out.println(filter(list, predicate1));

        System.out.println("====== все <=21");

        System.out.println( filter( list, (Person person) -> { return person.getAge()<=21; }     ));

        System.out.println("====== все на J");
        List<Person> res1 = filter(list, (Person p) -> { return p.getName().startsWith("J"); });
        System.out.println(res1);


        Comparator<Person> comparator1 = (Person p1, Person p2) -> {
            return Integer.compare(p1.getAge(), p2.getAge());
        };
        list.sort(comparator1);
        System.out.println(list);

        list.sort(  (Person p1, Person p2) -> {return p1.getName().compareTo(p2.getName());}          );
        System.out.println(list);

        System.out.println(filter(list, (p) -> {
            return p.getAge() > 22;
        }));

    }

    public static  List<Person> filter(List<Person> list, PredicatePerson predicate){
        List<Person> result = new ArrayList<>();
        for (Person person:list){
            if ( predicate.test(person) ){
                result.add(person);
            }
        }
        return result;
    }
}
