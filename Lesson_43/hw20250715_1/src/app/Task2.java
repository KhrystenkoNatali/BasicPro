package app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        List<String> list = List.of("jack", "nika", "mike", "jack", "john", "jack", "mike");
        System.out.println("Исходный лист: " + list);
        Map<String, Boolean> result = createContainsMap(list);
        System.out.println("Результат: ");
        print(result);

    }

    public static Map<String, Boolean> createContainsMap(List<String> list) {
        Map<String, Boolean> result = new HashMap<>();
        for (String str : list) {
            if (result.containsKey(str)) {
                result.put(str, false);
            } else {
                result.put(str, true);
            }
        }

        return result;
    }

    public static void print(Map<String, Boolean> map) {
        Set<String> keySet = map.keySet();
        for (var key : keySet) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
