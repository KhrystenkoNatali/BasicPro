package app;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        Person p1 = new Person("Jack",10);
        System.out.println("p1= " + p1);
        System.out.println("------------------");
        Person p2 = new Person("Mike",12);
        System.out.println("p1= " + p1);
        System.out.println("p2=" + p2);

        System.out.println("------------------");
        List<Person> list = new ArrayList<>();
        list.add(new Person("Ann1",10));
        list.add(new Person("Ann2",13));
        list.add(new Person("Ann3",12));
        list.add(new Person("Ann4",15));
        list.add(new Person("Ann5",11));

        System.out.println("p2=" + p2);
        System.out.println("=====================");
        for (Person person: list){
            System.out.println(person);
        }

        System.out.println(Person.howManyPerson());

    }
}
