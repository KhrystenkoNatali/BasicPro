package app;

import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long summa = 0;
        int num = 0;
        do{
            System.out.println("введите целое число или 0 для завершения");
            num = scanner.nextInt();
            summa+=num;
        } while (num != 0);
        System.out.println("-----------");
        System.out.println("Сумма введенных чисел: " + summa);


    }


    /*

    do {

    } while ( );


     */

}
