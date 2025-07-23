package task1.app;

import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list= List.of("jack", "john", "ann", "jack", "nick", "jack", "ann");

        Map<String, Boolean> result = list.stream().collect(Collectors.toMap(s->s, s -> false, (v1, v2) -> true));
        System.out.println(result);
    }
}
