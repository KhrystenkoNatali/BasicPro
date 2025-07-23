import app.Main;
import app.model.Employee;

import java.util.HashSet;
import java.util.Set;

public class Maiin {
    public static void main(String[] args) {
        int size = 8;
        int hash = -2;
        hash = Math.abs(hash);
        System.out.println(size< hash ? size%hash:hash);

        Employee e1 = new Employee("Jack", 3000);
        Employee e2 = new Employee("JLena", 4000);


        Set<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        System.out.println(set);
        System.out.println("----------- изменили");
        e1.setSalary(4500);
        System.out.println(set);
        System.out.println("ищем в сет " + e1);
        System.out.println(set.contains(e1));

    }
}
