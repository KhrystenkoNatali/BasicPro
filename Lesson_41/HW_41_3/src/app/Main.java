/*
Руководство компании решило премировать сотрудников.
Каждый team lead подал список сотрудников для получения премии.
Но получилось так, что некоторые сотрудники работают на нескольких проектах
и попали в списки несколько раз.
Итак, у вас есть массив из списков Employee.
Ваша задача помочь получить один общий список сотрудников, но без повторов.

 */
package app;

import app.model.Employee;
import app.util.EmployeeUtils;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> team1 = Arrays.asList(
                new Employee("Alice"),
                new Employee("Bob"),
                new Employee("Charlie")
        );

        List<Employee> team2 = Arrays.asList(
                new Employee("Bob"),
                new Employee("David"),
                new Employee("Eva")
        );

        List<Employee> team3 = Arrays.asList(
                new Employee("Charlie"),
                new Employee("Frank"),
                new Employee("Grace")
        );

        List<List<Employee>> allTeams = List.of(team1, team2, team3);

        List<Employee> finalList = EmployeeUtils.mergeAndRemoveDuplicates(allTeams);

        System.out.println("Сотрудники, получившие премию:");
        for (Employee e : finalList) {
            System.out.println(e);
        }
    }
}
