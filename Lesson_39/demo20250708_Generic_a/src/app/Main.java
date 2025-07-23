package app;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("jack");
        list.add("nick");
        list.add("lena");
        list.add("mike");
        System.out.println(list);

        System.out.println("Размер списка: "+ list.size());
        System.out.println("Элемент с индексом 0: "+ list.get(0));
        System.out.println("Последний элемент: "+ list.get(list.size()-1));

    }
}
