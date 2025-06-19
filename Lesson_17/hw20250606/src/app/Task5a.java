package app;

import java.util.Scanner;

public class Task5a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int num3 = scanner.nextInt();

        int max = num1;

        if (num2 > max){
            max = num2;
        }

        if (num3 > max){
            max = num3;
        }

        System.out.println(max + " наибольшее значение");



    }
}
