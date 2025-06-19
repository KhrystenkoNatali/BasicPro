package app;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int num3 = scanner.nextInt();

        if (num1 >= num2  && num1 >= num3 ) {
            System.out.println(num1 + " самое большое " );
        } else if (num2 >= num3){
            System.out.println(num2 + " самое большое " );
        } else {
            System.out.println(num3 + " самое большое " );
        }
    }
}
