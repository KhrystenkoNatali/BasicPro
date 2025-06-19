package app;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        /*
        Ваша программа должна (используя Scanner) запросить
        имя первого пассажира
        количество груза первого пассажира (целое число)
        имя второго пассажира
        количество груза первого пассажира (целое число)
        Естественно, все эти данный программа должна сохранит в соответствующие переменные.
        В качестве результата программа должна вывести что-то типа:
         Пассажир 1: имя, багаж: xxx
         Пассажир 2: имя, багаж: xxx
         Всего багажа: yyy
         Естественно, в результат должны подставится введенные данные.
         */
        Scanner scanner = new Scanner(System.in);

        // Первый пассажир
        System.out.println("Имя первого пассажира:");
        String name1 = scanner.nextLine();

        System.out.println("Багаж первого пассажира (целое число):");
        int bagagge1 = scanner.nextInt();
        scanner.nextLine(); // очистка строки

        // Второй пассажир
        System.out.println("Имя второго пассажира:");
        String name2 = scanner.nextLine();

        System.out.println("Багаж второго пассажира (целое число):");
        int bagagge2 = scanner.nextInt();

        System.out.println("Пассажир 1: " + name1 + ", багаж: " + bagagge1);
        System.out.println("Пассажир 2: " + name2 + ", багаж: " + bagagge2);
        System.out.println("Всего багажа: " + (bagagge1 + bagagge2));


    }
}
