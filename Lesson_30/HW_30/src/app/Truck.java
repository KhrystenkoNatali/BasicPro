package app;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String number, String brand, int year, double loadCapacity) {
        super(number, brand, year);
        this.loadCapacity = loadCapacity;

    }

    @Override
    public void drive() {
        System.out.println(number + ": поехали, перевозим " + loadCapacity + " тонн груза");
    }
}