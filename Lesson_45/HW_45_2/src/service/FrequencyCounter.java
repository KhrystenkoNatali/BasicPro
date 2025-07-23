package service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
    public static <T> Map<T, Integer> count(List<T> list) {
        Map<T, Integer> result = new HashMap<>();

        for (T item : list) {
            if (result.containsKey(item)) {
                result.put(item, result.get(item) + 1);
            } else {
                result.put(item, 1);
            }
        }

        return result;
    }
}
