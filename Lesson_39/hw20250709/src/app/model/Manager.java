package app.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Manager<T extends Employee> extends Employee{
    private final List<T> team;


    public Manager(String name, int salary) {
        super(name, salary);
        this.team = new ArrayList<>();
    }

    public  void addToTeam (T employee){
        team.add(employee);
    }

    @Override
    public String toString() {
        String res = "Manager: "+ super.toString() + System.lineSeparator();
        for (T employee: team){
            res+= "  " + employee + System.lineSeparator();
        }
        return res;
    }
}
