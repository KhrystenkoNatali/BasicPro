package app;

import java.util.ArrayList;
import java.util.List;

public class Manager<T extends Employee> {
    private List<T> team = new ArrayList<>();

    public void addToTeam(T employee) {
        team.add(employee);
    }

    public void showTeam() {
        for (T member : team) {
            System.out.println(member.getInfo());
        }
    }
}
