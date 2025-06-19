package app;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);     // создаем Scanner
        System.out.println("Введите целое число: ");  // выводим сообщение пользователю
        int i = scanner.nextInt();                    // читаем число  (невидимый символ конца строки остался в потоке)
        scanner.nextLine();                           // читаем строке ( невидимый символ конца строки читаем и удаляем из потока)
        System.out.println("Число:" + i);             // выводим на экран число

        System.out.println("Введите строку: ");       // выводим сообщение пользователю
        String str = scanner.nextLine();              // читаем строку (ожидаем от пользователя ввода сроки)
        System.out.println("Строка: " + str);

        System.out.println("------------ finish ----------------");

    }
}
