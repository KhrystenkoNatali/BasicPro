package app;

import java.util.Scanner;

public class VetClinicApp_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetCreator creator = new PetCreator();

        System.out.print("Сколько питомцев вы хотите ввести? ");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine(); // Чистим перевод строки

        // Создаем массив питомцев
        Pet[] pets = new Pet[numberOfPets];

        // Вводим питомцев
        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("\nВвод питомца №" + (i + 1));
            pets[i] = creator.createPet();
        }

        // Выводим всех питомцев
        System.out.println("\nСписок всех питомцев:");
        for (int i = 0; i < pets.length; i++) {
            System.out.println((i + 1) + ". " + pets[i]);
        }

        // Получаем статистику по типу
        System.out.print("\nВведите тип животного для получения статистики: ");
        String searchType = scanner.nextLine();

        printStatsByType(pets, searchType);
    }

    // Метод для вывода статистики по типу
    public static void printStatsByType(Pet[] pets, String type) {
        int count = 0;
        int totalAge = 0;

        for (Pet pet : pets) {
            if (pet.type.equalsIgnoreCase(type)) {
                count++;
                totalAge += pet.age;
            }
        }

        if (count == 0) {
            System.out.println("Животные типа '" + type + "' не найдены.");
        } else {
            double averageAge = (double) totalAge / count;
            System.out.println("Найдено животных типа '" + type + "': " + count);
            System.out.println("Средний возраст: " + averageAge);
        }
    }
}
