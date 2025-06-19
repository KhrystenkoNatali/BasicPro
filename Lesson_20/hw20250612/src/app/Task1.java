package app;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();  // ctrl + alt + v
        //
        String result = "";
        for (int i = 0; i < inputString.length() ; i++ ){
            if ( i%2 != 0   ) {
                result += inputString.charAt(i);
            }
        }

        System.out.println(result);

        // ==========================================
        System.out.println("---- второй вариант ------");

        result ="";
        for (int i = 1 ; i < inputString.length(); i+=2 ){
            result += inputString.charAt(i);
        }
        System.out.println(result);
    }
}
/*
### Задача 1
Пользователь водит строку. Ваша задача получить новую строку, которая будет состоять из букв исходной,
стоящих на нечетных позициях. Например:
~~~
Ввод: "java is very easy"
Вывод: "aai eyes"
~~~
или
~~~
Ввод: "0123456"
Вывод: "135"
~~~


 */

