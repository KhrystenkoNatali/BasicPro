package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str =  "Jack,John,Nick,John";
        System.out.println("Исходная строка: " + str);
        System.out.println("Обработанная строка: " + removeDuplicates(str));
    }
    public static String removeDuplicates(String str){
        /*
         1.  String -> set
         2.  set -> String
         */

        // srt -> String[]
        String[] words = str.split(",");
        // String[] -> set
        Set<String> set = new LinkedHashSet<>();
        for (String word:words){
            set.add(word);
        }
        // set -> String
        return String.join(",", set);

        //HashSet<String> set = new HashSet<>(Arrays.asList(words));
    }
}
