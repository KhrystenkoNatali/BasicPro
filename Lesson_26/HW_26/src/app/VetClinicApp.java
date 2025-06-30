package app;

import java.util.Scanner;

public class VetClinicApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetCreator creator = new PetCreator();

        System.out.print("Сколько питомцев вы хотите ввести? ");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine(); // Считываем лишний перевод строки

        // Создаем массив питомцев
        Pet[] pets = new Pet[numberOfPets];

        // Вводим питомцев в цикле
        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("\nВвод питомца №" + (i + 1));
            pets[i] = creator.createPet();
        }

        // Выводим всех питомцев
        System.out.println("\nСписок всех питомцев:");
        for (int i = 0; i < pets.length; i++) {
            System.out.println((i + 1) + ". " + pets[i]);
        }
    }
}
