package app;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        int age = scanner.nextInt();
        scanner.nextInt();

        System.out.println("Введите имя: ");
        String name = scanner.nextLine();

        System.out.println(name + " (" + age + ")" );



    }
}
