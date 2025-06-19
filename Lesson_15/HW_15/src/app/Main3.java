package app;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        /*
        Исходные данные: есть длина и ширина комнаты, площадь паркета в одной упаковке. Напишите программу, которая запрашивает эти данные у пользователя, сохраняет эти данные в переменных, вычисляет и выводит в консоль, сколько упаковок паркета необходимо купить для этой комнаты.
         Например:
          Длинна комнаты: 4.0
          Ширина комнаты: 3.0
          В одной упаковке: 3.5 метра
          Площадь комнаты 12 м.  необходимо 4 упаковки
         */
        Scanner scanner = new Scanner(System.in);

        // Вводим данные
        System.out.println("Длина комнаты:");
        double length = scanner.nextDouble();

        System.out.println("Ширина комнаты:");
        double width = scanner.nextDouble();

        System.out.println("Сколько метров в одной упаковке паркета:");
        double onePack = scanner.nextDouble();

        // Площадь комнаты
        double area = length * width;

        // Считаем нужное количество упаковок (округляем вверх)
        int packs = (int) (area / onePack);
        if (area % onePack != 0) {
            packs = packs + 1;
        }

        System.out.println("Площадь комнаты: " + area + " м");
        System.out.println("Нужно упаковок: " + packs);

    }
}
