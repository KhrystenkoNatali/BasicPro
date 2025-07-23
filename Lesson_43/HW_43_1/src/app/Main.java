/*
Дан список Programmer(String name,  List<Task>  tasks).
Каждый программист  имеет список задач    Task (int Number, String description) .
Напишите метод, который сформирует Map< Programmer,
List<Task> > где ключ - программист, а значение список его задач.

 */
package app;
//Группа 68m
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks1 = List.of(
                new Task(1, "Fix bug"),
                new Task(2, "Write tests")
        );

        List<Task> tasks2 = List.of(
                new Task(3, "Refactor code"),
                new Task(4, "Implement feature")
        );

        Programmer p1 = new Programmer("Alice", tasks1);
        Programmer p2 = new Programmer("Bob", tasks2);

        List<Programmer> programmers = List.of(p1, p2);

        Map<Programmer, List<Task>> result = TaskUtils.groupTasks(programmers);

        for (Map.Entry<Programmer, List<Task>> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Task task : entry.getValue()) {
                System.out.println("  - " + task);
            }
        }
    }
}
