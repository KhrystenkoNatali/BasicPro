package app;

public class Main2 {

    public static void main(String[] args) {
        /*
        Создайте новый класс. Создайте метод main. Объявите 2 переменные:
         цена товара без налога;
         налог
         Напишите программу, которая вычисляет цену товара с налогом

         Например, так:
         Введите цену товара: 200.0
         Налог составит: 19
         Цена с налогом 238.0
         */

        double price = 200.0;
        double tax = 19;

        double total = price + (price * tax / 100);

        System.out.println("Цена с налогом: " + total);
    }
}
