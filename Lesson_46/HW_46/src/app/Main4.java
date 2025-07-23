/*
 Сформировать Map<Task, Programmer> где ключ, задача, значение - программист,
 ответственный за задачу
 */
package app;

import app.model.Programmer;
import app.model.Task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main4 {
    public static void main(String[] args) {
        List<Programmer> programmers = List.of(
                new Programmer("Alice", "Berlin", List.of(
                        new Task(1, "Fix bug", "in progress", 3),
                        new Task(2, "Refactor code", "open", 8)
                )),
                new Programmer("Bob", "Munich", List.of(
                        new Task(3, "Implement feature", "in progress", 6),
                        new Task(4, "Fix tests", "finish", 7)
                )),
                new Programmer("Charlie", "Hamburg", List.of(
                        new Task(5, "Write tests", "in review", 10),
                        new Task(6, "Deploy", "open", 9)
                ))
        );

        Map<Task, Programmer> taskOwnerMap = new HashMap<>();

        programmers.forEach(programmer ->
                programmer.getTasks().forEach(task ->
                        taskOwnerMap.put(task, programmer)
                )
        );

        taskOwnerMap.forEach((task, programmer) ->
                System.out.println(task + " -> " + programmer.getName())
        );
    }

}
