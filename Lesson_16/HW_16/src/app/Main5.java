package app;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        /*
        Напишите программу, которая запрашивает у пользователя три числа.
        Программа должна определить наибольшее из трех чисел.
        Например:
        Ввод: -3, 10, 7 -> Результат: 10
        Ввод: 9, 3, 9 -> Результат: 9
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.print("Введите третье число: ");
        int num3 = scanner.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("Наибольшее число: " + max);
    }
}
