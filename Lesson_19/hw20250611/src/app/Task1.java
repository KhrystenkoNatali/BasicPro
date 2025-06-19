package app;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String inputString = scanner.nextLine();

        // hello java
        int index = 0;

        while(  index < inputString.length()  &&  inputString.charAt(index)!=' '){
            char ch = inputString.charAt(index);
            System.out.println(ch);
            index++;
        }


        System.out.println("---------------------------------------------");

        for( index = 0   ;  index < inputString.length()  &&  inputString.charAt(index)!=' '  ; index++   ){
            char ch = inputString.charAt(index);
            System.out.println(ch);
        }

        System.out.println("------- while with break ---------------");

        index = 0;

        while(  index < inputString.length()  ){
            char ch = inputString.charAt(index);
            if (ch == ' '){
                break;
            }
            System.out.println(ch);
            index++;
        }

        System.out.println("------- for with break ---------------");
        for( index = 0   ;  index < inputString.length()  ; index++   ){
            char ch = inputString.charAt(index);
            if (ch==' '){
                break;
            }
            System.out.println(ch);
        }

    }
}

/*
Напишите программу, которая просит пользователя ввести строку и выводит на экран
первое слово введенной строке, по-буквам, в столбик.
Задачу необходимо реализовать двумя видами цикла из трех.

Например:
~~~
hello java

h
e
l
l
o

~~~

 */

