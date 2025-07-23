package app;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        List<String> list = List.of("jack", "qwe","ertyu", "mike", "nick");

        ListIterator<String> iterator = list.listIterator(2);

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------------------");
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }



    }
}
