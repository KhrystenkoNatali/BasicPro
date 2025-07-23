/*
3
Сформировать список сет задач,  которые относятся к программистам не из Berlin,
 daysInProcessing у них больше 5 и статус не “finish”
 */
package app;

import app.model.Programmer;
import app.model.Task;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main3 {
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

        Set<Task> result = programmers.stream()
                .filter(p -> !p.getCity().equals("Berlin"))
                .flatMap(p -> p.getTasks().stream())
                .filter(t -> t.getDaysInProcessing() > 5 && !t.getStatus().equalsIgnoreCase("finish"))
                .collect(Collectors.toSet());

        result.forEach(System.out::println);
    }

}
