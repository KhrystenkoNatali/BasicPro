package app.model;

public class Programmer extends Employee {

    public Programmer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Programmer: " + super.toString();
    }
}
