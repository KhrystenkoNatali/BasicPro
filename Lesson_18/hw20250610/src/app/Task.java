package app;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        System.out.println("Введите номер месяца [1. Январь 2. ....]: ");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        switch (month) {
            case 1:
                System.out.println("Месяц номер " + month + ": Январь");
                break;
            case 2:
                System.out.println("Месяц номер " + month + ": Февраль");
                break;
            case 3:
                System.out.println("Месяц номер " + month + ": Март");
                break;
            case 4:
                System.out.println("Месяц номер " + month + ": Апрель");
                break;
            case 5:
                System.out.println("Месяц номер " + month + ": Май");
                break;
            case 6:
                System.out.println("Месяц номер " + month + ": Июнь");
                break;
            case 7:
                System.out.println("Месяц номер " + month + ": Июль");
                break;
            case 8:
                System.out.println("Месяц номер " + month + ": Август");
                break;
            case 9:
                System.out.println("Месяц номер " + month + ": Сентябрь");
                break;
            case 10:
                System.out.println("Месяц номер " + month + ": Октябрь");
                break;
            case 11:
                System.out.println("Месяц номер " + month + ": Ноябрь");
                break;
            case 12:
                System.out.println("Месяц номер " + month + ": Декабрь");
                break;
            default:
                System.out.println("Ошибка ввода");

        }



    }
}
