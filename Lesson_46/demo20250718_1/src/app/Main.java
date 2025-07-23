package app;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Jack", List.of(new Course("Java", "Mike"), new Course("C++", "Nick"))),
                new Student("Ann", List.of(new Course("Java", "Mike"), new Course("QA", "Lena"))),
                new Student("Tom", List.of(new Course("C++", "Nick")))
        );

        List<List<Course>> list = students.stream()
                .map(s -> s.getCourses())
                .toList();
        System.out.println(list);

        List<Course> list1 = students.stream()
                .flatMap(s -> s.getCourses().stream())
                .distinct()
                .toList();
        System.out.println(list1);

        System.out.println("---------------------------");
        students.stream()
                // .forEach(s-> System.out.println(s));
                .forEach(System.out::println);

        Set<Student> collect = students.stream()
                .collect(Collectors.toSet());   // получить из стрима set

        Map<String, Student> collect1 = students.stream().collect(Collectors.toMap(s -> s.getName(), s -> s));
        System.out.println(collect1);

    }
}
