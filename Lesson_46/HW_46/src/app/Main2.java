/*
2.
Сформировать список всех задач,  которые относятся к программистам из Berlin,
отсортированный по количеству дней в обработке ( daysInProcessing).
В списке не должны присутствовать уже закрытые задачи (status = “finish”)
 */
package app;

import app.model.Programmer;
import app.model.Task;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<Programmer> programmers = List.of(
                new Programmer("Alice", "Berlin", List.of(
                        new Task(1, "Fix bug", "in progress", 3),
                        new Task(2, "Refactor code", "finish", 1)
                )),
                new Programmer("Bob", "Munich", List.of(
                        new Task(3, "Implement feature", "in review", 5)
                )),
                new Programmer("Charlie", "Berlin", List.of(
                        new Task(4, "Write tests", "in progress", 2),
                        new Task(5, "Document code", "open", 4),
                        new Task(6, "Deploy to prod", "finish", 1)
                ))
        );

        List<Task> berlinTasks = programmers.stream()
                .filter(p -> p.getCity().equals("Berlin"))
                .flatMap(p -> p.getTasks().stream())
                .filter(t -> !t.getStatus().equalsIgnoreCase("finish"))
                .sorted(Comparator.comparingInt(Task::getDaysInProcessing))
                .collect(Collectors.toList());

        berlinTasks.forEach(System.out::println);
    }

}
