package app;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("jack",18));
        list.add(new Person("ann",19));
        list.add(new Person("nick",17));
        list.add(new Person("pavel",28));
        list.add(new Person("lena",21));
        list.add(new Person("lena",16));

        print(list);
        System.out.println("------------------------");
        introduceAll(list);
        System.out.println("---- персоны старше чем 17");
        List<Person> personOlderThan = getPersonOlderThan(list, 17);
        print(personOlderThan);
        System.out.println("");
        System.out.println("---- персоны старше чем 25");
        print(getPersonOlderThan(personOlderThan, 25));
        System.out.println("список имен");
        List<String> names = getPersonNames(list);
        System.out.println(names);

    }

    public static void print(List<Person> list){
        for(Person person : list){
            System.out.println(person);
        }
    }

    public static void introduceAll(List<Person> list){
        for(Person person: list ){
            person.introduce();
        }
    }

    public static  List<Person>  getPersonOlderThan(List<Person> list, int ageLimit){
        List<Person> result = new ArrayList<>();
        for (Person person: list){
            if (person.getAge() > ageLimit){
                result.add(person);
            }
        }
        return result;
    }

    public static List<String> getPersonNames(List<Person> list){
        List<String> result = new ArrayList<>();
        for (Person person : list){
            result.add(person.getName());
        }

        return result;
    }
}
