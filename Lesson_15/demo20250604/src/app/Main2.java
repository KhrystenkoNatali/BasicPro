package app;
// Особенность Scanner: если после ввода числа (например nextInt)
// необходимо ввести  строке (nextLine) сканнер "проскакивает" и
// не дает ввести

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);     // создаем Scanner
        System.out.println("Введите целое число: ");  // выводим сообщение пользователю
        int i = scanner.nextInt();                    // читаем число  (невидимый символ конца строки остался в потоке)
        System.out.println("Число:" + i);             // выводим на экран число

        System.out.println("Введите строку: ");       // выводим сообщение пользователю
        String str = scanner.nextLine();              // читаем строку (т. к. в потоке остался невидимый символ его и считываем, не ожидая ввода от пользователя  )
        System.out.println("Строка: " + str);

        System.out.println("------------ finish ----------------");

        // исправление в Main3 и Main4


    }
}
