package app;

import com.sun.tools.javac.Main;

public class Main2 {
    public static void main(String[] args) {
        Person p = new Person("Jack", 10);
        System.out.println(p);

        Object obj = p;
        Object obj1 = new Person("Tom", 19);
        Object obj3 = "hello";

        Person p2= (Person) obj1;
        if (obj3 instanceof Person) {
            Person p3 = (Person) obj3;
        }


    }
}
