/*
Используя класс ArrayList реализовать следующую программу:
Пользователь вводит строки. Как только пользователь ввел строку
Exit ваша программа должна вывести на экран все введенные
пользователем строки, пюс сформировать статистику:
 */
package app;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();

        System.out.println("Введите строки (введите 'Exit' для завершения):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Exit")) {
                break;
            }
            inputList.add(input);
        }

        System.out.println("\nВы ввели " + inputList.size() + " строк:");
        for (String str : inputList) {
            System.out.println("- " + str);
        }

        // Статистика
        int digitOnlyCount = 0;
        String longest = "";

        for (String str : inputList) {
            if (str.matches("\\d+")) {
                digitOnlyCount++;
            }
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        System.out.println("\nСтатистика:");
        System.out.println("Общее количество строк: " + inputList.size());
        System.out.println("Самая длинная строка: " + longest);
        System.out.println("Количество строк, содержащих только цифры: " + digitOnlyCount);
    }

}
