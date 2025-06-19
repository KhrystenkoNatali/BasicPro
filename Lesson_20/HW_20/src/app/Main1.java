/*
Реализовать программу, которая запрашивает у пользователя ввод 5 имен,
создает массив с выдуманными именами и выводит их на экран:

jack
jonh
ann
lena
nick

Вывод:

0.jack
1.jonh
2. ann
3.lena
4.nick
 */
package app;

// Группа 68m

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] defaultNames = {"jack", "jonh", "ann", "lena", "nick"};

        String[] userNames = new String[5];

        System.out.println("Введите 5 имён. Просто нажмите Enter, чтобы взять имя по умолчанию.");

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите имя #" + (i + 1) + " (по умолчанию: " + defaultNames[i] + "): ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) {
                userNames[i] = defaultNames[i];
            } else {
                userNames[i] = input;
            }
        }

        System.out.println("\nРезультат:");
        for (int i = 0; i < userNames.length; i++) {
            System.out.println(i + "." + userNames[i]);
        }

        scanner.close();

    }
}
