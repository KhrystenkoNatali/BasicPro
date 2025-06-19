package app;

//Группа 68m Lesson_15

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        /*
        Ваша программа должна (используя Scanner) запросить
        возраст пользователя
        имя пользователя
        Именно в таком порядке, сначало возраст потом имя.
        Естественно, все эти данный программа должна сохранит в соответствующие переменные.
        В качестве результата программа должна вывести что-то типа:
         Jack (20)
         Естественно, в результат должны подставится введенные данные.
        */
        Scanner scanner = new Scanner(System.in);

        // Сначала спрашиваем возраст
        System.out.println("Ваш возраст:");
        int age = scanner.nextInt(); // сохраняем возраст
        scanner.nextLine(); // чтобы "очистить" строку после числа

        // Потом спрашиваем имя
        System.out.println("Ваше имя:");
        String name = scanner.nextLine(); // сохраняем имя

        System.out.println(name + " (" + age + ")");


    }
}
