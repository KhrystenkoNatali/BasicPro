/*
Напишите программу, которая просит пользователя ввести строку и 1 символ.
Ввша программа должна считать, сколько раз заданный символ встречается во введенной строке
Например:
hello java
a
результат: 2
 */
package app;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        System.out.print("Введите один символ: ");
        String symbolInput = scanner.nextLine();

        if (symbolInput.isEmpty()) {
            System.out.println("Ошибка: вы не ввели символ.");
            return;
        }
        char targetChar = symbolInput.charAt(0);

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == targetChar) {
                count++;
            }
        }
        System.out.println("Результат: " + count);

        scanner.close();


    }
}
