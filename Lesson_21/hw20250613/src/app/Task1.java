package app;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int namesQuantity = 5;
        String[] names = new String[namesQuantity];

        System.out.println("Введите " + names.length + " имен");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Введите имя номер [" + (i+1) + "]  : " );
            names[i] = scanner.nextLine();
        }

        System.out.println("Вы ввели: ");
        for (int i = 0; i < names.length; i++) {
            System.out.println("names[" + (i+1) + "]  : " + names[i] );
        }





    }
}
