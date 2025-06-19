package app;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int[] arr = new int[5]; // создал пустой массив на 10 элементов int

        Scanner scanner = new Scanner(System.in);

        for (int i=0; i < arr.length; i++){
            System.out.println("Введите число с индексом [ " + i + "] :");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "       ");
        }
    }
}
