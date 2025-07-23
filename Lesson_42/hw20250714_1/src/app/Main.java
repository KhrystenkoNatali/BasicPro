package app;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // позитивный случай
        List<String> list = List.of("jack", "ringo", "james", "ringo", "bob", "bob", "john", "bob");
        System.out.println(list);
        System.out.println("В листе есть дубликаты: " + isDuplicateValue(list));

        // неготвгый случай
        List<String> list1 = List.of("jack", "john", "george");
        System.out.println(list1);
        System.out.println("В листе есть дубликаты: " + isDuplicateValue(list1));

        // null значение
        isDuplicateValue(null);
    }

    public static boolean isDuplicateValue(List<String> list){
        if (list==null){
            return false;
        }
        Set set = new HashSet(list);
        return set.size() != list.size();
    }
}
