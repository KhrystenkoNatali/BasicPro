package app;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целое число");
        int number = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < number; i++){
            if (number % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("число простое");
        } else {
            System.out.println("число не простое");
        }



    }

}

/*
### Задача 2
Пользователь водит целое число. Ваша задача определить, является ли жто число простым.
Напомню, простое число это то, которое без остатка делится только на 1 и на само себя,
иными словами, не делится ни на какое число больше.
Например:
~~~
5 простое делится только на 1 и на 5
6 не простое делится на 1, 2, 3 и 6
~~~

 */
