package app;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите целое число");
        int num = scanner.nextInt();

        int sum = 0;

        while ( num>0 ){
            int r = num % 10;
            sum+=r;
            num /= 10;
        }
        System.out.println(sum);




    }

}
/*
 int r =  num % 10
 int num = num / 10 = 231

 r = num % 10 = 231 % 10 = 1
num = num / 10



 */


/*
### Задача 3 (сложнее, по желанию)
Пользователь вводит целое число. Ваша задача определить, сумму разрядов этого числа.
**Например, ввели** число 2317
**Нужно посчитать:** 2 + 3 + 1 + 7
**Ответ:** 13

 */

