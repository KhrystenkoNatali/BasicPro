package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите номер дня недели [1. понедельник 2. ....]: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        if (day == 1){
            System.out.println("Понедельник");
        } else if (day == 2){
            System.out.println("вторник");
        } else if (day == 3){
            System.out.println("среда");
        } else if (day == 4) {
            System.out.println("четверг");
        } else if (day == 5) {
            System.out.println("пятница");
        } else if (day == 6) {
            System.out.println("суббота");
        } else if (day == 7) {
            System.out.println("воскресенье");
        } else {
            System.out.println("ошибка ввода");
        }

        /*
        switch (variable ) {
            case value1 :
            case value2 :
            case value3 :
                .......
            default:

        }
        */
        System.out.println("------------ switch ..... case .......");
        switch (day){
            case 1: System.out.println("Понедельник"); break;
            case 2: System.out.println("Вторник"); break;
            case 3: System.out.println("Среда"); break;
            case 4: System.out.println("Четверг"); break;
            case 5: System.out.println("Пятница"); break;
            case 6: System.out.println("Суббота"); break;
            case 7: System.out.println("Воскресенье"); break;
            default:  System.out.println("Ошибка ввода");

        }

        String str = "qwe";

        switch(str){
            case "qwo":
                System.out.println("кво");break;
            case "qwa":
                System.out.println("ква"); break;
            case "qwe":
                System.out.println("квe"); break;

        }

    }
}
