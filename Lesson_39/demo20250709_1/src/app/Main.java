package app;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(
                List.of("janna","anna", "mark", "jeff", "nick"));

        System.out.println("--------------- ITERATOR ------");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String element = iterator.next();
            System.out.println(element);
        }

        System.out.println("--------------- Remove with ITERATOR ------");
        Iterator<String> iterator2 = list.iterator();
        while (iterator2.hasNext()){
            String element = iterator2.next();
            if (element.equals("mark")){
                iterator2.remove();
            }
        }

        // -----
        System.out.println("----------- iterate by for..i");
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println("----------- iterate by for..each");
        for (String str:list){
            System.out.println(str);
        }

/* !!! ConcurrentModificationException
        System.out.println("----------- delete by for..each");
        for (String str:list){
            if (str.equals("mark")) {
                list.remove("mark2");
            }
        }
*/

    }
}
