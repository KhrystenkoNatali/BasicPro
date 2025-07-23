package app;

import app.model.Employee;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        List<Employee> list1 = List.of(
                new Employee("Jack", 5000),
                new Employee("Ann", 4000),
                new Employee("Lena", 3000),
                new Employee("Mike", 2000)
        );

        List<Employee> list2 = List.of(
                new Employee("Ann", 4000),
                new Employee("John", 4000),
                new Employee("Jack", 5000),
                new Employee("Jack", 2800)
        );
        Set<Employee> stuff = stuff(list1, list2);
        System.out.println(stuff);
    }

    public static Set<Employee> stuff(List<Employee> list1, List<Employee> list2){
        Set<Employee> set = new HashSet<>(list1);
        set.retainAll(list2);
        return set;
    }

}
