package app;

import app.model.Employee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
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

        List<Employee> list3 = List.of(
                new Employee("Ann", 4000),
                new Employee("John", 4000)
        );

        List< List<Employee> > allLists = new ArrayList<>();
        allLists.add(list1);
        allLists.add(list2);
        allLists.add(list3);

        System.out.println(allLists);
        System.out.println("---------------");
        List<Employee> result = removeDuplicates(allLists);
        System.out.println(result);

    }
    public static List<Employee>  removeDuplicates(List< List<Employee> > employeeLists){
        Set<Employee> set = new HashSet<>();
        for (List<Employee> element : employeeLists){
            set.addAll(element);
        }
        return new ArrayList<>(set);
    }
}
