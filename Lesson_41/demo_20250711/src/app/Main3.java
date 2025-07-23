package app;

// HashSet

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Misha");
        set.add("Masha");
        set.add("Mike");
        set.add("Nick");
        set.add("Lena");
        set.add("Ken");
        set.add("Masha");
        set.add("Vlad");
        set.add("Lena");

        System.out.println(set);
        System.out.println("-------- iterator ---------");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        List<String> list =
                List.of("Nick", "Vlad", "Masha", "Mike","Vlad", "Ken", "Vlad","Nick", "Lena");
        System.out.println("---------------- remove duplicate ---- " );
        System.out.println("Исходный лист: " + list);
        System.out.println("Результат:" + removeDuplicate(list));
    }

    public static List<String> removeDuplicate(List<String> list){
        Set<String> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);
    };
}
