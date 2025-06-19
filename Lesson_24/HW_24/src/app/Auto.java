/*
Создать класс Авто (машина)
Поля: бренд, цвет, год выпуска, создать цену нескольких объектов этого класса.
Напишите метод, который выводит на экран данные машины.
 */
package app;

// Группа 68m

public class Auto {
    String brand;
    String color;
    int year;

    void displayInfo() {
        System.out.println("Бренд: " + brand);
        System.out.println("Цвет: " + color);
        System.out.println("Год выпуска: " + year);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Auto car1 = new Auto();
        car1.brand = "Toyota";
        car1.color = "Красный";
        car1.year = 2018;

        Auto car2 = new Auto();
        car2.brand = "BMW";
        car2.color = "Чёрный";
        car2.year = 2021;

        car1.displayInfo();
        car2.displayInfo();
    }
}


