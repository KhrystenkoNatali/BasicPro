/*
Давайте создадим класс Product. Пусть у нашего продукта будет
название и цена. Создайте в программе список из Product,
и выведите его на экран, например так:

1. Хлеб 1.79
2. Молоко 1.05
3. Масло 2.39
4. Колбаса 2.99
5. Рис 0.99

Реализуйте возможность для пользователя указывать номер позиции,
тем самым добавлять продукт в корзину. Один и тот же продукт может
несколько раз быть добавленным в корзину. Если пользователь ввел '0'
считаем что ввод закончен. Система должна распечатать все продукты в
корзине и количество и сумму заказа.
 */
package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Хлеб", 1.79));
        products.add(new Product("Молоко", 1.05));
        products.add(new Product("Масло", 2.39));
        products.add(new Product("Колбаса", 2.99));
        products.add(new Product("Рис", 0.99));

        Cart cart = new Cart();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Список продуктов:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println((i + 1) + ". " + products.get(i));
        }

        while (true) {
            System.out.print("Введите номер продукта (0 - закончить): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number >= 1 && number <= products.size()) {
                cart.addProduct(products.get(number - 1));
            } else {
                System.out.println("Нет такого номера!");
            }
        }

        cart.showCart();
    }
}
