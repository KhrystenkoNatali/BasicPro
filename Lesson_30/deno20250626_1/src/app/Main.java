package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // IS A
        // является


        List<Employee> employees = new ArrayList<>();
        employees.add(new Programmer("Jack",5000) );
        employees.add(new Programmer("Lena",5600) );
        employees.add(new QAEngineer("Misha",5300) );
        employees.add(new QAEngineer("Ira",4800) );
        employees.add(new Manager("Tim",4800, 1000) );

        for (Employee employee: employees){
            employee.paySalary();
            employee.work();
        }

    }

}

