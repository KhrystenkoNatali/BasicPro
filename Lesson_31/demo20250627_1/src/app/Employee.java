package app;
// abstract class - не возможно создать объект этого класса
public abstract class  Employee {
    protected String name;
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

    // abstract метод должен быть определен в дочернем класс
    public abstract void work();

    public void learn(){}
}
