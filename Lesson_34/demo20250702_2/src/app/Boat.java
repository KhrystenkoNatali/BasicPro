package app;

public class Boat implements Swimmable {
    private String name;
    private int capacity;

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public void swim(){
        System.out.println("лодка не плавает а ходит!!!!!");
        System.out.println(name + ": полный вперед! ");
        System.out.println(name + ": на борту  " + capacity + " пассажиров");
    }
/*
    @Override
    public String getType() {
        return "лодка";
    }

 */

}
