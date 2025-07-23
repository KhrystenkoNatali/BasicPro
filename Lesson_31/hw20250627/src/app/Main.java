package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Truck("545", "Mann", 2015, 40));
        vehicles.add(new Car("656", "BMW", 2009));
        vehicles.add(new Bus("777", "Iкarus-'256' ", 1977, 47)); // данные с интернета 😁
        vehicles.add(new Car("555", "Toyota", 2025));
        vehicles.add(new Truck("999", "Volvo", 2005, 18));

        System.out.println("------ все транспортные средства --------------");
        for (Vehicle vehicle: vehicles){
            System.out.println(vehicle);
        }
        System.out.println("------ все поехали -----------");
        for (Vehicle vehicle: vehicles){
            vehicle.drive();
        }

        Truck truck = new Truck("1234", "Tatra", 1990, 15);

        Random random = new Random();
        for (int i = 0; i < 10 ; i++) {

            System.out.println(random.nextInt(50,100));
        }

    }
}
