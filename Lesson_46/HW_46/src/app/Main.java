/*
Дан список Programmer(String name, String city, List<Task>  tasks).
Каждый программист  имеет список задач    Task (int Number, String description,
String status, int daysInProcessing) . В  данной задаче имя программиста уникально
и не повторяется, список задач не пустой и в нем нет null значений
1.
 Сформировать Map<String, Integer> где ключ, это имя программиста,
 а значение количество задач в списке у данного программиста
 */
package app;
//Группа 68m
import app.model.Programmer;
import app.model.Task;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Programmer> programmers = List.of(
                new Programmer("Alice", "Berlin", List.of(
                        new Task(1, "Fix bug", "in progress", 3),
                        new Task(2, "Refactor code", "done", 1)
                )),
                new Programmer("Bob", "Munich", List.of(
                        new Task(3, "Implement feature", "in review", 5)
                )),
                new Programmer("Charlie", "Hamburg", List.of(
                        new Task(4, "Write tests", "in progress", 2),
                        new Task(5, "Document code", "open", 4),
                        new Task(6, "Deploy to prod", "done", 1)
                ))
        );

        Map<String, Integer> taskCountByName = programmers.stream()
                .collect(Collectors.toMap(
                        Programmer::getName,
                        p -> p.getTasks().size()
                ));

        System.out.println(taskCountByName);
    }
}
