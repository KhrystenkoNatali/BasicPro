package app.model;

public class Car  implements Vehicle{
    private String plate;
    private String brand;
    private int year;
    private  String color;
    private boolean isDrive;

    public Car(String plate, String brand, int year, String color) {
        this.plate = plate;
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {

        return "Car{" +
                "plate='" + plate + '\'' +
                ", brand='" + brand + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                "} " + (isDrive ? "едет" : "стоит") ;
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
