package app.model;

public class Bike implements Vehicle {
    private String state;
    @Override
    public void drive() {
        state = "Bike: поехали";
        System.out.println(state);
    }

    @Override
    public void stop() {
        state = "Bike: остановились";
        System.out.println(state);
    }

    @Override
    public String toString() {
        return "Bike{" +
                "state='" + state + '\'' +
                '}';
    }
}
