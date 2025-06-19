package app;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        String[] arr = {"jack", "john", "ann", "jack", "nick", "jack", "ann" };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку для поиска ");
        String findStr = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < arr.length ; i++) {
            if ( arr[i].equals(findStr) ){
                count++;
            }
        }

        System.out.println("Строка " + findStr + " встречается " + count + " раз");
    }
}
