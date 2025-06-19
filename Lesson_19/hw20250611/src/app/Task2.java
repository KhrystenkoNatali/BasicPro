package app;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();
        System.out.println("Введите один символ: ");
        String charString = scanner.nextLine();

        // можно сделать проверки корректности ввода

        char findChar = charString.charAt(0);
        int count = 0;
        for (int i = 0; i <  inputString.length() ;  i++ ){
            char ch = inputString.charAt(i);
            if (ch == findChar){
                count++;
            }
        }
        System.out.println("Символ '" + findChar + "' встречается " + count + " раз в строке:" );
        System.out.println(inputString);

        System.out.println("-------------------------- while -----------------");
        count = 0;
        int i = 0;
        while (i< inputString.length()){

            char ch = inputString.charAt(i);
            if (ch == findChar){
                count++;
            }

            i++;
        }

        System.out.println("Символ '" + findChar + "' встречается " + count + " раз в строке:" );
        System.out.println(inputString);
    }

}
/*
### Задача 2
Напишите программу, которая просит пользователя ввести строку и 1 символ.
Ввша программа должна считать, сколько раз заданный символ встречается во введенной строке

Например:
~~~
hello java
a

результат: 2
~~~




 */

