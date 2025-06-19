package app;

import java.util.Scanner;

public class Task3a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        String inputString = scanner.nextLine();   // "1237"

        int result = 0;

        for (int i = 0; i < inputString.length(); i++) {
            result += inputString.charAt(i) - '0';
        }
        System.out.println(result);
    }
}

/*





 */
