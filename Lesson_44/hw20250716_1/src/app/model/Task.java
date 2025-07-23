package app.model;

public class Task {
    private int number;
    private String description;
    private static int count = 0;

    public Task(String description) {
        this.description = description;
        number = ++count;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "[" + number + "] " + description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Task task = (Task) o;

        return number == task.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
