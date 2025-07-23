package app.model;

public class Boat  implements Vehicle {
    private String name;
    private int capacity;
    private boolean isDrive;  //

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {

        return "Boat{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", " + (isDrive ? "плывем":"стоим у причала") +
                '}';
    }

    @Override
    public void drive() {
        isDrive = true;
    }

    @Override
    public void stop() {
        isDrive = false;
    }
}
