package app.model;

public class Bus extends Vehicle {
    int numberOfPassenger;

    public Bus(String number, String brand, int year, int numberOfPassenger) {
        super(number, brand, year);
        this.numberOfPassenger = numberOfPassenger;
    }

    public int getNumberOfPassenger() {
        return numberOfPassenger;
    }

    @Override
    public String toString() {
        return "Автобус: [" + super.toString() + "] мест: " + numberOfPassenger;
    }


    public void drive() {
        super.drive();
        System.out.println(" повезли " + numberOfPassenger + " человек");
    }
}
