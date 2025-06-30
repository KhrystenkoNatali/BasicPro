/*
Напишите программу, которая позволяет пользователю вводить целые числа.
 Как только пользователь введет 0 - считаем что ввод закончен.
 Программа должна вывести на экран все введенные числа и их сумму
 */
package app;

// Группа 68m

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Main> numbers = new ArrayList<>();
        int sum = 0;

        System.out.println("Введите целые числа (0 - для завершения):");

        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }

            Main number = new Main();
            number.setValue(input);
            numbers.add(number);
            sum += number.getValue();
        }

        System.out.println("Вы ввели:");
        for (Main number : numbers) {
            System.out.print(number.getValue() + " ");
        }

        System.out.println("\nСумма: " + sum);
    }
}
