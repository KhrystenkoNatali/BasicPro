/*
Дана мпсств строка. Необходимо вываести его на экране.
Далее программа дожна запросить два целых числа - элементы номеров и
поменять местами соответствующие элементы. После чего опять выведите массив на экран.
 */
package app;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        char[] array = input.toCharArray();

        System.out.print("Массив символов: ");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();

        System.out.print("Введите первый индекс: ");
        int i = scanner.nextInt();
        System.out.print("Введите второй индекс: ");
        int j = scanner.nextInt();

        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;

        System.out.print("Изменённый массив: ");
        for (char c : array) {
            System.out.print(c + " ");
        }
        System.out.println();

    }
}
