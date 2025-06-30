package app;

public class Lazy extends Employee{
    public Lazy(String name, int salary) {
        super(name, salary);
    }

    public void work(){}  // abstract метод должен быть определен
}
