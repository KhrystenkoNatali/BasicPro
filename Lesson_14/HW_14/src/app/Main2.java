package app;

public class Main2 {

    public static void main(String[] args) {
        /*
        Обратная задача. Исходные данные программы: строка вида
        Николай Иванович Петров
        Copy
        Написать программу, которая рахбирает строку на три переменные:
        имя
        отчество
        фамилия
        Подсказка: Вам понадобятся методы строки indexOf(), lastIndexOf и substring()
        */
        String fullName = "Николай Иванович Петров";

        // Разбиваем строку по пробелам
        String[] parts = fullName.split(" ");

        // Присваиваем значения
        String name = parts[0];       // Имя
        String middleName = parts[1]; // Отчество
        String lastName = parts[2];   // Фамилия

        // Выводим результат
        System.out.println("Имя: " + name);
        System.out.println("Отчество: " + middleName);
        System.out.println("Фамилия: " + lastName);

    }
}

