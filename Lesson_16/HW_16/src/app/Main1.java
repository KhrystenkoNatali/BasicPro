package app;

// Группа 68

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        /*
        Пользователь вводит целое число.
        Ваша задача определить может ли это число являться валидным номером месяца
        (т.е. от 1 до 12) и записать это значение в переменную boolean isMonthValid.
        Если isMonthValid - программа должна выводить сообщение "месяц корректный",
        иначе выводить сообщение: "ошибка ввода месяца".
         */

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите номер месяца: ");
        int number = scan.nextInt();

        boolean isMonthValid = (number >= 1 && number <= 12);

        if (isMonthValid) {
            System.out.println("месяц корректный");
        } else {
            System.out.println("ошибка ввода месяца");
        }



    }


}
