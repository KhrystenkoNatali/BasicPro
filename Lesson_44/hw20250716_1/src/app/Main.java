package app;

import app.model.Programmer;
import app.model.Task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String ... args) {
        for (String s : args){
            System.out.println(s);
        }
        Programmer p1 = new Programmer("Jack");
        p1.addTask(new Task("работа 1"));
        p1.addTask(new Task("работа 2"));
        p1.addTask(List.of(new Task("задание 1"),
                new Task("Задание 2")
        ));

        Programmer p2 = new Programmer("Ann", List.of(
                new Task("Задание 3"),
                new Task("Исправление 1")
        ));

        Programmer p3 = new Programmer("Oleg");
        p3.addTask(new Task("qwe1"), new Task("qwe2"));

        Programmer p4 = new Programmer("Nick", new Task("qwe3"));

        List<Programmer> programmers = List.of(p1, p2, p3, p4);
        //----------------------------------------------------------


        System.out.println(programmers);

        System.out.println("---------------------");
        print(mapProgrammerTasks(programmers));
    }

    public static Map< Programmer, List<Task> > mapProgrammerTasks(List<Programmer> list){
        Map< Programmer, List<Task>>  map = new HashMap<>();
        for (Programmer programmer:list){
            map.put(programmer, programmer.getTasks());
        }
        return map;
    }

    public static void print (Map< Programmer, List<Task> > map){
        for (var entry:map.entrySet()){
            Programmer programmer = entry.getKey();
            List<Task> tasks = entry.getValue();
            System.out.println(programmer.getName() + ": задачи: " + tasks );
        }
    }

}
