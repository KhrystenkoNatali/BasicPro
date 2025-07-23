package app.model;

public class FrontendProgrammer extends Programmer{  // IS A

    public FrontendProgrammer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "FE  " + super.toString();
    }
}
