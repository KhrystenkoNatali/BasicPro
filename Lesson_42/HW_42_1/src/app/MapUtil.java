package app;

import java.util.Map;

public class MapUtil {
    public static void mergeKeys(Map<String, Integer> map, String key1, String key2) {
        if (map.containsKey(key1) && map.containsKey(key2)) {
            int sum = map.get(key1) + map.get(key2);
            String newKey = key1 + "_" + key2;
            map.put(newKey, sum);
        }
    }
}
