/*
В проекте с нашей реализацией листов, реализуйте Iterator у MyLinkedList с помощью анонимного класса
 */
package app;
//Группа 68m
import app.model.Product;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyLinkedList();

        list.add(new Product("phone0", 699.0, 8, 101));
        list.add(new Product("phone1", 630.0, 9, 201));
        list.add(new Product("phone2", 290.0, 7, 29));
        list.add(new Product("phone3", 301.0, 5, 44));
        list.add(new Product("phone4", 330.0, 6, 62));
        list.add(new Product("phone5", 586.0, 8, 9));
        list.add(new Product("phone6", 300.0, 9, 89));

        System.out.println("\nСписок продуктов:");
        for (Product p : list) {
            System.out.println(p);
        }

        System.out.println("\nПервый элемент: " + list.get(0));
        System.out.println("Последний элемент: " + list.get(list.size() - 1));
    }
}
