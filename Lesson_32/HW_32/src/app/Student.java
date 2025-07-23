package app;

public class Student {
    private static int nextId = 1;
    private static int count = 0;

    private int id;
    private String name;
    private String group;

    public Student(String name, String group) {
        this.id = nextId++;
        this.name = name;
        this.group = group;
        count++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public static int getStudentCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', group='" + group + "'}";
    }
}
