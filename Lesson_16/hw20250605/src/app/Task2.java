package app;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя первого пассажира : ");
        String namePassenger1 = scanner.nextLine();

        System.out.println("Введите массу багажа (целое число): ");
        int baggage1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите имя второго пассажира : ");
        String namePassenger2 = scanner.nextLine();

        System.out.println("Введите массу багажа (целое число): ");
        int baggage2 = scanner.nextInt();
        //scanner.nextLine();


        int baggageAmount = baggage1 + baggage2;


        //Пассажир 1: имя, багаж: xxx
        System.out.println("Пассажир 1: " + namePassenger1 + ", багаж: " + baggage1);
        System.out.println("Пассажир 2: " + namePassenger2 + ", багаж: " + baggage2);
        System.out.println("Всего багажа: " + baggageAmount);



    }
}
