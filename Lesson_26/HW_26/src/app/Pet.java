/*
Задача 1
Давайте представим, что мы пишем программу для ветеринарной клиники.
Создайте класс Pet(Домашнее животное)
Поля: тип (кот, собака, попугай и т.д.), имя, цвет, возраст
Реализуйте конструктор, toString() Реализуйте метод, который
позволяет создать объект Pet используя Scanner

Задача 2
Используя написанные в задаче 1 классы и методы напишите программу,
которая позволяет ввести несколько домашних животных и формирует
из них массив. Выведите этот массив на экран.

Задача 3 (по желанию)
реализуйте метод (или методы), которые позволят получить статистику
по базе животных: пользователь вводит тип животного, например "собака",
программа должна вывести количество собак в массиве и их средний возраст.
 */
package app;

//Группа 68m

import java.util.Scanner;

public class Pet {

    String type;
    String name;
    String color;
    int age;

    public Pet(String type, String name, String color, int age) {
        this.type = type;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String toString() {
        return "Тип: " + type + ", Имя: " + name + ", Цвет: " + color + ", Возраст: " + age + " года(лет)";
    }

    public static Pet createPetFromInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите тип животного (например, кот, собака, попугай): ");
        String type = scanner.nextLine();

        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.print("Введите цвет животного: ");
        String color = scanner.nextLine();

        System.out.print("Введите возраст животного: ");
        int age = scanner.nextInt();

        return new Pet(type, name, color, age);
    }

    public static void main(String[] args) {
        System.out.println("Создание нового питомца...");
        Pet myPet = Pet.createPetFromInput();

        System.out.println("Вы ввели следующего питомца:");
        System.out.println(myPet);
    }
}
