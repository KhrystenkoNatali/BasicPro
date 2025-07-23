package app.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringUtil {
    public static String removeDuplicates(String input) {
        String[] names = input.split(",");
        Set<String> uniqueNames = new LinkedHashSet<>();
        for (String name : names) {
            uniqueNames.add(name);
        }
        return String.join(",", uniqueNames);
    }
}
