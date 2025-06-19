/*
Дана мпсств строка. Пользователь вводит текст.
Программа должна подсчитать, сколько раз введенная строка встречается в массиве.
 */
package app;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "apple", "orange", "banana", "apple"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку для поиска: ");
        String input = scanner.nextLine();

        int count = 0;

        for (String item : array) {
            if (item.equals(input)) {
                count++;
            }
        }
        System.out.println("Строка '" + input + "' встречается " + count + " раз(а).");
    }

}
