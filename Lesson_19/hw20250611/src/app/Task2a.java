package app;

import java.util.Scanner;

public class Task2a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();
        System.out.println("Введите один символ: ");
        String charString = scanner.nextLine();

        // можно сделать проверки корректности ввода

        char findCharUpper = charString.toUpperCase().charAt(0);
        char findCharLower = charString.toLowerCase().charAt(0);



        int count = 0;
        for (int i = 0; i <  inputString.length() ;  i++ ){
            char ch = inputString.charAt(i);
            if (ch == findCharUpper || ch == findCharLower){
                count++;
            }
        }
        System.out.println("Символ '" + charString + "' встречается " + count + " раз в строке:" );
        System.out.println(inputString);




    }
}

/*
Привет! пойдем гулять
П / п   -> 2
 */

