package app;

import app.model.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Oleg"));
        list.add(new Student("Jack"));
        list.add(new Student("Misha"));
        list.add(new Student("Oleg"));
        list.add(new Student("Misha"));
        list.add(new Student("Ann"));
        list.add(new Student("Ann"));
        list.add(new Student("Ann"));
        list.add(new Student("Lena"));

        System.out.println(countAttendance(list));

    }
    public static Map<Student, Integer> countAttendance(List<Student> list){
        Map<Student, Integer> map = new HashMap<>();
        for (Student student:list){
            map.put(student, map.getOrDefault(student,0) + 1);
        }
        return map;
    }
}
