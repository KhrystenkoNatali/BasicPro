package app;

import java.util.Scanner;

public class PetCreator {
    public Pet createPet() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите тип животного (например, кот, собака, попугай): ");
        String type = scanner.nextLine();

        System.out.print("Введите имя животного: ");
        String name = scanner.nextLine();

        System.out.print("Введите цвет животного: ");
        String color = scanner.nextLine();

        System.out.print("Введите возраст животного: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        return new Pet(type, name, color, age);
    }
}
