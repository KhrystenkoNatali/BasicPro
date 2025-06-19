package app;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        /*
        В программе заданно 2 переменных: adminLogin и adminPass.
        Пользователь вводит свои логин и пароль.
        Если введенные логин и пароль совпадают с adminLogin и adminPass,
        программа выдает сообщение: "доступ возможен", иначе "вы не опознаны"
         */
        String adminLogin = "admin";
        String adminPass = "1234";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите логин: ");
        String login = scanner.nextLine();

        System.out.print("Введите пароль: ");
        String password = scanner.nextLine();

        if (login.equals(adminLogin) && password.equals(adminPass)) {
            System.out.println("доступ возможен");
        } else {
            System.out.println("вы не опознаны");
        }

    }
}
