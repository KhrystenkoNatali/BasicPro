package app;

public class BackEndProgrammer extends Programmer{
    public BackEndProgrammer(String name, int salary) {
        super(name, salary);
    }
    public void checkDataBase(){
        System.out.println("checkDataBase");
    }
}
