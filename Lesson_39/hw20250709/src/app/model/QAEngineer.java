package app.model;

public class QAEngineer extends Employee{


    public QAEngineer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "QAEngineer: " + super.toString();
    }
}
