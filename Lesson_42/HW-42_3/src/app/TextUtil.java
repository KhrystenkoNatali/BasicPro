package app;

import java.util.*;

public class TextUtil {
    public static Map<String, Integer> countWords(String text) {
        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        return map;
    }

}
