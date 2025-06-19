package app;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите email: ");
        String email = scanner.nextLine();

        int indexOfAt = email.indexOf("@");
        int indexOfDot = email.indexOf(".");

        boolean isEmailValid = email.length() > 8
                && indexOfDot > 0
                && indexOfAt > 0
                && email.lastIndexOf("@") != email.length() - 1  // email.length() - 1  - индекс последнего символа
                && email.lastIndexOf(".") != email.length() - 1;


        if (isEmailValid){
            System.out.println("email корректный");
        } else {
            System.out.println("email НЕ корректный");
        }


    }
}
