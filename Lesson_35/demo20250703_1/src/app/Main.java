package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 =  new Person("Jack", 10, "jack@mail.com");
        Person p2 =  new Person("Jack Crouford", 10, "jack@mail.com");


        System.out.println(p1 + (p1.equals(p2) ? " equals " : " not equals ") + p2);

        ArrayList<Person> people = new ArrayList<>();
        people.add( new Person("Jack", 10, "jack@mail.com"));
        people.add( new Person("Ann", 11, "ann@mail.com"));
        people.add( new Person("Kate", 15, "kate@mail.com"));
        people.add( new Person("Mike", 18, "mike@mail.com"));
        people.add( new Person("Nick", 17, "nick@mail.com"));

        System.out.println(people.contains(new Person("Kate", 15, "kate@mail.com")));
    }
}
