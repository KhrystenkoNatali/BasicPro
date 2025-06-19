/*
Напишите метод boolean chexkDate(int day, int month, int year),
который получает 3 значения: число, день, месяц и год, и определяет,
в какой момент эти значения будут правильной датой.

chexkDate(10,1,2008) - true
chexkDate(10,15,2008) - false
chexkDate(10,-1,2008) - false
 */

package app;

public class Main3 {
    public static boolean checkDate(int day, int month, int year) {
        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        int[] daysInMonth = {
                31, // Январь
                28, // Февраль (без учёта високосного года)
                31, // Март
                30, // Апрель
                31, // Май
                30, // Июнь
                31, // Июль
                31, // Август
                30, // Сентябрь
                31, // Октябрь
                30, // Ноябрь
                31  // Декабрь
        };

        if (month == 2 && isLeapYear(year)) {
            daysInMonth[1] = 29;
        }

        return day <= daysInMonth[month - 1];
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        System.out.println(checkDate(10, 1, 2008));   // true
        System.out.println(checkDate(10, 15, 2008));  // false (месяц 15 не существует)
        System.out.println(checkDate(10, -1, 2008));  // false (месяц -1 не существует)
        System.out.println(checkDate(29, 2, 2024));   // true (високосный год)
        System.out.println(checkDate(29, 2, 2023));   // false (не високосный год)


    }

}