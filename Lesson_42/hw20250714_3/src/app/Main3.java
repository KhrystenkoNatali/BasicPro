package app;

import app.model.Employee;

import java.util.Comparator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        String str = "hello";
        int a = 10;
        var str1 = "hello"; // выведет тип для переменно str1 исходя из значения
        var b = 18;
        var e = new Employee("lena",5000);

        //str1 = 10; // ошибка, т.к. тип переменной str1 - String, определен при объявлении переменной
        List<Employee> employees = List.of(
                new Employee("Jack", 3000),
                new Employee("JLena", 4000)
        );
        for (var element:employees){

        }
        // c - объект класса (анонимный класс), который имплементирует Comparator<Employee>
        // Тип переменной - Comparator<Employee>
        Comparator<Employee> c = new Comparator<Employee>(){
            public void temp(){
                System.out.println("привет");
            }
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        };

        // Тип переменной - анонимный класс (Main$1) Comparator<Employee>
        var c1 = new Comparator<Employee>(){
            public void temp(){
                System.out.println("привет");
            }
            @Override
            public int compare(Employee o1, Employee o2) {
                return 0;
            }
        };

    }
}
