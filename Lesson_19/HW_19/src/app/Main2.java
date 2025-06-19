/*
Пользователь водит целое число. Ваша задача определить,
является ли жто число простым. Напомню, простое число это то,
которое без остатка делится только на 1 и на само себя,
иными словами, не делится ни на какое число больше. Например:

5 простое делится только на 1 и на 5
6 не простое делится на 1, 2, 3 и 6
 */
package app;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Число не является простым.");
            return;
        }

        boolean simple = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                simple = false;
                break;
            }
        }

        if (simple) {
            System.out.println("Число простое.");
        } else {
            System.out.println("Число не является простым.");
        }


    }
}
