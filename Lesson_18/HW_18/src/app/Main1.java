/*
Напишите программу, которая просит пользователя ввести строку
и выводит на экран первое слово введенной строке, по-буквам, в столбик.
Задачу необходимо реализовать двумя видами цикла из трех.
Например:
hello java
h
e
l
l
o
Ограничения:
если исходная строка из одного слова, выводим всю строку
слова разделены пробелом
в рамках этой задачи нельзя использовать substring
 */
package app;

// Группа 68m

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        String firstWord = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == ' ') {
                break;
            }
            firstWord += c;
        }

        System.out.println("\n--- Цикл for с индексом ---");
        for (int i = 0; i < firstWord.length(); i++) {
            System.out.println(firstWord.charAt(i));
        }

        System.out.println("\n--- Цикл for-each по символам ---");
        for (char c : firstWord.toCharArray()) {
            System.out.println(c);
        }

        System.out.println("\n--- Цикл while ---");
        int i = 0;
        while (i < firstWord.length()) {
            System.out.println(firstWord.charAt(i));
            i++;
        }

        scanner.close();

    }
}
