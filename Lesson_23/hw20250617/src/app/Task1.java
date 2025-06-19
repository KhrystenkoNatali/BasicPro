package app;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите день:");
        int day = scanner.nextInt();
        System.out.println("Введите месяц:");
        int month = scanner.nextInt();
        System.out.println("Введите год:");
        int year = scanner.nextInt();

// -------------------------------------------
        printDate(15,1,2008);
        printDate(17,6,2025);
        printDate(day, month,year);

    }

    // SOLID
    public static void printDate(int day, int month, int year){
        System.out.println(year + " " + getMonthTitle(month) + " " + day);
    }

    public static String getMonthTitle(int month){
        /*
        String monthStr = "";


        switch (month){
            case 1: monthStr = "январь"; break;
            case 2: monthStr = "февраль"; break;
            case 3: monthStr = "март"; break;
            // ...
        }

         */


        String[] months = { "",
                "январь", "февраль", "март", "апрель", "май", "июнь",
                "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"
        };
        return months[month];
    }


}



/*
Напишите метод `void printDate(int day, int month, int year)` который получает
3 значения int и выводит на экран дату, следующем виде:
~~~
год месяц число
~~~
Например:
~~~
printDate(15,1,2008)
Вывод: 2008 январь 15
~~~
в рамках данной задачи предполагаем, что данные корректны

 */

