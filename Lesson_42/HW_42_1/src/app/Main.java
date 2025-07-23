/*
Напишите метод, который принимает map<String,Integer>, и две строки key1 и key2
Если в map есть заданные ключи key1 и key2,
то метод должен сформировать в map новый ключ из строке (key1+”-”+key2)
и положить туда сумму значений. Если какого-то из ключей нет, map остается без изменения.
Вывести на экран получившуюся Map столбиком:
ключ:значение

Примечание: Метод void, т.е. он не возвращает новый map а изменяет переданный в параметрах.

Пример:
Map:{
   “jack”,10
   “john”,5
}
Вызываем метод с ключами “jack” и “john”, получаем:
Map:{
   “jack”,10
   “john”,5
   “jack_john”:15
}

 */

package app;
//Группа 68m
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("jack", 10);
        map.put("john", 5);

        MapUtil.mergeKeys(map, "jack", "john");

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }
    }
}
