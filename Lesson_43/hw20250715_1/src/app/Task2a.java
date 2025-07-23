package app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Task2a {
    public static void main(String[] args) {
        List<String> list = List.of("jack", "nika", "mike", "jack", "john", "jack", "mike");
        System.out.println("Исходный лист: " + list);
        Map<String, Boolean> result = createContainsMap(list);
        System.out.println("Результат: ");
        print(result);

    }
    public static Map<String, Boolean> createContainsMap (List<String> list){
        Map<String, Boolean> result = new HashMap<>();
        for (String str:list){
            result.put(str, !result.containsKey(str) );
        }
        return result;
    }

    public static  void  print (Map<String,Boolean> map){
        Set<String> keySet = map.keySet();
        for (var key : keySet){
            System.out.println(key + ":" + map.get(key));
        }
    }

}

