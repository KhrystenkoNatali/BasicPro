package app;

import java.util.*;

public class TaskUtils {
    public static Map<Programmer, List<Task>> groupTasks(List<Programmer> programmers) {
        Map<Programmer, List<Task>> map = new HashMap<>();
        for (Programmer p : programmers) {
            map.put(p, p.getTasks());
        }
        return map;
    }
}
