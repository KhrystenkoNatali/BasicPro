package app;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        String adminLogin = "admin";
        String adminPass = "qwerty1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите login: ");
        String login = scanner.nextLine();

        System.out.println("Введите password: ");
        String password = scanner.nextLine();


        boolean isAdmin = adminLogin.equals(login) && adminPass.equals(password);

        if (isAdmin) {
            System.out.println("доступ возможен");
        } else {
            System.out.println("вы не опознаны");
        }
        scanner.close();

    }
}
