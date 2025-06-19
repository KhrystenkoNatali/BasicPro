package app;

import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        String numStr = scanner.nextLine();   // получим число как строку (например, "55")
        int i = Integer.parseInt(numStr);     // преобразовали в число int
        System.out.println("Число:" + i);

        System.out.println("Введите строку: ");
        String str = scanner.nextLine();
        System.out.println("Строка: " + str);

        System.out.println("------------ finish ----------------");
    }
}

