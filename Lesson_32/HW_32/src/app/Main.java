/*
Представьте, что вы пишете программу для on-line школы. Создайте класс
Student (int id, String name, String group) Поле id должно заполнятся автоматически,
порядковым номером студента. В классе Student реализуйте статический метод,
который отвечает на вопрос, сколько студентов всего.

Создайте список студентов. Создайте несколько методов для работы со списком студентов:

Выведите его на экран.
Вывести студентов заданной группы
Вывести всех студентов, имя которых содержит заданную строку
 */
package app;

// Группа 68m

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Anna Schmidt", "A1"));
        students.add(new Student("Boris Ivanov", "B2"));
        students.add(new Student("Anastasia Petrova", "A1"));
        students.add(new Student("Max Mustermann", "C3"));

        System.out.println("Все студенты:");
        printAllStudents(students);

        System.out.println("\nСтуденты группы A1:");
        printStudentsByGroup(students, "A1");

        System.out.println("\nСтуденты с именем, содержащим 'Anna':");
        printStudentsByNameSubstring(students, "Anna");

        System.out.println("\nВсего студентов: " + Student.getStudentCount());
    }

    public static void printAllStudents(List<Student> list) {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public static void printStudentsByGroup(List<Student> list, String group) {
        for (Student s : list) {
            if (s.getGroup().equalsIgnoreCase(group)) {
                System.out.println(s);
            }
        }
    }

    public static void printStudentsByNameSubstring(List<Student> list, String substring) {
        for (Student s : list) {
            if (s.getName().toLowerCase().contains(substring.toLowerCase())) {
                System.out.println(s);
            }
        }
    }
}
