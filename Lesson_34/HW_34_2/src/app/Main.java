/*
Создать интерфейс MailDeliveryService с одним методом void sendMail().
Создайте класс DHL, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты — напечатать что-то вроде:
«Положи письмо в конверт, поставь марку, отправь».
Создайте класс Email, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты - напечатать что-то вроде: «Отправить по Интернету».
Создайте класс Pigeon, который должен реализовать интерфейс MailDeliveryService.
Его способ отправки почты — напечатать что-то вроде:
«Голубь?! Серьезно!? в двадцать первом веке?!!! Ты сумасшедший! Я улетаю»
Создайте класс Sender. Реализуйте в нем метод send(),
который в качестве аргумента принимает MailDeliveryService и отправляет почту
с помощью данной службы.
Реализуйте диалог с пользователем (использовать Scanner),
как отправлять почту и отправлять ее с помощью Sender.

 */
package app;

// Группа 68m

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sender sender = new Sender();

        System.out.println("Выберите способ доставки: DHL, Email, Pigeon");
        String choice = scanner.nextLine().trim().toLowerCase();

        MailDeliveryService service;

        switch (choice) {
            case "dhl":
                service = new DHL();
                break;
            case "email":
                service = new Email();
                break;
            case "pigeon":
                service = new Pigeon();
                break;
            default:
                System.out.println("Неизвестный способ доставки.");
                scanner.close();
                return;
        }

        sender.send(service);
        scanner.close();
    }
}
