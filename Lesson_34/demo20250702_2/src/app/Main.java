package app;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String str = "hello";
        Person p = new Person("jack",20);
        Boat b = new Boat("Pobeda",20);
        Duck d = new Duck("Donald", "black");
        temp(p);
        temp(b);
        temp(d);

        List<Swimmable> swimmables = new ArrayList<>();
        swimmables.add(p);
        swimmables.add(b);
        swimmables.add(d);
        swimmables.add(new Boat("Titanic", 5000));
        swimmables.add(new Duck("Scroodge", "white"));
        swimAll(swimmables);

        System.out.println("-------------------------");
        letFly(p);

    }
    public static void temp(Swimmable p){ // объект класса, который реализует interface Swimmable
        p.swim();
    }

    public static void swimAll(List<Swimmable> list){
        System.out.println("------ Все в плаванье! ----");
        for (Swimmable swimmable: list){
            System.out.println("--- " + swimmable.getType().toUpperCase());
            swimmable.swim();
        }
    }

    public static void letFly(Flyable flyable){
        flyable.fly();
    }

}
