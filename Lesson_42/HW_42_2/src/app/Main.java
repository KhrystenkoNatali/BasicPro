/*
Дан лист строк, необходимо получить Map<String,Boolean>  где ключ, это строка,
а значение true - если строка встретилась в листе только один раз,
false - если встретилась больше одного раза


 */
package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Jack", "John", "Nick", "Jack", "Nick", "Mike");

        Map<String, Boolean> result = Utils.getUniqueMap(names);
        for (Map.Entry<String, Boolean> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
