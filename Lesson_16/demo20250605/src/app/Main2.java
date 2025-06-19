package app;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строке:");
        String str3 = scanner.nextLine();

        boolean res1 = str1 == str2;
        boolean res2 = str1 == str3;


        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);

        System.out.println("str1 == str2  :" + res1);
        System.out.println("str1 == str3  :" + res2);

        // *************************************************
        // Строки сравниваем с помощью метода equals()
        // == работает не всегда корректно

        boolean res3 = str1.equals(str3); // сравнение строк. можно  str3.equals(str1)
        System.out.println("str1.equals(str3)  :" + res3);






    }
}
