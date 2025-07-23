/*
Допустим вы продаете автомобили. Т.е. есть класс Auto. У каждой машины есть номер (id),
бренд, год выпуска, цена. У вас есть список автомобилей.
Ваша программа должна уметь получать список автомобилей отсортированный по:
 номеру
цене
году выпуска
бренду

Естественно, вам придется реализовать соответствующие компараторы.
Естественно, реализовывать нужно лямбда-выражением.

 */
package app;
//Группа 68m
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Auto> cars = new ArrayList<>(List.of(
                new Auto(3, "BMW", 2021, 35000),
                new Auto(1, "Audi", 2020, 33000),
                new Auto(4, "Tesla", 2022, 50000),
                new Auto(2, "Mercedes", 2019, 37000)
        ));

        System.out.println("=== По номеру ===");
        AutoUtil.sortById(cars);
        cars.forEach(System.out::println);

        System.out.println("\n=== По цене ===");
        AutoUtil.sortByPrice(cars);
        cars.forEach(System.out::println);

        System.out.println("\n=== По году ===");
        AutoUtil.sortByYear(cars);
        cars.forEach(System.out::println);

        System.out.println("\n=== По бренду ===");
        AutoUtil.sortByBrand(cars);
        cars.forEach(System.out::println);
    }

}
