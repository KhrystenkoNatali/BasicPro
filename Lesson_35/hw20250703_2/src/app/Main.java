package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MailDeliveryService[] services ={
                new DHL(),
                new Email(),
                new Pigeon(),
                new UPX()
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите способ доставки:");
        for (int j = 0; j< services.length; j++){
            System.out.println((j+1) + ". " + services[j].name());
        }

        int i = scanner.nextInt();
        if (i>=1 && i<=services.length){
            System.out.println("Отправляем используя сервис: " + services[i-1].name());
            Sender sender = new Sender(services[i-1]);
            sender.send();
        } else {
            System.out.println("Сервис отправки почты не найден");
        }


    }

}
