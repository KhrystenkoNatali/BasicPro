/*
Пользователь водит строку. Ваша задача получить новую строку,
которая будет состоять из букв исходной, стоящих на нечетных позициях. Например:

Ввод: "java is very easy"
Вывод: "aai eyes"

или

Ввод: "0123456"
Вывод: "135"
 */
package app;

//Группа68m

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        StringBuilder result = new StringBuilder();
        for (int i = 1; i < input.length(); i += 2) {
            result.append(input.charAt(i));
        }

        System.out.println("Результат: " + result);
    }

}





















