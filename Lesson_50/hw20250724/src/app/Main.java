package app;

import app.exceptions.NotCorrectEmailFormatException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String email = null;

        while (email == null) {
            try {
                email = getEmail();
            } catch (NotCorrectEmailFormatException e) {
                System.out.println("Ошибка ввода email: " + e.getMessage());
                System.out.println("Повторите ввод");

            }
        }
        System.out.println("Email: " + email);
    }

    public static String getEmail(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите email");

        String email = scanner.nextLine().trim();
        // проверки
        if (email.length()<5){
            throw new NotCorrectEmailFormatException("Некорректная длинна");
        }
        int indexAt = email.indexOf('@');
        if(indexAt == -1){
            throw new NotCorrectEmailFormatException("Нет '@'");
        } else {

            if (indexAt != email.lastIndexOf('@')) {
                throw new NotCorrectEmailFormatException("Не может быть более одного символа '@'");
            }
            if (email.startsWith("@")){
                throw new NotCorrectEmailFormatException("Не может начинаться с символа '@'");
            }
            if (email.endsWith("@")){
                throw new NotCorrectEmailFormatException("Не может заканчиваться символом '@'");
            }

        }
        return email;
    }

}
