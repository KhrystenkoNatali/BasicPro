package app;

import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<String> list = List.of("t", "Jack", "Nickolaus", "Michail", "Peter");

        List<String> list1 = list.stream()
                //.map(s -> s.toUpperCase())
                .map(String::toUpperCase)
                .toList();
        System.out.println(list1);


        List<String> list11 = list.stream()
                .map(String::length)
                //.map(i->Integer.toBinaryString(i))
                .map(Integer::toBinaryString)
                .toList();
        System.out.println(list11);
        System.out.println("-------------------------------");
        Stream<String> stream = list.stream()
                .filter(s -> {
                    System.out.println("hello from:" + s);
                    return s.length() > 2;
                });

        List<String> list2 = stream.toList();
        System.out.println(list2);

        List<String> list3 = stream.map(String::toUpperCase).toList();


    }
}
