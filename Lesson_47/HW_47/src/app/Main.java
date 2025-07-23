/*
Дан лист строк, нужно получить Map<String, Boolean>, где ключ - строка,
 значение - true, если строка встретилась более одного раза, иначе false
Естественно, решить используя Stream.
 */
package app;
//Группа 68m
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = List.of("apple", "banana", "orange", "apple", "kiwi", "banana");

        Map<String, Boolean> result = strings.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.collectingAndThen(Collectors.counting(), count -> count > 1)
                ));

        result.forEach((key, value) -> System.out.println(key + " : " + value));
    }

}
