package app;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String toString(){
        return name + " ( зп.: " + salary +")";
    }

    public void paySalary(){
        System.out.println(name+ ": получил " + salary);
    }

    public void work(){}
}
