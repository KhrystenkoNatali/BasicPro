package app.util;

import app.model.Employee;

import java.util.*;

public class EmployeeUtils {
    public static List<Employee> mergeAndRemoveDuplicates(List<List<Employee>> allTeams) {
        Set<Employee> unique = new LinkedHashSet<>();
        for (List<Employee> team : allTeams) {
            unique.addAll(team);
        }
        return new ArrayList<>(unique);
    }
}
