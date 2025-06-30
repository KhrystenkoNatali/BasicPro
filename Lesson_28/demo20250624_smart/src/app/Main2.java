package app;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Person> personArray = new ArrayList<>();

        personArray.add( new Person("Jack1", 10) );
        personArray.add( new Person("Jack2", 11) );
        personArray.add( new Person("Jack3", 12) );
        personArray.add( new Person("Jack4", 13) );
        personArray.add( new Person("Jack5", 14) );

        System.out.println(personArray);
        System.out.println(personArray.get(0));

        ArrayList<String> list = new ArrayList<>();
        list.add("wqwet1");
        list.add("wqwejjje ejje t2");
        list.add("hhdja kkkd3");
        list.add("888ehhns 4");
        System.out.println(list);


    }
}
