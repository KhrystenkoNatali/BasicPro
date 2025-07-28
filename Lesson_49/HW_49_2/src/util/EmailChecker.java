package util;

import exception.NotCorrectEmailFormatException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmailChecker {
    public static void checkEmail() throws NotCorrectEmailFormatException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите email: ");
        String email = scanner.nextLine();

        List<String> errors = new ArrayList<>();

        if (email.length() < 5) {
            errors.add("строка короче 5 символов");
        }

        int atIndex = email.indexOf('@');
        int lastAtIndex = email.lastIndexOf('@');

        if (atIndex == -1) {
            errors.add("отсутствует символ '@'");
        } else {
            if (atIndex == 0) {
                errors.add("'@' не может быть первым символом");
            }
            if (atIndex == email.length() - 1) {
                errors.add("'@' не может быть последним символом");
            }
            if (atIndex != lastAtIndex) {
                errors.add("должен быть только один символ '@'");
            }
        }

        if (!errors.isEmpty()) {
            StringBuilder message = new StringBuilder("Ошибки:\n");
            for (String error : errors) {
                message.append("- ").append(error).append("\n");
            }
            throw new NotCorrectEmailFormatException(message.toString());
        }

        System.out.println("Email корректный: " + email);
    }
}
