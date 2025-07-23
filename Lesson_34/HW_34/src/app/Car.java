package app;

public class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("The car is driving on the road.");
    }

    @Override
    public void stop() {
        System.out.println("The car has stopped.");
    }
}
