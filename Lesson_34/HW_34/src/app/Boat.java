package app;

public class Boat implements Vehicle {
    @Override
    public void drive() {
        System.out.println("The boat is sailing on water.");
    }

    @Override
    public void stop() {
        System.out.println("The boat has stopped.");
    }
}
