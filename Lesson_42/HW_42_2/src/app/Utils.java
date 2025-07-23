package app;

import java.util.*;

public class Utils {
    public static Map<String, Boolean> getUniqueMap(List<String> list) {
        Map<String, Integer> countMap = new HashMap<>();
        for (String s : list) {
            countMap.put(s, countMap.getOrDefault(s, 0) + 1);
        }

        Map<String, Boolean> resultMap = new HashMap<>();
        for (String key : countMap.keySet()) {
            resultMap.put(key, countMap.get(key) == 1);
        }

        return resultMap;
    }
}
