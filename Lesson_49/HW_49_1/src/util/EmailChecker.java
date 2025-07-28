package util;

import exception.NotCorrectEmailFormatException;

import java.util.Scanner;

public class EmailChecker {
    public static void checkEmail() throws NotCorrectEmailFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите email: ");
        String email = scanner.nextLine();

        if (email.length() < 5) {
            throw new NotCorrectEmailFormatException("Email слишком короткий");
        }

        int atIndex = email.indexOf('@');
        if (atIndex <= 0 || atIndex != email.lastIndexOf('@') || atIndex == email.length() - 1) {
            throw new NotCorrectEmailFormatException("Email должен содержать один символ '@' и не быть в начале или в конце");
        }

        System.out.println("Email корректный: " + email);
    }
}
