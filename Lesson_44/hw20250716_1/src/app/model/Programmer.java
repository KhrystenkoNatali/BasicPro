package app.model;

import java.util.*;

public class Programmer {
    private String name;
    private List<Task> tasks = new ArrayList<>();

    public Programmer(String name) {
        this.name = name;
    }

    public Programmer(String name, Collection<Task> tasks) {
        this.name = name;
        this.tasks.addAll(new HashSet<>(tasks));
    }

    public Programmer(String name, Task ... tasks){
        this(name,Arrays.asList(tasks));
    }

    public String getName() {
        return name;
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public void addTask(Task task){
        if(!tasks.contains(task)) {
            tasks.add(task);
        }
    }

    // public void addTask(Task[] tasks)
    public void addTask(Task ... tasks){
        for (int i=0; i< tasks.length; i++){
            addTask(tasks[i]);
        }
    }

    public void addTask(Collection<Task> tasks){
        for (Task task:tasks){
            addTask(task);
        }
    }

    @Override
    public String toString() {
        String result = name + System.lineSeparator();
        if (tasks.isEmpty()){
            result+="  задач нет.";
        } else {
            for (Task task : tasks) {
                result += "  " + task + System.lineSeparator();
            }
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Programmer that = (Programmer) o;

        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
