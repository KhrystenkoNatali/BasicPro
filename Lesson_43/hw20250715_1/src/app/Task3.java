package app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
    public static void main(String[] args) {
        String str = "Необходимо встречается получить где ключ слово из строки " +
                "значение встречается где сколько раз это встречается слово встречается где встречается";

        System.out.println(str);
        System.out.println();
        System.out.println("Результат:");
        print(count(str));

    }

    public static Map<String, Integer> count(String str){
        Map<String, Integer> map = new HashMap<>();
        for ( String word : str.split(" ") ){
            Integer value = map.get(word);
            map.put(word, value==null? 1 : value+1 );
        }
        return map;

    }

    public static  void  print (Map<String,Integer> map){
        Set<String> keySet = map.keySet();
        for (var key : keySet){
            System.out.println(key + ":" + map.get(key));
        }
    }
}
