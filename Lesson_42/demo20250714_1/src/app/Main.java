package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        //   ключ    значение
        //   клбчи - уникальны, значения могут повторяться


        map.put("jack", 4);
        map.put("ann", 3);
        map.put("nickolaus", 9);
        map.put("john", 4);

        System.out.println(map);
        System.out.println( map.get("ann") );  // получить значение по ключу

        Set<String> keySet = map.keySet();
        for (var key : keySet){
            System.out.println(key + " " + map.get(key));
        }

    }
}
