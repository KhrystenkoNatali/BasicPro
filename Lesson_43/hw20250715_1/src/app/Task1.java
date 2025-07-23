package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("jack", 10);
        map.put("john", 5);
        System.out.println("Исходная map: " + map);
        addKey(map, "jack", "john");
        System.out.println("Результат: " + map);
        System.out.println("-------------------------------------");
        print(map);

    }

    public static void addKey(Map<String, Integer> map, String key1, String key2) {
        if (map.containsKey(key1) && map.containsKey(key2)) {

            Integer value1 = map.get(key1);
            Integer value2 = map.get(key2);

            String newKey = key1 + "-" + key2;
            Integer newValue = value1 + value2;

            map.put(newKey, newValue);
        }
    }

    public static void print(Map<String, Integer> map) {
        Set<String> keySet = map.keySet();
        for (var key : keySet) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
