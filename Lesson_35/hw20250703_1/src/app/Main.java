package app;


import app.model.Bike;
import app.model.Boat;
import app.model.Car;
import app.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Car("BBB7711", "BMW", 2010,"black"));
        vehicleList.add(new Boat("Победа", 20));
        vehicleList.add(new Bike());

        System.out.println("---------1. начальное состояние --------------");
        for (Vehicle vehicle: vehicleList){
            System.out.println(vehicle);
        }
        System.out.println("---------2. поехали --------------");
        for (Vehicle vehicle: vehicleList){
            vehicle.drive();
            System.out.println(vehicle);
        }
        System.out.println("---------3. остановились --------------");
        for (Vehicle vehicle: vehicleList){
            vehicle.stop();
            System.out.println(vehicle);
        }


    }

}
