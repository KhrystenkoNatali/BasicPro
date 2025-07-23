package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
      /*
    Написать метод который получает Map< Integer, List<Person> >, где ключ - возраст,
    значение - список людей этого возраста
     */

    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("Jack",22),
                new Person("Mike",20),
                new Person("Nick",22),
                new Person("Lena",22),
                new Person("Stan",21)
        );
        System.out.println(list);
        System.out.println("-----------------------");
        Map<Integer, List<Person> > result = mapPersonByAge(list);
        for (var entry: result.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static Map<Integer,List<Person>> mapPersonByAge(List<Person> list){
        Map<Integer,List<Person>> result = new HashMap<>();

        for (Person person : list){
            Integer key =person.getAge();
            List<Person> peopleByAge = result.get(key);
            if (peopleByAge==null){
                peopleByAge = new ArrayList<>();
                result.put(key, peopleByAge);
            }
            peopleByAge.add(person);
        }
        return result;
    }
}
