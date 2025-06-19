package app;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        /*
        Пользователь вводит email ваша задача проверить,
        может ли введенная строка быть корректным email. Email корректен если он:
        содержит @
        длиннее 8 символов
        содержит .
        @ и . не последний и не первый символ
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите email: ");
        String email = scanner.nextLine();

        boolean hasAt = email.contains("@");
        boolean hasDot = email.contains(".");
        boolean longEnough = email.length() > 8;
        boolean notStartOrEnd = !email.startsWith("@") && !email.startsWith(".")
                && !email.endsWith("@") && !email.endsWith(".");

        if (hasAt && hasDot && longEnough && notStartOrEnd) {
            System.out.println("Email корректен.");
        } else {
            System.out.println("Email НЕ корректен.");
        }


    }
}
