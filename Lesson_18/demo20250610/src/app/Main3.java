package app;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {

        int l=3,r=7; //  [l...r]
        for (int counter=l; counter<=r;counter++){
            System.out.print(counter + " | ");
        }

//        System.out.println(counter);
        System.out.println();

        for (int counter=r; counter>=l; counter--)
            System.out.print(counter + " | ");

        System.out.println();

        System.out.println("========DO WHILE  VAR 1 ======");
        Scanner myScaner = new Scanner(System.in);
        String otvet="";
        do {
            System.out.println("Хорошая ли на улице погода Да/Нет");
            otvet=myScaner.nextLine();
            if (otvet.equalsIgnoreCase("да")||otvet.equalsIgnoreCase("нет"))
                break;
            System.out.println("Ваш ответ не распознан, только да или нет");
        } while (true);
        if (otvet.equalsIgnoreCase("да")){
            System.out.println("Ура я иду гулять");
        }
        else {
            System.out.println("Увы гулять не пойдем");
        }

        System.out.println("========DO WHILE  VAR 2 ======");

        do {
            System.out.println("Хорошая ли на улице погода Да/Нет");
            otvet=myScaner.nextLine();
        } while (!(otvet.equalsIgnoreCase("да")||otvet.equalsIgnoreCase("нет")));

        if (otvet.equalsIgnoreCase("да")){
            System.out.println("Ура я иду гулять");
        }
        else {
            System.out.println("Увы гулять не пойдем");
        }
    }
}
