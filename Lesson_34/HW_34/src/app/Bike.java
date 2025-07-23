package app;

public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("The bike is being pedaled on the path.");
    }

    @Override
    public void stop() {
        System.out.println("The bike has stopped.");
    }
}
