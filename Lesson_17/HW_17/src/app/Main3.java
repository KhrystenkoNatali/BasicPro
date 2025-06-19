/*
пользователь вводит строку вида:
22 + 6
в рамках данной задачи:
в выражение только 2 целых положительных числа
числа отделены одним пробелом от знака операции
возможные операции + - / *
пользователь вводит корректные данные, т.е. проверять эти условия не нужно
 */
package app;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите выражение (например, 22 + 6): ");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");

        int num1 = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int num2 = Integer.parseInt(parts[2]);

        int result = 0;
        boolean valid = true;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                valid = false;
                System.out.println("Неизвестная операция.");
        }

        if (valid) {
            System.out.println("Результат: " + result);
        }

        scanner.close();


    }
}
