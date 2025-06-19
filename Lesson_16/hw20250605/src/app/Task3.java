package app;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину комнаты: ");
        double length = scanner.nextDouble();

        System.out.println("Введите ширину комнаты: ");
        double width = scanner.nextDouble();

        System.out.println("Введите площадь паркета в одной упаковке: ");
        double areaInBox = scanner.nextDouble();


        double roomArea = length * width;
        //int boxForBuy = (int)(roomArea/areaInBox + 0.9) ;
        int boxForBuy = (int)Math.ceil(roomArea/areaInBox);


        System.out.println("Площадь комнаты: " + roomArea);
        System.out.println("Вам необходимо " + boxForBuy + " упаковок.");

    }
}
