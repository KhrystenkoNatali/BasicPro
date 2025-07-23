package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Jack", 1);
        map.put("John", 2);
        map.put("Poul", 3);

        Set<String> keySet = map.keySet();           // получить сет из ключей
        Collection<Integer> values = map.values();  // получить коллекцию из значений
        System.out.println(values);

        // сет из Map.Entry<String, Integer>
        Set<  Map.Entry<String, Integer> > entries = map.entrySet();

        for (Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // увеличить все значения map на 1
        for (var entry : map.entrySet()){
            entry.setValue(entry.getValue()+1);
        }
        System.out.println(map);


        Map<Integer, List<String> > map1 = new HashMap<>();

        map1.put(4, List.of("Jack", "John", "Mike") );
        map1.put(3, List.of("Ann", "Kim", "Lee") );
        map1.put(5, List.of("Tomas","Georg") );

        System.out.println(map1);

        HashSet<String> set = new HashSet<>();


        MySet<String> set1 = new MySet<>();
        set1.add("1");
        set1.add("2");
        set1.add("3");
        System.out.println(set1.contains("2"));








    }
}
