package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Person p1=new Person();
//        System.out.println(p1);
        Person p1=new Person("Vasya", "Ivanov", 33, 123);
        System.out.println(p1);
        Person p2=new Person("Petya", "Petrov", 22, 234);
        System.out.println(p2);
        System.out.println("======================");
        System.out.println("1. "+Person.getPopulationOfWorld());
//        System.out.println("2. "+ p1.getPopulationOfWorld()); // not good
        Person.sayHello();
        System.out.println(Person.pi);
        Person.sayGreeting(p1);
        Person.sayGreeting(p2);
        System.out.println("==================HW_32======================");
        List<Student> students=new ArrayList<>();
        students.add(new Student("Vasya","G1"));
        students.add(new Student("Petya","G2"));
        students.add(new Student("Kolya","G1"));
        students.add(new Student("Olya","G2"));
        students.add(new Student("Jack","G2"));
        students.add(new Student("Bob","G1"));
        students.add(new Student("John","G1",5555));
        System.out.println(students);

        printAllStudents(students);

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter group name:");
        String group=scanner.nextLine();
        printGroupOfStrudents(students,group);

        System.out.println("TOTAL Quantity of students = "+ Student.howManyStudentsNow());
        System.out.println("Enter name of student");
        String name=scanner.nextLine();
        printStudentsByName(students,name);


    }

    private static void printStudentsByName(List<Student> students,
                                            String name) {
        System.out.println("Students with name: "+ name);
        for(Student st:students)
            if (st.getName().equalsIgnoreCase(name))
                System.out.println(st);
//            if (st.getName().toLowerCase().contains(name.toLowerCase()))
//                System.out.println(st);

    }

    private static void printGroupOfStrudents(List<Student> students,
                                              String group) {
        System.out.println("For group "+group);
        for (Student st:students)
            if (st.getGroup().equalsIgnoreCase(group))
                System.out.println(st);
    }

    private static void printAllStudents(List<Student> students) {
        for (Student st:students)
            System.out.println(st);
    }

}
