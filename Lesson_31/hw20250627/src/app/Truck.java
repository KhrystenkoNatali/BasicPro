package app;

public class Truck extends Vehicle{
    private double loadCapacity;

    public Truck(String number, String brand, int year, double loadCapacity) {
        super(number, brand, year);   // super() - вызов конструктора родительского класса. Всегда первой строкой
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return "Грузовик: [" + super.toString() + "] грузоподъемность: " + loadCapacity ;
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println(" повезли " + loadCapacity + " тон груза");
    }
}
