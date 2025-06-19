package app;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца [1 .. 12]: ");
        int month = scanner.nextInt();

        boolean isMonthValid = month >= 1 && month <= 12;


        if ( isMonthValid ){
            System.out.println("месяц корректный");
        } else {
            System.out.println("ошибка ввода месяца");
        }

    }
}
