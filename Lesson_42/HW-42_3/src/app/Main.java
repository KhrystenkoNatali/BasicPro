package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "java is great and java is powerful and java is fun";

        Map<String, Integer> wordCounts = TextUtil.countWords(text);

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
