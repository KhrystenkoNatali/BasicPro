/*
Пользователь вводит целое число. Ваша задача определить, сумму разрядов этого числа.
Например, ввели число 2317
Нужно посчитать: 2 + 3 + 1 + 7
Ответ: 13
 */
package app;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int total = 0;

        if (number < 0) {
            number = -number;
        }

        while (number > 0) {
            int lastDigit = number % 10;
            total = total + lastDigit;
            number = number / 10;
        }

        System.out.println("Сумма цифр: " + total);

    }
}
