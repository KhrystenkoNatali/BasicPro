package task4.app;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = List.of("Jack:1110.00", "Nick:220.50", "Jack:1300.20");

        Map<String, Double> map = list.stream()
                .map(s->s.split(":"))
                .filter(arr->arr.length>1)
                .collect(Collectors.toMap(arr -> arr[0],
                        arr -> Double.parseDouble(arr[1]),
                        Double::sum)
                );

        map.forEach((k,v)-> System.out.println(k+":"+v));
    }
}
