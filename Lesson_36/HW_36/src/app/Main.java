/*
Предположим, вы пишите программу для on-line магазина
У каждого товара есть наименование, цена, рейтинг, количество штук на складе и т.д.
Ваша программа должна предлагать пользователю выбрать,
как бы он хотел сортировать товары и, в зависимости от выбора пользователя,
выводить список товаров в нужном порядке (например, по цене по возрастанию,
по цене по убыванию, по рейтингу, по количеству на складе).
Для этого, очевидно, можно использовать метод Collection.sort
и реализовать несколько Comparator<Person>
 */
package app;
// Группа 68m
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Ноутбук", 1000.0, 4.5, 10));
        products.add(new Product("Смартфон", 700.0, 4.7, 5));
        products.add(new Product("Наушники", 150.0, 4.3, 20));
        products.add(new Product("Монитор", 300.0, 4.0, 8));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Как сортировать товары?");
        System.out.println("1 - По цене (возрастание)");
        System.out.println("2 - По цене (убывание)");
        System.out.println("3 - По рейтингу");
        System.out.println("4 - По количеству на складе");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> Collections.sort(products, new PriceAscComparator());
            case 2 -> Collections.sort(products, new PriceDescComparator());
            case 3 -> Collections.sort(products, new RatingComparator());
            case 4 -> Collections.sort(products, new StockComparator());
            default -> System.out.println("Неверный выбор.");
        }

        System.out.println("\nСписок товаров:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
