/*
(По желанию) Дан список выплат в виде списка строк: "Jack:1110.00", "Nick:220.50",
"Jack:1300.20".... Необходимо получить Map<String, Double> где ключ это имя,
а значение - сумма выплат.
Пример:
("Jack:1110.00", "Nick:220.50", "Jack:1300.20") -> {Nick=220.5, Jack=2410.2}
 */
package app;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> payments = List.of(
                "Jack:1110.00",
                "Nick:220.50",
                "Jack:1300.20",
                "Anna:400.0",
                "Nick:30.00"
        );

        Map<String, Double> result = payments.stream()
                .map(s -> s.split(":"))
                .collect(Collectors.groupingBy(
                        parts -> parts[0],
                        Collectors.summingDouble(parts -> Double.parseDouble(parts[1]))
                ));

        result.forEach((name, sum) -> System.out.println(name + " → " + sum));
    }
}
