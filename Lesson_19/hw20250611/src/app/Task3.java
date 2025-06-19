package app;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long summa = 0;
        while (true){
            System.out.println("введите целое число или 0 для завершения");
            int num = scanner.nextInt();

            if (num == 0){
                break;
            }
            summa+=num;
        }
        System.out.println("-----------");
        System.out.println("Сумма введенных чисел: " + summa);


    }
}

