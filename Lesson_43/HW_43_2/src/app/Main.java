/*
Допустим, каждый раз, когда студент приходит на лекцию, преподаватель заносит его в список.
Таким образом, у вас есть список студентов, т.е. List<Student>,
в котором один и тот же студент может встречаться несколько раз.
Напишите метод, который сформирует Map<Student,Integer> где ключ - это студент,
а значение - сколько лекций он посетил

 */
package app;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> attendance = List.of(
                new Student("Alice"),
                new Student("Bob"),
                new Student("Alice"),
                new Student("Charlie"),
                new Student("Bob"),
                new Student("Alice")
        );

        Map<Student, Integer> result = AttendanceUtil.countAttendance(attendance);

        for (Map.Entry<Student, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " лекции");
        }
    }
}
